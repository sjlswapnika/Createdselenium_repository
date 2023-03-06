package test_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment0214_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://collegeweeklive.com/go-signup");
				
		driver.findElement(By.id("firstName")).sendKeys("Swapnika");
		
		driver.findElement(By.name("lastName")).sendKeys("Lastname");
		
		driver.findElement(By.name("emailAddress")).sendKeys("sjl.swapnika@gmail.com");
		
		driver.findElement(By.id("phoneNumber")).sendKeys("1234567890");
		
		driver.findElement(By.name("password")).sendKeys("Welcome");
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Welcome");
						
		driver.findElement(By.id("questions[q_135]")).click();
		
		driver.findElement(By.id("questions[q_136]")).click();
		
		driver.findElement(By.id("questions[q_137]")).click();
		
		driver.findElement(By.id("submit")).click();
	}

}
