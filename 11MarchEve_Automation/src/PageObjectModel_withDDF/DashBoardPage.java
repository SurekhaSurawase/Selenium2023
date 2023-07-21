package PageObjectModel_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;
	//Dashboard page is default page once user logged in
	//Paul Collings
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
	WebElement name ;
	
	@FindBy(xpath = "//p[@class=\"oxd-text oxd-text--p\"]")
	WebElement time;
	
	public void NameValidation() {
		String username =name.getText();
		if(username.equals("Paul Collings"))
			System.out.println("Correct login");
		else
			System.out.println("Incorrect login");
	}
	
	public void TimeAtWork() {
		boolean time1 = time.isDisplayed();
		System.out.println(time1);
	}
	
}
