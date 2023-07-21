package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownUp1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		
		//First type cast driver object with JavscriptExecutor interface
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		//ScrollDown
		JS.executeScript("window.scrollBy(0,5000)", "");
		
		//ScrollUp
		JS.executeScript("window.scollBy(0,-5000)", "");

	}

}
