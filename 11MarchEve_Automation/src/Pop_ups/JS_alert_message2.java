package Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_alert_message2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement popup = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		popup.click();
		driver.switchTo().alert().dismiss();
		String Result = driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		Thread.sleep(3000);
		System.out.println(Result);

	}

}
