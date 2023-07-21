package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");
		
		driver.findElement(By.id("search2")).sendKeys("automation");
		driver.findElement(By.id("learntocode_searchicon")).click();
		

	}

}
