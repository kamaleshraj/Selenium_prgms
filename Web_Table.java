package com.selenium.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		
		driver.manage().window().maximize();
		
		// coloumn data
		
		System.out.println("********Coloumn Data*******");
		
		List<WebElement> column_Data = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		
		for (WebElement data : column_Data) {
		
			String text = data.getText();
			
			System.out.println(text);
			
			
			
		}
		//Row data
		
		System.out.println("************Row dAta**********");
		
		List<WebElement> row_Data = driver.findElements(By.xpath("//table/tbodytr[3]/td[2]"));
		
		for (WebElement data : row_Data) {
			
			
			String text = data.getText();
			System.out.println(text);
			
		}
		
		
		// Header
		
		System.out.println("*******HEADER********");

		WebElement all_Header = driver.findElement(By.tagName("th"));
		
		for (int i = 0; i < all_Header.size(); i++) {
			
			all_Header.getSize(i)
			
		}
		
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
