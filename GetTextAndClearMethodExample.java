package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndClearMethodExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("sweta");
		
		//To clear the populated text in  textbox we  need to use clear method
		username.clear();
		
		
		WebElement text = driver.findElement(By.tagName("h1"));
		
		//to fetch the value of particular elements we can use getetxt method
		String value  = text.getText();
		System.out.println(value);
		
		

	}

}
