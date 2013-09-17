package com.jnexhelp.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.StockServiceDao;
import com.jnexhelp.domain.skills.StockServiceDomain;

public class StockServiceDaoHibernate extends HibernateDaoSupport implements StockServiceDao{

	@Override
	public Integer save(StockServiceDomain stockServiceDomain) {
		
		return (Integer)getHibernateTemplate().save(stockServiceDomain);
	}

}
