package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleValueDropDownExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select select = new Select(fruits);
		
		//to check the if we can select the multiple value from the dropdown we can use ismultple()
		
		if(select.isMultiple())
		{
			select.selectByIndex(0);
			select.selectByVisibleText("Apple");
			select.selectByValue("grape");
		}
		
//		select.deselectByIndex(0);
//		select.deselectByVisibleText("Apple");
//		select.deselectByValue("grape");
		select.deselectAll();
		
		

	}

}
