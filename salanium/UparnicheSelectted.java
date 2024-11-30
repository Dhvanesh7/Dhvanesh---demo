package salanium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UparnicheSelectted {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement myAccount = driver.findElement(By.xpath("//h3[text()='My account']"));
		Thread.sleep(3000);
		act.scrollToElement(myAccount).perform();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
