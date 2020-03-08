package practiceExcIfElse;

import java.util.Scanner;

public class fingGratestNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.  Take two int values from user and print greatest among them
		
		System.out.println("Find the Gratest number from 2  number:");
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 1st number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2 = scan.nextInt();		
		scan.close();
		
		if(num1 > num2) {
			System.out.println(num1 +  " is greatest number");
		} else {
			System.out.println(num2 +  " is greatest number");
		}
		


	}

}
