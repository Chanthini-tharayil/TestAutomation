package seleniumimp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//April 23
		driver.findElement(By.id("travel_date")).click();
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[2]")).getText().contains("May"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[3]")).click();
		}
		List<WebElement> e=driver.findElements(By.cssSelector("[class='datepicker-days'] td[class='day']"));
		//System.out.println(e.size());
		for(int i=0;i<e.size();i++)
		{
			//System.out.println(e.get(i).getText());
			if(e.get(i).getText().equals("20"))
			{
				e.get(i).click();
				break;
			//	driver.findElements(By.className("day")).get(i).click();
			}
		}
		
		
	}

}
