package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("arunpoopathi96@gmail.com");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("arunpoopathi@gmail.com");
		
		WebElement btnClick = driver.findElement(By.name("login"));
		btnClick.click();
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		driver.close();
		
		
		
	}
}
