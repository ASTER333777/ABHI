package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fontsizeofusernametextfieldinflipkart
{
public static <webelements> void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver d1=new ChromeDriver();
	Thread.sleep(2000);
	d1.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	List<WebElement> links = d1.findElements(By.xpath("//a"));
	
			
}
}

