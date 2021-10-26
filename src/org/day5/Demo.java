package org.day5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		
				
		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement src1 = driver.findElement(By.xpath("//li[@data-id='5']"));
		
		WebElement des1 = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		Thread.sleep(1000);
		
		
		
		
	
		
		Actions a = new Actions(driver);
		
		
		a.dragAndDrop(src,des).click().perform();
		
		a.dragAndDrop(src1, des1).click().perform();
		
		
		Thread.sleep(2000);
		
		
		
		
		
		
	}
}
