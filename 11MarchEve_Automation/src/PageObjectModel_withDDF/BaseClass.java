package PageObjectModel_withDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel_withoutDDF.LoginPage;

public class BaseClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		
		//WebDriverManager.chromeDriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		LoginPage LP = new LoginPage(driver);
		//here we are fetching data from external source i.e excel sheet
		
		String path = "./TestData\\testData_DDF.xlsx";
		//String path = "C:\\Users\\ASUS\\eclipse-workspace\\11MarchEve_Automation\\Testdata\\testData_DDF.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String Username = sheet.getRow(1).getCell(0).getStringCellValue();
		LP.Username(Username);
		
		String Password = sheet.getRow(1).getCell(1).getStringCellValue();
		LP.Password(Password);
		
		LP.submit();
		
		DashBoardPage DP = new DashBoardPage(driver);
		DP.NameValidation();
		DP.TimeAtWork();
		
	}

}
