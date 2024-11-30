package salanium;

import java.awt.Dimension;

import org.openqa.selenium.Point;
//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
//		driver.get("https://www.shoppersstack.com/products_page/18");
		Thread.sleep(3000);
//		driver.manage().window().maximize();  17 to 22 line run karvi
//		Thread.sleep(3000);
//		driver.manage().window().minimize();
//		Thread.sleep(3000);
//		driver.manage().window().fullscreen();
//		Thread.sleep(3000);
		org.openqa.selenium.Dimension sizeofBrowser = driver.manage().window().getSize(); // 23 to 33 line run karvi
		System.out.println(sizeofBrowser);    // getSize mathod
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		org.openqa.selenium.Dimension newSize = driver.manage().window().getSize();
		System.out.println("size of the browser after max: "+ newSize);
		System.out.println("width of web page : "+ newSize.getWidth());
		System.out.println("width of web page : "+ newSize.getHeight());
		Thread.sleep(3000);
		Point positionofBrowser = driver.manage().window().getPosition();
		System.out.println("position of browser is " + positionofBrowser);
		System.out.println(" X  coordinator  is " + positionofBrowser.getX());
		System.out.println(" Y  coordinator  is " + positionofBrowser.getY());
		Point position = new Point (300 , 500);
		driver.manage().window().setPosition(position);
		Thread.sleep(5000);
		driver.quit();
//		String title = driver.getTitle();
//		System.out.println("Titel page web is :"+ title );
//		String url = driver.getCurrentUrl();
//		System.out.println("url of page is : "+ url );
//		String pageScource = driver.getPageSource();
//		System.out.println("Page source of web page is: "+pageScource);
//		driver.findElement(By.id("compare")).click();
		
//		driver.quit();
//		Thread.sleep(10000);
//		driver.close();
		
	}

}
