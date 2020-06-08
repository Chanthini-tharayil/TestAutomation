package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageobjectlogin {
		
		WebDriver driver;	
		
		public pageobjectlogin(WebDriver driver2) {
			this.driver=driver2;
		}	

		By id=By.id("login1");
		By pwd=By.id("password");
		
		public WebElement emailid()
		{
			return driver.findElement(id);
		}
		public WebElement pwd()
		{
			return driver.findElement(pwd);
		}
		
	

}
