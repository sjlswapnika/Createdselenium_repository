package test_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thirdassignalertpract {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://stqatools.com/demo/Alerts.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Click on the Basic Alert
		driver.findElement(By.id("btnAlert")).click();
		Thread.sleep(3000);
		//Get the alert text
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000);
		//To click on OK button on Alert
		driver.switchTo().alert().accept();
		// Click on Confirm Alert
		//driver.findElement(By.id("btnConfirm")).click();
		//Thread.sleep(3000);
		//Get the alert text
		//System.out.println(driver.switchTo().alert().getText());
		//Thread.sleep(5000);
		//To click on OK button on Alert
		//driver.switchTo().alert().accept();
				
	}

}
