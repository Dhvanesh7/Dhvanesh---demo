package salanium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
 
public class Screenshort {

	public static void main(String[] args) throws IOException, InterruptedException {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.youtube.com/");
		driver.get("https://www.youtube.com/watch?v=cQJzmqVlaY4");
		 
		Thread.sleep(5000);
		
		// tack screen short
		
		// step no 1 -> Type casting 
		TakesScreenshot tks= (TakesScreenshot)driver;
		
		// step no 2 -> Take the screen shot
		File temp = tks.getScreenshotAs(OutputType.FILE);
		
		// step no 3 -> Create a permanant Loc
		File perm =  new File("./errorShort/YoutubeSS1.png");
		
		// step no 3 -> Copy the SS from temp loc to permanent loc
		FileHandler.copy(temp, perm);
		
		driver.quit();
		
		
		
	}

}
