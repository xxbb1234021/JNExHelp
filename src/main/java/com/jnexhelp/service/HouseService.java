package com.jnexhelp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jnexhelp.domain.skills.HouseServiceDomain;
import com.jnexhelp.model.RandomModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HouseService extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private String houseServiceName;
	
	private List<String> houseServiceList;
	
	private String[] selectedHouseServiceValues;
	
	private HouseServiceDomain houseServiceDomain;
	
	private RandomModel randomAction;
	
	private String redirectUrl;
	
	public HouseService(){
		
		houseServiceList = new ArrayList<String>();
		houseServiceList.add("出租房屋");
		houseServiceList.add("合租房屋");
		houseServiceList.add("短租房屋");
		houseServiceList.add("写字楼出租");
		houseServiceList.add("二手房出售");
		houseServiceList.add("新房出售");
		houseServiceList.add("写字楼出售");
		houseServiceList.add("厂房出租");
		houseServiceList.add("仓库出租");
		houseServiceList.add("车位出租");
		
		selectedHouseServiceValues = new String[houseServiceList.size()];
	}

	public String getHouseServiceName() {
		return houseServiceName;
	}

	public void setHouseServiceName(String houseServiceName) {
		this.houseServiceName = houseServiceName;
	}

	public List<String> getHouseServiceList() {
		return houseServiceList;
	}

	public void setHouseServiceList(List<String> houseServiceList) {
		this.houseServiceList = houseServiceList;
	}

	public String[] getSelectedHouseServiceValues() {
		return selectedHouseServiceValues;
	}

	public void setSelectedHouseServiceValues(String[] selectedHouseServiceValues) {
		this.selectedHouseServiceValues = selectedHouseServiceValues;
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

	public HouseServiceDomain getHouseServiceDomain() {
		return houseServiceDomain;
	}

	public void setHouseServiceDomain(HouseServiceDomain houseServiceDomain) {
		this.houseServiceDomain = houseServiceDomain;
	}

	public String execute() throws Exception{
		System.out.println(houseServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = houseServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("出租房屋")){
				houseServiceDomain.setRentHouse(true);
			}else if(services[i].trim().equals("合租房屋")){
				houseServiceDomain.setShareRentHouse(true);
			}else if(services[i].trim().equals("短租房屋")){
				houseServiceDomain.setTempRentHouse(true);
			}else if(services[i].trim().equals("写字楼出租")){
				houseServiceDomain.setOfficeRental(true);
			}else if(services[i].trim().equals("二手房出售")){
				houseServiceDomain.setsHouseDeal(true);
			}else if(services[i].trim().equals("新房出售")){
				houseServiceDomain.setnHouseDeal(true);
			}else if(services[i].trim().equals("写字楼出售")){
				houseServiceDomain.setOfficeSell(true);
			}else if(services[i].trim().equals("厂房出租")){
				houseServiceDomain.setPlantRental(true);
			}else if(services[i].trim().equals("仓库出租")){
				houseServiceDomain.setWarehousesRental(true);
			}else if(services[i].trim().equals("车位出租")){
				houseServiceDomain.setParkingRent(true);
			}
		}
		
		session.put("houseService", houseServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedHouseServiceValues[i] = services[i].trim();
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
		System.out.println(houseServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = houseServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("出租房屋")){
				houseServiceDomain.setRentHouse(true);
			}else if(services[i].trim().equals("合租房屋")){
				houseServiceDomain.setShareRentHouse(true);
			}else if(services[i].trim().equals("短租房屋")){
				houseServiceDomain.setTempRentHouse(true);
			}else if(services[i].trim().equals("写字楼出租")){
				houseServiceDomain.setOfficeRental(true);
			}else if(services[i].trim().equals("二手房出售")){
				houseServiceDomain.setsHouseDeal(true);
			}else if(services[i].trim().equals("新房出售")){
				houseServiceDomain.setnHouseDeal(true);
			}else if(services[i].trim().equals("写字楼出售")){
				houseServiceDomain.setOfficeSell(true);
			}else if(services[i].trim().equals("厂房出租")){
				houseServiceDomain.setPlantRental(true);
			}else if(services[i].trim().equals("仓库出租")){
				houseServiceDomain.setWarehousesRental(true);
			}else if(services[i].trim().equals("车位出租")){
				houseServiceDomain.setParkingRent(true);
			}
		}
		
		session.put("houseService", houseServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedHouseServiceValues[i] = services[i].trim();
		}
		redirectUrl = randomAction.getRandomDisplayAction(7);
		return "switch";
	}
}
