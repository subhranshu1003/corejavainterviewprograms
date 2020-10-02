package com.examples.java8;

import java.awt.Button;
import java.awt.Frame;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FirstLambda {

	public static void main(String[] args) {
		 Frame frame=new Frame("ActionListener java8");  
	     
	      Button b=new Button("Click Here");  
	      b.setBounds(50,100,80,50); 
	  
	      b.addActionListener(e -> System.out.println("Hello World!")); 
	      frame.add(b);
	  
	      frame.setSize(200,200);  
	      frame.setLayout(null);  
	      frame.setVisible(true); 
	      
	      System.out.println("\nDate class ... ");
			Date currentDate = new Date();
			System.out.println("currentDate: " + currentDate);
			
			System.out.println("currentDate in ms: " + currentDate.getTime());
			
	      
	      Calendar date=new GregorianCalendar(120,8,12);
	      System.out.println("Date is"+date);
	}

}
