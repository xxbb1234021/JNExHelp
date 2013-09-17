package com.jnexhelp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jnexhelp.domain.skills.StockServiceDomain;
import com.jnexhelp.model.RandomModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StockService extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private String stockServiceName;
	
	private List<String> stockServiceList;
	
	private String[] selectedStockServiceValues;
	
	private StockServiceDomain stockServiceDomain;
	
	private RandomModel randomAction;
	
	private String redirectUrl;
	
	public StockService(){
		
		stockServiceList = new ArrayList<String>();
		stockServiceList.add("股票点评");
		stockServiceList.add("个股推荐");
		
		selectedStockServiceValues = new String[stockServiceList.size()];
	}

	public String getStockServiceName() {
		return stockServiceName;
	}

	public void setStockServiceName(String stockServiceName) {
		this.stockServiceName = stockServiceName;
	}

	public List<String> getStockServiceList() {
		return stockServiceList;
	}

	public void setStockServiceList(List<String> stockServiceList) {
		this.stockServiceList = stockServiceList;
	}

	public String[] getSelectedStockServiceValues() {
		return selectedStockServiceValues;
	}

	public void setSelectedStockServiceValues(String[] selectedStockServiceValues) {
		this.selectedStockServiceValues = selectedStockServiceValues;
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

	public StockServiceDomain getStockServiceDomain() {
		return stockServiceDomain;
	}

	public void setStockServiceDomain(StockServiceDomain stockServiceDomain) {
		this.stockServiceDomain = stockServiceDomain;
	}

	public String execute() throws Exception{
		System.out.println(stockServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = stockServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("股票点评")){
				stockServiceDomain.setStockOpinion(true);
			}else if(services[i].trim().equals("个股推荐")){
				stockServiceDomain.setStockRecommend(true);
			}
		}
		
		session.put("stockService", stockServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedStockServiceValues[i] = services[i].trim();
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
		System.out.println(stockServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = stockServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("股票点评")){
				stockServiceDomain.setStockOpinion(true);
			}else if(services[i].trim().equals("个股推荐")){
				stockServiceDomain.setStockRecommend(true);
			}
		}
		
		session.put("stockService", stockServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedStockServiceValues[i] = services[i].trim();
		}
		redirectUrl = randomAction.getRandomDisplayAction(10);
		return "switch";
	}
	
}
