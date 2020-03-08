package practiceExcIfElse;

import java.util.Scanner;

public class TotalCost3 {

	public static void main(String[] args) {
	
/* A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
		Ask user for quantity Suppose, one unit will cost 100. Judge and print total cost for user. */
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("discount of 10% if the cost of purchased quantity is more than 1000.");
		System.out.println("Please enter quanitty: ");
		int quantity = input.nextInt();
		
		if (quantity >= 1000) {
			double total = (int) ((quantity) * (100)); // type casting
					double discount = total * (0.1);
					double discountTotal = total - discount;
			System.out.println("YOur total with discount :" + discountTotal);
		} else {
			System.out.println("Your total is: " + (quantity * 100));
		}
		input.close();

	}

}
