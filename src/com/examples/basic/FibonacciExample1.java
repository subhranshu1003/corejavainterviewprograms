//this program is to find fibonaci series 
package com.examples.basic;

import java.util.Scanner;

public class FibonacciExample1 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3, i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int count = scanner.nextInt();// fibonaci series upto count
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
