package practiceExcIfElse;

import java.util.Scanner;

public class StudentAttendanceMedicalCondition9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 8. A student will not be allowed to sit in exam if his/her attendence is less
		 * than 75%. Take following input from user Number of classes held Number of
		 * classes attended. And print percentage of class attended Is student is
		 * allowed to sit in exam or not. 
		 * 9. Modify the above question to allow student
		 * to sit if he/she has medical cause. Ask user if he/she has medical cause or
		 * not ( 'Y' or 'N' ) and print accordingly.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter total number of class: " ); 
		double totalClass = scan.nextDouble();
		System.out.println("Enter total number class attended: ");
		double attendance = scan.nextDouble();
		//System.out.println("Enter Student Medical condition: Please Press y/n ");
		// String medicalISsue = scan.nextLine();
			
		//scan.close();
				
		double requiredAttendance = totalClass*0.75;
		//double actualAttendance = totalClass - requiredAttendance;
		
		if (requiredAttendance > attendance  ) {
			
			System.out.println("Student had medical condition?: Press y/n");
			char med = scan.next().charAt(0);
			
			
			if (med == 'y'){
				System.out.println("Student is allow to write exam due to medical condition");
			}
			else if (med == 'n') {
				System.out.println("Student is not allow to write exam due to poor attendance");
			} else {
				System.out.println("Please enter valid answer");
			}
	} else {
		System.out.println("Student is allow to write exam.");
			
		}
		

	}

}



/*if (attendance <= requiredAttendance) {

System.out.println("Studen has less then 75% attendance: ");
System.out.println("Is student had medical condition: ");
if (no.equalsIgnoreCase("N")) {
	System.out.println("Not allow to sit in exam");
}	*/