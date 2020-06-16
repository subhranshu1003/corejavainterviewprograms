/*Search using Binary search algorithm
 * We basically ignore half of the elements just after one comparison.
 *
 *  Compare x with the middle element.
 *	If x matches with middle element, we return the mid index.
 *	Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
 *	Else (x is smaller) recur for the left half.
 */

package com.examples.search;

import java.util.Scanner;

public class BinarySearch {
	
	public int binarySearch(int[] nums, int key) {
		int low = 0;
		int high = nums.length - 1;
		
		while(low <= high) {
		    int mid = (high + low) / 2;
		    
		    if(nums[mid] == key) {
		    	return mid;
		    }
		    if(key < nums[mid]) { 
			  high = mid - 1; 
		    } else {
		        low = mid + 1; 
		    } 
		}
		return -1;
	}
 
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] nums = {1, 10, 20, 47, 59, 65, 75, 88, 99};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to search:");
		int n = scanner.nextInt();
		scanner.close();// it is the number to be checked
		
		int result=bs.binarySearch(nums, n);
		if(result==-1) {
			System.out.println("The input number is not present in array");
		}
		else {
			System.out.println("The input number is  present in array");
		}
	}

}
