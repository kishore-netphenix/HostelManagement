/**
 * 
 */
package com.main.classes;

import org.testng.annotations.Test;

import com.admin.addhostel.AddRooms;
import com.admin.addhostel.CreateHostel;
import com.admin.addhostel.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author qc
 *
 */
public class AddHostel {
	
	@Test
	public void mainTest() throws InterruptedException {
		ExtentReports logger = ExtentReports.get(BookingRoom.class);
		logger.init("//home//qc//eclipse-workspace//HostelManagement//advanceReport.html", true);
		logger.startTest("Stay Peace");
		LoginPage browser = new LoginPage();
		browser.launch();
		browser.signIn();
		logger.log(LogStatus.INFO, "Browser Launched Successfully");
		CreateHostel hstl = new CreateHostel();
		hstl.newHostel();
		logger.log(LogStatus.INFO, "Hostel added successfully");
		AddRooms add = new AddRooms();
		add.newRooms();	
		logger.log(LogStatus.INFO, "Rooms added successfully");		
		logger.log(LogStatus.PASS, "Test passed");
		logger.endTest();
	}


}
