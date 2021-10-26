package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Train {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement txtenter = driver.findElement(By.xpath("//input[@id='from_station']"));
		txtenter.sendKeys("chennai");
		
		WebElement txtto = driver.findElement(By.xpath("//input[@id='to_station']"));
		txtto.sendKeys("ariyalur");
		
		WebElement txtclk = driver.findElement(By.xpath("//button[@type='submit']"));
		txtclk.click();
		
		
	}
}
