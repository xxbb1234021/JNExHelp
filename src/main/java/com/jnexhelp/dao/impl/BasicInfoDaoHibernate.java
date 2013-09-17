package com.jnexhelp.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jnexhelp.dao.BasicInfoDao;
import com.jnexhelp.domain.BasicInfoDomain;

public class BasicInfoDaoHibernate extends HibernateDaoSupport implements BasicInfoDao{

	@Override
	public Integer save(BasicInfoDomain basicInfoDomain) {
		
		return (Integer)getHibernateTemplate().save(basicInfoDomain);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BasicInfoDomain> findByEmail(String email) {
		
		return (List<BasicInfoDomain>)getHibernateTemplate().find(
				"from BasicInfoDomain b where b.email = ?",email);
	}

	@Override
	public void update(BasicInfoDomain basicInfoDomain) {
		
		getHibernateTemplate().update(basicInfoDomain);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BasicInfoDomain> findPersonByStreet(String street) {
		
		return (List<BasicInfoDomain>)getHibernateTemplate().find(
				"from BasicInfoDomain b where b.street = ?",street);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BasicInfoDomain> findPersonByArea(String area) {

		return (List<BasicInfoDomain>)getHibernateTemplate().find(
				"from BasicInfoDomain b where b.area = ?",area);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BasicInfoDomain> findPersonByCity(String city) {

		return (List<BasicInfoDomain>)getHibernateTemplate().find(
				"from BasicInfoDomain b where b.city = ?",city);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BasicInfoDomain> findPersonByRegion(String region) {

		return (List<BasicInfoDomain>)getHibernateTemplate().find(
				"from BasicInfoDomain b where b.region = ?",region);
	}

}
