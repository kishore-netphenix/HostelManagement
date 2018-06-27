/**
 * 
 */
package com.admin.addhostel;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * @author qc
 *
 */
public class CreateHostel extends LoginPage {

	@Test
	public void newHostel() throws InterruptedException {
//		driver.findElement(By.xpath("//a[@data-hover='ADMIN']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'Add')]"))).click();
//		driver.findElement(By.xpath("//button[contains(text(), 'Add')]")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Yoga Hostel");
		driver.findElement(By.name("email")).sendKeys("newhostel@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-hostel-view/app-hostel/div[2]/div[2]/div[3]/input")).sendKeys("9686567876");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByIndex(0);
		Select state = new Select(driver.findElement(By.name("state")));
		state.selectByIndex(0);
		Select city = new Select(driver.findElement(By.name("city")));
		city.selectByIndex(0);				
		driver.findElement(By.name("url")).sendKeys("https://www.ganapathyhostel.com/");
		driver.findElement(By.name("floors")).sendKeys("1");
		driver.findElement(By.name("default_currency")).sendKeys("Rupees");
		driver.findElement(By.name("property_description")).sendKeys("With youth hostels and cheap hotels in over 3,500 destinations worldwide \n" + 
				"our aim is to be the number one website for backpackers and student travel, and every traveler looking for great budget accommodation.");
		driver.findElement(By.name("things_to_note")).sendKeys("1. Check in Time is after 12:00 NOON and Keep us informed if arriving after midnight.\n" + 
				"2. Production of original passport is must for all Nationals and valid Visa for foreigners.");
		driver.findElement(By.name("policy")).sendKeys("1. Age Restriction 2. Credit Cards Accepted 3. Non Smoking 4. Taxes Not Included");
		driver.findElement(By.name("cancellation_policy")).sendKeys("Cancellation charges applicable");
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-hostel-view/app-hostel/div[2]/div[3]/div[1]/ng-multiselect-dropdown/div/div[1]/span")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Select All')]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-hostel-view/app-hostel/div[2]/div[3]/div[2]/table/tbody/tr[1]/td[2]/input")).sendKeys("4500");
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-hostel-view/app-hostel/div[2]/div[3]/div[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("10000");
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-hostel-view/app-hostel/div[2]/div[3]/div[2]/table/tbody/tr[3]/td[5]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-hostel-view/app-hostel/div[2]/div[3]/div[2]/table/tbody/tr[4]/td[5]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-hostel-view/app-hostel/div[2]/div[3]/div[2]/table/tbody/tr[5]/td[5]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-hostel-view/app-hostel/div[2]/div[3]/div[2]/table/tbody/tr[6]/td[5]/input")).click();
		driver.findElement(By.xpath("//button[@title='Pick File']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@title='Upload']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Submit')]")).click();
	}
}






