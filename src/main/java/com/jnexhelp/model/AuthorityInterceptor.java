package com.jnexhelp.model;

import java.util.List;
import java.util.Map;

import com.jnexhelp.dao.BasicInfoDao;
import com.jnexhelp.domain.BasicInfoDomain;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorityInterceptor extends AbstractInterceptor {


	private static final long serialVersionUID = 1L;
	private BasicInfoDao basicInfoDao;

	public BasicInfoDao getBasicInfoDao() {
		return basicInfoDao;
	}

	public void setBasicInfoDao(BasicInfoDao basicInfoDao) {
		this.basicInfoDao = basicInfoDao;
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		ActionContext ctx = invocation.getInvocationContext();
		Map<String,Object> session = ctx.getSession();
		String email = (String) session.get("Email");
		
		List<BasicInfoDomain> bid= basicInfoDao.findByEmail(email);
		
		if((email != null) && (bid.size() > 0) ){
			return invocation.invoke();
		}
		
		return Action.LOGIN;
	}

}
