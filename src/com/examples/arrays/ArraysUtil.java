//this program is to print an array
package com.examples.arrays;

public class ArraysUtil {

	public void printArray(int array[]) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArraysUtil arrutl = new ArraysUtil();
		arrutl.printArray(new int[] { 4, 5, 6, 7 });
	}

}
