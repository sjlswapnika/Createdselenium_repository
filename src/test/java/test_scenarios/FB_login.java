package test_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		// Type URL
		driver. get("https://www.facebook.com/");
		// type username and password
		driver.findElement(By.name("email")).sendKeys("swapnika@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("test@1234");
		
		//Click on Login button 
		driver.findElement(By.name("login")).click();
		

	}

}
