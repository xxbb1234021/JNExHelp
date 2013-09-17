package com.jnexhelp.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.HouseServiceDao;
import com.jnexhelp.domain.skills.HouseServiceDomain;

public class HouseServiceDaoHibernate extends HibernateDaoSupport implements HouseServiceDao{

	@Override
	public Integer save(HouseServiceDomain houseServiceDomain) {
		
		return (Integer)getHibernateTemplate().save(houseServiceDomain);
	}

}
