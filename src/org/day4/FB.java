package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		WebElement txtuser = driver.findElement(By.xpath("//input[@type='text']"));
		txtuser.sendKeys("arunpoopathi96@gmail.com");
		String user = txtuser.getText();
		System.out.println("arunpoopathi96@gmail.com");
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
		txtpass.sendKeys("arun@1996");
		String pass = txtpass.getText();
		System.out.println("arun@1996");
		
		WebElement clk = driver.findElement(By.xpath("//button[@name='login']"));
		clk.click();
		
		
	}
}
