package com.jnexhelp.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.CateringServiceDao;
import com.jnexhelp.domain.skills.CateringServiceDomain;

public class CateringServiceDaoHibernate extends HibernateDaoSupport implements CateringServiceDao{

	@Override
	public Integer save(CateringServiceDomain cateringServiceDomain) {
		
		return (Integer)getHibernateTemplate().save(cateringServiceDomain);
	}

}
