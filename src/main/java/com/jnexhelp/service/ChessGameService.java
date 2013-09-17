package com.jnexhelp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jnexhelp.domain.skills.ChessGameServiceDomain;
import com.jnexhelp.model.RandomModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ChessGameService extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private String chessGameServiceName;
	
	private List<String> chessGameServiceList;
	
	private String[] selectedChessGameServiceValues;
	
	private ChessGameServiceDomain chessGameServiceDomain;
	
	private RandomModel randomAction;
	
	private String redirectUrl;
	
	public ChessGameService(){
		chessGameServiceList = new ArrayList<String>();
		
		chessGameServiceList.add("五子棋");
		chessGameServiceList.add("军棋");
		chessGameServiceList.add("中国象棋");
		chessGameServiceList.add("围棋");
		chessGameServiceList.add("国际象棋");
		chessGameServiceList.add("跳棋");
		
		selectedChessGameServiceValues = new String[chessGameServiceList.size()];
	}
	
	public String getChessGameServiceName() {
		return chessGameServiceName;
	}


	public void setChessGameServiceName(String chessGameServiceName) {
		this.chessGameServiceName = chessGameServiceName;
	}


	public List<String> getChessGameServiceList() {
		return chessGameServiceList;
	}


	public void setChessGameServiceList(List<String> chessGameServiceList) {
		this.chessGameServiceList = chessGameServiceList;
	}


	public String[] getSelectedChessGameServiceValues() {
		return selectedChessGameServiceValues;
	}


	public void setSelectedChessGameServiceValues(
			String[] selectedChessGameServiceValues) {
		this.selectedChessGameServiceValues = selectedChessGameServiceValues;
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

	public ChessGameServiceDomain getChessGameServiceDomain() {
		return chessGameServiceDomain;
	}

	public void setChessGameServiceDomain(
			ChessGameServiceDomain chessGameServiceDomain) {
		this.chessGameServiceDomain = chessGameServiceDomain;
	}

	public String execute() throws Exception{
		System.out.println(chessGameServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = chessGameServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("五子棋")){
				chessGameServiceDomain.setGobang(true);
			}else if(services[i].trim().equals("军棋")){
				chessGameServiceDomain.setMilitaryChess(true);
			}else if(services[i].trim().equals("中国象棋")){
				chessGameServiceDomain.setChineseChess(true);
			}else if(services[i].trim().equals("围棋")){
				chessGameServiceDomain.setGoGame(true);
			}else if(services[i].trim().equals("国际象棋")){
				chessGameServiceDomain.setChess(true);
			}else if(services[i].trim().equals("跳棋")){
				chessGameServiceDomain.setChineseCheckers(true);
			}
		}
		
		session.put("chessGameService", chessGameServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedChessGameServiceValues[i] = services[i].trim();
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
		System.out.println(chessGameServiceName);
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		
		String services[] = chessGameServiceName.split(",");
		
		for(int i=0;i<services.length;i++){
			if(services[i].trim().equals("五子棋")){
				chessGameServiceDomain.setGobang(true);
			}else if(services[i].trim().equals("军棋")){
				chessGameServiceDomain.setMilitaryChess(true);
			}else if(services[i].trim().equals("中国象棋")){
				chessGameServiceDomain.setChineseChess(true);
			}else if(services[i].trim().equals("围棋")){
				chessGameServiceDomain.setGoGame(true);
			}else if(services[i].trim().equals("国际象棋")){
				chessGameServiceDomain.setChess(true);
			}else if(services[i].trim().equals("跳棋")){
				chessGameServiceDomain.setChineseCheckers(true);
			}
		}
		
		session.put("chessGameService", chessGameServiceDomain);
		
		for(int i=0;i<services.length;i++){
			selectedChessGameServiceValues[i] = services[i].trim();
		}
		redirectUrl = randomAction.getRandomDisplayAction(2);
		return "switch";
	}
	
}
