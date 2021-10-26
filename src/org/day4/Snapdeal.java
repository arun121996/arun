package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		WebElement txt = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		txt.sendKeys("iphone");
		
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@title='Apple Iphone 11 Shock Proof Case Megha Star - Black Protection Smoke Cover']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
