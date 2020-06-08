import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.qaclickacademy.com");
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[5]/a")).click();
        WebDriverWait w= new WebDriverWait(driver,20);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocomplete"))).sendKeys("ind");
        
        //FIRST METHOD THROUGH ABSOLUTE PATH
        
    //   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']/li[2]/div"))).click();
       Thread.sleep(500);
       
       //SECOND METHOD BY GETTING LIST OF ITEMS IN DYNAMIC DRODOWN AND TRAVESRSING THROUGH IT
       
      /* List<WebElement> e= driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
        System.out.println(e.size());
        for(int i=0;i<e.size();i++)
        {
        	WebElement r = e.get(i).findElement(By.tagName("div"));
        	System.out.println(r.getText());
        	if(r.getText().equals("India"))
        	{
        		r.click();
        	}
        }*/
       
       //USING KEY PRESS
       
       driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
       driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
       driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
        driver.close();
	}
}
	        
	


