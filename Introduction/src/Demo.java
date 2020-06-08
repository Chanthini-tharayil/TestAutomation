import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://facebook.com");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hello");
        driver.findElement(By.cssSelector("input[name='pass'")).sendKeys("password");
        driver.findElement(By.xpath("//input[contains(@value,'Log')]")).click();
	}

}
