package practiceExcIfElse;

import java.util.Scanner;

public class Grading5 {

	public static void main(String[] args) {
		/* 5.  A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
*/
		Scanner grade = new Scanner (System.in);
		
		System.out.println("Enter your marks:" );
		double marks = grade.nextDouble();
		
		grade.close();
		 if(marks > 80) {
			System.out.println("your grade is : A ");
		 } else if (marks > 60) {
			System.out.println(" your grade is : B ");
		 } else if (marks > 50) {
			System.out.println(" your grade is : C ");
		 } else if (marks > 45) {
			System.out.println(" your grade is : D ");
		 } else if (marks > 25) {
			 System.out.println(" your grade is : E");
		 } else {
			 System.out.println("your grade is : F");
		 }

	}

}
