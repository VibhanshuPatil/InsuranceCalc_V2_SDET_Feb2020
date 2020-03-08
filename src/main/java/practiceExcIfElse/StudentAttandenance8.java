package practiceExcIfElse;

import java.util.Scanner;

public class StudentAttandenance8 {
	public static void main(String[] args) {
	
		
		
		/*
		 * 8. A student will not be allowed to sit in exam if his/her attendence is less
		 * than 75%. Take following input from user Number of classes held Number of
		 * classes attended. And print percentage of class attended Is student is
		 * allowed to sit in exam or not.
		 */

	Scanner scan = new Scanner(System.in);
	
	
			System.out.println("Enter total number of class: " ); 
			double totalClass = scan.nextDouble();
			System.out.println("Enter total umber class attended: ");
			double attendance = scan.nextDouble();
			scan.close();
			double requiredAttendance = totalClass*0.75;
			
			if (attendance <= requiredAttendance) {
				System.out.println("Not allow to sit in eaxm due to less than 75% attendance");
			}
			else {
				System.out.println("Allow to sit in exam");
			}
			
	
	}

}
