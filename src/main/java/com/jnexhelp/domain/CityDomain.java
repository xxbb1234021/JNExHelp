package com.jnexhelp.domain;

public class CityDomain {
	
	private Integer id;
	
	private String cityId;
	
	private String cityName;
	
	
	public CityDomain(){
		
	}
	
	public CityDomain(Integer id, String cityId, String cityName){
		this.id = id;
		this.cityId = cityId;
		this.cityName = cityName;
		
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	

}
