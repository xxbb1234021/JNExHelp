package com.jnexhelp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jnexhelp.domain.skills.HomeRepairServiceDomain;
import com.jnexhelp.model.RandomModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HomeRepairService extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private String homeRepairServiceName;
	
	private List<String> homeRepairServiceList;
	
	private String[] selectedHomeRepairServiceValues;
	
	private HomeRepairServiceDomain homeRepairServiceDomain;
	
	private RandomModel randomAction;
	
	private String redirectUrl;
	
	public HomeRepairService(){
		
		homeRepairServiceList = new ArrayList<String>();
		homeRepairServiceList.add("防水补漏");
		homeRepairServiceList.add("马桶维修");
		homeRepairServiceList.add("空调维修");
		homeRepairServiceList.add("空调清洗");
		homeRepairServiceList.add("换灯泡");
		homeRepairServiceList.add("沙发修补");
		
		selectedHomeRepairServiceValues = new String[homeRepairServiceList.size()];
	}

	public String getHomeRepairServiceName() {
		return homeRepairServiceName;
	}

	public void setHomeRepairServiceName(String homeRepairServiceName) {
		this.homeRepairServiceName = homeRepairServiceName;
	}

	public List<String> getHomeRepairServiceList() {
		return homeRepairServiceList;
	}

	public void setHomeRepairServiceList(List<String> homeRepairServiceList) {
		this.homeRepairServiceList = homeRepairServiceList;
	}

	public String[] getSelectedHomeRepairServiceValues() {
		return selectedHomeRepairServiceValues;
	}

	public void setSelectedHomeRepairServiceValues(
			String[] selectedHomeRepairServiceValues) {
		this.selectedHomeRepairServiceValues = selectedHomeRepairServiceValues;
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

	public HomeRepairServiceDomain getHomeRepairServiceDomain() {
		return homeRepairServiceDomain;
	}

	public void setHomeRepairServiceDomain(
			HomeRepairServiceDomain homeRepairServiceDomain) {
		this.homeRepairServiceDomain = homeRepairServiceDomain;
	}

	public String execute() throws Exception{
		System.out.println(homeRepairServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = homeRepairServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("防水补漏")){
				homeRepairServiceDomain.setWaterproofLeak(true);
			}else if(services[i].trim().equals("马桶维修")){
				homeRepairServiceDomain.setToiletMaintenance(true);
			}else if(services[i].trim().equals("空调维修")){
				homeRepairServiceDomain.setAirCondMaintenance(true);
			}else if(services[i].trim().equals("空调清洗")){
				homeRepairServiceDomain.setAirCondCleaning(true);
			}else if(services[i].trim().equals("换灯泡")){
				homeRepairServiceDomain.setLightBulbs(true);
			}else if(services[i].trim().equals("沙发修补")){
				homeRepairServiceDomain.setSofaRepair(true);
			}
		}
		
		session.put("homeRepairService", homeRepairServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedHomeRepairServiceValues[i] = services[i].trim();
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
		System.out.println(homeRepairServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = homeRepairServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("防水补漏")){
				homeRepairServiceDomain.setWaterproofLeak(true);
			}else if(services[i].trim().equals("马桶维修")){
				homeRepairServiceDomain.setToiletMaintenance(true);
			}else if(services[i].trim().equals("空调维修")){
				homeRepairServiceDomain.setAirCondMaintenance(true);
			}else if(services[i].trim().equals("空调清洗")){
				homeRepairServiceDomain.setAirCondCleaning(true);
			}else if(services[i].trim().equals("换灯泡")){
				homeRepairServiceDomain.setLightBulbs(true);
			}else if(services[i].trim().equals("沙发修补")){
				homeRepairServiceDomain.setSofaRepair(true);
			}
		}
		
		session.put("homeRepairService", homeRepairServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedHomeRepairServiceValues[i] = services[i].trim();
		}
		redirectUrl = randomAction.getRandomDisplayAction(6);
		return "switch";
	}
}
