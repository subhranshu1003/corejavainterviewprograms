//Selection sort example
package com.examples.sort;

import java.util.Arrays;

public class SelectionSort1 {
	
	public static void main(String[] args) {
		int[] data = {7,3,6,8,2};
		new SelectionSort1().sort(data);
		System.out.println(Arrays.toString(data));
	}
	
	public void sort(int[] data) {
		for (int i = 0; i < data.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < data.length; j++) {
				if (data[j] < data[minIndex]) {
					minIndex = j;
				}
			}
			int tmp = data[minIndex];
			data[minIndex] = data[i];
			data[i] = tmp;
		}
	}

}
