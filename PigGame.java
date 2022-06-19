package com.aurionpro.test;

import java.util.Scanner;

public class PigGame {

	public static void main(String args[]) {

		System.out.println(
				"* See how many turns it takes you to get to 20.\r\n" + "* Turn ends when you hold or roll a 1.\r\n"
						+ "* If you roll a 1, you lose all points for the turn.\r\n"
						+ "* If you hold, you save all points for the turn");

		pig();
	}

	static void pig() {
		int turn = 0;
		int min = 1;
		int max = 6;
		int die = 0;
		int score = 0;
		int totalScore = 0;
		String str1;
		String rollPermission = "r";
		String holdPermission = "h";
		Scanner sc = new Scanner(System.in);

		while (totalScore < 20) {
			turn++;
			System.out.println("\nTURN " + turn);
			score = 0;
			die = 0;
			while (die != 1) {
				System.out.print("Roll or hold? (r/h) : ");
				str1 = sc.nextLine();
				if (str1.equals(rollPermission)) {
					die = (int) Math.floor(Math.random() * (max - min + 1) + min);
					System.out.println("Die: " + die);
					score = score + die;

					if (die == 1) {
						System.out.println("Turn over. No score.");
					}
				} else if (str1.equals(holdPermission)) {
					totalScore = totalScore + score;
					System.out.println("Score for Turn " + score);
					System.out.println("Total Score " + totalScore);
					break;
				}

			}

		}
		System.out.println("\nYou finished in " + turn + " turns!");
		System.out.println("\nGame Over!");

	}

}
