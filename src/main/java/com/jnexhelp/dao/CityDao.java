package com.jnexhelp.dao;

import java.util.List;

import com.jnexhelp.domain.CityDomain;

public interface CityDao {
	
	List<CityDomain> findByCityName(String cityName);
	
	List<CityDomain> findByCityId(String cityId);
	
}
