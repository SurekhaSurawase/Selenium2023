package Webdriver_methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quite_method {

	public static void main(String[] args) throws InterruptedException {

		//Quit: This method is alternative to lose method.
		//Diff b/w Close() and quit()is close method closes only current tab but quit methodcloses all open tabsof browser.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("surekha9033@gmail.com");
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
