package com.jnexhelp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jnexhelp.domain.skills.ComputerPhoneServiceDomain;
import com.jnexhelp.model.RandomModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ComputerPhoneService extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private String computerPhoneServiceName;
	
	private List<String> computerPhoneServiceList;
	
	private String[] selectedComputerPhoneServiceValues;
	
	private ComputerPhoneServiceDomain computerPhoneServiceDomain;
	
	private RandomModel randomAction;
	
	private String redirectUrl;
	
	public ComputerPhoneService(){
		
		computerPhoneServiceList = new ArrayList<String>();
		computerPhoneServiceList.add("手机维修");
		computerPhoneServiceList.add("手机软件安装或升级");
		computerPhoneServiceList.add("笔记本维修");
		computerPhoneServiceList.add("台式机维修");
		computerPhoneServiceList.add("软件安装");
		computerPhoneServiceList.add("软件使用");
		computerPhoneServiceList.add("软件升级");
		computerPhoneServiceList.add("网络维护");
		computerPhoneServiceList.add("数码相机维修");
		
		selectedComputerPhoneServiceValues = new String[computerPhoneServiceList.size()];
	}

	public String getComputerPhoneServiceName() {
		return computerPhoneServiceName;
	}

	public void setComputerPhoneServiceName(String computerPhoneServiceName) {
		this.computerPhoneServiceName = computerPhoneServiceName;
	}

	public List<String> getComputerPhoneServiceList() {
		return computerPhoneServiceList;
	}

	public void setComputerPhoneServiceList(List<String> computerPhoneServiceList) {
		this.computerPhoneServiceList = computerPhoneServiceList;
	}

	public String[] getSelectedComputerPhoneServiceValues() {
		return selectedComputerPhoneServiceValues;
	}

	public void setSelectedComputerPhoneServiceValues(
			String[] selectedComputerPhoneServiceValues) {
		this.selectedComputerPhoneServiceValues = selectedComputerPhoneServiceValues;
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

	public ComputerPhoneServiceDomain getComputerPhoneServiceDomain() {
		return computerPhoneServiceDomain;
	}

	public void setComputerPhoneServiceDomain(
			ComputerPhoneServiceDomain computerPhoneServiceDomain) {
		this.computerPhoneServiceDomain = computerPhoneServiceDomain;
	}

	public String execute() throws Exception{
		System.out.println(computerPhoneServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = computerPhoneServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("手机维修")){
				computerPhoneServiceDomain.setPhoneRepair(true);
			}else if(services[i].trim().equals("手机软件安装或升级")){
				computerPhoneServiceDomain.setPhoneSoftware(true);
			}else if(services[i].trim().equals("笔记本维修")){
				computerPhoneServiceDomain.setLaptopRepair(true);
			}else if(services[i].trim().equals("台式机维修")){
				computerPhoneServiceDomain.setComputerRepair(true);
			}else if(services[i].trim().equals("软件安装")){
				computerPhoneServiceDomain.setSoftwareInstallation(true);
			}else if(services[i].trim().equals("软件使用")){
				computerPhoneServiceDomain.setSoftwareMaintain(true);
			}else if(services[i].trim().equals("软件升级")){
				computerPhoneServiceDomain.setSoftwareUpgrade(true);
			}else if(services[i].trim().equals("网络维护")){
				computerPhoneServiceDomain.setNetworkRepair(true);
			}else if(services[i].trim().equals("数码相机维修")){
				computerPhoneServiceDomain.setCameraRepair(true);
			}
		}
		
		session.put("computerPhoneService", computerPhoneServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedComputerPhoneServiceValues[i] = services[i].trim();
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
		System.out.println(computerPhoneServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = computerPhoneServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("手机维修")){
				computerPhoneServiceDomain.setPhoneRepair(true);
			}else if(services[i].trim().equals("手机软件安装或升级")){
				computerPhoneServiceDomain.setPhoneSoftware(true);
			}else if(services[i].trim().equals("笔记本维修")){
				computerPhoneServiceDomain.setLaptopRepair(true);
			}else if(services[i].trim().equals("台式机维修")){
				computerPhoneServiceDomain.setComputerRepair(true);
			}else if(services[i].trim().equals("软件安装")){
				computerPhoneServiceDomain.setSoftwareInstallation(true);
			}else if(services[i].trim().equals("软件使用")){
				computerPhoneServiceDomain.setSoftwareMaintain(true);
			}else if(services[i].trim().equals("软件升级")){
				computerPhoneServiceDomain.setSoftwareUpgrade(true);
			}else if(services[i].trim().equals("网络维护")){
				computerPhoneServiceDomain.setNetworkRepair(true);
			}else if(services[i].trim().equals("数码相机维修")){
				computerPhoneServiceDomain.setCameraRepair(true);
			}
		}
		
		session.put("computerPhoneService", computerPhoneServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedComputerPhoneServiceValues[i] = services[i].trim();
		}
		redirectUrl = randomAction.getRandomDisplayAction(4);
		return "switch";
	}
	
}
