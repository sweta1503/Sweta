package com.MainApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("sweta");
		driver.findElement(By.id("password")).sendKeys("sweta2123");
		driver.findElement(By.id("login")).click();
		
		
		

	}

}
