package com.jnexhelp.action;


import java.util.List;
import java.util.Map;

import com.jnexhelp.dao.BasicInfoDao;
import com.jnexhelp.domain.BasicInfoDomain;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private BasicInfoDao basicInfoDao;
	
	private String userName;
	private String passwd;
	
	private String result;
		
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public BasicInfoDao getBasicInfoDao() {
		return basicInfoDao;
	}

	public void setBasicInfoDao(BasicInfoDao basicInfoDao) {
		this.basicInfoDao = basicInfoDao;
	}

	public String execute() throws Exception{
		String ret = ERROR;
		
		String email = userName.trim();
				
		List<BasicInfoDomain> bid= basicInfoDao.findByEmail(email);
		
		if(bid.size() > 0){
			for(int i=0;i<bid.size();i++){
				String pword = bid.get(i).getPasswd();
				
				if (pword.equals(passwd.trim())){
					ret = SUCCESS;
					break;
				}
			}
		}
		
		if(ret.equals(ERROR)){
			this.result = "������������!";
		}
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		session.put("Email",email);		
		
		return ret;
	}
	
	/*
	 * forget his password, use the method to make him change his password
	 */
	public String willChangePassword() throws Exception{
		
		return SUCCESS;
	}

}
