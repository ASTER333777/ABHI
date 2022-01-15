package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver d1=new ChromeDriver();
	Thread.sleep(3000);
	d1.get("file:///C:/Users/abhis/OneDrive/Desktop/copypaste.html");
	Thread.sleep(2000);
	WebElement e1=d1.findElement(By.xpath("//input[@value='Home']"));
	Thread.sleep(2000);
	WebElement e2=d1.findElement(By.xpath("//input[@value='World']"));
	Thread.sleep(2000);
	WebElement e3=d1.findElement(By.xpath("//a[@href='https://www.google.com']"));
	e1.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	e1.sendKeys(Keys.CONTROL+"c");
	Thread.sleep(2000);
	e2.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	e2.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(2000);
	e3.sendKeys(Keys.ENTER);
}
}
