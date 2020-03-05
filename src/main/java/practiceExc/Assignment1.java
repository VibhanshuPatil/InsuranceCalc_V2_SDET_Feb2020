package practiceExc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assignment1 {
	
	public static void main(String [] args)
	{
		
		/*
		 * Try Executing the same Test case on all Major browsers you have on your
		 * laptop. (You can use either WebDriver manager to manager driver executables
		 * automatically or download and use them manually. Have habit of using both
		 * because some companies may not allow using webdriverManager).
		 */

//Step 1
		
		//Opening Chrome web browser
		WebDriver driver = new ChromeDriver(); 
		
		//Using Internet Explorer
		// WebDriver driver = new InternetExplorerDriver();
		
		  //Using Edge
		//System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
/***************Using WrbDriver dependencies********************************/
		
	
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Set implicit wait to 15 seconds
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
//Step 2
		
		//Navigate to http://qdpm.net/demo/v9/index.php  
		driver.get("http://qdpm.net/demo/v9/index.php");
		
//Step 3 
		
		// Verify Page Title as “qdPM } Login” 	
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle = "qdPM } Login";
		 
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test Case Pass...Matching Title");
		}
		else {
			System.out.println("Test case fail...Title not matching");
		}
		
		
//Step 4
			// Verify current url (Use getCurrentURL method on driver) and make sure that it is as same as you used in step2.	
				
			String currentURL = driver.getCurrentUrl();
			System.out.println(currentURL);
			
			if(currentURL.equals("http://qdpm.net/demo/v9/index.php")) {
				System.out.println("Matching URL");
			}
			else {
				System.out.println("URL not matching as expected");
			}

//Step 5 	
			// Close the URL
			
			driver.close();
			
	
	}
	

}
