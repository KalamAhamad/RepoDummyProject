package SeleniumTest;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import References.Utility;

public class TracAddFunctionality {

	public static void main(String[] args) throws InterruptedException {

		TracView.OpenTracView();
		// Static Means particular that class is ready to give access from his
		// side
		// we can call class by direct as above "TracView.OpenTracView();" but
		// we have to add "static" in TraView class or we can call by object as
		// below, there no required to add static

		// TracView obj = new TracView();
		// obj.OpenTracView();
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("//button[text()='View']")).click(); // Click
																					// view
																					// without
																					// selecting
																					// a
																					// item
																					// from
																					// grid
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("//button[text()='OK']")).click(); // Click
																				// OK
																				// from
																				// the
																				// popup
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("//div[text()='TEST123']")).click(); // Select
																					// the
																					// Item
																					// from
																					// Grid
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("//button[text()='Add']")).click(); // Click
																				// Add
																				// button
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("//button[text()='Yes']")).click(); // Click
																				// YEs
																				// button
																				// from
																				// Non-Sear
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("//select[@data-ng-model='cutomerAndProduct.Product']")).click(); // Click
																												// on
																												// the
																												// combo
																												// box
																												// field
																												// //Select
																												// the
																												// value
																												// from
																												// the
																												// first
																												// combo
																												// box
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("//select[@data-ng-model='cutomerAndProduct.Product']")).click();

		Select ChooseProductCategory = new Select(
				Utility.driver.findElement(By.xpath("//select[@data-ng-model='cutomerAndProduct.Product']"))); // Select
																												// the
																												// value
																												// from
																												// the
																												// first
																												// combo
																												// box
		ChooseProductCategory.selectByIndex(2);
		Thread.sleep(1000);
		Select ChooseCustomerName = new Select(
				Utility.driver.findElement(By.xpath("//select[@data-ng-model='cutomerAndProduct.Customer']")));
		ChooseCustomerName.selectByIndex(1);
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("//button[text()='Get Number Now']")).click();
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("//button[text()='OK']")).click();

		
		int a;
		Random Model = new Random();
		a = Model.nextInt(20 + 1) + 20;
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("//input[@data-ng-model='upcObj.Modelno']")).clear();
		Utility.driver.findElement(By.xpath("//input[@data-ng-model='upcObj.Modelno']")).sendKeys("Model" + a);
		Thread.sleep(1000);
		int x;
		Random obj_UPC_Code_OA5388 = new Random();
		x = obj_UPC_Code_OA5388.nextInt(20 + 1) + 20;
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("//input[@data-ng-model='upcObj.NewUpc']")).sendKeys("UPC" + x);
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("//button[text()='Ok']")).click();
		Thread.sleep(1000);
		Utility.driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		// Utility.driver.close();

	}

}
