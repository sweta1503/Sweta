package com.MainApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Practicle\\software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();

		//to fetch all the columns from the table we will use the below code
		
		List<WebElement> column = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		int size = column.size();
		System.out.println("total no of columns are:"+size);
		
		for(int i=0;i<size;i++)
		{
			String columnName = column.get(i).getText();
			System.out.println(columnName);
			
//			if(columnName.equalsIgnoreCase("Company"))
//			{
//				System.out.println("we have column name as per requirment");
//			}
		}
		
		//to fetch the all the rows from the table we will use the below code
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		int size1 = rows.size();
		System.out.println("total no of rows are :"+size1);
		
		for(int j=0;j<size1;j++)
		{
			String rowName = rows.get(j).getText();
			System.out.println(rowName);
		}
		
		
		//to fetch the cell data  we will use the below code
		WebElement cellData = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[20]/td[3]"));
		System.out.println(cellData.getText());
		
		
	}

}
