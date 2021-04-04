package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\ModelSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("test@123.com");
		
		WebElement name = driver.findElement(By.name("pass"));
		name.sendKeys("adfq$123");
		
		WebElement login_btn = driver.findElement(By.name("login"));
		login_btn.click();
		
	
		
		
		
		
	}
	
	
	
}
