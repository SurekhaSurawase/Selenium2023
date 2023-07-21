package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox1 {

	//without using select class
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
		
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//option[contains(text(),'9')]")).click();
		
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Sep')]")).click();
		
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[contains(text(),'2022')]")).click();
		
		
		
	}

}
