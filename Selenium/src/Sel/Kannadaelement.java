package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Kannadaelement
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver d1=new ChromeDriver();
	Thread.sleep(2000);
	d1.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement e1=d1.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	System.out.println(e1.getAttribute("href"));
}
}
