package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalLeftRightScroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		//Scroll to right
		JS.executeScript("window.scrollBy(10000,0)", "");

		//Scroll to left
		JS.executeScript("window.scrollBy(-5000,0)", "");
	}

}
