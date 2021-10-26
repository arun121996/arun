package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get(" http://www.greenstechnologys.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	    driver.manage().window().maximize();
	    
	    WebElement txt = driver.findElement(By.xpath("(//div[@class='trainer-info'])[1]"));
	    String text = txt.getText();
	    System.out.println(text);
	    
	    WebElement add2= driver.findElement(By.xpath("(//div[@class='trainer-info'])[2]"));
	    String text3 = add2.getText();
	    System.out.println(text3);
	    
	    WebElement add3 = driver.findElement(By.xpath("(//div[@class='trainer-info'])[3]"));
	    String text4 = add3.getText();
	    System.out.println(text4);
	    
	    WebElement add4 = driver.findElement(By.xpath("(//div[@class='trainer-info'])[4]"));
	    String text5 = add4.getText();
	    System.out.println(text5);
	    
	    WebElement add5 = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
	    String text6 = add5.getText();
	    System.out.println(text6);
	    
	    WebElement add6 = driver.findElement(By.xpath("(//div[@class='trainer-info'])[6]"));
	    String text7 = add6.getText();
	    System.out.println(text7);
	    
	    
	}
}
