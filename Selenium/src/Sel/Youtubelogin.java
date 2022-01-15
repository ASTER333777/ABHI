package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubelogin
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver f1=new ChromeDriver();
	f1.get("https://www.google.com/maps/");
	Thread.sleep(2000);
	f1.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("Kerala");
	Thread.sleep(2000);
	f1.findElement(By.xpath("//button[@aria-label='Search']")).click();
	Thread.sleep(2000);
	f1.findElement(By.xpath("//img[@alt='Directions']")).click();
	Thread.sleep(2000);
	f1.findElement(By.xpath("//body[@class='keynav-mode-off highres screen-mode']")).sendKeys("Bengaluru");
	Thread.sleep(2000);
	f1.findElement(By.xpath("//button[@jstcache='965']")).click();
	Thread.sleep(2000);
	f1.findElement(By.xpath("//span[.='NH 44 and NH544']")).click();
	Thread.sleep(2000);
}
}

