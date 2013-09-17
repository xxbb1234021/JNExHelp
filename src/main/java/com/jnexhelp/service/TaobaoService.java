package com.jnexhelp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jnexhelp.domain.skills.TaobaoServiceDomain;
import com.jnexhelp.model.RandomModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TaobaoService extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private String taobaoServiceName;
	
	private List<String> taobaoServiceList;
	
	private String[] selectedTaobaoServiceValues;
	
	private TaobaoServiceDomain taobaoServiceDomain;
	
	private RandomModel randomAction;
	
	private String redirectUrl;
	
	public TaobaoService(){
		
		taobaoServiceList = new ArrayList<String>();
		taobaoServiceList.add("网络推广");
		taobaoServiceList.add("平面设计");
		taobaoServiceList.add("淘宝排名技术");
		
		selectedTaobaoServiceValues = new String[taobaoServiceList.size()];
	}

	public String getTaobaoServiceName() {
		return taobaoServiceName;
	}

	public void setTaobaoServiceName(String taobaoServiceName) {
		this.taobaoServiceName = taobaoServiceName;
	}

	public List<String> getTaobaoServiceList() {
		return taobaoServiceList;
	}

	public void setTaobaoServiceList(List<String> taobaoServiceList) {
		this.taobaoServiceList = taobaoServiceList;
	}

	public String[] getSelectedTaobaoServiceValues() {
		return selectedTaobaoServiceValues;
	}

	public void setSelectedTaobaoServiceValues(String[] selectedTaobaoServiceValues) {
		this.selectedTaobaoServiceValues = selectedTaobaoServiceValues;
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

	public TaobaoServiceDomain getTaobaoServiceDomain() {
		return taobaoServiceDomain;
	}

	public void setTaobaoServiceDomain(TaobaoServiceDomain taobaoServiceDomain) {
		this.taobaoServiceDomain = taobaoServiceDomain;
	}

	public String execute() throws Exception{
		System.out.println(taobaoServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = taobaoServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("网络推广")){
				taobaoServiceDomain.setOnlineMarketing(true);
			}else if(services[i].trim().equals("平面设计")){
				taobaoServiceDomain.setPhotoShop(true);
			}else if(services[i].trim().equals("淘宝排名技术")){
				taobaoServiceDomain.setTaobaoRanking(true);
			}
		}
		
		session.put("taobaoService", taobaoServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedTaobaoServiceValues[i] = services[i].trim();
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
		System.out.println(taobaoServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = taobaoServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("网络推广")){
				taobaoServiceDomain.setOnlineMarketing(true);
			}else if(services[i].trim().equals("平面设计")){
				taobaoServiceDomain.setPhotoShop(true);
			}else if(services[i].trim().equals("淘宝排名技术")){
				taobaoServiceDomain.setTaobaoRanking(true);
			}
		}
		
		session.put("taobaoService", taobaoServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedTaobaoServiceValues[i] = services[i].trim();
		}
		redirectUrl = randomAction.getRandomDisplayAction(11);
		return "switch";
	}
}
