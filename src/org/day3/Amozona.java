package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amozona {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get(" https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement txtsearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtsearch.sendKeys("realme");
		
		WebElement txtclk = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		txtclk.click();
	}
}
