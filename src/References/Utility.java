package References;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	public static WebDriver driver;
	
public static void initialize(){
	// System.out.println(" TTestcase Executing...");
	  System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
	   driver = new ChromeDriver();   
	 driver.navigate().to("http://192.168.1.211/Husqvarna/");
	 driver.manage().window().maximize();
}
}
