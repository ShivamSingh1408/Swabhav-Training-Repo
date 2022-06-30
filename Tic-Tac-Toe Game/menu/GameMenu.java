package com.aurionpro.menu;

import java.util.Scanner;

import com.aurionpro.game.GameLoader;
import com.aurionpro.player.Symbol;

public class GameMenu {

	static Scanner scan = new Scanner(System.in);

	public static void gameStart() {
		System.out.println("************* TicTacToe Game *************");
		System.out.println("------------------------------------------");
		System.out.println("\n Welcome to TicTacToe Game, Let's Play!");
		gameMenu();
	}

	public static void gameMenu() {
		char ch = '0';
		System.out.println("Choose an Option!");
		System.out.println("1. Play Game : Player vs Player");
		System.out.println("2. Exit Game!!");
		do {
			System.out.print("Enter your Option:->");
			ch = scan.nextLine().charAt(0);
			switch (ch) {
			case '1':
				loadPlayervsPlayerGame();
				break;
			case '2':
				System.out.println("Thanks For Playing!!");
				System.exit(0);
				break;
			default:
				System.out.println("Enter Choice 1 or 2 to Countinue!");
				break;
			}
		} while (!(ch == '1' || ch == '2'));
	}
	private static void loadPlayervsPlayerGame() {
		System.out.println();
		int i=1;
		for (Symbol symbol : Symbol.values()) {
			System.out.println("Player "+i+" Symbol: "+symbol.toString());
			i++;
		}
		GameLoader loader =new GameLoader();
		loader.startPlayervsPlayerGame();
	}
}
