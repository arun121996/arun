package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("(//input[@id='autocomplete'])[1]"));
		
		text.sendKeys("redex");
		
		driver.findElement(By.xpath("//a[@class='srch_action btn orange']")).click();
		
		driver.findElement(By.xpath("//img[contains(@title,'Royal Son')]")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	
		
		
		
	
	}
}