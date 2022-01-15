package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartlogin
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver f1=new ChromeDriver();
	f1.get("https://www.amazon.in/");
	Thread.sleep(2000);
	f1.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("Abhishek");
	Thread.sleep(2000);
	f1.findElement(By.cssSelector("input[type='password']")).sendKeys("Abhishek");
	Thread.sleep(2000);
	f1.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
}
}
