package com.jnexhelp.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.ChessGameServiceDao;
import com.jnexhelp.domain.skills.ChessGameServiceDomain;

public class ChessGameServiceDaoHibernate extends HibernateDaoSupport implements ChessGameServiceDao {

	@Override
	public Integer save(ChessGameServiceDomain chessGameServiceDomain) {

		return (Integer)getHibernateTemplate().save(chessGameServiceDomain);
	}

}
