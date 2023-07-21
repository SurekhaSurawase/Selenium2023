package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	    WebElement Username = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	    Username.sendKeys("Surekha");
	    Thread.sleep(3000);
	    Username.clear();
	    Username.sendKeys("shiv");
	    WebElement PWD = driver.findElement(By.xpath("//input[@type=\"password\"]"));
	    PWD.sendKeys("jnksdjfnl");
	    Thread.sleep(3000);
	    PWD.clear();
	    
	    driver.quit();
	}

}
