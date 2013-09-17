package com.jnexhelp.model;

public class SuitPerson
{

	private String userName;

	private String userEmail;

	private String userMsn;

	private String userQQ;

	private String userLocation;

	public SuitPerson()
	{

	}

	public SuitPerson(String userName, String userEmail, String userMsn, String userQQ, String userLocation)
	{

		this.userName = userName;
		this.userEmail = userEmail;
		this.userMsn = userMsn;
		this.userQQ = userQQ;
		this.userLocation = userLocation;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getUserEmail()
	{
		return userEmail;
	}

	public void setUserEmail(String userEmail)
	{
		this.userEmail = userEmail;
	}

	public String getUserMsn()
	{
		return userMsn;
	}

	public void setUserMsn(String userMsn)
	{
		this.userMsn = userMsn;
	}

	public String getUserQQ()
	{
		return userQQ;
	}

	public void setUserQQ(String userQQ)
	{
		this.userQQ = userQQ;
	}

	public String getUserLocation()
	{
		return userLocation;
	}

	public void setUserLocation(String userLocation)
	{
		this.userLocation = userLocation;
	}

}
