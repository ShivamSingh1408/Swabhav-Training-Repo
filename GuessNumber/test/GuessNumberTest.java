package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.GuessNumber;

public class GuessNumberTest {

	public static void main(String[] args) {
		GuessNumber guessNum = new GuessNumber();
		printStart();
		player();
		guessNum.game();
	}

	private static void player() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Player Name : ");
		String player = sc.next();
		System.out.println("Player :" + player);
	}

	private static void printStart() {
		System.out.println(
				"!!!Welcome to Number Guesser Game!!!\n" + "Rules are simple: guess a Number between 1 to 100\n"
						+ "You will be having 6 rounds to guess the correct number.\n"
						+ "If you will guess the correct number in 6 round yoy will win the game.");
		System.out.println("-----------------------------------------------------------------------------");
	}

}
