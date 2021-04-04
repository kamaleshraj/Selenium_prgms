package com.selenium.basic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicpath_Practise {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
driver.get("https://www.ajio.com/shop/men");

driver.manage().window().maximize();

driver.manage().deleteAllCookies();

@SuppressWarnings("unchecked")
List <WebElement> shoeprice = (List<WebElement>) driver.findElement(By.xpath("//span[@class='prod-cp']"));

List<Integer> price  = new ArrayList<Integer>();
	
	
	
}
	
	
	
















	}
	
	
	
	
	

