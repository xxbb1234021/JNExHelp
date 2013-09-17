package com.jnexhelp.domain.skills;


public class HomeRepairServiceDomain {
	
	private Integer id;
	
	private String userId;
	
	private boolean waterproofLeak;
	
	private boolean toiletMaintenance;
	
	private boolean airCondMaintenance;
	
	private boolean airCondCleaning;
	
	private boolean lightBulbs;
	
	private boolean sofaRepair;
	
	
	public HomeRepairServiceDomain(){
		
	}
	
	public HomeRepairServiceDomain(Integer id, String userId, boolean waterproofLeak,
			boolean toiletMaintenance, boolean airCondMaintenance,boolean airCondCleaning,
			boolean lightBulbs,boolean sofaRepair){
		
		this.id = id;
		this.userId = userId;
		this.waterproofLeak = waterproofLeak;
		this.toiletMaintenance = toiletMaintenance;
		this.airCondMaintenance = airCondMaintenance;
		this.airCondCleaning = airCondCleaning;
		this.lightBulbs = lightBulbs;
		this.sofaRepair = sofaRepair;
		
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

	public boolean isWaterproofLeak() {
		return waterproofLeak;
	}

	public void setWaterproofLeak(boolean waterproofLeak) {
		this.waterproofLeak = waterproofLeak;
	}

	public boolean isToiletMaintenance() {
		return toiletMaintenance;
	}

	public void setToiletMaintenance(boolean toiletMaintenance) {
		this.toiletMaintenance = toiletMaintenance;
	}

	public boolean isAirCondMaintenance() {
		return airCondMaintenance;
	}

	public void setAirCondMaintenance(boolean airCondMaintenance) {
		this.airCondMaintenance = airCondMaintenance;
	}

	public boolean isAirCondCleaning() {
		return airCondCleaning;
	}

	public void setAirCondCleaning(boolean airCondCleaning) {
		this.airCondCleaning = airCondCleaning;
	}

	public boolean isLightBulbs() {
		return lightBulbs;
	}

	public void setLightBulbs(boolean lightBulbs) {
		this.lightBulbs = lightBulbs;
	}

	public boolean isSofaRepair() {
		return sofaRepair;
	}

	public void setSofaRepair(boolean sofaRepair) {
		this.sofaRepair = sofaRepair;
	}
}
