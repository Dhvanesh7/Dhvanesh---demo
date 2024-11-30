package salanium;

import java.time.Duration;     // rignt click karva mate

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		Actions act = new Actions (driver);
		 act.contextClick().perform();
		 
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		act.contextClick(gmailLink).perform();
		
		
	}

}
