package com.iPivot.InsuranceCalculator_V02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class TestInsuranceApp_Navigation 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
    	WebDriver driver = new ChromeDriver(); // open chrome browser
    	driver.get("http://demo.automationtalks.com"); // navigate to the link
    	driver.manage().window().maximize(); // Maximize the window
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // wait element to be active or present
    	driver.findElement(By.name("Navigation Truck")).click();
    	
    	Thread.sleep(5000);
    	driver.navigate().refresh();
    	
    	Thread.sleep(5000);
    	driver.navigate().back();
    	
    	Thread.sleep(5000);
    	driver.navigate().forward();
    	
    	System.out.println("Test Case Pass");
    }
}
