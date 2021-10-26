package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		WebElement txtmob = driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		
		Actions obj = new Actions(driver);
		
		obj.moveToElement(txtmob).click().perform();
		
		Thread.sleep(2000);
		
		WebElement txtcovers = driver.findElement(By.xpath("//span[text()='New Launches Covers']"));
		
		obj.moveToElement(txtcovers).click().perform();
	}
}
