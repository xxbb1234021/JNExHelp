package com.jnexhelp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jnexhelp.domain.skills.CateringServiceDomain;
import com.jnexhelp.model.RandomModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CateringService extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String cateringServiceName;
	
	private List<String> cateringServiceList;
	
	private String[] selectedCateringServiceValues;
	
	private CateringServiceDomain cateringServiceDomain;
	
	private RandomModel randomAction;
	
	private String redirectUrl;
	
	public CateringService(){
		cateringServiceList = new ArrayList<String>();
		
		cateringServiceList.add("中餐烹饪");
		cateringServiceList.add("西餐");
		cateringServiceList.add("日本料理");
		
		selectedCateringServiceValues = new String[cateringServiceList.size()];
	}

	public String getCateringServiceName() {
		return cateringServiceName;
	}

	public void setCateringServiceName(String cateringServiceName) {
		this.cateringServiceName = cateringServiceName;
	}

	public List<String> getCateringServiceList() {
		return cateringServiceList;
	}

	public void setCateringServiceList(List<String> cateringServiceList) {
		this.cateringServiceList = cateringServiceList;
	}

	public String[] getSelectedCateringServiceValues() {
		return selectedCateringServiceValues;
	}

	public void setSelectedCateringServiceValues(
			String[] selectedCateringServiceValues) {
		this.selectedCateringServiceValues = selectedCateringServiceValues;
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

	public CateringServiceDomain getCateringServiceDomain() {
		return cateringServiceDomain;
	}

	public void setCateringServiceDomain(CateringServiceDomain cateringServiceDomain) {
		this.cateringServiceDomain = cateringServiceDomain;
	}

	public String execute() throws Exception{
		System.out.println(cateringServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = cateringServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("中餐烹饪")){
				cateringServiceDomain.setChineseFood(true);
			}else if(services[i].trim().equals("西餐")){
				cateringServiceDomain.setWesternStyleFood(true);
			}else if(services[i].trim().equals("日本料理")){
				cateringServiceDomain.setJapaneseFood(true);
			}
		}
		
		session.put("cateringService", cateringServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedCateringServiceValues[i] = services[i].trim();
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
		System.out.println(cateringServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = cateringServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("中餐烹饪")){
				cateringServiceDomain.setChineseFood(true);
			}else if(services[i].trim().equals("西餐")){
				cateringServiceDomain.setWesternStyleFood(true);
			}else if(services[i].trim().equals("日本料理")){
				cateringServiceDomain.setJapaneseFood(true);
			}
		}
		
		session.put("cateringService", cateringServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedCateringServiceValues[i] = services[i].trim();
		}
		redirectUrl = randomAction.getRandomDisplayAction(1);
		return "switch";
	}
}
