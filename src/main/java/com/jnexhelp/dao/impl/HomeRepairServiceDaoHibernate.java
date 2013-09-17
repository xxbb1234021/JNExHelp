package com.jnexhelp.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.HomeRepairServiceDao;
import com.jnexhelp.domain.skills.HomeRepairServiceDomain;

public class HomeRepairServiceDaoHibernate extends HibernateDaoSupport implements HomeRepairServiceDao{

	@Override
	public Integer save(HomeRepairServiceDomain homeRepairServiceDomain) {

		return (Integer)getHibernateTemplate().save(homeRepairServiceDomain);
	}

}
