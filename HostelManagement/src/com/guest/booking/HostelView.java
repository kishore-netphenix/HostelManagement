/**
 * 
 */
package com.guest.booking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

/**
 * @author qc
 *
 */
public class HostelView {
	public static WebDriver driver;

	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.gecko.driver", "/home/qc/Documents/Selenium/geckodriver-v0.20.1-linux64/geckodriver");
		driver = new FirefoxDriver();
		driver.navigate().to("http://localhost:4200");
		String title = driver.getTitle();
		System.out.println("Page title is -->"+ title);
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is -->"+ url);
		String pageid = driver.getWindowHandle();
		System.out.println("Page id is -->"+ pageid);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
