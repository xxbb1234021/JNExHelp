package com.jnexhelp.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.CityDao;
import com.jnexhelp.domain.CityDomain;

public class CityDaoHibernate extends HibernateDaoSupport implements CityDao {

	@SuppressWarnings("unchecked")
	public List<CityDomain> findByCityName(String cityName) {

		return (List<CityDomain>)getHibernateTemplate().find(
				"from CityDomain c where c.cityName = "+cityName);
	}   

	@SuppressWarnings("unchecked")
	@Override
	public List<CityDomain> findByCityId(String cityId) {

		Query query = getSession().createQuery("from CityDomain c where c.cityId like :cityId");

		query.setParameter("cityId",cityId);
		
		List<CityDomain> result=query.list();
		
		return result;
	}
		
		

}
