package com.jnexhelp.action;

import java.util.Date;
import java.util.Map;

import com.jnexhelp.domain.BasicInfoDomain;
import com.jnexhelp.model.RandomModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BasicInfoAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String region;
	private String city;
	private String area;
	private String street;
	
	private String email;
	private String userName;
	private String passwd;
	private String gender;
	private String year;
	private String month;
	private String day;
	
	private Date birthDay;
	private String career;
	private long indetifiedId;
	
	
	public BasicInfoDomain basicInfoDomain;
	
	public RandomModel rdModel;

	private String redirectUrl;
	
	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	
	public BasicInfoDomain getBasicInfoDomain() {
		return basicInfoDomain;
	}

	public void setBasicInfoDomain(BasicInfoDomain basicInfoDomain) {
		this.basicInfoDomain = basicInfoDomain;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public long getIndetifiedId() {
		return indetifiedId;
	}

	public void setIndetifiedId(long indetifiedId) {
		this.indetifiedId = indetifiedId;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}

	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}
	
	public RandomModel getRdModel() {
		return rdModel;
	}

	public void setRdModel(RandomModel rdModel) {
		this.rdModel = rdModel;
	}

	@SuppressWarnings("deprecation")
	public String execute() throws Exception{
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		basicInfoDomain.setRegion(region);
		basicInfoDomain.setCity(city);
		basicInfoDomain.setArea(area);
		basicInfoDomain.setStreet(street);
		
		basicInfoDomain.setEmail(email);
		basicInfoDomain.setUserName(userName);
		basicInfoDomain.setPasswd(passwd);
		
		if (gender.equals("on"))
			basicInfoDomain.setGender(1);
		else
			basicInfoDomain.setGender(0);
		birthDay = new Date(Integer.parseInt(year),
				Integer.parseInt(month),
				Integer.parseInt(day));
		basicInfoDomain.setBirthDay(birthDay);
		basicInfoDomain.setCareer(career);
		
		session.put("basicInfo", basicInfoDomain);
		session.put("Email",email);
		
		Map<String,Object> aContext=actionContext.getValueStack().getContext();
		
		System.out.println(aContext.toString());
		
		//redirectUrl = "taobaoServiceDisplayAction";
		redirectUrl = rdModel.getRandomDisplayAction();
		
		return "others";
	}
	
	public String validateUser() throws Exception{
		
		
		return SUCCESS;
	}

}
