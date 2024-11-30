package salanium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LogoScreenshort {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.youtube.com/");
//		driver.get("https://www.youtube.com/watch?v=cQJzmqVlaY4");
		driver.get("https://www.udemy.com/");
		 
		Thread.sleep(5000);
		
		// tack screen short
		
		// step no 1 -> Loc we 
		WebElement udemyLogo = driver.findElement(By.xpath("//img[@alt='udemy' and @loading='lazy']"));
		
		// step no 2 -> Take the screen shot
		File temp = udemyLogo.getScreenshotAs(OutputType.FILE);
		
		// step no 3 -> Create a permanant Loc
		File perm =  new File("./errorShort/udemyLogo.png");
		
				
		// step no 5 -> Copy the SS from temp loc to permanent loc
		FileHandler.copy(temp, perm);
		
//		driver.quit();

	}

}
