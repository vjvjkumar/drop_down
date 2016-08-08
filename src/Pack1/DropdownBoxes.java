package Pack1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownBoxes {
	@Test
	public void login() throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(3000); //java feature
		
		driver.get("http://ebay.com");
		
		driver.findElement(By.id("gh-cat")).sendKeys("Baby");
		driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
		
	}

}
