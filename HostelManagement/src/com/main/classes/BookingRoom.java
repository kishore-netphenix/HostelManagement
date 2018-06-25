/**
 * 
 */
package com.main.classes;

import org.testng.annotations.Test;

import com.guest.booking.Booking;
import com.guest.booking.HostelList;
import com.guest.booking.HostelQuotePrice;
import com.guest.booking.HostelView;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;


/**
 * @author qc
 *
 */
public class BookingRoom {

	@Test
	public void mainTest() throws InterruptedException {
		ExtentReports logger = ExtentReports.get(BookingRoom.class);
		logger.init("//home//qc//eclipse-workspace//HostelManagement//advanceReport.html", true);
		logger.startTest("Stay Peace");
		HostelView browser = new HostelView();
		browser.launch();		
		logger.log(LogStatus.INFO, "Browser Launched Successfully");
		HostelList viewlist = new HostelList();
		viewlist.hostels();
		logger.log(LogStatus.INFO, "List of hostels view page");
		HostelQuotePrice pricing = new HostelQuotePrice();
		pricing.priceList();
		logger.log(LogStatus.INFO, "View price for rooms and services");		
		Booking book = new Booking();
		book.bookRoom();		
		logger.log(LogStatus.INFO, "Booked Successfully");		
		logger.log(LogStatus.PASS, "Test passed");
		logger.endTest();
	}

}
