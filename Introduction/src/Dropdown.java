import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://spicejet.com");
		//driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		 Thread.sleep(10);
        Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        Thread.sleep(10);
        s.selectByVisibleText("INR");;
	}

}
