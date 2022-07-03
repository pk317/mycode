package other;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class copy_paste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	

	
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Desktop\\chrome93\\chromedriver_win32_93\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://courses.letskodeit.com/practice");
				driver.manage().window().maximize();
			WebElement source = driver.findElement(By.id("name"));
			WebElement target = driver.findElement(By.id("displayed-text"));
			source.sendKeys("abc");
			Actions act= new Actions(driver);
			act.keyDown(Keys.CONTROL);
			act.sendKeys("a");
			act.keyUp(Keys.CONTROL);
			act.perform();
			act.keyDown(Keys.CONTROL);
			act.sendKeys("c");
			act.keyUp(Keys.CONTROL);
			act.perform();
			Thread.sleep(3000);
			act.moveToElement(target).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();	
			
			
			
			
		 
			
					

			


	}

}
