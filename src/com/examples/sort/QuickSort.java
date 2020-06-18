/*
 * Java Program for QuickSort
 * QuickSort is a Divide and Conquer algorithm. 
 * It picks an element as pivot and partitions the given array around the picked pivot. 
 * The key process in quickSort is partition().
 * Target of partitions is, given an array and an element x of array as pivot,
 * put x at its correct position in sorted array and put all smaller elements (smaller than x) before x,
 * and put all greater elements (greater than x) after x. All this should be done in linear time.
 */
package com.examples.sort;
import java.util.Arrays;

public class QuickSort {
	public void sort(Integer[] data) {
		quicksort(data, 0, data.length-1);
	}
	
	public void quicksort(Integer[] data, int start, int end) {
		if (start < end) {
			int pivotIndex = partition(data, start, end);
			quicksort(data, start, pivotIndex-1);
			quicksort(data, pivotIndex+1, end);
		}
	}
	
	private int partition(Integer[] data, int start, int end) {
		int pivot = data[end];
		int i = start;
		for (int j = start; j <= end - 1; j++) {
			if (data[j] < pivot) {
				int tmp = data[i];
				data[i] = data[j];
				data[j] = tmp;
				i++;
			}
		}
		data[end] = data[i];
		data[i] = pivot;
		return i;
	}
	
	public static void main(String[] args) {
		Integer[] data = {25,5,7,2,18,23,12,18};
		new QuickSort().sort(data);
		System.out.println(Arrays.toString(data));
	}

}
