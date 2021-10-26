package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccGoogle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
	   System.out.println(url);
	   
	   WebElement txtfname = driver.findElement(By.xpath("//input[@name='firstName']"));
	   txtfname.sendKeys("arunkumar");
	   
	   WebElement txtlname = driver.findElement(By.xpath("//input[@name='lastName']"));
	   txtlname.sendKeys("P");
	   
	   WebElement txtuser = driver.findElement(By.xpath("//input[@name='Username']"));
	   txtuser.sendKeys("arunpoopathi96");
	   
	   WebElement txtpass = driver.findElement(By.xpath("//input[@name='Passwd']"));
	   txtpass.sendKeys("arun@1996");
	   
	   WebElement txtconfirm = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
	   txtconfirm.sendKeys("arun@1996");
	   
	   driver.close();
	}
}
