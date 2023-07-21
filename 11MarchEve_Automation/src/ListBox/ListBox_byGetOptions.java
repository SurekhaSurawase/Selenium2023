package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_byGetOptions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.drover", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Surekha");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Surawase");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("8980492090");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("1234567");
		
		WebElement Day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		Select S1 = new Select(Day);
		List<WebElement> listDay = S1.getOptions();
		for(int i=0; i<listDay.size(); i++) {
			
			String DayValues = listDay.get(i).getText();//1,2,3----31
			System.out.print(DayValues+" ");
			if(DayValues.equals("9")) {
				listDay.get(i).click();
			}
		}
		System.out.println();
		Select S2 = new Select(Month);
		
		List<WebElement> ListMonths = S2.getOptions();
		for(int j=0; j<ListMonths.size(); j++) {
			
			String MonthValues= ListMonths.get(j).getText();
			System.out.println(MonthValues);
			
			if(MonthValues.equals("Feb")) {
				ListMonths.get(j).click();
			}
		}
		
		System.out.println();
		
		Select S3 = new Select(Year);
		
		List<WebElement> ListYear = S3.getOptions();
		
		for(int k=0; k<ListYear.size(); k++) {
			String YearValues = ListYear.get(k).getText();
			System.out.println(YearValues+" ");
			
			if(YearValues.equals("1994")) {
				ListYear.get(k).click();
			}
		}
				
	}

}
