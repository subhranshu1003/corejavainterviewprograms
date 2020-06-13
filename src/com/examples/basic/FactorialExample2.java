package com.examples.basic;

import java.util.Scanner;

public class FactorialExample2 {
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 } 
	
	public static void main(String args[]){  
		  int i,fact=1;  
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter the value of n:");
		  int number = scanner.nextInt();//It is the number to calculate factorial   
	      scanner.close();    
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
}
