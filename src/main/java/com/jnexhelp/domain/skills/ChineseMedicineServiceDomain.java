package com.jnexhelp.domain.skills;

public class ChineseMedicineServiceDomain {
	
	private Integer id;
	private String userId;
	
	private boolean palmprintDiagnosis;
	private boolean guaSha;
	private boolean cuppingTherapy;
	private boolean chineseMassage;
	
	public ChineseMedicineServiceDomain(){
		
	}
	
	public ChineseMedicineServiceDomain(Integer id, String userId, boolean palmprintDiagnosis,
			boolean guaSha, boolean cuppingTherapy, boolean chineseMassage){
		this.id = id;
		this.userId = userId;
		this.palmprintDiagnosis = palmprintDiagnosis;
		this.guaSha = guaSha;
		this.cuppingTherapy = cuppingTherapy;
		this.chineseMassage = chineseMassage;

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
	public boolean isPalmprintDiagnosis() {
		return palmprintDiagnosis;
	}
	public void setPalmprintDiagnosis(boolean palmprintDiagnosis) {
		this.palmprintDiagnosis = palmprintDiagnosis;
	}
	public boolean isGuaSha() {
		return guaSha;
	}
	public void setGuaSha(boolean guaSha) {
		this.guaSha = guaSha;
	}
	public boolean isCuppingTherapy() {
		return cuppingTherapy;
	}
	public void setCuppingTherapy(boolean cuppingTherapy) {
		this.cuppingTherapy = cuppingTherapy;
	}
	public boolean isChineseMassage() {
		return chineseMassage;
	}
	public void setChineseMassage(boolean chineseMassage) {
		this.chineseMassage = chineseMassage;
	}


}
