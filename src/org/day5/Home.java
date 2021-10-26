package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Home {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.homedepot.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		WebElement txtdept = driver.findElement(By.xpath("//a[@data-id='departmentsFlyout'][1]"));
		
		Actions obj =new Actions(driver);
		
		obj.moveToElement(txtdept).click().perform();
		
		Thread.sleep(2000);
		
		WebElement txtheatingcooling = driver.findElement(By.xpath("//strong[text()='Heating, Venting & Cooling']"));
		
		obj.moveToElement(txtheatingcooling).click().perform();
		
		Thread.sleep(2000);
		
		WebElement txtac = driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
		
		obj.moveToElement(txtac).click().perform();
		
		
	}
}
