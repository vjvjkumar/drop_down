package Pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintDropdownbox_Options {
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
		
//to get the multiple options we have to use findElements we can use TagName
		
		List<WebElement> options=driver.findElements(By.tagName("option"));

		System.out.println("Total Options in the dropdown box: "+options.size());
		
		for(int i=0;i<=options.size()-1;i++){
		
			System.out.println(options.get(i).getText());
		}
	}

}
