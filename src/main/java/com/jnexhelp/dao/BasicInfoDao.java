package com.jnexhelp.dao;

import java.util.List;

import com.jnexhelp.domain.BasicInfoDomain;

public interface BasicInfoDao {
	public Integer save(BasicInfoDomain basicInfoDomain);
	
	public List<BasicInfoDomain> findByEmail(String email);
	
	public void update(BasicInfoDomain basicInfoDomain);
	
	public List<BasicInfoDomain> findPersonByStreet(String street);
	
	public List<BasicInfoDomain> findPersonByArea(String area);
	
	public List<BasicInfoDomain> findPersonByCity(String city);
	
	public List<BasicInfoDomain> findPersonByRegion(String region);
}
