package com.jnexhelp.dao;

import java.util.List;

import com.jnexhelp.domain.skills.BeautifyServiceDomain;
import com.jnexhelp.model.SuitPerson;

public interface BeautifyServiceDao {
	public Integer save(BeautifyServiceDomain beautifyServiceDomain);
	
	public List<SuitPerson> findPersons(String findpersonsHql);
}
