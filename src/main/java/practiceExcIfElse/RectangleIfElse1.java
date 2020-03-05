package practiceExcIfElse;

import java.util.Scanner;

public class RectangleIfElse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 1.  Take values of length and breadth of a rectangle from user and check if it is square or not.*/
		
		System.out.println("Enter values for length and breadth to calculate rectangle: ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Length: ");
		int length = scan.nextInt();
		System.out.println("Breadth: ");
		int breadth = scan.nextInt();
		
		scan.close();
		
		if (length == breadth) {
			System.out.println("It is square");
			
		}
		else {
			System.out.println(length * breadth);
		}
		
		
	

	}

}
