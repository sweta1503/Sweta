package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookHomework {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
//		WebElement username = driver.findElement(By.id("email"));
//		WebElement password = driver.findElement(By.id("pass"));
//		WebElement login =  driver.findElement(By.id("loginbutton"));
//
//		
//		username.sendKeys("sweta");
//		password.sendKeys("sweta123");
//		login.click();
		
//		WebElement username = driver.findElement(By.name("email"));
//		WebElement password = driver.findElement(By.name("pass"));
//		WebElement login = driver.findElement(By.name("login"));
		
//		WebElement username = driver.findElement(By.className("inputtext55r1inputtext1kbtinputtext1kbt"));
//		WebElement password = driver.findElement(By.className("inputtext55r1inputtext9npiinputtext9npi"));
//		WebElement login = driver.findElement(By.className("42ft4jy052e04jy64jy1selected51sy"));
		
		
//		WebElement username = driver.findElement(By.tagName("input"));
//		WebElement password = driver.findElement(By.tagName("input"));
		WebElement login = driver.findElement(By.tagName("button"));
//		username.sendKeys("sweta");
//		password.sendKeys("sweta123");
		login.click();
		
		
		
	}

}
