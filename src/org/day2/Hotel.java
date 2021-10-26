package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("8098422362");
		
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("arun@1996");
		
		WebElement txtenter = driver.findElement(By.id("login"));
		txtenter.click();
		driver.close();
	}
}
