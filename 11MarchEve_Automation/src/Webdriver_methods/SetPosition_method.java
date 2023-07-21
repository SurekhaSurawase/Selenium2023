package Webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition_method {

	public static void main(String[] args) throws InterruptedException {
		//SetPosition: this method is used to change position of browser and accepts dimension arguments
		//Before using method we need to create object of point class and need to pass arguments in it.
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.get("https://www.amazon.in/");
		
		Point P1 = new Point(500,700);
		
		driver.manage().window().setPosition(P1);
		
		System.out.println(driver.manage().window().getPosition());
		
		driver.close();
	}

}
