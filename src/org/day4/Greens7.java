package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		WebElement txtsearch = driver.findElement(By.xpath("//input[@name='q']"));
		txtsearch.sendKeys("greens velmurugan");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md'][1]")).click();
		
		Thread.sleep(2000);
		
	}
}
