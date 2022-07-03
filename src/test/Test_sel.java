package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test_sel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Desktop\\chrome93\\chromedriver_win32_93\\chromedriver.exe");
				/*
				 * ChromeOptions ch= new ChromeOptions();
				 * ch.addArguments("--disbale-popup-blocking");
				 * 
				 * 
				 * 
				 */
				
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://courses.letskodeit.com/practice");
				
	}

}
