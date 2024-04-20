package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
//		//1.by using  tag and class name
//		
//		WebElement username = driver.findElement(By.cssSelector("input.inputtext"));
//		
//		
//		//2.by using tag and id
//		WebElement password = driver.findElement(By.cssSelector("input#pass"));
		
//		//3.by using tag and attributes
		//WebElement username = driver.findElement(By.cssSelector("input[type='text']"));// multiple attributes can use
//		
//		
//		//4.by using tag class and attributes
		//WebElement password = driver.findElement(By.cssSelector("input.inputtext[type='password'][tabindex='2']"));
		
		//5.by using tag id and attributes
		//WebElement username = driver.findElement(By.cssSelector("input#email[type='text'][name='email']"));
		//WebElement password =driver.findElement(By.cssSelector("input#pass[class='inputtext'][name='pass']"));
		//WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type='submit'][tabindex='4'][value='Log In']"));
		
		//6.BY using the starts with (tag and and attiribtue)- it will find the locators based on starting character
		//WebElement username = driver.findElement(By.cssSelector("input[name^='ema']"));
		//WebElement password = driver.findElement(By.cssSelector("input[type^='pass']"));
		
		//7.By using ends with(by using tag and attrributes) - it will find the locators based on  ending charater
		//WebElement username = driver.findElement(By.cssSelector("input[id$='ail']"));
		//WebElement password = driver.findElement(By.cssSelector("input[type$='word']"));
		
		//8.by using the contains - it will find the locators based on charater whic is present or not
		WebElement username = driver.findElement(By.cssSelector("input#email[name*='ma'][type*='ex']"));
		WebElement password = driver.findElement(By.cssSelector("input#pass[name*='as'][type*='wo']"));
		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type*='bm']"));
		username.sendKeys("sweta");
		password.sendKeys("sweta1503");
		login.click();
		
		
		
	}

}
