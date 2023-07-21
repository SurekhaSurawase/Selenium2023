package Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadBrowserPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\ASUS\\eclipse-workspace\\11MarchEve_Automation\\Testdata\\StudentInfo.xlsx");

		driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
		String text =driver.findElement(By.xpath("//h3[contains(text(),'File Uploaded!')]")).getText();
		System.out.println(text);
	}

}
