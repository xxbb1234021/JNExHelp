package com.jnexhelp.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.EntertainmentServiceDao;
import com.jnexhelp.domain.skills.EntertainmentServiceDomain;

public class EntertainmentServiceDaoHibernate extends HibernateDaoSupport implements EntertainmentServiceDao{

	@Override
	public Integer save(EntertainmentServiceDomain entertainmentServiceDomain) {
		
		return (Integer)getHibernateTemplate().save(entertainmentServiceDomain);
	}

}
