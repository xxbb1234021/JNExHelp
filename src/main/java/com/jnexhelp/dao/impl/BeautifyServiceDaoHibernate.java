package com.jnexhelp.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.BeautifyServiceDao;
import com.jnexhelp.domain.skills.BeautifyServiceDomain;
import com.jnexhelp.model.SuitPerson;

public class BeautifyServiceDaoHibernate extends HibernateDaoSupport implements BeautifyServiceDao{

	@Override
	public Integer save(BeautifyServiceDomain beautifyServiceDomain) {
		
		return (Integer)getHibernateTemplate().save(beautifyServiceDomain);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SuitPerson> findPersons(String findpersonsHql) {
		
		return (List<SuitPerson>)getHibernateTemplate().find(findpersonsHql);
	}

}
