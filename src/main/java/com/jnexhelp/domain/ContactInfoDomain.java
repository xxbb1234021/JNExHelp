package com.jnexhelp.domain;

public class ContactInfoDomain {
	
	private Integer id;
	private String userId;
	private Integer phoneNo;
	private String qq;
	private String msn;
	private String imgfile;
	
	private BasicInfoDomain basicInfo;
	
	public ContactInfoDomain(){
		
	}
	
	public ContactInfoDomain(Integer id, String userId, Integer phoneNo,
			String qq, String msn, String imgfile, BasicInfoDomain basicInfo){
		this.id = id;
		this.userId = userId;
		this.phoneNo = phoneNo;
		this.qq = qq;
		this.msn = msn;
		this.imgfile = imgfile;
		this.basicInfo = basicInfo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMsn() {
		return msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getImgfile() {
		return imgfile;
	}

	public void setImgfile(String imgfile) {
		this.imgfile = imgfile;
	}

	public BasicInfoDomain getBasicInfo() {
		return basicInfo;
	}

	public void setBasicInfo(BasicInfoDomain basicInfo) {
		this.basicInfo = basicInfo;
	}
	
	
	
}
