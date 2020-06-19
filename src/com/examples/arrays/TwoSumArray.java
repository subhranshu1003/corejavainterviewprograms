//Java Program to find pairs on integer array whose sum is equal to k

package com.examples.arrays;

public class TwoSumArray {

	/**
	 * * Prints all pair of integer values from given array whose sum is is equal to
	 * given number. complexity of this solution is O(n^2)
	 */
	public static void printPairs(int[] array, int sum) {
		for (int i = 0; i < array.length; i++) {
			int first = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int second = array[j];
				if ((first + second) == sum) {
					System.out.printf("(%d, %d) %n", first, second);
				}
			}
		}
	}

	public static void main(String args[]) {
		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
		printPairs(numbers, 7);
	}

}
