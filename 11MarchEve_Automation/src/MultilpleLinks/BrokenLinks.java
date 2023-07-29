package MultilpleLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links -->"+Links.size());
		
		int Bronkenlinks=0;
		
		for(WebElement L1:Links) {
			
			
			// By using the href we can get the URL of the required link
			String url = L1.getAttribute("href");
			
			if(url==null || url.isEmpty()) {
				
				System.out.println("url is empty or null");
			}
			
			URL L2= new URL(url);
			
			// Create the object ULR object"L2"
			
			//HttpURLConnection httpscode = (HttpURLConnection) L2.openConnection(); // 
			
			//HttpURLConnection httpscode= (HttpURLConnection) L2.openConnection();
			//httpscode.connect();
			
			HttpURLConnection httpscode = (HttpURLConnection) L2.openConnection();
			httpscode.connect();
			// 200--ok
			//400--bad request
			
			if(httpscode.getResponseCode()>=400) {
				
				System.out.println(httpscode.getResponseCode()+"--->"+url+"is--> broken link");
				Bronkenlinks++;
				
			}
			else {
				
				System.out.println(httpscode.getResponseCode()+"--->"+url+"is--> Valid link");
				
			}
			
		}
		System.out.println("No. of broken links-->"+Bronkenlinks);

	}

}
