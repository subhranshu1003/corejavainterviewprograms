//this program is to find reverse value of an array
package com.examples.arrays;

public class ReverseArray {
	
	public static void reverse(int[] numbers, int start, int end) {
		while(start < end) {
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;
			start++;
			end--;
		}
	}
	public static void reverse(int[] numbers) {
		for(int i=numbers.length-1; i >= 0; i --) {
			System.out.print(numbers[i]+" ");
		}
	}
	
	
	public static void printArray(int[] arr) { 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}  
		System.out.println(); 
	} 
 
	public static void main(String[] args) {
		int[] numbers = {2, 11, 5, 10, 7, 8};
		printArray(numbers);
		//reverse(numbers, 0, numbers.length - 1);
		//printArray(numbers);
		reverse(numbers);
	}

}
