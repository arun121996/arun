package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		WebElement txtuser = driver.findElement(By.xpath("//input[@id='email']"));
		txtuser.sendKeys("arunpoopathi@gmail.com");
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@id='pass']"));
		txtpass.sendKeys("arun@1996");
		
		WebElement enter = driver.findElement(By.xpath("//button[@name='login']"));
		enter.click();
		
	 
	}
}
