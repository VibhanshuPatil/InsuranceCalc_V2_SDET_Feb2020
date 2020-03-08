package practiceExcIfElse;

import java.util.Scanner;

public class EmployeeBonousCalculator4 {
	

	public static void main(String[] args) {

	/*4.  A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
			Ask user for their salary and year of service and print the net bonus amount.*/
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your years of service: " );
		double year = scan.nextDouble();
		System.out.println("Enter your salary: ");
		double salary = scan.nextDouble();
		
		scan.close();
		
		if (year >= 5) {
			System.out.println("Your net bonous amount is :" +(salary*0.05));
		} else System.out.println("You are not eligible for bonous");		
		
		
	}

}
