package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(5000);
		
		boolean B1 = driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
		System.out.println(B1);

		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
        boolean B2 = driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
        System.out.println(B2);
	}

}
