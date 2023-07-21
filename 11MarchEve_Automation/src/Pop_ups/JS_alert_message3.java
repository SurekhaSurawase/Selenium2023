package Pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_alert_message3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
//		String ActText = driver.switchTo().alert().getText();
//		System.out.println(ActText);
		
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		Thread.sleep(3000);
		popup.sendKeys("HI");
		Thread.sleep(4000);
		popup.accept();
		//WebElement result =driver.findElement(By.id("result"));
		String Result = driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		Thread.sleep(3000);
		System.out.println("Result is: "+Result);
	}

}
