package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		WebElement txtphno = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		txtphno.sendKeys("8098422362");
		
		WebElement txtenter = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		txtenter.click();
		
	   driver.close();
		
	
	}
}
