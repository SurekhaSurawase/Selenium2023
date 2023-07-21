package WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		String Id1 = driver.getWindowHandle();
		System.out.println(Id1);
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		String Id = driver.getWindowHandle();
		System.out.println(Id);;
	}

}
