/**
 * 
 */
package com.admin.addhostel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author qc
 *
 */
public class LoginPage {

	public static WebDriver driver;
	
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.gecko.driver", "/home/qc/Documents/Selenium/geckodriver-v0.20.1-linux64/geckodriver");
		driver = new FirefoxDriver();
		driver.navigate().to("http://localhost:4000");
		String title = driver.getTitle();
		System.out.println("Page title is -->"+ title);
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is -->"+ url);
		String pageid = driver.getWindowHandle();
		System.out.println("Page id is -->"+ pageid);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void signIn() {
		driver.findElement(By.xpath("//a[@data-hover='SIGNIN/SIGNUP']")).click();
		driver.findElement(By.name("user_name")).sendKeys("sam");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
		System.out.println("Login Successful");
	}
}
