package com.Exercise.pll;

import com.Exercise.bll.Author;


public class TestAuthor {
public static void main(String[] args) { 
		
		/*•	Create three objects with the defined constructors (one is with default, 
		one is with two parameterized constructor and one is with three parameterized constructor)*/
		
         Author a1=new Author();
		Author a2=new Author("Abhishek ","Kolate");
		Author a3=new Author("Abhishek","Kolate","Summer Vibes");
		
		
		//•	Create one reference and try to display the values. What is your observation
		
		Author []Auth=new Author[10];
		
		 

		//Display the values of second object by using getters.
		
		System.out.println("\nAuthors first name  :"+a2.getFirstName());
		System.out.println("Authors last name  :"+a2.getLastName());
		
		
		
		//Display the values of the third object by using the toString() method.
		
		System.out.println("\n Author details  :"+a3.toString());
		
		
		//Display the values of first object by using getters
		
		System.out.println("\nFirst name is of second object :"+a1.getFirstName());
		System.out.println("Second name is  of second object :"+a1.getLastName());
		System.out.println("Book name is of second object :"+a1.getBookname());
	 
		
		
		//Assign second object to the reference and display the values.
		
		 Auth[1]=a2;
		 
		 System.out.println("\nAuthors first name  :"+Auth[1].getFirstName());
		 System.out.println(" Authors last name  :"+Auth[1].getLastName());
		 
		
	}
}
