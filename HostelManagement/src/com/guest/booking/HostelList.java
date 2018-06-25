/**
 * 
 */
package com.guest.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * @author qc
 *
 */
public class HostelList extends HostelView {

	@Test
	public void hostels() throws InterruptedException {
		
		Select country = new Select(driver.findElement(By.xpath("//select[@name='search_country']")));
		country.selectByIndex(1);
		Select city = new Select(driver.findElement(By.xpath("//select[@name='search_city']")));
		city.selectByIndex(1);
		Select guests = new Select(driver
				.findElement(By.xpath("/html/body/app-root/app-guest-index/app-header/app-header-search/div/div/div/div[2]/select")));
		guests.selectByIndex(2);
		WebDriverWait search = new WebDriverWait(driver, 500);
		search.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-guest-index/app-header/app-header-search/div/div/div/button"))).click();
//		WebElement slider = driver.findElement(By.xpath(
//				"/html/body/app-root/app-guest-index/app-view/div/div/div/app-filter/div/div[1]/div/nouislider/div/div/div[1]/div"));
//		Actions move = new Actions(driver);
//		Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
//		action.perform();
	}
}
