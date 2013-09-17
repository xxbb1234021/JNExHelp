package com.jnexhelp.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.TaobaoServiceDao;
import com.jnexhelp.domain.skills.TaobaoServiceDomain;

public class TaobaoServiceDaoHibernate extends HibernateDaoSupport implements TaobaoServiceDao{

	@Override
	public Integer save(TaobaoServiceDomain taobaoServiceDomain) {

		return (Integer)getHibernateTemplate().save(taobaoServiceDomain);
	}

}
