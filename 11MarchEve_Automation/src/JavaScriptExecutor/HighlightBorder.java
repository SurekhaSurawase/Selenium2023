package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBorder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		WebElement email = driver.findElement(By.id("email"));
		JS.executeScript("arguments[0].style.border='10px solid orange'", email);
		Thread.sleep(3000);
		
		//JS.executeScript("arguments[0].style.border = 10px solid yellow", email);
		JS.executeScript("arguments[0].style.border='5px solid red'", email);

	}

}
