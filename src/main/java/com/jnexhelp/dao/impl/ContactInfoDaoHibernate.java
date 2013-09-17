package com.jnexhelp.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.ContactInfoDao;
import com.jnexhelp.domain.ContactInfoDomain;

public class ContactInfoDaoHibernate extends HibernateDaoSupport implements ContactInfoDao{

	@Override
	public Integer save(ContactInfoDomain contactInfoDomain) {
		return (Integer)getHibernateTemplate().save(contactInfoDomain);
	}

}
