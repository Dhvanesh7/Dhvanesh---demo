package salanium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnAnvocationHelpAttribut {
	@Test(invocationCount = 10, threadPoolSize = 5)
	public void login()throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		Reporter.log("Login Successfull ", true);
		Thread.sleep(3000);
		driver.quit();
	}
	
}
