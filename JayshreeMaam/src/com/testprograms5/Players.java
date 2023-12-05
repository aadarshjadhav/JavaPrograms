package com.testprograms5;

public class Players {
	
	int playerid;
	String playername;
	String country;
	String team;
	
	public Players(int playerid, String playername, String country, String team) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.country = country;
		this.team = team;
	}

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Players [playerid=" + playerid + ", playername=" + playername + ", country=" + country + ", team="
				+ team + "]";
	}
	
	

}
