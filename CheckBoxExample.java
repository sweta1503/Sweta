package com.MainApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//to click on the single checkbox we need  to findout the element and click on it
		//WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
		//checkbox1.click();
		
		//to check  the checkbox is already selected or not we need to use below logic
//		if(checkbox1.isSelected())
//		{
//			System.out.println("checkbox is selected by default");
//		}
//		else
//		{
//			checkbox1.click();
//		}
		
		
		
		//To select the multiple checkbox in single code we will use below method
		//here we use  collectinframe work lists
		List<WebElement> checkboxes =   driver.findElements(By.xpath("//*[@type='checkbox']"));
		int size = checkboxes.size();
    	System.out.println(size);
		
		
		// if u have multiple elements and you want to perform operation on specific index you can use get method
		//checkboxes.get(0).click();
		
		
//		for(int i=0; i<size; i++)
//		{
//			checkboxes.get(i).click();
//		}
		
		//how we will select the dynamic checkbox 
//		for(int i=0; i<size; i++)
//		{
//		  //getattribute method is used to fetch the value of element
//			String value = checkboxes.get(i).getAttribute("value");
//			if(value.equalsIgnoreCase("cricket"))
//			{
//				checkboxes.get(i).click();
//			}
//		}

	}

}
