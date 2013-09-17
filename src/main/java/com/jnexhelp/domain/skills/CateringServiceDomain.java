package com.jnexhelp.domain.skills;


public class CateringServiceDomain {
	private Integer id;
	
	private String userId;
	
	private boolean chineseFood;
	
	private boolean westernStyleFood;
	
	private boolean japaneseFood;
	
	
	public CateringServiceDomain(){
		
	}

	public CateringServiceDomain(Integer id, String userId, boolean chineseFood, 
			boolean westernStyleFood, boolean japaneseFood){
		
		this.id = id;
		this.userId = userId;
		this.chineseFood = chineseFood;
		this.westernStyleFood = westernStyleFood;
		this.japaneseFood = japaneseFood;

	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean isChineseFood() {
		return chineseFood;
	}

	public void setChineseFood(boolean chineseFood) {
		this.chineseFood = chineseFood;
	}

	public boolean isWesternStyleFood() {
		return westernStyleFood;
	}

	public void setWesternStyleFood(boolean westernStyleFood) {
		this.westernStyleFood = westernStyleFood;
	}

	public boolean isJapaneseFood() {
		return japaneseFood;
	}

	public void setJapaneseFood(boolean japaneseFood) {
		this.japaneseFood = japaneseFood;
	}

}
