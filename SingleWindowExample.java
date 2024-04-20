package com.MainApp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindowExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		//getwindow method will store the unique session id of opened window
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);

		//in set<string> in this  we use set because it accept only unique data in list we use duplicate data also
		//iterator means iterate the data one by one
		//hasNExt in this it will return true if iteration has more element
		
		WebElement button = driver.findElement(By.xpath("//*[@id='Tabbed']/a/button"));
		button.click();
		
		//it will store the all the opened window after clicking on button
		Set<String> childwindow = driver.getWindowHandles();
		Iterator<String> i = childwindow.iterator();
		while(i.hasNext())
		{
			String childwiwindow1 = i.next();
			System.out.println(childwiwindow1);
			if(!parentwindow.equalsIgnoreCase(childwiwindow1))
			{
				driver.switchTo().window(childwiwindow1);
				WebElement download = driver.findElement(By.linkText("Downloads"));
				download.click();
				driver.close();			
				}
			
		}
		driver.switchTo().window(parentwindow);
	}

}
