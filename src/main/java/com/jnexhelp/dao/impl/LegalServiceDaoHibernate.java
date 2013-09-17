package com.jnexhelp.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.LegalServiceDao;
import com.jnexhelp.domain.skills.LegalServiceDomain;

public class LegalServiceDaoHibernate extends HibernateDaoSupport implements LegalServiceDao{

	@Override
	public Integer save(LegalServiceDomain legalServiceDomain) {
		return (Integer)getHibernateTemplate().save(legalServiceDomain);
	}

}
