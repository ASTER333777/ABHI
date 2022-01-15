package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonpayment
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./software/geckodriver.exe");
	WebDriver d1=new FirefoxDriver();
	Thread.sleep(2000);
	d1.get("https://www.naukri.com/");
	Thread.sleep(2000);
	d1.manage().window().maximize();
	d1.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iPhone 13 (128GB)");
	Thread.sleep(2000);
	d1.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(2000);
	d1.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	Thread.sleep(2000);
	d1.findElement(By.xpath("//span[@id='submit.add-to-cart-announce' and @class='a-button-text' and .='Add to Cart']")).click();
	Thread.sleep(2000);
	
	
	
	
	
	
	
}
}
