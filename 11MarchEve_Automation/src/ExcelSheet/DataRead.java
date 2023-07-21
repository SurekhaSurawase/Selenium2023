package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String Path = "D:\\Manual testing notes\\Data.xlsx";
		
		FileInputStream file= new FileInputStream(Path);

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		String Data1 =workbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(Data1);
		//String Data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		//System.out.println(Data);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(Data1);
		driver.findElement(By.id("pass")).sendKeys(Data1);
		driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
		
		
		
	}

}
