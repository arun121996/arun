package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(prime).perform();
		Thread.sleep(2000);
		
		WebElement imgclk = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		
		a.moveToElement(imgclk).click().perform();
		
		
	}
}
