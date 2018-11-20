package SeleniumTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import References.Utility;

public class TracView {
	
	@Test
	public static void OpenTracView() throws InterruptedException
	{
		VerifyLogin.login();
		Thread.sleep(1000);
		Utility.driver.findElement(By.linkText("Tractor")).click();		
		Thread.sleep(1000);
		Utility.driver.findElement(By.linkText("View")).click();
		//Utility.driver.findElement(By.linkText("toggleDropdown()")).click();
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/form/div/div[1]/div/button")).click(); // Select on the year field
		Thread.sleep(1000);
		Utility.driver.findElement(By.id("selectAll")).click();
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/form/div/div[2]/button[2]")).click();
        Thread.sleep(1000);
        Utility.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div/div[4]/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div")).click();
        Thread.sleep(1000);
        Utility.driver.findElement(By.xpath("//button[text()='View']")).click(); // TagName is - //button and Attribute Name is - [text()= and Value of that is - 'View']"
        Thread.sleep(2000);
        Utility.driver.findElement(By.xpath("//span[text()='2']")).click();
        Thread.sleep(2000);
        Utility.driver.findElement(By.xpath("//span[text()='3']")).click();
        Thread.sleep(2000);
        Utility.driver.findElement(By.xpath("//span[text()='4']")).click();
        Thread.sleep(2000);
        Utility.driver.findElement(By.xpath("//span[text()='5']")).click();
        Thread.sleep(2000);
        Utility.driver.findElement(By.xpath("//button[text()='Close']")).click();
      
//        Thread.sleep(2000); 
//        Utility.driver.close(); 
	}
}
