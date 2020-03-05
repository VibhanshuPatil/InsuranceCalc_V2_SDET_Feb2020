package javaPractice;

public class MethodsDemo {

	
//Method type 1 -- No return value --> No argument
	public void addition() {
		System.out.println("In Addition Method");
		
		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2;
		System.out.println("The addition is "+ sum);
	}
	
//Method type 2 -- Parameterize Method
	public void multi (int num1, int num2) {
		System.out.println("In Multiplication method");
		int num3 = num1 * num2;
		System.out.println("Multiplicstion is " + num3);
	}
	

//Method 3 -- Method with return type
	public int sub (int num1, int num2) {
		System.out.println("In Substration method");
		int num3 = num1 - num2;
		System.out.println("Substartion is " + num3);
		return num3;
		
	} 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo obj1 = new MethodsDemo();
		
		obj1.addition();
		
		obj1.multi(2, 4);
		
		int subResult = obj1.sub(10, 3);
		System.out.println("SubResult is:"+ subResult);

	}

}
