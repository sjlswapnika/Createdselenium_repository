package test_scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitexplicitwait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("c;/users/nalla/onedrive/desktop/selenium/exam_14oct2022/QE%20-%20index.html");
		
		//to maximize the screen when the command is executed.
		driver.manage().window().maximize();
		
		//implicit wait: wait for page load. 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Explicitly wait: wait with condition. eg: wait for the button to be clickable.  
		
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		ww.until(ExpectedConditions.elementToBeClickable(By.id("test5-button")));
		//ww= is referenced for webdriverwait. 
		
		
		
		
		
	}

}
