package com.techbins.niki.beta.tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.techbins.niki.beta.base.Base_Class;

import PageObject_Component.HomePO;

public class HomePageTest extends Base_Class{

	static HomePO homePO;
	
	@BeforeClass
	public void testInitialize() throws IOException, InterruptedException
	{
		Start_Server();
		Init_app();
	}
	
	
	@Test(priority=1,groups = {"smoke"})
	public void testHomePage() throws IOException, InterruptedException
	{		
		homePO = new HomePO(driver);		
		homePO.validateHomeText();
	}

	@Test(priority=2)
	public void testMobileRechargeChat() throws IOException, InterruptedException
	{		
		homePO = new HomePO(driver);
		
		homePO.cancleConversation();
		homePO.clickOnListItemsBtn();	
		homePO.clickOnMobileRechargeBtn();
		homePO.validateMobileRecharge();	
	}
	
	@Test(priority=3,groups = {"smoke"})
	public void testElectricityPayChat() throws IOException, InterruptedException
	{		

		homePO = new HomePO(driver);
		
		homePO.cancleConversation();
		homePO.clickOnListItemsBtn();
		homePO.clickOnUtilityBillsBtn();
		homePO.validateElectricityBill();	
	}
	
	@Test(priority=4,groups = {"smoke"})
	public void testCabBookingChat() throws IOException, InterruptedException
	{		
		homePO = new HomePO(driver);
		
		homePO.cancleConversation();
		homePO.clickOnListItemsBtn();
		homePO.clickOnCabBtn();
		homePO.validateCabBooking();	
	}
	
	@Test(priority=5)
	public void testMovieTicketBookingChat() throws IOException, InterruptedException
	{		
		homePO = new HomePO(driver);
			
		homePO.cancleConversation();
		homePO.clickOnListItemsBtn();
		homePO.clickOnMoviesBtn();
		homePO.validateMovieTicketBooking();	
	}
	
	@Test(priority=6,groups = {"smoke"})
	public void testEventTicketBookingChat() throws IOException, InterruptedException
	{		
		homePO = new HomePO(driver);
		
		homePO.cancleConversation();
		homePO.clickOnListItemsBtn();
		homePO.clickOnEventsBtn();
		homePO.validateEventTicketBooking();	
	}
	

	@AfterClass
	public void testTearDown() throws IOException, InterruptedException
	{
		Stop_Server();
	}

}
