package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		WebElement txtsports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		
		Actions obj = new Actions(driver);
		
		obj.moveToElement(txtsports).click().perform();
		
		Thread.sleep(2000);
		
		WebElement txtclk = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		obj.moveToElement(txtclk).click().perform();
	}
}
