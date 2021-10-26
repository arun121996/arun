package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String title = driver.getTitle();
		System.out.println("title");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		
		WebElement txtuser = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtuser.sendKeys("arun@1996");
		String text = txtuser.getText();
		System.out.println("arun@1996");
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
		txtpass.sendKeys("arun@1996");
		String text2 = txtpass.getText();
		System.out.println("arun@1996");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
