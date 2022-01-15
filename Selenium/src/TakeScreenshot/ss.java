package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ss 
	{
		public static void main(String[] args) throws InterruptedException, IOException 
		 {
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.youtube.com/");
			Thread.sleep(2000);
            TakesScreenshot ts=(TakesScreenshot) driver;
            File temp = ts.getScreenshotAs(OutputType.FILE);
            File hdd = new File("C:\\Users\\abhis\\OneDrive\\Desktop\\ss.jpeg");
            FileUtils.copyFile(temp,hdd);
            
	     }

}
