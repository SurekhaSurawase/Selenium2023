package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		// 1st way How many rows are there:

		int R1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("No. of rows-->" + R1);
		
		List<WebElement> R2 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println("No. of rows R2->" + R2.size());

		// col
		int C1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("No. of column-->" + C1);

		// Retrieve the specific value

		String Data = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[2]")).getText();
		System.out.println(Data);

		// Reading all Data from table

		for (int i = 2; i <= R1; i++) {

			for (int j = 1; j <= C1; j++) {

				String D1 = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				if (D1.equals("UK")) {

					System.out.println("Row no." + i + "----" + "Col no." + j);
					break;
				}

				System.out.print(D1 + " - ");
			}
			System.out.println();
		}
	}

}
