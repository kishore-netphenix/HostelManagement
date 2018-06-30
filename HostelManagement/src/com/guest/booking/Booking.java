/**
 * 
 */
package com.guest.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * @author qc
 *
 */
public class Booking extends HostelView {
	
	@Test
	public void bookRoom() {
		WebDriverWait fname = new WebDriverWait(driver, 500);
		fname.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bookingModal\"]/div/div/div[2]/div[1]/div[1]/input"))).sendKeys("Kishore");
		WebDriverWait lname = new WebDriverWait(driver, 500);
		lname.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bookingModal\"]/div/div/div[2]/div[1]/div[2]/input"))).sendKeys("Kumar");
		driver.findElement(By.xpath("//*[@id=\"bookingModal\"]/div/div/div[2]/div[2]/div[1]/input")).sendKeys("nkishore@netphenix.com");
		driver.findElement(By.xpath("//*[@id=\"bookingModal\"]/div/div/div[2]/div[2]/div[2]/input")).sendKeys("9787431055");
		driver.findElement(By.xpath("//*[@id=\"bookingModal\"]/div/div/div[2]/div[3]/div/textarea")).sendKeys("Ooty");
		driver.findElement(By.xpath("//*[@id=\"bookingModal\"]/div/div/div[2]/div[4]/div/div/label/span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Confirm My Booking')]")).click();
	}

}
