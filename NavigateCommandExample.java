package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigateCommandExample {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1. to open the url we can use navigate.to method
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		//2.to refresh the page
		driver.navigate().refresh();
		
		//3.  to redirect on one step back
		WebElement flight = driver.findElement(By.linkText("Flights"));
		flight.click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		//4. to redirect  on one step forward
		driver.navigate().forward();
		
	}

}
