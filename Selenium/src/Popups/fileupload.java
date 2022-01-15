package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileupload
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		Thread.sleep(2000);
		d1.get("https://www.naukri.com/");
		Thread.sleep(2000);
		String p_id=d1.getWindowHandle();
		
		System.out.println(p_id);
		d1.close();
		}
	}