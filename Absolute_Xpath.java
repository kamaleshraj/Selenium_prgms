package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\ModelSelenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/s?k=iphone&ref=nb_sb_noss_2");
	
	driver.manage().window().maximize();
	
	WebElement iphone_btn = driver.findElement(By.xpath("//div[@id='dp']/div[2]"));
	
	iphone_btn.click();
	
	driver.close();
	
	
	}
	
	
}
