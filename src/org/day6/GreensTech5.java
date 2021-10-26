package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech5 {
	public static void main(String[] args) throws AWTException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
			
			WebDriver  driver = new ChromeDriver();
			
			driver.get("http://greenstech.in/selenium-course-content.html");
			
			driver.manage().window().maximize();
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			driver.findElement(By.id("heading303")).click();
			
			Actions a = new Actions(driver);
			
			WebElement txttask = driver.findElement(By.xpath("//a[text()=' DAY 6 TASK']"));
			
			a.contextClick(txttask).build().perform();
			
			Robot r = new Robot();
			for (int i = 0; i < 6; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
	}
}
