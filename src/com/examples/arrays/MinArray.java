//this program is to fin minimum value of an integer array
package com.examples.arrays;

public class MinArray {
	
	public int findMinimum(int[] arr) {
		// edge case
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		int min = arr[0]; // min will hold the minimum of array
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
 
	public static void main(String[] args) {
		int[] arr = {5, 9, 3, 15, 0, 2,-5};
		MinArray ma = new MinArray();
		System.out.println(ma.findMinimum(arr));
	}

}
