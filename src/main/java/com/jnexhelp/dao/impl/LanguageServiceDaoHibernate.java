package com.jnexhelp.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.LanguageServiceDao;
import com.jnexhelp.domain.skills.LanguageServiceDomain;

public class LanguageServiceDaoHibernate extends HibernateDaoSupport implements LanguageServiceDao{

	@Override
	public Integer save(LanguageServiceDomain languageServiceDomain) {

		return (Integer)getHibernateTemplate().save(languageServiceDomain);
	}

}
