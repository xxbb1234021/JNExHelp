package com.jnexhelp.action;

import java.util.ArrayList;
import java.util.List;

import com.jnexhelp.dao.CityDao;
import com.jnexhelp.domain.CityDomain;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;


public class CitySelectAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String result;
	private CityDao cityDao;
	private CityDomain cityDomain;
	private String cityCode;
	private String areaCode;
	private String regionCode;
	

	public String getRegionCode() {
		return regionCode;
	}


	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}


	public String getAreaCode() {
		return areaCode;
	}


	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}


	public String getCityCode() {
		return cityCode;
	}


	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}


	public CityDao getCityDao() {
		return cityDao;
	}


	public void setCityDao(CityDao cityDao) {
		this.cityDao = cityDao;
	}


	public CityDomain getCityDomain() {
		return cityDomain;
	}


	public void setCityDomain(CityDomain cityDomain) {
		this.cityDomain = cityDomain;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}
	
	public String selectRegion() throws Exception{
		List<CityDomain> regionList = cityDao.findByCityId("%000");
		JSONArray  jsonArray = JSONArray.fromObject( regionList ); 
		this.result = jsonArray.toString();
		return SUCCESS;
	}
	
	public String selectCity() throws Exception{
		
		String regionCode_ = regionCode.charAt(0)+"%"+regionCode.charAt(2)+regionCode.charAt(3);
		
		List<CityDomain> tmpCityList = cityDao.findByCityId(regionCode_);
		List<CityDomain> cityList = new ArrayList<CityDomain>();
		
		cityList.add(new CityDomain(0000,"0000","ѡ�����"));
		
		for(CityDomain cityDomain : tmpCityList){
			if (!cityDomain.getCityId().equals(regionCode)){
				cityList.add(cityDomain);
			}
		}
		JSONArray jsonArray = JSONArray.fromObject(cityList);    
		this.result=jsonArray.toString();  
		return SUCCESS;
	}
	
	public String selectArea() throws Exception{
		String citycode_ = Character.toString(cityCode.charAt(0))+Character.toString(cityCode.charAt(1))
				+"%"+Character.toString(cityCode.charAt(3));

		List<CityDomain> tmpArealist=cityDao.findByCityId(citycode_);    
		
		List<CityDomain> areaList = new ArrayList<CityDomain>();
		areaList.add(new CityDomain(0000,"0000","ѡ������"));
		for(CityDomain cityDomain : tmpArealist){
			if (!cityDomain.getCityId().equals(cityCode)){
				areaList.add(cityDomain);
			}
		}

		JSONArray jsonArray = JSONArray.fromObject(areaList);    
		this.result=jsonArray.toString();    
		return SUCCESS;
		
	}
	
	public String selectStreet() throws Exception{
		
		String areacode_ = Character.toString(this.areaCode.charAt(0))
				+ Character.toString(this.areaCode.charAt(1))+Character.toString(areaCode.charAt(2))+"%";

		List<CityDomain> tmpStreetlist=cityDao.findByCityId(areacode_);    
		
		List<CityDomain> streetList = new ArrayList<CityDomain>();
		streetList.add(new CityDomain(0000,"0000","ѡ��λ��"));
		for(CityDomain cityDomain : tmpStreetlist){
			if (!cityDomain.getCityId().equals(areaCode)){
				streetList.add(cityDomain);
			}
		}

		JSONArray jsonArray = JSONArray.fromObject(streetList);    
		this.result=jsonArray.toString();    
		return SUCCESS;
		
	}

}
