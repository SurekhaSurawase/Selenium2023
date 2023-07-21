package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment_byjus {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//https://byjus.com/learn/profile
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://byjus.com/learn/account/login");
		
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your mobile number\"]")).sendKeys("8980492090");
	
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'10th Grade')])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'My profile')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name=\"date_of_birth\"]")).sendKeys("02/06/1998");
		
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//input[@name=\"date_of_birth\"]")).click();
		Thread.sleep(3000);
		// Select the Month
		WebElement month = driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"));
		Select SC3 = new Select(month);
		SC3.selectByVisibleText("June");
		Thread.sleep(3000);
		
		// Select the Year
		WebElement year = driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]"));
		Select SC4 = new Select(year);
		SC4.selectByVisibleText("1998");
		Thread.sleep(2000);
		
		// Select the day
		driver.findElement(By.xpath("(//div[contains(text(),'2')])[4]")).click();
		Thread.sleep(3000);
		
		// Using the Action class we can select the Gender
		Actions act = new Actions(driver);
		WebElement gender = driver.findElement(By.xpath("//input[@id=\"react-select-3-input\"]"));
		act.click(gender);
		act.sendKeys("Male").perform();
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(3000);
		// Using the  same Action class-"act" we can select the Gender
		WebElement city = driver.findElement(By.xpath("//input[@id=\"react-select-4-input\"]"));
		act.click(city);
		act.sendKeys("Pune");
		act.sendKeys(Keys.ENTER).perform();
		
		
		// Selecting the avatar
		
		driver.findElement(By.xpath("//img[@src=\"https://learn-assets.byjusweb.com/images/profile/edit.png\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//img[@alt=\"profile icon\"])[3]")).click();
		
		// Save Button
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"Save\"]")).click();
		Thread.sleep(5000);
		
		
	}
}
