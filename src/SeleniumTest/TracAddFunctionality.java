package SeleniumTest;

import org.openqa.selenium.By;

import References.Utility;

public class TracAddFunctionality {

 public static void main(String[] args) throws InterruptedException{
	
	TracView.OpenTracView();
	// Static Means particular that class is ready to give access from his side
	//we can call class by direct as above "TracView.OpenTracView();" but we have to add "static" in TraView class or we can call by object as below, there no required to add static 

	//TracView obj = new TracView();
   //	obj.OpenTracView();
	Thread.sleep(2000);
	 Utility.driver.findElement(By.xpath("//button[text()='View']")).click(); // Click view without selecting a item from grid
	 Thread.sleep(1000);
	 Utility.driver.findElement(By.xpath("//button[Text()='OK']")).click(); // Click OK from the popup
	 
	
	
}
	

}
