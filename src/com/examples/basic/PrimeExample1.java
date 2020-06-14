//this progrm is to check for a number is prime or not
package com.examples.basic;

import java.util.Scanner;

public class PrimeExample1 {

	public static void main(String[] args) {
		int i, m = 0, flag = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = scanner.nextInt();
		scanner.close();// it is the number to be checked
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
	}
}
