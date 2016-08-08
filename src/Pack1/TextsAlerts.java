package Pack1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextsAlerts{
	
	@Test
	public void login() throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(3000); //java feature
		
		driver.get("http://rediff.com");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		Thread.sleep(3000);
		
		//create object for Alert
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();  //It'll click on OK button
		//alt.dismiss(); //It'll click on Cancel button
	}
}
