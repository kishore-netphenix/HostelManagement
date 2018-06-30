/**
 * 
 */
package com.test.signuppage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author qc
 *
 */
public class SignUp {

public static WebDriver driver;
	
	@BeforeTest
	public void browser() {
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
	public void newUser() {
		driver.findElement(By.xpath("//a[@data-hover='SIGNIN/SIGNUP']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Sign Up Here')]")).click();
		driver.findElement(By.name("first_name")).sendKeys("Kishore");
		driver.findElement(By.name("last_name")).sendKeys("Kumar");
		driver.findElement(By.name("name")).sendKeys("shamkishore");
		driver.findElement(By.name("email")).sendKeys("kishore89.ooty@gmail.com");
		WebDriverWait pswd = new WebDriverWait(driver, 500);
		pswd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login\"]/div/div/div/app-login/form[2]/app-register/div/div[2]/div/div[5]/input"))).sendKeys("1234");
		driver.findElement(By.name("confirmpassword")).sendKeys("1234");
		driver.findElement(By.name("primaryphone")).sendKeys("9787431055");
		driver.findElement(By.name("secondaryphone")).sendKeys("00000000000");
		driver.findElement(By.xpath("//input[@value='male']")).click();
		Select usertype = new Select(driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div/app-login/form[2]/app-register/div/div[2]/div/div[10]/select")));
		usertype.selectByIndex(0);
		WebDriverWait acpt = new WebDriverWait(driver, 500);
		acpt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login\"]/div/div/div/app-login/form[2]/app-register/div/div[2]/div/div[11]/input"))).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Submit')]"));
	}
}





