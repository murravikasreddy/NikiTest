package com.techbins.niki.beta.tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.techbins.niki.beta.base.Base_Class;

import PageObject_Component.NavigationPO;

public class NavigationTest extends Base_Class{

	NavigationPO navigationPO;
	
	@BeforeClass
	public void testInitialize() throws IOException, InterruptedException
	{
		Start_Server();
		Init_app();
	}
	
	@Test(priority=1,groups = {"smoke"})
	public void enterToMainMenu()
	{
		navigationPO = new NavigationPO(driver);		
		navigationPO.clickOnMainMenuBtn();		
	}
	
	@Test(priority=2)
	public void validateUserName()
	{
		navigationPO = new NavigationPO(driver);
		navigationPO.clickOnMainMenuBtn();
		navigationPO.validateUserName();		
	}
	
	@Test(priority=3)
	public void validateMailId()
	{
		navigationPO = new NavigationPO(driver);		
		navigationPO.validateMailId();		
	}

	@Test(priority=4)
	public void validateMobileNo()
	{
		navigationPO = new NavigationPO(driver);
		
		navigationPO.validateMobileNo();		
	}
	
	@Test(priority=5,groups = {"smoke"})
	public void validateMyOrders()
	{
		navigationPO = new NavigationPO(driver);
		navigationPO.clickOnMyOrders();
		navigationPO.validateMyOrders();		
	}
	
	@Test(priority=6,groups = {"smoke"})
	public void validateIME() throws InterruptedException
	{
		navigationPO = new NavigationPO(driver);
		navigationPO.clickOnImproveMyExperience();
		navigationPO.validateIME();		
	}
	
	@Test(priority=7)
	public void validateNotification() throws IOException, InterruptedException
	{		
		navigationPO = new NavigationPO(driver);	
		navigationPO.clickOnMainMenuBtn();
		navigationPO.clickOnNotification();
		navigationPO.validateNotificatoin();		
	}	
	
	@Test(priority=8,groups = {"smoke"})
	public void validateReferEarn()
	{
		navigationPO = new NavigationPO(driver);
		navigationPO.clickOnMainMenuBtn();
		navigationPO.clickOnReferEarn();
		navigationPO.validateReferEarn();
	}
	
	@Test(priority=9)
	public void validateOffersPromos()
	{
		navigationPO = new NavigationPO(driver);
		navigationPO.clickOnMainMenuBtn();
		navigationPO.clickOnOffersPromos();
		navigationPO.validateOffersPromos();		
	}
	
	
	@AfterClass
	public void testTearDown() throws IOException, InterruptedException
	{
		Stop_Server();
	}

}
