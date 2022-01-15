package Sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alterandconfirmationpopup
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		Thread.sleep(2000);
		d1.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		d1.findElements(By.xpath("//a[.='4.1.1')]"));
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
}