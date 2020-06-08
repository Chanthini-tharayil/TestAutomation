import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.findElement(By.id("checkBoxOption1")).click();
		 Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		 driver.findElement(By.id("checkBoxOption1")).click();
		 Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		 Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),3);
		 
	}

}
