package com.jnexhelp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jnexhelp.domain.skills.EntertainmentServiceDomain;
import com.jnexhelp.model.RandomModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EntertainmentService extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private String entertainmentServiceName;
	
	private List<String> entertainmentServiceList;
	
	private String[] selectedEntertainmentServiceValues;
	
	private EntertainmentServiceDomain entertainmentServiceDomain;
	
	private RandomModel randomAction;
	
	private String redirectUrl;
	
	public EntertainmentService(){
		
		entertainmentServiceList = new ArrayList<String>();
		entertainmentServiceList.add("羽毛球");
		entertainmentServiceList.add("兵乓球");
		entertainmentServiceList.add("网球");
		entertainmentServiceList.add("篮球");
		entertainmentServiceList.add("足球");
		entertainmentServiceList.add("台球");
		entertainmentServiceList.add("跳绳");
		entertainmentServiceList.add("游泳");
		entertainmentServiceList.add("滑冰");
		entertainmentServiceList.add("唱歌");
		entertainmentServiceList.add("声乐");
		entertainmentServiceList.add("舞蹈");
		entertainmentServiceList.add("绘画");
		
		selectedEntertainmentServiceValues = new String[entertainmentServiceList.size()];
	}

	public String getEntertainmentServiceName() {
		return entertainmentServiceName;
	}

	public void setEntertainmentServiceName(String entertainmentServiceName) {
		this.entertainmentServiceName = entertainmentServiceName;
	}

	public List<String> getEntertainmentServiceList() {
		return entertainmentServiceList;
	}

	public void setEntertainmentServiceList(List<String> entertainmentServiceList) {
		this.entertainmentServiceList = entertainmentServiceList;
	}

	public String[] getSelectedEntertainmentServiceValues() {
		return selectedEntertainmentServiceValues;
	}

	public void setSelectedEntertainmentServiceValues(
			String[] selectedEntertainmentServiceValues) {
		this.selectedEntertainmentServiceValues = selectedEntertainmentServiceValues;
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

	public EntertainmentServiceDomain getEntertainmentServiceDomain() {
		return entertainmentServiceDomain;
	}

	public void setEntertainmentServiceDomain(
			EntertainmentServiceDomain entertainmentServiceDomain) {
		this.entertainmentServiceDomain = entertainmentServiceDomain;
	}

	public String execute() throws Exception{
		System.out.println(entertainmentServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = entertainmentServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("羽毛球")){
				entertainmentServiceDomain.setBadminton(true);
			}else if(services[i].trim().equals("兵乓球")){
				entertainmentServiceDomain.setPingpong(true);
			}else if(services[i].trim().equals("网球")){
				entertainmentServiceDomain.setTennis(true);
			}else if(services[i].trim().equals("篮球")){
				entertainmentServiceDomain.setBasketball(true);
			}else if(services[i].trim().equals("足球")){
				entertainmentServiceDomain.setFootball(true);
			}else if(services[i].trim().equals("台球")){
				entertainmentServiceDomain.setBilliards(true);
			}else if(services[i].trim().equals("跳绳")){
				entertainmentServiceDomain.setRopeskipping(true);
			}else if(services[i].trim().equals("游泳")){
				entertainmentServiceDomain.setSwimming(true);
			}else if(services[i].trim().equals("滑冰")){
				entertainmentServiceDomain.setSkating(true);
			}else if(services[i].trim().equals("唱歌")){
				entertainmentServiceDomain.setSing(true);
			}else if(services[i].trim().equals("声乐")){
				entertainmentServiceDomain.setVocalist(true);
			}else if(services[i].trim().equals("舞蹈")){
				entertainmentServiceDomain.setDance(true);
			}else if(services[i].trim().equals("绘画")){
				entertainmentServiceDomain.setPainting(true);
			}
		}
		
		session.put("entertainmentService", entertainmentServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedEntertainmentServiceValues[i] = services[i].trim();
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
		System.out.println(entertainmentServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = entertainmentServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("羽毛球")){
				entertainmentServiceDomain.setBadminton(true);
			}else if(services[i].trim().equals("兵乓球")){
				entertainmentServiceDomain.setPingpong(true);
			}else if(services[i].trim().equals("网球")){
				entertainmentServiceDomain.setTennis(true);
			}else if(services[i].trim().equals("篮球")){
				entertainmentServiceDomain.setBasketball(true);
			}else if(services[i].trim().equals("足球")){
				entertainmentServiceDomain.setFootball(true);
			}else if(services[i].trim().equals("台球")){
				entertainmentServiceDomain.setBilliards(true);
			}else if(services[i].trim().equals("跳绳")){
				entertainmentServiceDomain.setRopeskipping(true);
			}else if(services[i].trim().equals("游泳")){
				entertainmentServiceDomain.setSwimming(true);
			}else if(services[i].trim().equals("滑冰")){
				entertainmentServiceDomain.setSkating(true);
			}else if(services[i].trim().equals("唱歌")){
				entertainmentServiceDomain.setSing(true);
			}else if(services[i].trim().equals("声乐")){
				entertainmentServiceDomain.setVocalist(true);
			}else if(services[i].trim().equals("舞蹈")){
				entertainmentServiceDomain.setDance(true);
			}else if(services[i].trim().equals("绘画")){
				entertainmentServiceDomain.setPainting(true);
			}
		}
		
		session.put("entertainmentService", entertainmentServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedEntertainmentServiceValues[i] = services[i].trim();
		}
		
		redirectUrl = randomAction.getRandomDisplayAction(5);
		return "switch";
	}
}
