package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.google.com/");
		
		
		String url = driver.getCurrentUrl();
		System.out.println("url");
		
		driver.manage().window().maximize();
		
		WebElement txt = driver.findElement(By.name("q"));
		txt.sendKeys("GreensTechnology");
		
		WebElement search = driver.findElement(By.name("btnK"));
		search.click();
	}
}
