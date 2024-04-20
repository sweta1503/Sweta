package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorsExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		// web driver interface
		//To find the element by using id locatores firstly we need to create  refrence variable of web element interface and need to use below syntax
		WebElement username = driver.findElement(By.id("email"));
		
		WebElement password = driver.findElement(By.id("pass"));
		
		//WebElement login = driver.findElement(By.id("loginbutton"));		
		WebElement login =  driver.findElement(By.id("u_0_b"));
		
		
		
		
		
		//sendkeys method is used to enter the value in textbox
		username.sendKeys("swetapatro15@gmail.com");
		password.sendKeys("sweta1503");
		
		//click method is used to click on any button, radio button checkbox or link
		login.click();//submit
		
	}

}
