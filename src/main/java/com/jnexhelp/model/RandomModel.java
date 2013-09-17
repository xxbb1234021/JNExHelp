package com.jnexhelp.model;

import java.util.Random;

public class RandomModel {
	
	
	private String randomDisplayAction;
	
	public RandomModel(){
		
	}

	public String getRandomDisplayAction() {
		Random rd = new Random();
		int action = rd.nextInt(12);
		
		switch(action){
			case 0 :
				randomDisplayAction = "beautifyServiceDisplayAction";
				break;
			case 1 :
				randomDisplayAction = "cateringServiceDisplayAction";
				break;
			case 2 :
				randomDisplayAction = "chessGameServiceDisplayAction";
				break;
			case 3 :
				randomDisplayAction = "chineseMedicineServiceDisplayAction";
				break;
			case 4 :
				randomDisplayAction = "computerPhoneServiceDisplayAction";
				break;
			case 5 :
				randomDisplayAction = "entertainmentServiceDisplayAction";
				break;
			case 6 :
				randomDisplayAction = "homeRepairServiceDisplayAction";
				break;
			case 7 :
				randomDisplayAction = "houseServiceDisplayAction";
				break;
			case 8 :
				randomDisplayAction = "languageServiceDisplayAction";
				break;
			case 9 :
				randomDisplayAction = "legalServiceDisplayAction";
				break;
			case 10 :
				randomDisplayAction = "stockServiceDisplayAction";
				break;
			case 11 :
				randomDisplayAction = "taobaoServiceDisplayAction";
				break;
			
			default :
				randomDisplayAction = "homeRepairServiceDisplayAction";
		}
		
		return randomDisplayAction;
	}
	
	public String getRandomDisplayAction(int i) {
		
		int action = getActionId(i);
		
		switch(action){
			case 0 :
				randomDisplayAction = "beautifyServiceDisplayAction";
				break;
			case 1 :
				randomDisplayAction = "cateringServiceDisplayAction";
				break;
			case 2 :
				randomDisplayAction = "chessGameServiceDisplayAction";
				break;
			case 3 :
				randomDisplayAction = "chineseMedicineServiceDisplayAction";
				break;
			case 4 :
				randomDisplayAction = "computerPhoneServiceDisplayAction";
				break;
			case 5 :
				randomDisplayAction = "entertainmentServiceDisplayAction";
				break;
			case 6 :
				randomDisplayAction = "homeRepairServiceDisplayAction";
				break;
			case 7 :
				randomDisplayAction = "houseServiceDisplayAction";
				break;
			case 8 :
				randomDisplayAction = "languageServiceDisplayAction";
				break;
			case 9 :
				randomDisplayAction = "legalServiceDisplayAction";
				break;
			case 10 :
				randomDisplayAction = "stockServiceDisplayAction";
				break;
			case 11 :
				randomDisplayAction = "taobaoServiceDisplayAction";
				break;
			default :
				randomDisplayAction = "homeRepairServiceDisplayAction";
		}
		
		return randomDisplayAction;
		
	}
	
	public void setRandomDisplayAction(String randomAction) {
		this.randomDisplayAction = randomAction;
	}
	
	public int getActionId(int i){
		int actionId = 0;
//		Random rd = new Random();
//		actionId = rd.nextInt(12);
//		
//		if(actionId == i){
//			actionId = getActionId(i);
//		}
		
		actionId = (i+1) % 12;
		
		return actionId;
	}
	
}
