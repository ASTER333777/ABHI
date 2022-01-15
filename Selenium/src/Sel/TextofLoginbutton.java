package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextofLoginbutton
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver d1=new ChromeDriver();
	Thread.sleep(2000);
	d1.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	WebElement e1=d1.findElement(By.xpath("(//span[.='Login'])[3]"));
	System.out.println(e1.getLocation());
	System.out.println(e1.getLocation().getX());
	System.out.println(e1.getLocation().getY());
	
}
}

