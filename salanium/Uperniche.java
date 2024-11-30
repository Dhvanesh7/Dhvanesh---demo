package salanium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uperniche {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(5000);
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(5000);
		act.scrollByAmount(0, -500).perform();
		Thread.sleep(5000);
		act.scrollByAmount(0, -500).perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
