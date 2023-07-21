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

public class SS2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Random = RandomString.make();
		String Image= "Redbus";
		
		File dsetination =new File("C:\\Users\\ASUS\\eclipse-workspace\\11MarchEve_Automation\\ScreenShot//"+Image+" "+Random+".jpg");
		
		FileHandler.copy(source, dsetination);

	}

}
