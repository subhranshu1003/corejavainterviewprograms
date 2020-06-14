//this program is to check given number is palindrome number or not
package com.examples.basic;

import java.util.Scanner;

public class PalindromeExample {
	 public static void main(String args[]){  
		  int r,sum=0,temp;    
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter the value of n:");
		  int n = scanner.nextInt();//It is the number variable to be checked for palindrome 
	      scanner.close();
		   
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(temp +" is a palindrome number ");    
		  else    
		   System.out.println(temp +" is not palindrome");    
		}  

}
