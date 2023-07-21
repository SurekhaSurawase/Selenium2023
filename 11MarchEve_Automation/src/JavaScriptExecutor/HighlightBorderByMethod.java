package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBorderByMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement logo = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		HighlightBorderByMethod.drawborder(driver, logo);
		HighlightBorderByMethod.drawborder(driver, email);


	}
	
	public static void drawborder(WebDriver driver, WebElement element) {
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].style.border='5px solid red'", element);
		
	}

}
