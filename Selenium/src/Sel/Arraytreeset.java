package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arraytreeset 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		Thread.sleep(2000);
		d1.get("file:///C:/Users/abhis/OneDrive/Desktop/mainpage.html");
		Thread.sleep(2000);
		WebElement e1=d1.findElement(By.xpath("(//iframe[@id='f1'])"));
		d1.switchTo().frame(e1);
		d1.findElement(By.xpath("(//input[@id='t2'])")).sendKeys("Abhishek");
		Thread.sleep(2000);
		d1.switchTo().defaultContent();
		d1.findElement(By.xpath("(//input[@id='t'])")).sendKeys("Hi");
		Thread.sleep(2000);
}
}