package com.selenium.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\ModelSelenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement alert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alert.click();
		
		Alert alertS = driver.switchTo().alert();
		alertS.accept();
		
		
		WebElement clkS = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		clkS.click();
		
		
		WebElement clk = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		clk.click();
		
		Thread.sleep(5000);     /// to overcome sleep we use wait concept
		
		Alert clk2 = driver.switchTo().alert();
		clk2.dismiss();
		
		WebElement prompt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		prompt.click();
		
		WebElement prt_btn = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		prt_btn.click();
		
		
		Alert alertprt = driver.switchTo().alert();
		alertprt.sendKeys("Tester: TEST");
		alertprt.accept();
		
		
		
}
}		
	
	
	
	
	
	
	

