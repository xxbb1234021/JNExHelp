package com.jnexhelp.action;

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
import com.jnexhelp.model.SuitPerson;
import com.opensymphony.xwork2.ActionSupport;

public class FindPersonAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String region;
	private String city;
	private String area;
	private String street;
	
	private String txtHelpMsg;
	private String classificationHelp;
	private String classificationHelpItems; 
	
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
	
	public FindPersonAction(){
		
	}
	
	public String execute() throws Exception{
		
		if (classificationHelp.equalsIgnoreCase("beautifyService")){
			String findpersonsHql = "select new com.jnexhelp.model.SuitPerson(a.userName,a.email,b.msn,b.qq,a.street) " +
					"from BasicInfoDomain as a, ContactInfoDomain as b, BeautifyServiceDomain as c where " ;
			
			if ((!classificationHelpItems.equals(""))&&(classificationHelpItems!=null)){
				classificationHelpItems = "���δ���";
				String services[] = classificationHelpItems.split(",");
				
				for(int i=0;i<services.length;i++){
					if(services[i].trim().equals("���δ���")){
						findpersonsHql += "c.clothingMatching = true and ";
					}else if(services[i].trim().equals("���ʹ���")){
						findpersonsHql += "c.hairCare = true and ";
					}else if(services[i].trim().equals("�沿��ױ")){
						findpersonsHql += "c.facialMakeup = true and ";
					}else if(services[i].trim().equals("����֪ʶ")){
						findpersonsHql += "c.beautyKnowledge = true and ";
					}
				}
				
				findpersonsHql = findpersonsHql + "a.email = b.userId and a.email = c.userId";
				List<SuitPerson> suitPersonList = beautifyServiceDao.findPersons(findpersonsHql);
				
				for(int i=0;i<suitPersonList.size();i++){
					System.out.println(((SuitPerson)(suitPersonList.get(i))).getUserEmail());
				}
			}
		}
		return null;
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

	public String getTxtHelpMsg() {
		return txtHelpMsg;
	}

	public void setTxtHelpMsg(String txtHelpMsg) {
		this.txtHelpMsg = txtHelpMsg;
	}

	public String getClassificationHelp() {
		return classificationHelp;
	}

	public void setClassificationHelp(String classificationHelp) {
		this.classificationHelp = classificationHelp;
	}

	public String getClassificationHelpItems() {
		return classificationHelpItems;
	}

	public void setClassificationHelpItems(String classificationHelpItems) {
		this.classificationHelpItems = classificationHelpItems;
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
	

}
