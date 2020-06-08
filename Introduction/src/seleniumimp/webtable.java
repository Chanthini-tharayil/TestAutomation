package seleniumimp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.qaclickacademy.com");
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[5]/a")).click();
		//WebElement e1= driver.findElement(By.xpath("//table[@id='product']"));
		List<WebElement> e=driver.findElements(By.xpath("//table[@id='product']/tbody/tr/td[3]"));
				//System.out.println(e.size());
		List<WebElement> e1=driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th"));
				
		for(int i=0;i<e.size();i++)
		{			
		System.out.println(e.get(i).getText());		
			
		}
		for(int i=0;i<e1.size();i++)
		{			
		System.out.println(e1.get(i).getText());		
			
		}
	}

} 
