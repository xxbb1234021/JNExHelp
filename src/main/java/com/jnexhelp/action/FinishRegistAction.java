package com.jnexhelp.action;
import java.util.Map;

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
import com.jnexhelp.domain.ContactInfoDomain;
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
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FinishRegistAction extends ActionSupport {


	private static final long serialVersionUID = 1L;

	private BasicInfoDomain basicInfoDomain;
	private ContactInfoDomain contactInfoDomain;
	
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
	
	private String phoneNo;
	private String qq;
	private String msn;
	private String imgfile;

	public BasicInfoDomain getBasicInfoDomain() {
		return basicInfoDomain;
	}


	public void setBasicInfoDomain(BasicInfoDomain basicInfoDomain) {
		this.basicInfoDomain = basicInfoDomain;
	}


	public ContactInfoDomain getContactInfoDomain() {
		return contactInfoDomain;
	}


	public void setContactInfoDomain(ContactInfoDomain contactInfoDomain) {
		this.contactInfoDomain = contactInfoDomain;
	}


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


	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMsn() {
		return msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getImgfile() {
		return imgfile;
	}

	public void setImgfile(String imgfile) {
		this.imgfile = imgfile;
	}

	public String execute() throws Exception{
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> session = actionContext.getSession();
		System.out.println("get a Session: "+ session.get("Email"));
		String userId = (String) session.get("Email");
		contactInfoDomain.setUserId(userId);
		contactInfoDomain.setPhoneNo(Integer.parseInt(phoneNo));
		contactInfoDomain.setQq(qq);
		contactInfoDomain.setMsn(msn);
		contactInfoDomain.setImgfile(imgfile);
		
		basicInfoDomain = (BasicInfoDomain)session.get("basicInfo");
		basicInfoDomain.setContactInfo(contactInfoDomain);
		contactInfoDomain.setBasicInfo(basicInfoDomain);
		
		basicInfoDao.save(basicInfoDomain);
		contactInfoDao.save(contactInfoDomain);
		
		beautifyServiceDomain = (BeautifyServiceDomain)session.get("beautifyService");
		if (beautifyServiceDomain != null){
			beautifyServiceDomain.setUserId(userId);
			beautifyServiceDao.save(beautifyServiceDomain);
		}
		
		cateringServiceDomain = (CateringServiceDomain)session.get("cateringService");
		if (cateringServiceDomain != null){
			cateringServiceDomain.setUserId(userId);
			cateringServiceDao.save(cateringServiceDomain);
		}
		
		chessGameServiceDomain = (ChessGameServiceDomain)session.get("chessGameService");
		if(chessGameServiceDomain != null){
			chessGameServiceDomain.setUserId(userId);
			chessGameServiceDao.save(chessGameServiceDomain);
		}
		
		chineseMedicineServiceDomain = (ChineseMedicineServiceDomain)session.get("chineseMedicineService");
		if (chineseMedicineServiceDomain != null){
			chineseMedicineServiceDomain.setUserId(userId);
			chineseMedicineServiceDao.save(chineseMedicineServiceDomain);
		}
		
		computerPhoneServiceDomain = (ComputerPhoneServiceDomain)session.get("computerPhoneService");
		if(computerPhoneServiceDomain != null){
			computerPhoneServiceDomain.setUserId(userId);
			computerPhoneServiceDao.save(computerPhoneServiceDomain);
		}
		
		entertainmentServiceDomain = (EntertainmentServiceDomain)session.get("entertainmentService");
		if (entertainmentServiceDomain != null){
			entertainmentServiceDomain.setUserId(userId);
			entertainmentServiceDao.save(entertainmentServiceDomain);
		}
		
		homeRepairServiceDomain = (HomeRepairServiceDomain)session.get("homeRepairService");
		if (homeRepairServiceDomain != null){
			homeRepairServiceDomain.setUserId(userId);
			homeRepairServiceDao.save(homeRepairServiceDomain);
		}
		
		houseServiceDomain = (HouseServiceDomain)session.get("houseService");
		if (houseServiceDomain != null){
			houseServiceDomain.setUserId(userId);
			houseServiceDao.save(houseServiceDomain);
		}
		
		languageServiceDomain = (LanguageServiceDomain)session.get("languageService");
		if (languageServiceDomain != null) {
			languageServiceDomain.setUserId(userId);
			languageServiceDao.save(languageServiceDomain);
		}
		
		stockServiceDomain = (StockServiceDomain)session.get("stockService");
		if (stockServiceDomain != null){
			stockServiceDomain.setUserId(userId);
			stockServiceDao.save(stockServiceDomain);
		}
		
		taobaoServiceDomain = (TaobaoServiceDomain)session.get("taobaoService");
		if (taobaoServiceDomain != null) {
			taobaoServiceDomain.setUserId(userId);
			taobaoServiceDao.save(taobaoServiceDomain);
		}
		
		return SUCCESS;
		
	}

}
