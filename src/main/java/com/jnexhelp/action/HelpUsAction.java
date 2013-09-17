package com.jnexhelp.action;

import java.util.ArrayList;
import java.util.List;

import com.jnexhelp.dao.BasicInfoDao;
import com.jnexhelp.dao.BeautifyServiceDao;
import com.jnexhelp.dao.CateringServiceDao;
import com.jnexhelp.dao.ChessGameServiceDao;
import com.jnexhelp.dao.ChineseMedicineServiceDao;
import com.jnexhelp.dao.ComputerPhoneServiceDao;
import com.jnexhelp.dao.ContactInfoDao;
import com.jnexhelp.dao.EntertainmentServiceDao;
import com.jnexhelp.dao.HomeRepairServiceDao;
import com.jnexhelp.dao.HouseServiceDao;
import com.jnexhelp.dao.LanguageServiceDao;
import com.jnexhelp.dao.LegalServiceDao;
import com.jnexhelp.dao.StockServiceDao;
import com.jnexhelp.dao.TaobaoServiceDao;
import com.jnexhelp.domain.BasicInfoDomain;
import com.jnexhelp.domain.skills.BeautifyServiceDomain;
import com.jnexhelp.domain.skills.CateringServiceDomain;
import com.jnexhelp.domain.skills.ChessGameServiceDomain;
import com.jnexhelp.domain.skills.ChineseMedicineServiceDomain;
import com.jnexhelp.domain.skills.ComputerPhoneServiceDomain;
import com.jnexhelp.domain.skills.EntertainmentServiceDomain;
import com.jnexhelp.domain.skills.HomeRepairServiceDomain;
import com.jnexhelp.domain.skills.HouseServiceDomain;
import com.jnexhelp.domain.skills.LanguageServiceDomain;
import com.jnexhelp.domain.skills.LegalServiceDomain;
import com.jnexhelp.domain.skills.StockServiceDomain;
import com.jnexhelp.domain.skills.TaobaoServiceDomain;
import com.opensymphony.xwork2.ActionSupport;

public class HelpUsAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String region;
	private String city;
	private String area;
	private String street;
	
	private String helpContent;
	
	private String category;
	private String serviceNames;
	
	private BeautifyServiceDomain beautifyServiceDomain;
	private CateringServiceDomain cateringServiceDomain;
	private ChessGameServiceDomain chessGameServiceDomain;
	private ChineseMedicineServiceDomain chineseMedicineServiceDomain;
	private ComputerPhoneServiceDomain computerPhoneServiceDomain;
	private EntertainmentServiceDomain entertainmentServiceDomain;
	private HomeRepairServiceDomain homeRepairServiceDomain;
	private HouseServiceDomain houseServiceDomain;
	private LanguageServiceDomain languageServiceDomain;
	private LegalServiceDomain legalServiceDomain;
	private StockServiceDomain stockServiceDomain;
	private TaobaoServiceDomain taobaoServiceDomain;
	
	
	private BasicInfoDao basicInfoDao;
	private ContactInfoDao contactInfoDao;
	private BeautifyServiceDao beautifyServiceDao;
	private CateringServiceDao cateringServiceDao;
	private ChessGameServiceDao chessGameServiceDao;
	private ChineseMedicineServiceDao chineseMedicineServiceDao;
	private ComputerPhoneServiceDao computerPhoneServiceDao;
	private EntertainmentServiceDao entertainmentServiceDao;
	private HomeRepairServiceDao homeRepairServiceDao;
	private HouseServiceDao houseServiceDao;
	private LanguageServiceDao languageServiceDao;
	private LegalServiceDao legalServiceDao;
	private StockServiceDao stockServiceDao;
	private TaobaoServiceDao taobaoServiceDao;
	
	
	
	public BeautifyServiceDomain getBeautifyServiceDomain() {
		return beautifyServiceDomain;
	}

	public void setBeautifyServiceDomain(BeautifyServiceDomain beautifyServiceDomain) {
		this.beautifyServiceDomain = beautifyServiceDomain;
	}

	public CateringServiceDomain getCateringServiceDomain() {
		return cateringServiceDomain;
	}

	public void setCateringServiceDomain(CateringServiceDomain cateringServiceDomain) {
		this.cateringServiceDomain = cateringServiceDomain;
	}

	public ChessGameServiceDomain getChessGameServiceDomain() {
		return chessGameServiceDomain;
	}

	public void setChessGameServiceDomain(
			ChessGameServiceDomain chessGameServiceDomain) {
		this.chessGameServiceDomain = chessGameServiceDomain;
	}

	public ChineseMedicineServiceDomain getChineseMedicineServiceDomain() {
		return chineseMedicineServiceDomain;
	}

	public void setChineseMedicineServiceDomain(
			ChineseMedicineServiceDomain chineseMedicineServiceDomain) {
		this.chineseMedicineServiceDomain = chineseMedicineServiceDomain;
	}

	public ComputerPhoneServiceDomain getComputerPhoneServiceDomain() {
		return computerPhoneServiceDomain;
	}

	public void setComputerPhoneServiceDomain(
			ComputerPhoneServiceDomain computerPhoneServiceDomain) {
		this.computerPhoneServiceDomain = computerPhoneServiceDomain;
	}

	public EntertainmentServiceDomain getEntertainmentServiceDomain() {
		return entertainmentServiceDomain;
	}

	public void setEntertainmentServiceDomain(
			EntertainmentServiceDomain entertainmentServiceDomain) {
		this.entertainmentServiceDomain = entertainmentServiceDomain;
	}

	public HomeRepairServiceDomain getHomeRepairServiceDomain() {
		return homeRepairServiceDomain;
	}

	public void setHomeRepairServiceDomain(
			HomeRepairServiceDomain homeRepairServiceDomain) {
		this.homeRepairServiceDomain = homeRepairServiceDomain;
	}

	public HouseServiceDomain getHouseServiceDomain() {
		return houseServiceDomain;
	}

	public void setHouseServiceDomain(HouseServiceDomain houseServiceDomain) {
		this.houseServiceDomain = houseServiceDomain;
	}

	public LanguageServiceDomain getLanguageServiceDomain() {
		return languageServiceDomain;
	}

	public void setLanguageServiceDomain(LanguageServiceDomain languageServiceDomain) {
		this.languageServiceDomain = languageServiceDomain;
	}

	public LegalServiceDomain getLegalServiceDomain() {
		return legalServiceDomain;
	}

	public void setLegalServiceDomain(LegalServiceDomain legalServiceDomain) {
		this.legalServiceDomain = legalServiceDomain;
	}

	public StockServiceDomain getStockServiceDomain() {
		return stockServiceDomain;
	}

	public void setStockServiceDomain(StockServiceDomain stockServiceDomain) {
		this.stockServiceDomain = stockServiceDomain;
	}

	public TaobaoServiceDomain getTaobaoServiceDomain() {
		return taobaoServiceDomain;
	}

	public void setTaobaoServiceDomain(TaobaoServiceDomain taobaoServiceDomain) {
		this.taobaoServiceDomain = taobaoServiceDomain;
	}

	public BasicInfoDao getBasicInfoDao() {
		return basicInfoDao;
	}

	public void setBasicInfoDao(BasicInfoDao basicInfoDao) {
		this.basicInfoDao = basicInfoDao;
	}

	public ContactInfoDao getContactInfoDao() {
		return contactInfoDao;
	}

	public void setContactInfoDao(ContactInfoDao contactInfoDao) {
		this.contactInfoDao = contactInfoDao;
	}

	public BeautifyServiceDao getBeautifyServiceDao() {
		return beautifyServiceDao;
	}

	public void setBeautifyServiceDao(BeautifyServiceDao beautifyServiceDao) {
		this.beautifyServiceDao = beautifyServiceDao;
	}

	public CateringServiceDao getCateringServiceDao() {
		return cateringServiceDao;
	}

	public void setCateringServiceDao(CateringServiceDao cateringServiceDao) {
		this.cateringServiceDao = cateringServiceDao;
	}

	public ChessGameServiceDao getChessGameServiceDao() {
		return chessGameServiceDao;
	}

	public void setChessGameServiceDao(ChessGameServiceDao chessGameServiceDao) {
		this.chessGameServiceDao = chessGameServiceDao;
	}

	public ChineseMedicineServiceDao getChineseMedicineServiceDao() {
		return chineseMedicineServiceDao;
	}

	public void setChineseMedicineServiceDao(
			ChineseMedicineServiceDao chineseMedicineServiceDao) {
		this.chineseMedicineServiceDao = chineseMedicineServiceDao;
	}

	public ComputerPhoneServiceDao getComputerPhoneServiceDao() {
		return computerPhoneServiceDao;
	}

	public void setComputerPhoneServiceDao(
			ComputerPhoneServiceDao computerPhoneServiceDao) {
		this.computerPhoneServiceDao = computerPhoneServiceDao;
	}

	public EntertainmentServiceDao getEntertainmentServiceDao() {
		return entertainmentServiceDao;
	}

	public void setEntertainmentServiceDao(
			EntertainmentServiceDao entertainmentServiceDao) {
		this.entertainmentServiceDao = entertainmentServiceDao;
	}

	public HomeRepairServiceDao getHomeRepairServiceDao() {
		return homeRepairServiceDao;
	}

	public void setHomeRepairServiceDao(HomeRepairServiceDao homeRepairServiceDao) {
		this.homeRepairServiceDao = homeRepairServiceDao;
	}

	public HouseServiceDao getHouseServiceDao() {
		return houseServiceDao;
	}

	public void setHouseServiceDao(HouseServiceDao houseServiceDao) {
		this.houseServiceDao = houseServiceDao;
	}

	public LanguageServiceDao getLanguageServiceDao() {
		return languageServiceDao;
	}

	public void setLanguageServiceDao(LanguageServiceDao languageServiceDao) {
		this.languageServiceDao = languageServiceDao;
	}

	public LegalServiceDao getLegalServiceDao() {
		return legalServiceDao;
	}

	public void setLegalServiceDao(LegalServiceDao legalServiceDao) {
		this.legalServiceDao = legalServiceDao;
	}

	public StockServiceDao getStockServiceDao() {
		return stockServiceDao;
	}

	public void setStockServiceDao(StockServiceDao stockServiceDao) {
		this.stockServiceDao = stockServiceDao;
	}

	public TaobaoServiceDao getTaobaoServiceDao() {
		return taobaoServiceDao;
	}

	public void setTaobaoServiceDao(TaobaoServiceDao taobaoServiceDao) {
		this.taobaoServiceDao = taobaoServiceDao;
	}

	public String getHelpContent() {
		return helpContent;
	}

	public void setHelpContent(String helpContent) {
		this.helpContent = helpContent;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getServiceNames() {
		return serviceNames;
	}

	public void setServiceNames(String serviceNames) {
		this.serviceNames = serviceNames;
	}

	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String findRightPerson() throws Exception{
		
		String ret = ERROR;
		
		String street = this.street.trim();
		List<String> emailList = new ArrayList<String>();
		
		List<BasicInfoDomain> bidSuitStreets = basicInfoDao.findPersonByStreet(street);
		
		if(bidSuitStreets.size() > 0){
			for(BasicInfoDomain bidSuitStreet:bidSuitStreets){
				emailList.add(bidSuitStreet.getEmail());
			}
		}
		else{
			String area = this.area.trim();
			List<BasicInfoDomain> bidSuitAreas = basicInfoDao.findPersonByArea(area);
			
			if(bidSuitAreas.size() > 0){
				
				for(BasicInfoDomain bidSuitArea : bidSuitAreas){
					emailList.add(bidSuitArea.getEmail());
				}
				
			}else{
				
				String city = this.city.trim();
				List<BasicInfoDomain> bidSuitCities = basicInfoDao.findPersonByCity(city);
				if(bidSuitCities.size() > 0) {
					for(BasicInfoDomain bidSuitCity:bidSuitCities){
						emailList.add(bidSuitCity.getEmail());
					}
				}
				else{
					String region = this.region.trim();
					List<BasicInfoDomain> bidSuitRegions = basicInfoDao.findPersonByRegion(region);
					
					if(bidSuitRegions.size() > 0){
						for(BasicInfoDomain bidSuitRegion:bidSuitRegions){
							emailList.add(bidSuitRegion.getEmail());
						}
					}
				}
			}
			
		}
		
		if(category.trim().equalsIgnoreCase("BeautifyServiceDomain")){
			//beautifyServiceDao.findByEmail(email);
		}
	
		
		return ret;
	}
	
	public Object getRightDao(String domain){
		Object o = null;
		
		if(domain.equalsIgnoreCase("BeautifyServiceDomain")){
			 o = beautifyServiceDao;
			 
		}
		
		
		return o;
	}
}
