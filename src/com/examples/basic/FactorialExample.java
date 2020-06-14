//this program is to find factorial of a number
package com.examples.basic;

import java.util.Scanner;

public class FactorialExample {
	public static void main(String args[]){  
		  int i,fact=1;  
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter the value of n:");
		  int number = scanner.nextInt();//It is the number to calculate factorial   
	      scanner.close();
		  
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  

}
