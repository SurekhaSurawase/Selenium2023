package PageObjectModel_withoutDDF;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseOrTestClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		
		//WebDriverManager.chromeDriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		LoginPage LP = new LoginPage(driver);
		LP.Username("Admin");
		LP.Password("admin123");
		LP.submit();

		DashBoardPage Dp = new DashBoardPage(driver) ;
		Dp.NameValidation();
		Dp.TimeAtWork();
//		
//		driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[6]")).click();
//		MyInfoPage PI = new MyInfoPage(driver);
//		Thread.sleep(5000);
//		PI.FirstName("Paul");
//		Thread.sleep(5000);
//		PI.MiddleName("jack");
//		Thread.sleep(7000);
//		PI.LastName("Collings");
	}

}
