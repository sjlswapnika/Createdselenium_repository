package test_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Justrechrgelinkpartial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Open browser
		WebDriver driver = new ChromeDriver();
		// Type URL
		driver. get("https://www.justrechargeit.com/");
		driver.manage().window().maximize();
		//Click on Signin Link
		driver.findElement(By.linkText("Sign in")). click();
		//Click on Forgot your password link.
		driver.findElement(By.partialLinkText("Forgot your password?")). click();
		
		
	}

}
