package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Absolute_Xpath1 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\ModelSelenium\\Driver\\geckodriver.exe") ;
	
WebDriver driver = new FirefoxDriver();

driver.get("https://www.amazon.in/s?k=iphone&ref=nb_sb_noss_2");


driver.manage().window().maximize();

WebElement fp = driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]"));


fp.click();

fp.clear();		
	}
	
	
	
	
	
	
	
}
