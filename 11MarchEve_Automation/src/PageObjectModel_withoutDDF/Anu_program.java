package PageObjectModel_withoutDDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anu_program {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    // Enter Username
	    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	    
	    // Enter password
	    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
	    
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    
	    String Username = "Paul Collings";
	    		
	    String name = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
	    System.out.println(name);
	    
	    if (Username.equals(name))
	    {
	    System.out.println("Correct usename or login successfully");
	    }
	    else
	    	System.out.println("inCorrect usename or password");
	}

}
