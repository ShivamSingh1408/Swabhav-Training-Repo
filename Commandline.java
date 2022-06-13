package com.aurionpro.test;

public class Commandline {

	public static void main(String[] args) {
		int sum = 0;
		int n = args.length;
		int m = n / 2;
		float avg;
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[0]);
		System.out.println("Calculates Sum for below Integers");
		for (int i = 0; i < n; i++) {
			System.out.println(args[i]);
			sum = sum + Integer.parseInt(args[i]);
			if (min > Integer.parseInt(args[i]))
				min = Integer.parseInt(args[i]);
			if (max < Integer.parseInt(args[i]))
				max = Integer.parseInt(args[i]);
		}

		avg = (float) sum / n;
		System.out.println("Sum :" + sum);
		System.out.println("Average :" + avg);
		System.out.println("Minimum :" + min);
		System.out.println("Maximum :" + max);
		// median
		if (n % 2 == 0)
			System.out.println("Median :" + (Integer.parseInt(args[m]) + (Integer.parseInt(args[m - 1]))) / 2);
		else
			System.out.println("Median :" + Integer.parseInt(args[m]));
		// frequency of elements
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(args[i]);
			if (temp == -1)
				continue;
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (Integer.parseInt(args[j]) == temp) {
					count++;
					args[j] = "-1";
				}

			}
			System.out.println("Frequency of " + temp + " is " + count);

		}
	}
}
