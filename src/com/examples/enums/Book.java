package com.examples.enums;

public class Book {
	public enum BookGenre {
		BIOGRAPHY (12),
		HORROR (15);
		
		private BookGenre(int minAgeToRead) {
	        this.minAgeToRead = minAgeToRead;
	    }	
	
	    private int minAgeToRead;	
	    public int getMinAgeToRead() {
	        return minAgeToRead;
	    }	    
		
	}
	
	public static void main(String[] args) {    
    	for (BookGenre bookGenre : BookGenre.values()) {
            System.out.println("\nName: " + bookGenre); //toString
            System.out.println(" name(): " + bookGenre.name());
            System.out.println(" Ordinal: " + bookGenre.ordinal());
            System.out.println(" Declaring Class: " + bookGenre.getDeclaringClass());	
            System.out.println(" compareTo(HORROR): " + bookGenre.compareTo(BookGenre.HORROR));
            System.out.println(" equals(HORROR): " + bookGenre.equals(BookGenre.HORROR));
            System.out.println(" minAgeToRead: " + bookGenre.getMinAgeToRead());
         }        
    }


}
