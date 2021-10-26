package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//a[@id='home-tab']")).click();
		
		Thread.sleep(5000);
		
		WebElement txt = driver.findElement(By.xpath("//p[contains(text(),'Velmurugan currently ')]"));
		String text = txt.getText();
		System.out.println(text);
		
		WebElement txt1 = driver.findElement(By.xpath("//p[contains(text(),'Velmurugan has a pass')]"));
		String text2 = txt.getText();
		System.out.println(text2);
		
		
	}
}
