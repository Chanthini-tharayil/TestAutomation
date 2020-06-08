import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://qaclickacademy.com");
driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[5]")).click();;
Thread.sleep(2000);
driver.findElement(By.id("autocomplete")).click();
driver.findElement(By.id("autocomplete")).sendKeys("ind");
Thread.sleep(2000);
driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);

	}

}
