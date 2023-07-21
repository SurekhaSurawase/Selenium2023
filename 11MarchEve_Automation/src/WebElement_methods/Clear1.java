package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shiv@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.name("pass")).sendKeys("!@#$%^");
		Thread.sleep(5000);
		driver.findElement(By.name("pass")).clear();
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		driver.quit();

	}

}
