package com.jnexhelp.domain.skills;

public class LegalServiceDomain {
	private Integer id;
	
	private String userId;
	
	private boolean legalAgent;
	
	private boolean legalConsult;
	
	private boolean legalInstrument;
	
	private boolean legalLetters;
	
	private boolean legalAdviser;
	
	public LegalServiceDomain(){
		
	}
	
	public LegalServiceDomain(Integer id, String userId, boolean legalAgent, boolean legalConsult,
		boolean legalInstrument, boolean legalLetters, boolean legalAdviser){
		this.id = id;
		this.userId = userId;
		this.legalAgent = legalAgent;
		this.legalConsult = legalConsult;
		this.legalInstrument = legalInstrument;
		this.legalLetters = legalLetters;
		this.legalAdviser = legalAdviser;

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

	public boolean isLegalAgent() {
		return legalAgent;
	}

	public void setLegalAgent(boolean legalAgent) {
		this.legalAgent = legalAgent;
	}

	public boolean isLegalConsult() {
		return legalConsult;
	}

	public void setLegalConsult(boolean legalConsult) {
		this.legalConsult = legalConsult;
	}

	public boolean isLegalInstrument() {
		return legalInstrument;
	}

	public void setLegalInstrument(boolean legalInstrument) {
		this.legalInstrument = legalInstrument;
	}

	public boolean isLegalLetters() {
		return legalLetters;
	}

	public void setLegalLetters(boolean legalLetters) {
		this.legalLetters = legalLetters;
	}

	public boolean isLegalAdviser() {
		return legalAdviser;
	}

	public void setLegalAdviser(boolean legalAdviser) {
		this.legalAdviser = legalAdviser;
	}
}
