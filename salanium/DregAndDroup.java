package salanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DregAndDroup {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act = new Actions (driver);
		WebElement srcRome = driver.findElement(By.id("box6"));
		WebElement srcMadrid = driver.findElement(By.id("box7"));
		WebElement srcWashington = driver.findElement(By.id("box3"));
		WebElement srcCopenhagen = driver.findElement(By.id("box4"));
		WebElement srcSeoul = driver.findElement(By.id("box5"));
		WebElement srcStockholm = driver.findElement(By.id("box2"));
		WebElement srcOslo = driver.findElement(By.id("box1"));
		
		// To locate target  we
		
		WebElement targetItaly = driver.findElement(By.id("box106"));
		WebElement targetSpain = driver.findElement(By.id("box107"));
		WebElement targetUS = driver.findElement(By.id("box103"));
		WebElement targetDenmark = driver.findElement(By.id("box104"));
		WebElement targetSouthKorea = driver.findElement(By.id("box105"));
		WebElement targetSweden = driver.findElement(By.id("box102"));
		WebElement targetNorway = driver.findElement(By.id("box101"));
	
		
		act.dragAndDrop(srcRome, targetItaly).perform();
		Thread.sleep(2000);
		act.dragAndDrop(srcMadrid, targetSpain).perform();
		Thread.sleep(2000);
		act.dragAndDrop(srcWashington, targetUS).perform();
		Thread.sleep(2000);
		act.dragAndDrop(srcCopenhagen, targetDenmark).perform();
		Thread.sleep(2000);
		act.dragAndDrop(srcSeoul, targetSouthKorea).perform();
		Thread.sleep(2000);
		act.dragAndDrop(srcStockholm, targetSweden).perform();
		Thread.sleep(2000);
		act.dragAndDrop(srcOslo, targetNorway).perform();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
