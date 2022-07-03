package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Desktop\\chrome93\\chromedriver_win32_93\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("phone");
		searchBox.sendKeys(Keys.ENTER);

	}

}
