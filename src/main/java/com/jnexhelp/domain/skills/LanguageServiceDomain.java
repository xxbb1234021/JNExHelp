package com.jnexhelp.domain.skills;

public class LanguageServiceDomain {
	
	private Integer id;
	private String userId;
	private boolean englishSkills;
	private boolean japaneseSkills;
	private boolean cantoneseSkills;
	private boolean frenchSkills;
	
	public LanguageServiceDomain(){
		
	}
	
	public LanguageServiceDomain(Integer id, String userId, boolean englishSkills,
			boolean japaneseSkills, boolean cantoneseSkills, boolean frenchSkills){
		this.id = id;
		this.userId = userId;
		this.englishSkills = englishSkills;
		this.japaneseSkills = japaneseSkills;
		this.cantoneseSkills = cantoneseSkills;
		this.frenchSkills = frenchSkills;
		
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
	public boolean isEnglishSkills() {
		return englishSkills;
	}
	public void setEnglishSkills(boolean englishSkills) {
		this.englishSkills = englishSkills;
	}
	public boolean isJapaneseSkills() {
		return japaneseSkills;
	}
	public void setJapaneseSkills(boolean japaneseSkills) {
		this.japaneseSkills = japaneseSkills;
	}
	public boolean isCantoneseSkills() {
		return cantoneseSkills;
	}
	public void setCantoneseSkills(boolean cantoneseSkills) {
		this.cantoneseSkills = cantoneseSkills;
	}
	public boolean isFrenchSkills() {
		return frenchSkills;
	}
	public void setFrenchSkills(boolean frenchSkills) {
		this.frenchSkills = frenchSkills;
	}
}
