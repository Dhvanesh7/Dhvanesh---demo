package salanium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapp.skillrary.com/product.php");
		WebElement addBtun = driver.findElement(By.id("add"));
		Actions act = new Actions(driver);
		act.doubleClick(addBtun).perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
