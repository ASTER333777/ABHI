package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cleardata 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/abhis/OneDrive/Desktop/disabled%20TF.html");
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('t1').value=''");
}
}
