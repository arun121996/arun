package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement txtclk = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		txtclk.click();
		
		WebElement txtphno = driver.findElement(By.xpath("//input[@name='mobile']"));
	   txtphno.sendKeys("8098422362");
	   
	   WebElement txtname = driver.findElement(By.xpath("//input[@name='name']"));
		txtname.sendKeys("arun");
		
		WebElement txtmail = driver.findElement(By.xpath("//input[@name='email']"));
		txtmail.sendKeys("arunpoopathi96@gmail.com");
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@name='password']"));
		txtpass.sendKeys("arun@1996");
		
		WebElement txtenter = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		txtenter.click();
		
	}
}
