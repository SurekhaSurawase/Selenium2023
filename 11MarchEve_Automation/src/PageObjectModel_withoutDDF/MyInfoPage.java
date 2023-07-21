package PageObjectModel_withoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage {

	WebDriver driver;
	//first create constructor of class with 1 i/p parameter
	public MyInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name=\"firstName\"]")
	WebElement Fname;
	
	@FindBy(xpath = "//input[@name=\"middleName\"]")
	WebElement Mname;
	
	@FindBy(xpath = "//input[@class=\"oxd-input oxd-input--active orangehrm-lastname\"]")
	WebElement Lname;
	
	public void FirstName(String name) {
		Fname.clear();
		Fname.sendKeys(name);
	}
	
	public void MiddleName(String Middlename) {
		Mname.clear();
		Mname.sendKeys(Middlename);
	}
	
	public void LastName(String name) {
		Lname.clear();
		Lname.sendKeys(name);
	}
	
	
}
