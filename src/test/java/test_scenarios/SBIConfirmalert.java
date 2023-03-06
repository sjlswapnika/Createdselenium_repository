package test_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBIConfirmalert {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		//Get the alert text
		System.out.println(driver.switchTo().alert().getText());
		// To click on in Cancel button on Confirmation Alert. 
		driver.switchTo().alert().dismiss();
		
	}

}
