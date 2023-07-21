package Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//driver.get("https://the-internet.herokuapp.com/");
		//to handle the authentication popups we need to pas the credentials in URL only
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Basic Auth')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).isDisplayed();
	}

}
