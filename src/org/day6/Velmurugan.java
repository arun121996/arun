package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Velmurugan {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/webhp");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement txtname = driver.findElement(By.name("q"));
		
		a.sendKeys(txtname, "velmurugan").perform();
		
		a.doubleClick(txtname).build().perform();
		
		a.contextClick().perform();
		
		Robot r = new Robot();
		
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		     r.keyPress(KeyEvent.VK_ENTER);
		     r.keyRelease(KeyEvent.VK_ENTER);
		     
		     
		
		
		
		
		
		
		
		
	}
}
