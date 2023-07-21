package Demo;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String data = Login.LoginData().get("M");
		String arr[] =data.split(":");
		
		driver.findElement(By.id("email")).sendKeys(arr[0]);
		driver.findElement(By.id("pass")).sendKeys(arr[1]);
		driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
		
		String title =driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook")) {
			System.out.println("correct");
		}
		else System.out.println("Incorrect");
		
	}
	
	public static HashMap<String, String> LoginData() {
		HashMap<String, String> HM = new HashMap<>();
		HM.put("A", "Surekha: Surekha9033");
		HM.put("C", "Surekha1: Surekha20");
		HM.put("M", "Surekha2: Surekha93");
		HM.put("T", "Surekha3: Surekha033");
		
		return HM;
	}
}
