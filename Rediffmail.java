package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
//		WebElement username = driver.findElement(By.id("login1"));
//		WebElement password = driver.findElement(By.id("password"));
//		//WebElement login = driver.findElement(By.id(""));
		
//		username.sendKeys("sweta");
//		password.sendKeys("sweta1503");

		
		WebElement username = driver.findElement(By.name("login"));
		WebElement password = driver.findElement(By.name("passwd"));
		WebElement login = driver.findElement(By.name("proceed"));
		
		
		username.sendKeys("sweta");
		password.sendKeys("sweta1503");
		login.click();
		
		
		
		
	}

}
