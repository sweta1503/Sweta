package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1.using simple x apth method by using tag and attributes
//		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
//		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
//		WebElement login = driver.findElement(By.xpath("//input[@tabindex='4']"));
		
		
		//2.using and condition
//		WebElement username = driver.findElement(By.xpath("//input[@id='email' and @class='inputtext' and @type='text']"));
//		WebElement password = driver.findElement(By.xpath("//input[@name='pass' and @id='pass' and @tabindex='2']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In' and @tabindex='4' and @type='submit']"));
		
		//3.using or condition// in or condition if one attribute is wrong then even it will give output,or both will right it will give  output
//		WebElement username = driver.findElement(By.xpath("//input[@id='email' or @class='inputtext' or @type='text']"));
//		WebElement password = driver.findElement(By.xpath("//input[@name='pass' or @id='pass' or @tabindex='2']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In' or @tabindex='4' or @type='submit']"));
		
		//4.using contains method
//		WebElement username = driver.findElement(By.xpath("//input[contains(@id,'ma')]"));
//		WebElement password = driver.findElement(By.xpath("//input[contains(@type,'wo')]"));
//		WebElement login = driver.findElement(By.xpath("//input[contains(@value,'og')]"));
		
		
		//5. using starts-eith method
//		WebElement username = driver.findElement(By.xpath("//input[starts-with(@id,'em')]"));
//		WebElement password = driver.findElement(By.xpath("//input[starts-with(@name,'pa')]"));
//		WebElement login = driver.findElement(By.xpath("//input[starts-with(@value,'Lo')]"));
		
//		username.sendKeys("sweta");
//		password.sendKeys("sweta");
//		login.click();
		
		//6.using text method
		WebElement link = driver.findElement(By.xpath("//*[text()='Agile Project']"));
		link.click();
		
		

	}

}
