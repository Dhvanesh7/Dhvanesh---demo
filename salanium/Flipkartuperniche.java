package salanium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartuperniche {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/big-diwali-sale1-store?param=912&s_kwcid=AL!739!3!676201929245!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=Cj0KCQjwveK4BhD4ARIsAKy6pMJ2iYoq-ZBqSyFQrsBg-whKv7k5tAL4EQ_aSYSmL12pdew4cTHXEU4aAoo2EALw_wcB");
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.scrollByAmount(0, 1500).perform();
		Thread.sleep(5000);
		act.scrollByAmount(0, 1500).perform();
		Thread.sleep(5000);
		act.scrollByAmount(0, -1500).perform();
		Thread.sleep(5000);
		act.scrollByAmount(0, -1500).perform();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
