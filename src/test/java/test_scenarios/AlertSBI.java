package test_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSBI {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Button2")).click();
		//	Get the alert text
		System.out.println(driver.switchTo().alert().getText());
		//To click on OK button on Alert
		driver.switchTo().alert().accept();
		
		
		
	}

}
