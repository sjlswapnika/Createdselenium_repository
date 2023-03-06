package test_scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TTDwaitclick {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
		
		//to maximize the screen when the command is executed.
		driver.manage().window().maximize();
		
		//implicit wait: wait for page load. 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("entity")).click();
		driver.findElement(By.name("name")).sendKeys("Test");
		
		}

}
