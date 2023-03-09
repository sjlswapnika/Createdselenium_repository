package test_scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collegeweeklive_threadsleep {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup");
		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("firstName")).sendKeys("Swapnika");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastName")).sendKeys("Lastname");
		Thread.sleep(2000);
		
		driver.findElement(By.name("emailAddress")).sendKeys("sjl.swapnika@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("phoneNumber")).sendKeys("1234567890");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Welcome");
		Thread.sleep(2000);
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Welcome");
		Thread.sleep(2000);
						
		driver.findElement(By.id("questions[q_135]")).click();
		
		driver.findElement(By.id("questions[q_136]")).click();
		
		driver.findElement(By.id("questions[q_137]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("submit")).click();
	}

}
