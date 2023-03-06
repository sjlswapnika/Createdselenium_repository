package test_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class justrechargeitnavigationassignment {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver. get("https://www.justrechargeit.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")). click();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
	}

}
