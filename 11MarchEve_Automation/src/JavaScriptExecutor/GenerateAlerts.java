package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GenerateAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement account = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		Actions action= new Actions(driver);
		action.moveToElement(account).build().perform();
		
		WebElement signin = driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
		signin.click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("1236547");
		String errormessage = driver.findElement(By.xpath("//span[@class=\"a-list-item\"]")).getText();
		System.out.println(errormessage);
		
		//to generate alert popup first create object of actions class
		
		//String message = "There was problem with password";
		generatealert(driver, "There was problem with password");
	}
	
	public static void generatealert(WebDriver driver, String message) {
		JavascriptExecutor JS = (JavascriptExecutor) driver;
	
		JS.executeScript("window.scrollBy(0, 5000)", "");
		JS.executeScript("alert('"+message+"')");
	}

}
