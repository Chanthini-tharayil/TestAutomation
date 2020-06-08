package pagetest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobject.pageobjectlogin;

public class pageobjecttest {
	public static void main(String[] args)
	{
		pagetest();
	
}
	public static void pagetest()

	{
		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
		pageobjectlogin ob=new pageobjectlogin(driver);
		ob.emailid().sendKeys("hello");
		ob.pwd().sendKeys("pwd");
	}
}
