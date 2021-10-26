package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		
		WebElement txtacc = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		 Actions obj = new Actions(driver);
		 
		 obj.moveToElement(txtacc).click().perform();
		 
		 WebElement textcreate = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		 
		 obj.moveToElement(textcreate).click().perform();
		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("arun");
		 
		 driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("8098422362");
		 
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("arun@com");
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("arun@1996");
		 
		 Thread.sleep(2000);
		 
		 driver.close();
		 
	}
}
