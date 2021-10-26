package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement txtclk = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		txtclk.click();
		
		WebElement txtreg = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		txtreg.click();
		
		WebElement txtphno = driver.findElement(By.xpath("//input[@name='username']"));
		txtphno.click();
		
		
	}
}
