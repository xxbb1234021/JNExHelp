package com.jnexhelp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jnexhelp.domain.skills.LanguageServiceDomain;
import com.jnexhelp.model.RandomModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LanguageService extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private String languageServiceName;
	
	private List<String> languageServiceList;
	
	private String[] selectedLanguageServiceValues;
	
	private LanguageServiceDomain languageServiceDomain;
	
	private RandomModel randomAction;
	
	private String redirectUrl;
	
	public LanguageService(){
		
		languageServiceList = new ArrayList<String>();
		languageServiceList.add("英语");
		languageServiceList.add("日语");
		languageServiceList.add("粤语");
		languageServiceList.add("法语");
		
		selectedLanguageServiceValues = new String[languageServiceList.size()];
	}

	public String getLanguageServiceName() {
		return languageServiceName;
	}

	public void setLanguageServiceName(String languageServiceName) {
		this.languageServiceName = languageServiceName;
	}

	public List<String> getLanguageServiceList() {
		return languageServiceList;
	}

	public void setLanguageServiceList(List<String> languageServiceList) {
		this.languageServiceList = languageServiceList;
	}

	public String[] getSelectedLanguageServiceValues() {
		return selectedLanguageServiceValues;
	}

	public void setSelectedLanguageServiceValues(
			String[] selectedLanguageServiceValues) {
		this.selectedLanguageServiceValues = selectedLanguageServiceValues;
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

	public LanguageServiceDomain getLanguageServiceDomain() {
		return languageServiceDomain;
	}

	public void setLanguageServiceDomain(LanguageServiceDomain languageServiceDomain) {
		this.languageServiceDomain = languageServiceDomain;
	}

	public String execute() throws Exception{
		System.out.println(languageServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = languageServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("英语")){
				languageServiceDomain.setEnglishSkills(true);
			}else if(services[i].trim().equals("日语")){
				languageServiceDomain.setJapaneseSkills(true);
			}else if(services[i].trim().equals("粤语")){
				languageServiceDomain.setCantoneseSkills(true);
			}else if(services[i].trim().equals("法语")){
				languageServiceDomain.setFrenchSkills(true);
			}
		}
		
		session.put("languageService", languageServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedLanguageServiceValues[i] = services[i].trim();
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
		System.out.println(languageServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = languageServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("英语")){
				languageServiceDomain.setEnglishSkills(true);
			}else if(services[i].trim().equals("日语")){
				languageServiceDomain.setJapaneseSkills(true);
			}else if(services[i].trim().equals("粤语")){
				languageServiceDomain.setCantoneseSkills(true);
			}else if(services[i].trim().equals("法语")){
				languageServiceDomain.setFrenchSkills(true);
			}
		}
		
		session.put("languageService", languageServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedLanguageServiceValues[i] = services[i].trim();
		}
		redirectUrl = randomAction.getRandomDisplayAction(8);
		return "switch";
	}
}
