package practiceExcIfElse;

import java.util.Scanner;

public class Age6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 6.   Take input of age of 3 people by user and determine oldest and youngest among them.*/
		
		
		Scanner age = new Scanner (System.in);
		
		 System.out.println("Enter 1st person age:");
		 double a = age.nextDouble();
		 
		 System.out.println("Enter 2nd person age:");
		 double b = age.nextDouble();
		 
		 System.out.println("Enter 3rd person age:");
		 double c = age.nextDouble();
		 
		 age.close();
		 
		 
//		 if (a > b && b > c) {
//			 System.out.println("Oldest person age is "+a);
//		 } else if (b > a && a > c) {
//			 System.out.println("Oldest person age is "+b);
//		 } else if (c > a && a > b) {
//			 System.out.println("Oldest person age is " +c);
//		 } else if (a < b && b < c) {
//			 System.out.println("Youngest Person age is " +a);
//		 } else if (b < a && a < c) {
//			 System.out.println("Youngest person age is " + b);
//		 } else {
//			 System.out.println("Youngest person age is " +c);
//		 }
//		 
//		
		 if (a > b && b > c) {
			 System.out.println("Oldest person age is "+a);
		 } else if (b > a && a > c) {
			 System.out.println("Oldest person age is "+b);
		 } else if (c > a && a > b) {
			 System.out.println("Oldest person age is " +c);
		 } else if (a < b && b < c) {
			 System.out.println("Youngest Person age is " +a);
		 } else if (b < a && a < c) {
			 System.out.println("Youngest person age is " + b);
		 } else {
			 System.out.println("Youngest person age is " +c);
		 }
		 
		
		 
	
		 
		 
	}

}
