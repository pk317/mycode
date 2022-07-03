package other;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Desktop\\chrome96\\chromedriver_win32_96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	WebElement ele=	driver.findElement(By.name("q"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys("mobile").perform();
		
		//ele.sendKeys("mobile");
		Thread.sleep(3000);
	
		
		//control +a
		
	/*	act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		//control +c
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		
		//control +v
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();*/
		
						//ele.sendKeys(Keys.ENTER);
//act.sendKeys(Keys.ENTER).perform();
			

	}

}
