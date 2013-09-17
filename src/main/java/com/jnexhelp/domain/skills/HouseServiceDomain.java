package com.jnexhelp.domain.skills;

public class HouseServiceDomain {
	
	private Integer id;
	private String userId;
	
	private boolean rentHouse;
	private boolean shareRentHouse;
	private boolean tempRentHouse;
	private boolean officeRental;
	private boolean sHouseDeal;
	private boolean nHouseDeal;
	private boolean officeSell;
	private boolean plantRental;
	private boolean warehousesRental;
	private boolean parkingRent;
	

	public HouseServiceDomain(){
		
	}

	public HouseServiceDomain(Integer id, String userId, boolean rentHouse,
			boolean shareRentHouse, boolean tempRentHouse, boolean officeRental,
			boolean sHouseDeal, boolean nHouseDeal, boolean officeSell,
			boolean plantRental, boolean warehousesRental, boolean parkingRent){
		this.id = id;
		this.userId = userId;
		this.rentHouse = rentHouse;
		this.shareRentHouse = shareRentHouse;
		this.tempRentHouse = tempRentHouse;
		this.officeRental = officeRental;
		this.sHouseDeal = sHouseDeal;
		this.nHouseDeal = nHouseDeal;
		this.officeSell = officeRental;
		this.plantRental = plantRental;
		this.warehousesRental = warehousesRental;
		this.parkingRent = parkingRent;
		
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

	public boolean isRentHouse() {
		return rentHouse;
	}

	public void setRentHouse(boolean rentHouse) {
		this.rentHouse = rentHouse;
	}

	public boolean isShareRentHouse() {
		return shareRentHouse;
	}

	public void setShareRentHouse(boolean shareRentHouse) {
		this.shareRentHouse = shareRentHouse;
	}

	public boolean isTempRentHouse() {
		return tempRentHouse;
	}

	public void setTempRentHouse(boolean tempRentHouse) {
		this.tempRentHouse = tempRentHouse;
	}

	public boolean isOfficeRental() {
		return officeRental;
	}

	public void setOfficeRental(boolean officeRental) {
		this.officeRental = officeRental;
	}

	public boolean issHouseDeal() {
		return sHouseDeal;
	}

	public void setsHouseDeal(boolean sHouseDeal) {
		this.sHouseDeal = sHouseDeal;
	}

	public boolean isnHouseDeal() {
		return nHouseDeal;
	}

	public void setnHouseDeal(boolean nHouseDeal) {
		this.nHouseDeal = nHouseDeal;
	}

	public boolean isOfficeSell() {
		return officeSell;
	}

	public void setOfficeSell(boolean officeSell) {
		this.officeSell = officeSell;
	}

	public boolean isPlantRental() {
		return plantRental;
	}

	public void setPlantRental(boolean plantRental) {
		this.plantRental = plantRental;
	}

	public boolean isWarehousesRental() {
		return warehousesRental;
	}

	public void setWarehousesRental(boolean warehousesRental) {
		this.warehousesRental = warehousesRental;
	}

	public boolean isParkingRent() {
		return parkingRent;
	}

	public void setParkingRent(boolean parkingRent) {
		this.parkingRent = parkingRent;
	}

}
