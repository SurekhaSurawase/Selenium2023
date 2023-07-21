package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownTillBottom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		//Scroll down till bottom
		JS.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		Thread.sleep(5000);
		//ScrollUp till top
		JS.executeScript("window.scrollBy(document.documentElement.scrollTop=0)", "");

	}

}
