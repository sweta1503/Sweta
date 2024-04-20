package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		
		//1.firstly we need to create refrence variable of Java Script Executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//2. In javaScript executor interface we have two method 
		driver.findElement(By.name("uid")).sendKeys("sweta");
		driver.findElement(By.name("password")).sendKeys("sweta123");
		
		WebElement login= driver.findElement(By.name("btnLogin"));
		
//		//we will use below javascript to click on login button.
//		js.executeScript("arguments[0].click();",login);
//		
//		//we will use below javascript to handle  the alert
//		js.executeScript("alert('User or Password is not valid');");
		
		
		//we will use below script to et all details of webpage like tittle, domain name
		
		String domainName = js.executeScript("return document.domain;").toString();
		System.out.println(domainName);
		
		String tittle = js.executeScript("return document.title;").toString();
		System.out.println(tittle);
		
		String url = js.executeScript("return document.URL").toString();
		System.out.println(url);
		
		// we will use below script to launch url
		js.executeScript("window.location='https://demo.guru99.com/test/facebook.html'");
		
		
		
	}

}
