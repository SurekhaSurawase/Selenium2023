package Webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_practice2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Dimension D = new Dimension(500,700);
		
		driver.manage().window().setSize(D);
		
		System.out.println(driver.manage().window().getSize());
		
		driver.manage().window().maximize();

		driver.manage().window().getSize();
		
		System.out.println(driver.manage().window().getSize());
		
		Point P = new Point(600,300);
		
		driver.manage().window().setPosition(P);
		
		System.out.println(driver.manage().window().getPosition());
		
		driver.manage().window().getPosition();
		
		System.out.println(driver.manage().window().getPosition());
		
	}

}
