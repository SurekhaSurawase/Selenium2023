package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		WebElement name = driver.findElement(By.xpath("//h1[contains(text(),'W3Schools Spaces')]"));

		JS.executeScript("arguments[0].scrollIntoView()",name);
	}

}
