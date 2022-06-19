package com.aurionpro.test;

import java.util.Arrays;

public class Commandline {

	public static void main(String args[]) {
		int[] arr = new int[args.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		int size = arr.length;
		sum(args);
		average(args);
		minMax(args);
		median(arr);
		Frequency(arr, size);
	}

	static void sum(String args[]) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("Sum :" + sum);

	}

	static void average(String args[]) {
		int sum = 0;
		float average;
		for (int i = 0; i < args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
		}
		average = (float) sum / args.length;
		System.out.println("Average :" + average);

	}

	static void minMax(String args[]) {
		int maxvalue = Integer.parseInt(args[0]);
		int minvalue = Integer.parseInt(args[0]);
		for (int i = 0; i < args.length; i++) {
			if (minvalue > Integer.parseInt(args[i])) {
				minvalue = Integer.parseInt(args[i]);
			}
			if (maxvalue < Integer.parseInt(args[i])) {
				maxvalue = Integer.parseInt(args[i]);
			}
		}

		System.out.println("Min :" + minvalue);
		System.out.println("Max :" + maxvalue);
	}

	static void median(int[] arr) {
		Arrays.sort(arr);
		if (arr.length % 2 != 0) {
			System.out.println("Median :" + arr[arr.length / 2]);
		} else {
			System.out.println("Median : " + (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0);
		}

	}

	static void Frequency(int[] arr, int n) {

		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			int count = 1;

			while (i < n - 1 && arr[i] == arr[i + 1]) {
				i++;
				count++;
			}
			System.out.println("Frequency of " + arr[i] + " is " + count);

			count++;

		}

	}
}
