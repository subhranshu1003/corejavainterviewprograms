//this program is to resize an array
package com.examples.arrays;

public class ArraysUtilResize {
	
	public void printArray(int array[]) {
		int n=array.length;
		for(int i=0;i < n;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	public int[] resize(int array[],int capacity) {
		int[] temp=new int[capacity];
		for(int i=0;i < array.length;i++) {
			temp[i]=array[i];
		}
		array=temp;
		return array;
	}
	
	
	public static void main(String[] args) {
		ArraysUtilResize arrutl=new ArraysUtilResize();
		//arrutl.printArray(new int[] {4,5,6,7});
		int[] original=new int[] {4,5,8,9,0};
		System.out.println("the size of original array is :"+original.length);
		original=arrutl.resize(original, 10);
		System.out.println("the size of original array after resize is :"+original.length);
	}

}
