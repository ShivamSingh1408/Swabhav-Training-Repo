package com.aurionpro.model;

import java.util.Scanner;

public class GuessNumber {

	public void game() {

		Scanner sc = new Scanner(System.in);
		int min = 1;
		int max = 100;
		int play = 1;
		int guess = 1;

		while (play != 0) {
			int num = (int) Math.floor(Math.random() * (max - min + 1) + min);
			int count = 0;

			while (count < 6) {
				System.out.println("\nTurn :" + (count + 1));
				System.out.print("Guess the number: ");
				guess = sc.nextInt();
				count++;
				if (guess < num)
					System.out.println("Sorry too low");
				else if (guess > num)
					System.out.println("Sorry too high");
				else if (guess == num) {
					System.out.println("You Won!!!");
					break;
				}
				if (count == 6 && guess != num) {
					System.out.println("\nYou've lost,Try Again!!");
					break;
				}
			}
			System.out.print("\nDo you want to Continue?? (if yes enter 1 otherwise enter 0): ");

			play = sc.nextInt();
		}
		System.out.println("Thanks for playing");
	}
}
