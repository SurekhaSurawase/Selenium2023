package MultilpleLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_links {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//to fetch the multiple links we use find elements method and use tagname"a" and store all this into list of webElements
		
		List<WebElement> list= driver.findElements(By.tagName("a"));
		int Total_links= list.size();
		System.out.println(Total_links);
		
		//to print all URL use for each loop.

		for(WebElement URL: list) {
			//System.out.println(URL);
			System.out.println(URL.getAttribute("href"));
			System.out.println(URL.getText());
		}
	}

}
