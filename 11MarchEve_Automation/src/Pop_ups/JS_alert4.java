package Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_alert4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement UN = driver.findElement(By.xpath("//input[@id=\"login1\"]"));
		UN.sendKeys("Surekha");
//		WebElement PWD= driver.findElement(By.xpath("//input[@id=\"password\"]"));
//
//		PWD.sendKeys("123654");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		String Expected = "Please enter your password";
		String actual= driver.switchTo().alert().getText();
		System.out.println(actual);
		
		if(Expected.equals(actual))
			System.out.println("Correct text");
		else
			System.out.println("Incorrect text");
		
		driver.switchTo().alert().accept();
	}

}
