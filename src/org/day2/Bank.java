package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		driver.manage().window().maximize();
		
		WebElement txtuser = driver.findElement(By.name("DUMMY1"));
		txtuser.sendKeys("arun@1996");
		
	}
}
