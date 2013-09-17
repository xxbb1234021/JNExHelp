package com.jnexhelp.action;

import java.util.List;
import java.util.Map;

import com.jnexhelp.dao.BasicInfoDao;
import com.jnexhelp.domain.BasicInfoDomain;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ChangePasswdAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BasicInfoDao basicInfoDao;
	
	private String email;

	private String passwd;
	
	public BasicInfoDao getBasicInfoDao() {
		return basicInfoDao;
	}

	public void setBasicInfoDao(BasicInfoDao basicInfoDao) {
		this.basicInfoDao = basicInfoDao;
	}

	
	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String execute() throws Exception{
		
		
		return SUCCESS;
	}
	
	public String startUpdatePasswd() throws Exception{
		String ret = ERROR;
	
		List<BasicInfoDomain> bid= basicInfoDao.findByEmail(email.trim());
		
		if(bid.size() > 0){
			ret = SUCCESS;
			
			ActionContext actionContext = ActionContext.getContext();
			Map<String, Object> session = actionContext.getSession();
			
			session.put("Email", email.trim());
		}
		
		return ret;
	}
	
	public String updatePasswd() throws Exception{
		
		String ret = ERROR;
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String email = (String)session.get("Email");
		
		List<BasicInfoDomain> bid= basicInfoDao.findByEmail(email.trim());
		
		if(bid.size() > 0){
			BasicInfoDomain updateBid = bid.get(0);
			updateBid.setPasswd(passwd);
			basicInfoDao.update(updateBid);
			
			ret = SUCCESS;
		}
	
		return ret;
	}

}
