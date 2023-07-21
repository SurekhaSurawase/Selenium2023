package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password= driver.findElement(By.id("pass"));
		
		JS.executeScript("arguments[0].value = '"+  "Test" +"';", username);
		
		JS.executeScript("arguments[0].value = '"+   "test123"  +"';", password);
		
		WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
		JS.executeScript("arguments[0].click()", button);

	}

}
