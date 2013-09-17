package com.jnexhelp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jnexhelp.domain.skills.LegalServiceDomain;
import com.jnexhelp.model.RandomModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LegalService extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private String legalServiceName;
	
	private List<String> legalServiceList;
	
	private String[] selectedLegalServiceValues;
	
	private LegalServiceDomain legalServiceDomain;
	
	private RandomModel randomAction;
	
	private String redirectUrl;
	
	public LegalService(){
		
		legalServiceList = new ArrayList<String>();
		legalServiceList.add("案件代理");
		legalServiceList.add("法律咨询");
		legalServiceList.add("代写文书");
		legalServiceList.add("发律师函");
		legalServiceList.add("法律顾问");
		
		selectedLegalServiceValues = new String[legalServiceList.size()];
	}

	public String getLegalServiceName() {
		return legalServiceName;
	}

	public void setLegalServiceName(String legalServiceName) {
		this.legalServiceName = legalServiceName;
	}

	public List<String> getLegalServiceList() {
		return legalServiceList;
	}

	public void setLegalServiceList(List<String> legalServiceList) {
		this.legalServiceList = legalServiceList;
	}

	public String[] getSelectedLegalServiceValues() {
		return selectedLegalServiceValues;
	}

	public void setSelectedLegalServiceValues(String[] selectedLegalServiceValues) {
		this.selectedLegalServiceValues = selectedLegalServiceValues;
	}
	
	public RandomModel getRandomAction() {
		return randomAction;
	}

	public void setRandomAction(RandomModel randomAction) {
		this.randomAction = randomAction;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public LegalServiceDomain getLegalServiceDomain() {
		return legalServiceDomain;
	}

	public void setLegalServiceDomain(LegalServiceDomain legalServiceDomain) {
		this.legalServiceDomain = legalServiceDomain;
	}

	public String execute() throws Exception{
		System.out.println(legalServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = legalServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("案件代理")){
				legalServiceDomain.setLegalAgent(true);
			}else if(services[i].trim().equals("法律咨询")){
				legalServiceDomain.setLegalConsult(true);
			}else if(services[i].trim().equals("代写文书")){
				legalServiceDomain.setLegalInstrument(true);
			}else if(services[i].trim().equals("发律师函")){
				legalServiceDomain.setLegalLetters(true);
			}else if(services[i].trim().equals("法律顾问")){
				legalServiceDomain.setLegalAdviser(true);
			}
		}
		
		session.put("legalService", legalServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedLegalServiceValues[i] = services[i].trim();
		}
		return SUCCESS;
	}
	
	public String display() throws Exception{

		return NONE;
	}
	
	public String prePage() throws Exception{
		
		return "prepage";
	}
	
	public String switchSkill() throws Exception{
		System.out.println(legalServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = legalServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("案件代理")){
				legalServiceDomain.setLegalAgent(true);
			}else if(services[i].trim().equals("法律咨询")){
				legalServiceDomain.setLegalConsult(true);
			}else if(services[i].trim().equals("代写文书")){
				legalServiceDomain.setLegalInstrument(true);
			}else if(services[i].trim().equals("发律师函")){
				legalServiceDomain.setLegalLetters(true);
			}else if(services[i].trim().equals("法律顾问")){
				legalServiceDomain.setLegalAdviser(true);
			}
		}
		
		session.put("legalService", legalServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedLegalServiceValues[i] = services[i].trim();
		}
		redirectUrl = randomAction.getRandomDisplayAction(9);
		return "switch";
	}

}
