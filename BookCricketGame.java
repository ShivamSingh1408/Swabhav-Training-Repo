package com.aurionpro.test;

import java.util.Scanner;

public class BookCricketGame {

	public static void main(String[] args) {
		int min = 1;
		int max = 300;
		int point = 1;
		int score1 = 0;
		int score2 = 0;
		int round1 = 0;
		int round2 = 0;
		System.out.println("Welcome to BookCricketGame!!\n" + "Rules for the game :\n"
				+ "**Assume a book of 300 pages\r\n"
				+ "1. Player 1 opens the book to read a page number(example 87)(Randomly generated)\r\n"
				+ "2. if the page number is 87->87%7(number % 7 will always be between 0 - 6)-3 should be added to score)\r\n"
				+ "3. Player 1 continues and keeps adding to the score untill page number results in a 0 score\r\n"
				+ "4. Player 2 starts the game and tries to beat the score of player 1\r\n"
				+ "5. In case of a tie, check the number of turns(player with lesser turns is winner)\r\n"
				+ "6. Show the winner of the game.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 for Start game and 0 for Exit : ");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.print("Enter Player 1 Name : ");
			String player1 = sc.next();
			System.out.print("Enter Player 2 Name : ");
			String player2 = sc.next();
			System.out.println("Player :" + player1);
			while (point != 0) {
				System.out.print("Enter 1 to open Book :");
				int key = sc.nextInt();
				if (key == 1) {
					int pageNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
					point = pageNumber % 7;
					score1 = point + score1;
					round1++;
					if (point == 0)
						System.out.println("*****!!!OOPS!!!*****");

					System.out
							.println("Page Number " + pageNumber + "\t\t Point : " + point + "\t\t Score : " + score1);

				}
			}
			System.out.println(player1 + " Total Score : " + score1);
			System.out.println(player1 + " Takes " + round1 + " Rounds\n");
			System.out.println(player2 + " Needs " + (++score1) + " Score In " + round1 + " Rounds To WIN MATCH");
			System.out.println("Player :" + player2);
			point++;
			int temp = round1;
			while (point != 0 && temp != 0 && score1 > score2) {
				System.out.print("Enter 1 to open Book :");
				int key = sc.nextInt();
				if (key == 1) {
					int pageNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
					point = pageNumber % 7;
					score2 = point + score2;
					round2++;
					if (point == 0)
						System.out.println("*****!!!OOPS!!!*****");

					System.out.println("Page Number " + pageNumber + "\t\t Point : " + point + "\t\t Score : " + score2
							+ "\t\t Round Left : " + --temp);

				}
			}
			if (score2 > (score1 - 1)) {
				System.out.println(player2 + " Wins the Match ");
			} else if (score2 == (score1 - 1)) {
				if (round2 < round1) {
					System.out.println(player2 + " Wins the Match ");
				} else if (round2 > round1) {
					System.out.println(player1 + " Wins the Match ");
				} else {
					System.out.println("NO ONE Wins the Match There is Tie!! between " + player1 + " and " + player2);
				}
			} else {
				System.out.println(player1 + " Wins the Match ");
			}

		}

	}

}
