package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement clkmanage = driver.findElement(By.xpath("//i[@id='i-icon-profile']"));
		clkmanage.click();
		
    	WebElement log = driver.findElement(By.xpath("//li[@id='signInLink']"));
    	log.click();
    	
    	WebElement txtno = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
    	txtno.sendKeys("8098422362");
	}
}
