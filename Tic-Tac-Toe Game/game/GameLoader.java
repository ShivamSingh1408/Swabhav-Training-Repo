package com.aurionpro.game;

import java.util.Scanner;

import com.aurionpro.player.Player;
import com.aurionpro.player.Symbol;

public class GameLoader {
	static Scanner scan = new Scanner(System.in);
	static String playerX = Symbol.X.toString();
	static String playerO = Symbol.O.toString();

	public void startPlayervsPlayerGame() {
		System.out.println("\nPlayer X");
		Player player1 = getPlayerInfo(playerX);
		System.out.println("\nPlayer O");
		Player player2 = getPlayerInfo(playerO);
		System.out.println("\n ----------------------------\n");
		System.out.println("Now, In order to Mark a palce with your symbol");
		System.out.println("Enter cell Number between (1 - 9)\n");
		GameLogic game = new GameLogic();
		game.loadBoard();
		game.printBoard();

		while (true) {
			game.playerHandler(player1);
			game.playerHandler(player2);

		}
	}

	private Player getPlayerInfo(String symbol) {
		String name = "";
		System.out.print("Enter Your Name:-> ");
		name = scan.nextLine();
		Player player = new Player(name, symbol);
		System.out.println(player.toString());
		return player;
	}
}
