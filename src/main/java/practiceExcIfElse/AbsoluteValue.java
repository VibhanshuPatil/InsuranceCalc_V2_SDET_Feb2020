package practiceExcIfElse;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*7.  Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1
*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		double num = scan.nextDouble();
		
		if (num <= 0) {
			System.out.println(num*(-1));
		}
		else {
			System.out.println(num);
		}
		
		

	}

}
