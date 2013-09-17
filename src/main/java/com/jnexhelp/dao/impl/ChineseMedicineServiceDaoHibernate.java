package com.jnexhelp.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.ChineseMedicineServiceDao;
import com.jnexhelp.domain.skills.ChineseMedicineServiceDomain;

public class ChineseMedicineServiceDaoHibernate extends HibernateDaoSupport implements ChineseMedicineServiceDao{

	@Override
	public Integer save(
			ChineseMedicineServiceDomain chineseMedicineServiceDomain) {
		
		return (Integer)getHibernateTemplate().save(chineseMedicineServiceDomain);
	}

}
