package com.aurionpro.player;

public class Player {
	public String playerName;
	public String playerSymbol;

	public Player(String playerName, String playerSymbol) {
		this.playerName = playerName;
		this.playerSymbol = playerSymbol;
	}

	@Override
	public String toString() {
		return "Player [Player Name=" + playerName + ", Player Symbol=" + playerSymbol + "]";
	}

}

