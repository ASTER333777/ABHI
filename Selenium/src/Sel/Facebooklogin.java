package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver f1=new ChromeDriver();
	f1.get("https://www.facebook.com/");
	Thread.sleep(2000);
	f1.findElement(By.cssSelector("input[name='email']")).sendKeys("Abhishek");
	Thread.sleep(2000);
	f1.findElement(By.cssSelector("input[type='password']")).sendKeys("Abhishek");
	Thread.sleep(2000);
	f1.findElement(By.cssSelector("button[value='1']")).click();
}
}
