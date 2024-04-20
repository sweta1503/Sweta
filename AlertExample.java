package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		// to maximize the window we can use below code
		   driver.manage().window().maximize();
		 //to minimize the window we can use below code  
		   driver.manage().window().minimize();
		   
		   
//		WebElement button = driver.findElement(By.xpath("//*[@id='OKTab']/button"));
//		button.click();
//		
//		//1. to get the text from alret box will use gettext method
//		
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
//
//		//2.to accept the alert we can use accept method
//		driver.switchTo().alert().accept();//to click on ok we use accept method
		
//		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
//		button.click();
//		
//		WebElement button1 = driver.findElement(By.xpath("//*[@id='CancelTab']/button"));
//		button1.click();
//		
//		//3. to dismiss the alret we can use dismis method
//		driver.switchTo().alert().dismiss();// to click on cancel we use dismis method
		
		
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		button.click();
		
		WebElement button1 = driver.findElement(By.xpath("//*[@id='Textbox']/button"));
		button1.click();
			
		//4. to enter the value in alert we can use sendkeys method
		driver.switchTo().alert().sendKeys("sweta");
		driver.switchTo().alert().accept();
		
		
		
		
	}

}
