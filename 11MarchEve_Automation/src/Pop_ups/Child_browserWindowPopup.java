package Pop_ups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browserWindowPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String>Childwindows = driver.getWindowHandles();
		for(String cw : Childwindows) {
			if(!parentwindow.equalsIgnoreCase(cw)) {
			driver.switchTo().window(cw);
			System.out.println(cw);
			String text =driver.findElement(By.xpath("//h1[@class=\"display-1\"]")).getText();
			System.out.println(text);
			driver.close();
			}
		}
		
		driver.switchTo().window(parentwindow);
		String text1=driver.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site')]")).getText();
		System.out.println(text1);
		
	}

}
