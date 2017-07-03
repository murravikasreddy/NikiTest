package PageObject_Component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.techbins.niki.beta.base.Base_Class;

import io.appium.java_client.AppiumDriver;
import junit.framework.Assert;

public class HomePO extends Base_Class {
	
	public AppiumDriver driver;
	
	public HomePO(AppiumDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

	//Home text
	
	@FindBy(id="com.techbins.niki.beta:id/niki_title_chat")
	public WebElement homeText;
	
	@FindBy(id="com.techbins.niki.beta:id/btnHelp")
	public WebElement listItemsBtn;
	
	//Cancle conversation 
	
	@FindBy(id="com.techbins.niki.beta:id/action_cancel")
	public WebElement cancleBtn;
	
	@FindBy(id="com.techbins.niki.beta:id/btnYes")
	public WebElement yesBtn;
	
	
	//Mobile Recharge
	
	@FindBy(xpath="//*[@index='0'][@class='android.support.v7.app.ActionBar$Tab']")
	public WebElement mobileRechargeBtn;
	
	@FindBy(id="com.techbins.niki.beta:id/suggestionText")
	public WebElement rechargeLinkText;

	@FindBy(xpath="//*[@text='Pick number from contacts'][@class='android.widget.Button']")
	public WebElement mobileChatOption;
	
	//Electricity Bill
	
	@FindBy(xpath="//*[@index='1'][@class='android.support.v7.app.ActionBar$Tab']")
	public WebElement utilityBillsBtn;
	
	@FindBy(xpath="//*[@text='Pay my electricity bill'][@class='android.widget.TextView']")
	public WebElement ecPayBillLinkText;
	
	@FindBy(xpath="//*[@index='1'][@resource-id='com.techbins.niki.beta:id/edtTxtInputMessage']")
	public WebElement enterTextForEcBill;
	
	@FindBy(xpath="//*[@index='2'][@resource-id='com.techbins.niki.beta:id/btnSend']")
	public WebElement clickSendBtnForEcBill;
	
	@FindBy(xpath="//*[index='1'][@resource-id='com.techbins.niki.beta:id/listiclesButtonGridView']")
	public WebElement ecPayBillChatOption;
	
	//Cab Booking
	
	@FindBy(xpath="//*[@index='2'][@class='android.support.v7.app.ActionBar$Tab']")
	public WebElement cabBtn;

	@FindBy(id="com.techbins.niki.beta:id/suggestionText")
	public WebElement bookACabLinkText;
	
	@FindBy(id="com.techbins.niki.beta:id/listOption")
	public WebElement cabChatOption;
	
	//Movie ticket Booking
	
	@FindBy(xpath="//*[@index='3'][@class='android.support.v7.app.ActionBar$Tab']")
	public WebElement movieBtn;
	
	@FindBy(xpath="//*[@text='Latest hindi movies in bangalore'][@class='android.widget.TextView']")
	public WebElement bookAMovieLinkText;
	
	@FindBy(id="com.techbins.niki.beta:id/recommendationActionButton1")
	public WebElement movieCityChatOption;
	
	//Event Booking
	
	@FindBy(xpath="//*[@index='4'][@class='android.support.v7.app.ActionBar$Tab']")
	public WebElement eventsBtn;
	
	@FindBy(xpath="//*[@text='Show me events'][@class='android.widget.TextView']")
	public WebElement bookAEventLinkText;
	
	@FindBy(xpath="//*[@text='How can I help you?'][@resource-id='com.techbins.niki.beta:id/edtTxtInputMessage']")
	public WebElement enterTextForEvents;
	
	@FindBy(xpath="//*[@index='2'][@resource-id='com.techbins.niki.beta:id/btnSend']")
	public WebElement clickSendBtnForEvents;
	
	@FindBy(xpath="//*[@text='Entertainment'][@class='android.widget.Button']")
	public WebElement eventCityChatOption;
	
	public void cancleConversation()
	{
		try 
		{
			if(cancleBtn.isDisplayed())
			{
				cancleBtn.click();
				yesBtn.click();
			}			
		} catch (Exception e)
		{
		}
		
	}	
	
	public void validateHomeText()
	{
		String text = homeText.getText();
		Assert.assertEquals("Niki", text);		
	}	
	
	public void clickOnListItemsBtn()
	{
		listItemsBtn.click();
	}
	
	public void clickOnMobileRechargeBtn()
	{
		mobileRechargeBtn.click();
	}	
	
	
	public void validateMobileRecharge()
	{
		rechargeLinkText.click();
		
		Explicit_wait(mobileChatOption, 20);
		String text = mobileChatOption.getText();
		Assert.assertEquals("Pick number from contacts",text);
		cancleBtn.click();
		yesBtn.click();
	}	
	
	public void clickOnUtilityBillsBtn()
	{
		utilityBillsBtn.click();
	}	
	
	public void validateElectricityBill()
	{
		ecPayBillLinkText.click();
		Explicit_wait(enterTextForEcBill, 20);
		enterTextForEcBill.sendKeys("BESCOM");
		clickSendBtnForEcBill.click();		
		Explicit_wait(ecPayBillChatOption, 20);
		ecPayBillChatOption.isDisplayed();
		cancleBtn.click();
		yesBtn.click();
	}
	
	public void clickOnCabBtn()
	{
		cabBtn.click();
	}
	
	public void validateCabBooking()
	{
		bookACabLinkText.click();
		
		Explicit_wait(cabChatOption, 20);
		String text = cabChatOption.getText();
		Assert.assertEquals("Pick Source",text);
		cancleBtn.click();
		yesBtn.click();
	}
	
	public void clickOnMoviesBtn()
	{
		movieBtn.click();
	}
	
	public void validateMovieTicketBooking()
	{
		bookAMovieLinkText.click();
		
		Explicit_wait(movieCityChatOption, 20);
		String text = movieCityChatOption.getText();
		Assert.assertEquals("Details", text);
		cancleBtn.click();
		yesBtn.click();
	}
	
	public void clickOnEventsBtn()
	{
		eventsBtn.click();
	}
	
	public void validateEventTicketBooking()
	{
		bookAEventLinkText.click();
		
		Explicit_wait(enterTextForEvents, 20);
		enterTextForEvents.sendKeys("Delhi");
		clickSendBtnForEvents.click();		
		Explicit_wait(eventCityChatOption, 20);
		String text = eventCityChatOption.getText();
		Assert.assertEquals("Entertainment",text);
		cancleBtn.click();
		yesBtn.click();
	}	
}
