package com.techbins.niki.beta.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.techbins.niki.beta.utilities.Utility_Class;

public class Base_Class {
	
	public static Process process;
	public static  AppiumDriver driver;
	
	static Utility_Class c1= new Utility_Class();
	
	//Start server
	
	public static  void Start_Server() throws IOException, InterruptedException
	{
		String Start_Server=c1.Reading_properties("Appium_path");
		
		System.out.println("Appium Path : " + Start_Server);
		
		 process = Runtime.getRuntime().exec(Start_Server);
		
		if(process!=null)
		{
			System.out.println("Started the Appium Server");
		}
		else
		{
			System.out.println("NOT Initialized");
		}
			
		Thread.sleep(20000);
				
	}
	
	//********************************************
	
	public static void Init_app() throws InterruptedException, IOException
	{
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", c1.Reading_properties("deviceName"));
		capabilities.setCapability("platformName", c1.Reading_properties("platformName"));
		capabilities.setCapability("platformVersion", c1.Reading_properties("platformVersion"));
		
//		capabilities.setCapability("app", c1.Reading_properties("Apk_path"));
		
		//app details
		capabilities.setCapability("appPackage", c1.Reading_properties("Package_name"));
		capabilities.setCapability("appActivity",c1.Reading_properties("Activity_name"));
		
//		capabilities.setCapability("fullReset", true);

		
		
		//Appium details
		
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		Thread.sleep(3000);
		
		
		
	}
	
	//Explicit wait
	
	public void Explicit_wait(WebElement ele, long T1)
	{
		WebDriverWait wait = new WebDriverWait(driver, T1);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	//Screenshot
	
	public void Snapshot1(String TC_ID, String Order) throws IOException
	{
		
		Date date= new Date();
		SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		
		File file= new File(df.format(date)+".png");
		
		
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotAs,new File("S:\\Appium\\Aug-14\\July_BB_Project\\Screenshot" +TC_ID+"-"+Order+"-"+file));
		
		
	}
	
	
	
	
	//******************************************
	// Stop server
	
	public static  void Stop_Server() throws InterruptedException
	{
		
		if(process!=null)
		{
			Thread.sleep(2000);
			driver.quit();
			Thread.sleep(3000);
			process.destroy();
			Thread.sleep(5000);
			System.out.println("Stopped the appium server");
			
		}
	}


}
