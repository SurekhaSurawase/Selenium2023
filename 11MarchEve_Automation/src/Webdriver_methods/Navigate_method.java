package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_method {

	public static void main(String[] args) throws InterruptedException {
		//Navigate Method: is an alternative to get method.
		//With the help of navigate we can navigate the pagaes forward, back and also can refresh the same 
		//but get method  do not provide this function.
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.amazon.in/");
		
		String Title= driver.getTitle();
		System.out.println(Title);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
