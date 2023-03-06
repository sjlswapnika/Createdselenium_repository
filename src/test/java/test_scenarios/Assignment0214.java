package test_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment0214 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
				
		driver.findElement(By.name("txtUserName")).sendKeys("sjl.swapnika@gmail.com");
		
		driver.findElement(By.name("txtPasswd")).sendKeys("123456");
		
		driver.findElement(By.name("txtPasswd")).sendKeys("123456");
		
		driver.findElement(By.id("txtCaptcha")).sendKeys("48");
		
		driver.findElement(By.name("imgbtnSignin")).click();

	}

}
