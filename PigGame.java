package com.aurionpro.test;

import java.util.Scanner;

public class PigGame {

	public static void main(String args[]) {

		System.out.println(
				"* See how many turns it takes you to get to 20.\r\n" + "* Turn ends when you hold or roll a 1.\r\n"
						+ "* If you roll a 1, you lose all points for the turn.\r\n"
						+ "* If you hold, you save all points for the turn\r\n" + "*player with lesser turns is winner");

		pig();

	}

	static void pig() {
		int turn1 = 0;
		int turn2 = 0;
		int min = 1;
		int max = 6;
		int die = 0;
		int score1 = 0;
		int score2 = 0;
		int totalScore = 0;

		String rollPermission = "r";
		String holdPermission = "h";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Player 1 Name : ");
		String player1 = sc.next();
		System.out.print("Enter Player 2 Name : ");
		String player2 = sc.next();
		System.out.println("Player :" + player1);

		while (totalScore < 20) {
			turn1++;
			System.out.println("\nTURN " + turn1);
			score1 = 0;
			die = 0;
			while (die != 1) {
				System.out.print("Roll or hold? (r/h) : ");
				String str1 = sc.next();
				if (str1.equals(rollPermission)) {
					die = (int) Math.floor(Math.random() * (max - min + 1) + min);
					System.out.println("Die: " + die);
					score1 = score1 + die;

					if (die == 1) {
						System.out.println("Turn over. No score.");
					}
				} else if (str1.equals(holdPermission)) {
					totalScore = totalScore + score1;
					System.out.println("Score for Turn " + score1);
					System.out.println("Total Score " + totalScore);
					break;
				}

			}

		}
		System.out.println("\n" + player1 + " finished in " + turn1 + " turns!");
		int temp = turn1 - 1;
		System.out.println(player2 + " Needs Score 20 in  " + temp + " Turns To WIN MATCH");
		System.out.println("Player :" + player2);
		totalScore = 0;
		while (totalScore < 20 && turn1 >= turn2) {
			turn2++;
			if (turn2 <= turn1) {
				System.out.println("\nTURN " + turn2);
			}
			score2 = 0;
			die = 0;
			while (die != 1 && turn2 <= turn1) {
				System.out.print("Roll or hold? (r/h) : ");
				String str1 = sc.next();
				if (str1.equals(rollPermission)) {
					die = (int) Math.floor(Math.random() * (max - min + 1) + min);
					System.out.println("Die: " + die);
					score2 = score2 + die;

					if (die == 1) {
						System.out.println("Turn over. No score.");
					}
				} else if (str1.equals(holdPermission)) {
					totalScore = totalScore + score2;
					System.out.println("Score for Turn " + score2);
					System.out.println("Total Score " + totalScore);
					break;
				}

			}
		}
		if (turn1 > turn2) {
			System.out.println("\nPlayer " + player2 + " Wins the match");
			System.out.println("***Game Over!!!***");
		} else if (turn1 == turn2) {
			System.out.println("\nTheir is Tie between " + player1 + " and " + player2);
			System.out.println("***Game Over!!!***");

		} else {
			System.out.println("\nPlayer " + player1 + " Wins the match");
			System.out.println("***Game Over!!!***");

		}

	}

}
