package com.jnexhelp.domain.skills;


public class EntertainmentServiceDomain {
	
	private Integer id;
	private String userId;
	
	private boolean badminton;
	private boolean pingpong;
	private boolean tennis;
	private boolean basketball;
	private boolean football;
	private boolean billiards;
	private boolean ropeskipping;
	private boolean swimming;
	private boolean skating;
	private boolean sing;
	private boolean vocalist;
	private boolean dance;
	private boolean painting;
	

	public EntertainmentServiceDomain(){
		
	}
	
	public EntertainmentServiceDomain(Integer id, String userId, boolean badminton,
			boolean pingpong, boolean tennis, boolean basketball, boolean football,
			boolean billiard, boolean ropeskipping, boolean swimming, boolean skating,
			boolean sing, boolean vocalist, boolean dance, boolean painting){
		
		this.id = id;
		this.userId = userId;
		this.badminton = badminton;
		this.pingpong = pingpong;
		this.tennis = tennis;
		this.basketball = basketball;
		this.football = football;
		this.billiards = billiard;
		this.ropeskipping = ropeskipping;
		this.swimming = swimming;
		this.skating = skating;
		this.sing = sing;
		this.vocalist = vocalist;
		this.dance = dance;
		this.painting = painting;
	
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

	public boolean isBadminton() {
		return badminton;
	}

	public void setBadminton(boolean badminton) {
		this.badminton = badminton;
	}

	public boolean isPingpong() {
		return pingpong;
	}

	public void setPingpong(boolean pingpong) {
		this.pingpong = pingpong;
	}

	public boolean isTennis() {
		return tennis;
	}

	public void setTennis(boolean tennis) {
		this.tennis = tennis;
	}

	public boolean isBasketball() {
		return basketball;
	}

	public void setBasketball(boolean basketball) {
		this.basketball = basketball;
	}

	public boolean isFootball() {
		return football;
	}

	public void setFootball(boolean football) {
		this.football = football;
	}

	public boolean isBilliards() {
		return billiards;
	}

	public void setBilliards(boolean billiards) {
		this.billiards = billiards;
	}

	public boolean isRopeskipping() {
		return ropeskipping;
	}

	public void setRopeskipping(boolean ropeskipping) {
		this.ropeskipping = ropeskipping;
	}

	public boolean isSwimming() {
		return swimming;
	}

	public void setSwimming(boolean swimming) {
		this.swimming = swimming;
	}

	public boolean isSkating() {
		return skating;
	}

	public void setSkating(boolean skating) {
		this.skating = skating;
	}

	public boolean isSing() {
		return sing;
	}

	public void setSing(boolean sing) {
		this.sing = sing;
	}

	public boolean isVocalist() {
		return vocalist;
	}

	public void setVocalist(boolean vocalist) {
		this.vocalist = vocalist;
	}

	public boolean isDance() {
		return dance;
	}

	public void setDance(boolean dance) {
		this.dance = dance;
	}

	public boolean isPainting() {
		return painting;
	}

	public void setPainting(boolean painting) {
		this.painting = painting;
	}

}
