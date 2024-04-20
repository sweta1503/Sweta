package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagLocatorExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//WebElement username =driver.findElement(By.tagName("input"));
		//username.sendKeys("sweta");
		
		//WebElement password =driver.findElement(By.tagName("input"));
		//password.sendKeys("sweta");
		
		WebElement login = driver.findElement(By.tagName("label"));
		login.click();
		
	}

}
