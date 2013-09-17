package com.jnexhelp.domain.skills;


public class StockServiceDomain {
	private Integer id;
	private String userId;
	private boolean stockOpinion;
	private boolean stockRecommend;
	
	public StockServiceDomain(){
		
	}
	
	public StockServiceDomain(Integer id,String userId,boolean stockOpinion,boolean stockRecommend){
		this.id = id;
		this.userId = userId;
		this.stockOpinion = stockOpinion;
		this.stockRecommend = stockRecommend;
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

	public boolean isStockOpinion() {
		return stockOpinion;
	}

	public void setStockOpinion(boolean stockOpinion) {
		this.stockOpinion = stockOpinion;
	}

	public boolean isStockRecommend() {
		return stockRecommend;
	}

	public void setStockRecommend(boolean stockRecommend) {
		this.stockRecommend = stockRecommend;
	}

}
