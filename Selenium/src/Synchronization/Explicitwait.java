package Synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait 
{
  public static void main(String[] args) 
  {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.naruget.tv/category/boruto-subbed/");
	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.titleContains("Boruto"));
	String title = driver.getTitle();
	System.out.println(title);
  }
}
