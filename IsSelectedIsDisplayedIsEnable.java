package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedIsDisplayedIsEnable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username  = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
//		boolean result = username.isDisplayed();
//		boolean result1 = username.isEnabled();
//		System.out.println(result);
//		System.out.println(result1);
//		
//		System.out.println(password.isDisplayed());
//		System.out.println(password.isEnabled());
		
		
		// isDisplayed method is used to vaidate element is   present or not
		//isEnable  methid is used to validate element is enable or disable
		if(username.isDisplayed() && username.isEnabled())
		{
			username.sendKeys("sweta");
		}
		else
		{
			System.out.println("username is not displaye");
		}
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("sweta");
		}
		else
		{
			System.out.println("password is not displayed");
		}
		
		
		
		// isSelected method is used to validate checkbox or radio button is already selected or not 
		WebElement checkbox = driver.findElement(By.id("persist_box"));
		
//		boolean result = checkbox.isSelected();
//		System.out.println(result);
				System.out.println(checkbox.isSelected());
	}

}
