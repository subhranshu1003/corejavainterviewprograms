/*Linear search 
 * A simple approach is to do linear search, i.e
 * Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
 *	If x matches with an element, return the index.
 *  If x doesn’t match with any of elements, return -1.
 */
package com.examples.search;

import java.util.Scanner;

public class LinearSearch {
	public int search(int[] arr, int x) {
		// edge case
		
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Invalid input");
		}
		int n=arr.length;
		for(int i = 0; i < n; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {5, 1, 9, 2, 10, 15, 20};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to search:");
		int n = scanner.nextInt();
		scanner.close();// it is the number to be checked
		LinearSearch ls = new LinearSearch();
		int result=ls.search(arr, n);
		if(result==-1) {
			System.out.println("The input number is not present in array");
		}
		else {
			System.out.println("The input number is  present in array");
		}
	}
}
