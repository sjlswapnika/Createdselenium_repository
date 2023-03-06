package test_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practisse {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/Alerts.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("btnAlert")).click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();


	}

}





