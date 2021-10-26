package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart8 {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement txttoys = driver.findElement(By.xpath("//img[@alt='Beauty,Toys & more']"));
		
		Actions obj = new Actions(driver);
		
		Thread.sleep(2000);
		
		obj.moveToElement(txttoys).click().perform();
		Thread.sleep(2000);
		
		WebElement txtkids = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		
		obj.moveToElement(txtkids).click().perform();
	}
}
