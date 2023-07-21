package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Self_assign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://byjus.com/learn/account/login");

		driver.findElement(By.xpath("(//a[contains(text(),'Login')])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your mobile number\"]")).sendKeys("8980492090");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
//     	driver.findElement(By.xpath("//button[contains(text(),'Skip tour')]")).click();
//		driver.findElement(By.xpath("//img[@class=\"Guidetour_vector2__mpHbA img-fluid\"]")).click();
//		driver.findElement(By.xpath("//noscript[contains(text(),'You need to enable JavaScript to run this app.')]")).click();
//		
//		driver.get("");
		
	}

}
