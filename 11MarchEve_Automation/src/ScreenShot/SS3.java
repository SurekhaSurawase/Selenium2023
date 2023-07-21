package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import net.bytebuddy.utility.RandomString;

public class SS3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(4);
		String Img = "Facebook";
		
		File dest = new File("C:\\Users\\ASUS\\eclipse-workspace\\11MarchEve_Automation\\ScreenShot//"+Img+" "+Random+".jpg");
		
		FileHandler.copy(source, dest);

	}

}
