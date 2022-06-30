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

package com.aurionpro.game;

import java.util.Scanner;

import com.aurionpro.menu.GameMenu;
import com.aurionpro.player.*;

public class GameLogic {
	private static String[][] board = new String[3][3];
	static Scanner scan = new Scanner(System.in);
	Integer cellMarked = 0;
	static String playerX = Symbol.X.toString();
	static String playerO = Symbol.O.toString();

	public void loadBoard() {
		Integer cellNumber = 1;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = "_" + cellNumber + "_";
				cellNumber++;

			}
		}
	}

	public void printBoard() {
		System.out.println(" ___________ ");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print("|");// vertical line
				System.out.print(board[i][j]);// board cell
			}
			System.out.print("|");
			System.out.println();
		}
	}

	public void playerHandler(Player player) {
		Integer cellNumber = 0;
		boolean isCellFree = false;
		do {
			cellNumber = takeInput(player);
			isCellFree = isCellFree(cellNumber);
			if (isCellFree == false) {
				System.out.println("Cell Already Marked!!\nEnter Another Cell Number!!");
			}
		} while (!isCellFree);

		updateBoard(cellNumber, player);
		checkIfWon(player);
	}

	private boolean isCellFree(Integer cellNumber) {
		int cellCount = 1;
		boolean cellMarked = false;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				String cell = board[i][j];
				if (cellCount == cellNumber) {
					if (cell.contains(playerX) || cell.contains(playerO)) {
						return cellMarked;
					}
				}

				cellCount++;
			}

		}
		return true;
	}

	private Integer takeInput(Player player) {
		char ch = '0';
		while (!(ch >= '1' && ch <= '9')) {
			System.out.print(
					"\nPlayer: " + player.playerName + " (" + player.playerSymbol + ") , Enter Your Cell # :-> ");
			ch = scan.nextLine().charAt(0);
			if (!(ch >= '1' && ch <= '9')) {
				System.out.println("Only Enter Numbers Between (1 - 9)");
			}
		}
		return Integer.parseInt(Character.toString(ch));
	}

	private void updateBoard(Integer cellNumber, Player player) {
		int cellCount = 1;
		String cellReplace = "_" + player.playerSymbol + "_";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (cellCount == cellNumber) {
					board[i][j] = cellReplace;
				}
				cellCount++;
			}

		}
		this.cellMarked++;
		printBoard();
	}

	public void checkIfWon(Player player) {
		
		if (checkHorizontal(player)) {
			System.out.println("\nCongrats!! " + player.playerName + "( " + player.playerSymbol + " ), You Won!!");
			GameMenu.gameMenu();
		}
		if (checkVertical(player)) {
			System.out.println("\nCongrats!! " + player.playerName + "( " + player.playerSymbol + " ), You Won!!");
			GameMenu.gameMenu();
		}
		if (checkDiagonal(player)) {
			System.out.println("\nCongrats!! " + player.playerName + "( " + player.playerSymbol + " ), You Won!!");
			GameMenu.gameMenu();
		}
		if (cellMarked == 9) {
			System.out.println("Game Draw!! No one Won!!");
			GameMenu.gameMenu();
		}
	}

	private boolean checkHorizontal(Player player) {
		boolean didPlayerWin = false;
		String playerSymbol = player.playerSymbol;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < 1; j++) {
				String cell1 = board[i][j];
				String cell2 = board[i][j + 1];
				String cell3 = board[i][j + 2];
				if (cell1.contains(playerSymbol) && cell2.contains(playerSymbol) && cell3.contains(playerSymbol)) {
					didPlayerWin = true;
				}
			}
		}
		return didPlayerWin;
	}

	private boolean checkVertical(Player player) {
		boolean didPlayerWin = false;
		String playerSymbol = player.playerSymbol;
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < board.length; j++) {
				String cell1 = board[i][j];
				String cell2 = board[i + 1][j];
				String cell3 = board[i + 2][j];
				if (cell1.contains(playerSymbol) && cell2.contains(playerSymbol) && cell3.contains(playerSymbol)) {
					didPlayerWin = true;
				}
			}
		}
		return didPlayerWin;
	}

	private boolean checkDiagonal(Player player) {
		Integer diagonalMarkCount = 0;
		String playerSymbol = player.playerSymbol;
		String cell = "";
		// primary diagonal
		int i = 0;
		while (i < board.length) {
			cell = board[i][i];
			if (cell.contains(playerSymbol)) {
				diagonalMarkCount++;
			}
			i++;
		}
		if (diagonalMarkCount == 3) {
			return true;
		}
		// secondary diagonal
		int j = board.length - 1;
		i = 0;
		diagonalMarkCount = 0;
		while (i < board.length) {
			cell = board[i][j];
			if (cell.contains(playerSymbol)) {
				diagonalMarkCount++;
			}
			i++;
			j--;
		}
		if (diagonalMarkCount == 3) {
			return true;
		}
		return false;
	}
}
