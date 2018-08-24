package PageLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	@Test
	public void loginTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("suvenduuuuuu.rocking@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sasmita123", Keys.ENTER);
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		/*driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='u_1g_5']")).click();
		Thread.sleep(3000);*/
		driver.close();
	}

}
