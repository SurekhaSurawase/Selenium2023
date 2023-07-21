package Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_alert_message1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		//after this pop-up will apperar and unless and until we perform action on pop-up we cant proceed further.
		//For handling such type of pop-ups we use alert().methodname() ie action to be performed.
		//there are 4 method present accept(), getText(), sendKeys()and dismiss();
		
		driver.switchTo().alert().accept();
		
		

	}

}
