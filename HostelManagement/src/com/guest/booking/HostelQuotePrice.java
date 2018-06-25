/**
 * 
 */
package com.guest.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * @author qc
 *
 */
public class HostelQuotePrice extends HostelView {

	@Test
	public void priceList() {
		WebDriverWait view = new WebDriverWait(driver, 500);
		view.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-guest-index/app-view/div/div/div/app-list/div/div[1]/app-list-reviews/div/a"))).click();
		Select guest = new Select(driver.findElement(By.xpath("/html/body/app-root/app-guest-index/app-detailview/div/div/div[2]/div/table/tbody/tr/td[2]/div/select")));
		guest.selectByIndex(1);
//		driver.findElement(By.xpath("/html/body/app-root/app-guest-index/app-detailview/div/div/div[2]/div/table/tbody/tr/td[3]/input")).sendKeys("5");
		driver.findElement(By.xpath("//button[contains(text(), 'Quote Price')]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-guest-index/app-detailview/div/div/div[2]/div/div[2]/div[2]/ul[2]/li[3]/div/label/span[1]")).click();
		Select floor = new Select(driver.findElement(By.xpath("/html/body/app-root/app-guest-index/app-detailview/div/div/div[2]/div/div[1]/select")));
		floor.selectByIndex(2);
		driver.findElement(By.xpath("//a[contains(text(),'201')]")).click();
		Select guest1 = new Select(driver.findElement(By.xpath("/html/body/app-root/app-guest-index/app-detailview/div/div/div[2]/div/table/tbody/tr/td[2]/div/select")));
		guest1.selectByIndex(2);
		driver.findElement(By.xpath("//button[contains(text(), 'Quote Price')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Book Now')]")).click();
	}
}
