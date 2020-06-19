//Reverse of a number98989
package com.examples.basic;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[]) {

		 Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter the value of n:");
		  int number = scanner.nextInt();
		  scanner.close();

		int reverse = reverse(number);
		System.out.println("Reverse of number: " + number + " is " + reverse(number));

	}

	/*
	 * reverse a number in Java using iteration
	 * 
	 * @return reverse of number
	 */
	public static int reverse(int number) {
		int reverse = 0;
		int remainder = 0;
		do {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;

		} while (number > 0);

		return reverse;
	}

}
