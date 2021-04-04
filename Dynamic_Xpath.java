package com.selenium.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe"); // path can be shared
		
WebDriver driver = new ChromeDriver();

driver.get("https://www.myntra.com/men-tshirts");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();    // to delete all the cookies
		
		List<WebElement> all_Price_list = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
																					//xpath //relation::tagname
		List<Integer> price_List = new ArrayList<Integer>();
		
		// from list we cannot take so need to iterate by foreach
for (WebElement price : all_Price_list) {
	
	String value = price.getText().replace("Rs. ", "");
	int values = Integer.parseInt(value);
	
	//System.out.println(value);
	price_List.add(values);	
}
System.out.println(price_List);
	
Collections.max(price_List);

System.out.println("Maximum value : " +Collections.max(price_List)); // its static here so without creating object we can call

System.out.println("Minimum value : " +Collections.min(price_List));

	int size = price_List.size();
	System.out.println("Size: " +size);
	
}		
	}
	
	
	
	

