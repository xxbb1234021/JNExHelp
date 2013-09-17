package com.jnexhelp.domain;

import java.util.Date;

import com.jnexhelp.domain.skills.BeautifyServiceDomain;
import com.jnexhelp.domain.skills.CateringServiceDomain;
import com.jnexhelp.domain.skills.ChessGameServiceDomain;
import com.jnexhelp.domain.skills.ChineseMedicineServiceDomain;
import com.jnexhelp.domain.skills.ComputerPhoneServiceDomain;
import com.jnexhelp.domain.skills.EntertainmentServiceDomain;
import com.jnexhelp.domain.skills.HomeRepairServiceDomain;
import com.jnexhelp.domain.skills.HouseServiceDomain;
import com.jnexhelp.domain.skills.LanguageServiceDomain;
import com.jnexhelp.domain.skills.LegalServiceDomain;
import com.jnexhelp.domain.skills.StockServiceDomain;
import com.jnexhelp.domain.skills.TaobaoServiceDomain;

public class BasicInfoDomain {

	private Integer id;
	private String region;
	private String city;
	private String area;
	private String street;
	private String email;
	private String userName;
	private String passwd;
	private Integer gender;
	private Date birthDay;  //will be changed
	private String career;
	private long indetifiedId;
	
	private ContactInfoDomain contactInfo;
	
	
	public BasicInfoDomain(){
		
	}
	
	public BasicInfoDomain(Integer id, String region,String city,String area,String street,
			String email, String userName,String passwd, 
			Integer gender, Date birthday, String career,long indetifiedId, 
			ContactInfoDomain contactInfo){
		this.id = id;
		this.region = region;
		this.city = city;
		this.area = area;
		this.street = street;
		this.email = email;
		this.userName = userName;
		this.passwd = passwd;
		this.gender = gender;
		this.birthDay = birthday;
		this.career = career;
		this.indetifiedId = indetifiedId;
		this.contactInfo = contactInfo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
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

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
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

	public ContactInfoDomain getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfoDomain contactInfo) {
		this.contactInfo = contactInfo;
	}

}
