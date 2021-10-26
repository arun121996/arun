package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/\r\n");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		
		String url = driver.getCurrentUrl();
		System.out.println("url");
		
		WebElement loc = driver.findElement(By.id("location"));
		loc.sendKeys("chennai");
		
	
	}

}
