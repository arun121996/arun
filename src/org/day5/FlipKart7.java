package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart7 {
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
		
		
		WebElement txtfashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		Actions obj = new Actions(driver);
		
		obj.moveToElement(txtfashion).click().perform();
		
		Thread.sleep(2000);
		
		WebElement txtwomens = driver.findElement(By.xpath("//span[text()='Women']"));
		
		
		obj.moveToElement(txtwomens).perform();
		
		Thread.sleep(2000);
		
		WebElement txtslip = driver.findElement(By.xpath("//a[@title='Slippers & Flip Flop's']"));
		obj.moveToElement(txtslip).perform();
		
	}
}
