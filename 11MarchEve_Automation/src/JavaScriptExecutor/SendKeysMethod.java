package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		WebElement email = driver.findElement(By.id("email"));
		
		JS.executeScript("arguments[0].value='"+  "surekha"  +"';", email);
		
		WebElement password = driver.findElement(By.id("pass"));
		
		JS.executeScript("arguments[0].value='"+  "qwerty"  +"';", password);
		
		//WebElement showpassword = driver.findElement(By.id("u_0_4_2E"));
		
		//JS.executeScript("arguments[0].click()", showpassword);
		
		//JS.executeScript("document.getElementByID('email').value='surekha';");
		  

	}

}
