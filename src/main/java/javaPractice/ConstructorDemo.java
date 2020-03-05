package javaPractice;

public class ConstructorDemo {
	
	
	String DBserverURL = "url.com";	
	String DBname;
	String UserName;
	String Password;
	
//In Constructor Create Class Level Variables
	
// Constructor use is to initialize the class level variables
	
/*Create Constructor - Rule 1 Constructor name should be class name 
					   Rule 2 No return type with out void or int, string ,double and so on
*/
	public ConstructorDemo(String name, String uName, String pass) { // Constructor method without return method
		DBname = name;
		UserName = uName;
		Password = pass;				
	}
	
	public ConstructorDemo(String serverURL, String name, String uName, String pass ) { // Constructor method without return method
		
		DBserverURL = serverURL;
		DBname = name;
		UserName = uName;
		Password = pass;		
		
	}
	
	public void readTable() {
		
		System.out.println("Started reading data from: " + DBserverURL + " " + DBname + " " + UserName + " " + Password);
		
	}

}
