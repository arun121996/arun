package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.manage().window().maximize();
		
		WebElement txtfrom = driver.findElement(By.id("src"));
		txtfrom.sendKeys("chennai");
		
		WebElement txtto = driver.findElement(By.id("dest"));
		txtto.sendKeys("ariyalur");
		
		WebElement enter = driver.findElement(By.id("search_btn"));
		enter.click();
		
		
	}
}
