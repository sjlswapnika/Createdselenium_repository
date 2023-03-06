package test_scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuitmethod {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		// Type URL
		driver. get("https://demoqa.com/browser-windows");
		//maximize the window.
		driver.manage().window().maximize();
		// this is to wait for the page load to click on the new window button. 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click method is used to click on the new window button. 
		driver.findElement(By.id("windowButton")).click();
		// Use Thread sleep to wait for the page load to close the page the cursor is on. 
		Thread.sleep(4000); 
		// Close method
		// driver.close();
		
		// for quit: which closes both the parent and child windows. 
		driver.quit();
		
		
		
		
	}

}

//code worked successfully for both Quit and  Close. 