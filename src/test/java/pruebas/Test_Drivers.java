package pruebas;

import static org.junit.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Drivers {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "..\\AltenTest\\Drivers\\chromedriver.exe");
		
		driver= new ChromeDriver();
	}
	
	@Test
	public void driverChrome() throws InterruptedException, IOException {
		driver.get("https://www.alten.es/");
		WebElement contentElement = driver.findElement(By.className("content"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		takeScreenshotOfElement(contentElement);
		driver.findElement(By.className("search-btn")).click();
		
		WebElement searchElement = driver.findElement(By.className("search-field"));
		
		searchElement.sendKeys("adidas");
		Thread.sleep(3000);
		takeScreenshotOfElement(contentElement);
		searchElement.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement searchPage = driver.findElement(By.className("search-page"));
		takeScreenshotOfElement(searchPage);
		
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
		@AfterClass
		public static void fin() {
			driver.quit();
		}
		
		
		public static void takeScreenshotOfElement(WebElement element) throws IOException {
			//capture the screenshot of full page 
			TakesScreenshot ts = (TakesScreenshot)driver;
			File file = ts.getScreenshotAs(OutputType.FILE);

	                              // read the screenshot image
			BufferedImage fullScreen = ImageIO.read(file);

	                   //get the width and height of the element
	                   int width = element.getSize().getWidth();
		    int height = element.getSize().getHeight();

	                   //get the X and Y coordinates of the webElement      
		    Point location = element.getLocation();           
		    
	//get the image using height,width and coordinates
		    BufferedImage logoImage = fullScreen.getSubimage(location.getX(), location.getY(),width, height);
		    ImageIO.write(logoImage, "png", file);  

	//save the captured screenshot
		    Random random = new Random();
		    FileUtils.copyFile(file,new File("./ScreenShot_Folder/screenshot_Test"+random.nextInt()+".png"));
			
			
		}

	}
		
	

