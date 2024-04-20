package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaysToRefreshPage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
//		//1. by using refresh method
//		driver.navigate().refresh();
//		
//		//2.by using get and current url method
//		//driver.get(driver.getCurrentUrl());
//		System.out.println(driver.getCurrentUrl());
//		
//		//3. by using the get current url and add that into navigate method
//		driver.navigate().to(driver.getCurrentUrl());
		
		
//		//4.by using f5 key press
//		driver.findElement(By.id("email")).sendKeys(Keys.F5);
		
		//5. by using ascii value
		driver.findElement(By.id("email")).sendKeys("\uE035");
		

	}

}
