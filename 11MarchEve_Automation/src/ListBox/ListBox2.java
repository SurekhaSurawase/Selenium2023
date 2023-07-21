package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Surekha");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Pawar");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("shiv@gmail.com");
		//driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("456651234545");
		//driver.findElement(By.id("id=\"u_2_g_YT\"")).sendKeys("9405585888");
		driver.findElement(By.xpath("//input[@data-type=\"password\"]")).sendKeys("78456361");
		
		WebElement Day= driver.findElement(By.id("day"));
	    WebElement Month= driver.findElement(By.id("month"));
	    WebElement Year= driver.findElement(By.id("year"));
	    
	    
	    //1. selectByVisibleText() of select class
//	    Select Day1= new Select(Day);
//	    Day1.selectByVisibleText("11");
//	    
//	    Select Month1 = new Select(Month);
//	    Month1.selectByVisibleText("Feb");
//	    
//	    Select Year1 = new Select (Year);
//	    Year1.selectByVisibleText("2020");
	    
	    //2. selectByValue()
//	    Select Day2 = new Select(Day);
//	    Day2.selectByValue("15");
//
//	    Select Month2 = new Select(Month);
//	    Month2.selectByValue("3");
//	    
//	    Select Year2 = new Select (Year);
//	    Year2.selectByValue("2021");
	    
	    //3.selectByIndex()
	    Select Day3 = new Select(Day);
	    Day3.selectByIndex(11);

	    Select Month3 = new Select(Month);
	    Month3.selectByIndex(6);
	    
	    Select Year3 = new Select (Year);
	    Year3.selectByIndex(15);
	    

	}

}
