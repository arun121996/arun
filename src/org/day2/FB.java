package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("arunpoopathi96@gmail.com");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("arun@1996");
		
		WebElement clk = driver.findElement(By.name("login"));
		clk.click();
		
		driver.close();
	}
}
