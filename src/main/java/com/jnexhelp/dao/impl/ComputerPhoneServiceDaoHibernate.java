package com.jnexhelp.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.ComputerPhoneServiceDao;
import com.jnexhelp.domain.skills.ComputerPhoneServiceDomain;

public class ComputerPhoneServiceDaoHibernate extends HibernateDaoSupport implements ComputerPhoneServiceDao {

	@Override
	public Integer save(ComputerPhoneServiceDomain computerPhoneServiceDomain) {
		
		return (Integer)getHibernateTemplate().save(computerPhoneServiceDomain);
	}

}
