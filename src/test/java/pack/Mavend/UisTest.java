package pack.Mavend;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class UisTest {

	@Test
	public void udse() throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr Pramod Pandey\\Desktop\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		driver.get("https://ashishkumarportfolio.netlify.app/");
		
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("C:\\Users\\Dr Pramod Pandey\\sc"));
		
		//FileUtils.copyFile(src,new File("C:\\Users\\Dr Pramod Pandey\\Desktop\\SS"));
		
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//Actions a = new Actions(driver);
		
		//WebElement source = driver.findElement(By.id("draggable"));
		
		//WebElement target = driver.findElement(By.id("droppable"));
		
		//a.dragAndDrop(source, target).build().perform();
		
		

	}
}
