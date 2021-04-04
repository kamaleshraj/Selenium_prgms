package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Demo {
	

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\ModelSelenium\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	driver.manage().window().maximize();
	
	WebElement singleF = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
	singleF.click();
	
	driver.switchTo().frame("SingleFrame");
	
	WebElement enter = driver.findElement(By.xpath("//input[@type='text']"));
	enter.sendKeys("TESTING");

	Thread.sleep(5000);
	driver.switchTo().defaultContent();
	
	//iframe
	
	WebElement iframe = driver.findElement(By.xpath("//a[@class='analystic'])[2]"));
	//WebElement iframe = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
	iframe.click();
	
	
	WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outerframe);
	
	
	WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(innerframe);
	
	WebElement send = driver.findElement(By.xpath("//input[@type='text']"));
	send.sendKeys("TESTING DATA");

		}	
}
