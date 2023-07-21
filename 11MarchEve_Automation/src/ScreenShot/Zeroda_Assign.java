package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import net.bytebuddy.utility.RandomString;

public class Zeroda_Assign {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\ASUS\\Desktop\\ScreenShot_assign//Sample1.jpg");
		FileHandler.copy(source, dest);
		
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Login')]"));
		
		File source1 = ((TakesScreenshot) text).getScreenshotAs(OutputType.FILE);
		
		File dest1 = new File("C:\\Users\\ASUS\\eclipse-workspace\\11MarchEve_Automation\\Project//Sample2.jpg");
		FileHandler.copy(source1, dest1);
		
		//String Random = RandomString.make(5);
		String File = "Zeroda";
		
		Zeroda_Assign.zeroda_ss(File);
		Zeroda_Assign.zeroda_ss("test1"+File);
		Zeroda_Assign.zeroda_ss("test2"+File);
		Zeroda_Assign.zeroda_ss("test3"+File);
//		File source2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		File dest2 = new File("C:\\Users\\ASUS\\eclipse-workspace\\11MarchEve_Automation\\Project//"+Img+" "+Random+".jpg");
//		FileHandler.copy(source2, dest2);
		

	}

	public static void zeroda_ss(String File) throws IOException {
		File source2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Random = RandomString.make(5);
		File dest2 = new File("C:\\Users\\ASUS\\eclipse-workspace\\11MarchEve_Automation\\Project//"+File+" "+Random+".jpg");
		FileHandler.copy(source2, dest2);
	}
}
