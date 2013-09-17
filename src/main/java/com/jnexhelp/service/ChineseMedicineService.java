package com.jnexhelp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jnexhelp.domain.skills.ChineseMedicineServiceDomain;
import com.jnexhelp.model.RandomModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ChineseMedicineService extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	private String chineseMedicineServiceName;
	
	private List<String> chineseMedicineServiceList;
	
	private String[] selectedChineseMedicineServiceValues;
	
	private ChineseMedicineServiceDomain chineseMedicineServiceDomain;
	
	private RandomModel randomAction;
	
	private String redirectUrl;
	
	public ChineseMedicineService(){
		
		chineseMedicineServiceList = new ArrayList<String>();
		chineseMedicineServiceList.add("中医掌纹诊病");
		chineseMedicineServiceList.add("刮痧");
		chineseMedicineServiceList.add("拔罐");
		chineseMedicineServiceList.add("中医推拿");
		
		selectedChineseMedicineServiceValues = new String[chineseMedicineServiceList.size()];
	}
	
	
	
	public String getChineseMedicineServiceName() {
		return chineseMedicineServiceName;
	}



	public void setChineseMedicineServiceName(String chineseMedicineServiceName) {
		this.chineseMedicineServiceName = chineseMedicineServiceName;
	}



	public List<String> getChineseMedicineServiceList() {
		return chineseMedicineServiceList;
	}



	public void setChineseMedicineServiceList(
			List<String> chineseMedicineServiceList) {
		this.chineseMedicineServiceList = chineseMedicineServiceList;
	}



	public String[] getSelectedChineseMedicineServiceValues() {
		return selectedChineseMedicineServiceValues;
	}



	public void setSelectedChineseMedicineServiceValues(
			String[] selectedChineseMedicineServiceValues) {
		this.selectedChineseMedicineServiceValues = selectedChineseMedicineServiceValues;
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


	public ChineseMedicineServiceDomain getChineseMedicineServiceDomain() {
		return chineseMedicineServiceDomain;
	}


	public void setChineseMedicineServiceDomain(
			ChineseMedicineServiceDomain chineseMedicineServiceDomain) {
		this.chineseMedicineServiceDomain = chineseMedicineServiceDomain;
	}



	public String execute() throws Exception{
		System.out.println(chineseMedicineServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = chineseMedicineServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("中医掌纹诊病")){
				chineseMedicineServiceDomain.setPalmprintDiagnosis(true);
			}else if(services[i].trim().equals("刮痧")){
				chineseMedicineServiceDomain.setGuaSha(true);
			}else if(services[i].trim().equals("拔罐")){
				chineseMedicineServiceDomain.setCuppingTherapy(true);
			}else if(services[i].trim().equals("中医推拿")){
				chineseMedicineServiceDomain.setChineseMassage(true);
			}
		}
		
		session.put("chineseMedicineService", chineseMedicineServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedChineseMedicineServiceValues[i] = services[i].trim();
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
		System.out.println(chineseMedicineServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = chineseMedicineServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("中医掌纹诊病")){
				chineseMedicineServiceDomain.setPalmprintDiagnosis(true);
			}else if(services[i].trim().equals("刮痧")){
				chineseMedicineServiceDomain.setGuaSha(true);
			}else if(services[i].trim().equals("拔罐")){
				chineseMedicineServiceDomain.setCuppingTherapy(true);
			}else if(services[i].trim().equals("中医推拿")){
				chineseMedicineServiceDomain.setChineseMassage(true);
			}
		}
		
		session.put("chineseMedicineService", chineseMedicineServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedChineseMedicineServiceValues[i] = services[i].trim();
		}
		redirectUrl = randomAction.getRandomDisplayAction(3);
		return "switch";
	}
}
