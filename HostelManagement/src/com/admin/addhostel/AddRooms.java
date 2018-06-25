/**
 * 
 */
package com.admin.addhostel;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * @author qc
 *
 */
public class AddRooms extends LoginPage {

	@Test
	public void newRooms() {
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-hostel-view/app-hostel/div/table/tbody/tr[1]/td[7]/div/button[3]")).click();
		Select floor = new Select(driver.findElement(By.xpath("//*[@id=\"rooms\"]/div/section/div/div[2]/select")));
		floor.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"rooms\"]/div/section/div/div[3]/input")).sendKeys("2");
		driver.findElement(By.xpath("//button[contains(text(),'Create Rooms')]")).click();
		
		//first room
		Select roomtype1 = new Select(driver.findElement(By.xpath("//*[@id=\"rooms\"]/div/section/div/table/tbody[1]/tr[1]/td[2]/select")));
		roomtype1.selectByIndex(0);
		driver.findElement(By.xpath("//*[@id=\"rooms\"]/div/section/div/table/tbody[1]/tr[1]/td[3]/input")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id=\"rooms\"]/div/section/div/table/tbody[1]/tr[1]/td[4]/input")).sendKeys("2");
		
		//second room
		Select roomtype2 = new Select(driver.findElement(By.xpath("//*[@id=\"rooms\"]/div/section/div/table/tbody[2]/tr[1]/td[2]/select")));
		roomtype2.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"rooms\"]/div/section/div/table/tbody[2]/tr[1]/td[3]/input")).sendKeys("2");
		driver.findElement(By.xpath("//button[contains(text(),'Apply&Continue')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		
	}
}
