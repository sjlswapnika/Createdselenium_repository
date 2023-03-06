package test_scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Validationmethods {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// Type URL
		driver. get("file:///C:/Users/cdisr/Downloads/QE%20-%20index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("test5-button")).click();	
		driver. manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.findElement(By.id("test5-alert")).getText());
	
		//Assert that the button is now disabled
		Assert.assertEquals(driver.findElement(By.id("test5-button")).isEnabled(), false);
		
	}

}
