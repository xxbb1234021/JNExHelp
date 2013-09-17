package com.jnexhelp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jnexhelp.domain.skills.BeautifyServiceDomain;
import com.jnexhelp.model.RandomModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BeautifyService extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String beautifyServiceName;
	
	private List<String> beautifyServiceList;
	
	private String[] selectedBeautifyServiceValues;
	
	BeautifyServiceDomain beautifyServiceDomain;
	
	private RandomModel randomAction;
	
	private String redirectUrl;
	
	public BeautifyService(){
		beautifyServiceList = new ArrayList<String>();
		
		beautifyServiceList.add("服饰搭配");
		beautifyServiceList.add("发型打理");
		beautifyServiceList.add("面部化妆");
		beautifyServiceList.add("美容知识");
		
		selectedBeautifyServiceValues = new String[beautifyServiceList.size()];
	}
		
	public String getBeautifyServiceName() {
		return beautifyServiceName;
	}

	public void setBeautifyServiceName(String beautifyServiceName) {
		this.beautifyServiceName = beautifyServiceName;
	}

	public List<String> getBeautifyServiceList() {
		return beautifyServiceList;
	}

	public void setBeautifyServiceList(List<String> beautifyServiceList) {
		this.beautifyServiceList = beautifyServiceList;
	}

	public String[] getSelectedBeautifyServiceValues() {
		return selectedBeautifyServiceValues;
	}

	public void setSelectedBeautifyServiceValues(
			String[] selectedBeautifyServiceValues) {
		this.selectedBeautifyServiceValues = selectedBeautifyServiceValues;
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

	public BeautifyServiceDomain getBeautifyServiceDomain() {
		return beautifyServiceDomain;
	}

	public void setBeautifyServiceDomain(BeautifyServiceDomain beautifyServiceDomain) {
		this.beautifyServiceDomain = beautifyServiceDomain;
	}

	public String execute() throws Exception{
		System.out.println(beautifyServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = beautifyServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("服饰搭配")){
				beautifyServiceDomain.setClothingMatching(true);
			}else if(services[i].trim().equals("发型打理")){
				beautifyServiceDomain.setHairCare(true);
			}else if(services[i].trim().equals("面部化妆")){
				beautifyServiceDomain.setFacialMakeup(true);
			}else if(services[i].trim().equals("美容知识")){
				beautifyServiceDomain.setBeautyKnowledge(true);
			}
		}
		
		session.put("beautifyService", beautifyServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedBeautifyServiceValues[i] = services[i].trim();
		}
		return SUCCESS;
	}
	
	public String display() throws Exception{

		return NONE;
	}
	
	public String switchSkill() throws Exception{
		System.out.println(beautifyServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = beautifyServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("服饰搭配")){
				beautifyServiceDomain.setClothingMatching(true);
			}else if(services[i].trim().equals("发型打理")){
				beautifyServiceDomain.setHairCare(true);
			}else if(services[i].trim().equals("面部化妆")){
				beautifyServiceDomain.setFacialMakeup(true);
			}else if(services[i].trim().equals("美容知识")){
				beautifyServiceDomain.setBeautyKnowledge(true);
			}
		}
		
		session.put("beautifyService", beautifyServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedBeautifyServiceValues[i] = services[i].trim();
		}
		
		redirectUrl = randomAction.getRandomDisplayAction(0);
		return "switch";
	}

}
