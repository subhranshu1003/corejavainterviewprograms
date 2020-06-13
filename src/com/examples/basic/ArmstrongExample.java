package com.examples.basic;

import java.util.Scanner;

public class ArmstrongExample {
	public static void main(String[] args) {
		int c = 0, a, temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = scanner.nextInt();//// It is the number to check armstrong
		scanner.close();

		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");
	}
}
