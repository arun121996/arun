package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		WebElement txtcourse = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
		
		Actions obj = new Actions(driver);
		
		obj.moveToElement(txtcourse).click().perform();
		
		WebElement txtRpa = driver.findElement(By.xpath("//span[text()='RPA (6)']"));
		
		obj.moveToElement(txtRpa).click().perform();
		Thread.sleep(2000);
		
		WebElement txtBPT = driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
		
		obj.moveToElement(txtBPT);
	}
}
