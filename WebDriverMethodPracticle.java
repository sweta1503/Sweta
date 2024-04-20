package com.MainApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodPracticle 
{

	public static void main(String[] args) 
	{
		//This method will help you to set the browser path which we need to used to run the automation testing
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		
		
		
		//to create chromedriver object we need to crate webdriver interface refrance varaiable and need to create object for browser
		WebDriver driver = new ChromeDriver();//here we create a object of chrome driver
		
		//1.get()- this method will help you to open to any Url
		
		driver.get("https://www.amazon.in/");
		
		
		//2.getTittle()- this method will help you to fetch the tittle of current open url to get tittle method
		//String tittle = driver.getTitle();
		System.out.println(driver.getTitle());
		
		//3.getCurrenturl - to get the currently opend url we can use current url method
		//String tittle = driver.getCurrentUrl
		System.out.println(driver.getCurrentUrl());
		
		
		//4.getPageSource()- to get the source code of open url we can use getPageSource 
		//String pageSource = driver.getPageSource();
		 System.out.println(driver.getPageSource());
		
		//5.close()- this method will help you to  close  the current opened url
		driver.close();
		 
		 //6.quit()-  this method will help you to close the all opened url we need to use quit method
		driver.quit();
		
		
		
		
		
	}

}
