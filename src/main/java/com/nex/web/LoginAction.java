package com.nex.web;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport
{
	private static final Logger logger = Logger.getLogger(LoginAction.class);

	public String username;
	public String password;

	public String execute()
	{
		logger.info("username:"+username); 
		logger.info("password:"+password);
		if (!username.equals("admin"))
		{
			super.addFieldError("username", "用户名错误!");
			return ERROR;
		}

		if (!password.equals("admin"))
		{
			super.addFieldError("password", "密码错误!");
			return ERROR;
		}

		return SUCCESS;
	}

	public void validate()
	{
		if ((null == username) || (0 == username.length()))
		{
			super.addActionError("用户名不能为空!");
		}

		if ((null == password) || (0 == password.length()))
		{
			super.addActionError("密码不能为空!");
		}
	}
}
