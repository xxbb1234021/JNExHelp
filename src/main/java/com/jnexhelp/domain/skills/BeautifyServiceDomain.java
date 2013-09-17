package com.jnexhelp.domain.skills;


public class BeautifyServiceDomain {
	private Integer id;
	private String userId;
	
	private boolean clothingMatching;
	private boolean hairCare;
	private boolean facialMakeup;
	private boolean beautyKnowledge;
	
	
	public BeautifyServiceDomain(){
		
	}

	public BeautifyServiceDomain(Integer id, String userId, boolean clothingMatching,
			boolean hairCare, boolean facialMakeup, boolean beautyKnowledge){
		this.id = id;
		this.userId = userId;
		this.clothingMatching = clothingMatching;
		this.hairCare = hairCare;
		this.facialMakeup = facialMakeup;
		this.beautyKnowledge = beautyKnowledge;
		
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

	public boolean isClothingMatching() {
		return clothingMatching;
	}

	public void setClothingMatching(boolean clothingMatching) {
		this.clothingMatching = clothingMatching;
	}

	public boolean isHairCare() {
		return hairCare;
	}

	public void setHairCare(boolean hairCare) {
		this.hairCare = hairCare;
	}

	public boolean isFacialMakeup() {
		return facialMakeup;
	}

	public void setFacialMakeup(boolean facialMakeup) {
		this.facialMakeup = facialMakeup;
	}

	public boolean isBeautyKnowledge() {
		return beautyKnowledge;
	}

	public void setBeautyKnowledge(boolean beautyKnowledge) {
		this.beautyKnowledge = beautyKnowledge;
	}

	
}
