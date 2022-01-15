package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollbarandclick
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		
		for(int i=0;i<3;i++)
		{	
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		}
		}
	}