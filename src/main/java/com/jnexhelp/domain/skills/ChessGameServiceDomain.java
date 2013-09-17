package com.jnexhelp.domain.skills;


public class ChessGameServiceDomain {
	private Integer id;
	private String userId;
	
	private boolean gobang;
	private boolean militaryChess;
	private boolean chineseChess;
	private boolean goGame;
	private boolean chess;
	private boolean chineseCheckers;
	
	public ChessGameServiceDomain(){
		
	}

	public ChessGameServiceDomain(Integer id, String userId, boolean gobang,
			boolean militaryChess, boolean chineseChess, boolean goGame,
			boolean chess, boolean chineseCheckers){
		
		this.id = id;
		this.userId = userId;
		this.gobang = gobang;
		this.militaryChess = militaryChess;
		this.chineseChess = chineseChess;
		this.goGame = goGame;
		this.chess = chess;
		this.chineseCheckers = chineseCheckers;

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

	public boolean isGobang() {
		return gobang;
	}

	public void setGobang(boolean gobang) {
		this.gobang = gobang;
	}

	public boolean isMilitaryChess() {
		return militaryChess;
	}

	public void setMilitaryChess(boolean militaryChess) {
		this.militaryChess = militaryChess;
	}

	public boolean isChineseChess() {
		return chineseChess;
	}

	public void setChineseChess(boolean chineseChess) {
		this.chineseChess = chineseChess;
	}

	public boolean isGoGame() {
		return goGame;
	}

	public void setGoGame(boolean goGame) {
		this.goGame = goGame;
	}

	public boolean isChess() {
		return chess;
	}

	public void setChess(boolean chess) {
		this.chess = chess;
	}

	public boolean isChineseCheckers() {
		return chineseCheckers;
	}

	public void setChineseCheckers(boolean chineseCheckers) {
		this.chineseCheckers = chineseCheckers;
	}

}
