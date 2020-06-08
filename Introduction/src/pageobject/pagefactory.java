package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagefactory {

	WebDriver driver;	
	
	public pagefactory(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}	

	/*By id=By.id("login1");
	By pwd=By.id("password");*/
	
	@FindBy(id="login1")
	WebElement id;
	@FindBy(id="password")
	WebElement pwd;
	
	public WebElement emailid()
	{
		return id;
	}
	public WebElement pwd()
	{
		return pwd;
	}
	
}
