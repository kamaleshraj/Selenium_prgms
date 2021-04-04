package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOneSelenium {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\ModelSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		// driver.get("https://www.udemy.com/");
		
		//to maximize the window
		
		driver.manage().window().maximize();
		
		// to get title ---- we have to give return type
		
		String title = driver.getTitle();
		System.out.println("title" + title);
		
		// to get the current page URL  -- we have to give return type
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Url" + currentUrl);
		
		
		// navigation
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		// close
		
		driver.close();
		driver.quit();
		
		
		
		
		
	}
	
	
}
