package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement txtname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtname.sendKeys("arunkumar");
		
		WebElement txtadd = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtadd.sendKeys("chennai");
		
		WebElement txtmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtmail.sendKeys("arunpoopathi96@gmail");
		
		WebElement txtph = driver.findElement(By.xpath("//input[@type='tel']"));
		txtph.sendKeys("8098422362");
		
		//WebElement txtlang = driver.findElement(By.xpath("//div[@id='msdd']"));
		//txtlang.sendKeys("tamil");
		
	}
}
