package PageObject_Component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.techbins.niki.beta.base.Base_Class;

import io.appium.java_client.AppiumDriver;
import junit.framework.Assert;

public class NavigationPO extends Base_Class{
	
//	public AppiumDriver driver;
	
	public NavigationPO(AppiumDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

	//Main Menu
	@FindBy(className="android.widget.ImageButton")
	public WebElement menuBtn;
	
	//UserName
	@FindBy(id="com.techbins.niki.beta:id/userName")
	public WebElement validateUserName;

	//Mail Id
	@FindBy(id="com.techbins.niki.beta:id/userEmail")
	public WebElement validateMailId;
	
	//Mobile No
	@FindBy(id="com.techbins.niki.beta:id/userContactNumber")
	public WebElement validateMobileNo;
	
	//My Orders
	@FindBy(name="My Orders")
	public WebElement myOrdersBtn;
	
	@FindBy(id="com.techbins.niki.beta:id/title")
	public WebElement validateMyOrders;

	@FindBy(xpath="//*[@index='0'][@class='android.widget.ImageButton']")
	public WebElement backToMainMenu;
	
	//Improve My Experience
	@FindBy(xpath="//*[@text='Improve My Experience'][@class='android.widget.TextView']")
	public WebElement IMEBtn;
	
	@FindBy(id="com.techbins.niki.beta:id/reminderHeader")
	public WebElement newReminderLink;
	
	@FindBy(id="com.techbins.niki.beta:id/saveReminderButton")
	public WebElement saveBtnLink;
	
	//Notifications
	@FindBy(name="Notifications")
	public WebElement notificationBtn;
	
	@FindBy(id="com.techbins.niki.beta:id/title")
	public WebElement validateNotification;
	
	//Refer & Earn
	@FindBy(name="Refer & Earn")
	public WebElement referEarnBtn;
	
	@FindBy(id="com.techbins.niki.beta:id/whatsApp")
	public WebElement validateReferEarn;	
	
	//Offers & Promocodes
	@FindBy(name="Offers & Promocodes")
	public WebElement offersPromosBtn;
	
	@FindBy(id="com.techbins.niki.beta:id/btnAvailableOffers")
	public WebElement validateOffersPromos;
	 
	//Enter to Main menu
	public void clickOnMainMenuBtn()
	{
		menuBtn.click();
	}
	
	//UserName
	public void validateUserName()
	{
		String UserName = validateUserName.getText();
		Assert.assertEquals(ConstantTexts.USERNAME, UserName);		
	}
	
	//Mail Id
	public void validateMailId()
	{
		String MailId = validateMailId.getText();		
		Assert.assertEquals(ConstantTexts.MAILID, MailId);		
	}
	
	//MobileNo
	public void validateMobileNo()
	{
		String MobileNo = validateMobileNo.getText();
		Assert.assertEquals(ConstantTexts.MOBILENO, MobileNo);		
	}
	
	//My Orders
	public void clickOnMyOrders()
	{
		Explicit_wait(myOrdersBtn, 10);
		myOrdersBtn.click();
	}
	
	public void validateMyOrders()
	{
		Explicit_wait(validateMyOrders, 10);
		String text = validateMyOrders.getText();
		Assert.assertEquals("My Orders", text);	
		backToMainMenu.click();
	}	
	
	public void clickOnImproveMyExperience() throws InterruptedException
	{
		Explicit_wait(IMEBtn, 10);		
		IMEBtn.click();		
	}
	
	public void validateIME() throws InterruptedException
	{		
		Explicit_wait(newReminderLink, 20);
		System.out.println("Entering validation");
		newReminderLink.click();
		String text = saveBtnLink.getText();
		Assert.assertEquals("Save & continue", text);
		backToMainMenu.click();
		backToMainMenu.click();		
	}
	
	//Notifications
	public void clickOnNotification()
	{
		menuBtn.click();
		notificationBtn.click();
	}
	
	public void validateNotificatoin()
	{
		String text = validateNotification.getText();
		Assert.assertEquals("Notifications", text);
		backToMainMenu.click();
	}
	
	//Refer & Earn
	public void clickOnReferEarn()
	{
		referEarnBtn.click();
	}
	
	public void validateReferEarn()
	{	
		Explicit_wait(validateReferEarn, 10);
		validateReferEarn.isDisplayed();
		backToMainMenu.click();
	}
	
	//Offers & Promocodes
	public void clickOnOffersPromos()
	{
		offersPromosBtn.click();
	}
	
	public void validateOffersPromos()
	{
		Explicit_wait(validateOffersPromos, 10);
		validateOffersPromos.getText();
		backToMainMenu.click();
	}
}