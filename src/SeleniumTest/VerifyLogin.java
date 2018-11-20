
package SeleniumTest;
import org.testng.annotations.Test;

import References.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
@Test
public static void login() throws InterruptedException
//public void loginAndTracView() throws InterruptedException
 { 
 // System.out.println(" TTestcase Executing...");
//  System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
//  WebDriver driver = new ChromeDriver();   
// driver.navigate().to("http://192.168.1.211/Husqvarna/");
// driver.manage().window().maximize();
	
Utility.initialize();
Thread.sleep(1000);
 Utility.driver.findElement(By.id("inputEmail")).clear();
 Utility.driver.findElement(By.id("inputEmail")).sendKeys("husq");
Thread.sleep(1000);
Utility.driver.findElement(By.id("inputPassword")).clear();
Utility.driver.findElement(By.id("inputPassword")).sendKeys("husq");
Thread.sleep(1000);
Utility.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/button")).click();


 //driver.close();
 }

}

