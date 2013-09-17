package com.jnexhelp.domain.skills;


public class TaobaoServiceDomain {
	
	private Integer id;
	
	private String userId;
	
	private boolean onlineMarketing;
	
	private boolean photoShop;
	
	private boolean taobaoRanking;
	
	public TaobaoServiceDomain(){
		
	}
	
	public TaobaoServiceDomain(Integer id,String userId,boolean onlineMarketing,
			boolean photoShop,boolean taobaoRanking){
		
		this.id = id;
		this.userId = userId;
		this.onlineMarketing = onlineMarketing;
		this.photoShop = photoShop;
		this.taobaoRanking = taobaoRanking;
		
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

	public boolean isOnlineMarketing() {
		return onlineMarketing;
	}

	public void setOnlineMarketing(boolean onlineMarketing) {
		this.onlineMarketing = onlineMarketing;
	}

	public boolean isPhotoShop() {
		return photoShop;
	}

	public void setPhotoShop(boolean photoShop) {
		this.photoShop = photoShop;
	}

	public boolean isTaobaoRanking() {
		return taobaoRanking;
	}

	public void setTaobaoRanking(boolean taobaoRanking) {
		this.taobaoRanking = taobaoRanking;
	}
}
