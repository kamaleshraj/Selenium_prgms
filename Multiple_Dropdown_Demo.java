package com.selenium.basic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\ModelSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement multidropdown = driver.findElement(By.id("multi-select"));
		
		Select s = new Select(multidropdown);
		
		// is multiple
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		// get options
		
		List<WebElement> alloptions = s.getOptions();
		System.out.println("****** alloptions**********");
		
		// for each
		
		for (WebElement webElement : alloptions) {
			
			String text = webElement.getText();
			System.out.println(text);
		}
		// size
		
		int size = alloptions.size();
		System.out.println("size: "+ size );
		
		// for loop
		
		for (int i = 0; i < size; i++) {
			if(i == 6 || i == 1 || i == 3) {
				s.selectByIndex(i);	
				
		}
		}
		// get all selected options
		
		System.out.println("***** All selected********");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allSelected : allSelectedOptions) {
			System.out.println(allSelected.getText());	
		
		}
		// first selected options
		
		System.out.println("*****First selected*****");
		Thread.sleep(3000);
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);	
	}
}
