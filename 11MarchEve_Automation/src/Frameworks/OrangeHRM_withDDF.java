package Frameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_withDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Data Drivern framework is a method of separating test cases from test data.
		//so in this case we will store data in external source like .xlsx file and we will fetch data from it.
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String path = "C:\\Users\\ASUS\\eclipse-workspace\\11MarchEve_Automation\\Testdata\\testData_DDF.xlsx";
		FileInputStream file = new FileInputStream(path);
		String username = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		
		FileInputStream file1 = new FileInputStream(path);
		String password = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String ExpName = "Paul Collings";
		
		String ActName = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		System.out.println(ActName);
		
		if(ExpName.equals(ActName))
			System.out.println("Correct name and login successfully");
		else
			System.out.println("Incorrect username or password");
				
	}

}
