package com.appveen.pageobjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import config.DefineConstants;
import helperMethods.DropDown;
import helperMethods.JavascriptClick;
import helperMethods.Screenshots;
import helperMethods.WaitTypes;

public class DataAppCenterPage {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
    private JavascriptClick javascriptClick;

	public DataAppCenterPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick= new JavascriptClick(driver);
	}

	@FindBy(xpath = "//span[contains(text(),'Add Data')]")
	private WebElement addData_Button;
	
	@FindBy(xpath = "//input[@id='_id']")
	private WebElement id_Textbox;
	
	@FindBy(xpath = "//textarea[@id='firstName']")
	private WebElement attribute_One;
	
	@FindBy(tagName = "p")
	private WebElement attribute_Two;
	
	@FindBy(xpath = "//input[@id='age']")
	private WebElement attribute_Four;
	
	@FindBy(xpath = "//span[normalize-space()='male']//following::span[@class='slider round']")
	private WebElement attribute_Three;

	@FindBy(xpath = "//button[@id='saveBtn']")
	private WebElement save_Button;
	
	@FindBy(xpath = "//button[@id='saveBtn']")
	private WebElement successMessage;
	
	@FindBy(xpath = "//div[@id='toast-container']")
	private WebElement savedButton;
	
	public void click_AddButtonOnDataCenter() throws IOException {
		applyWait.waitForElementToBeClickable(addData_Button, 30);
		javascriptClick.click(addData_Button);
		Screenshots.takeScreenshot(driver, "User clicked add data on selected data service");
		test.log(Status.INFO, "User clicked add data on selected data service");
	}
	
	public void enter_IDOnDataCenter(String input_ID) throws IOException {
		applyWait.waitForElementToBeClickable(id_Textbox, 30).sendKeys(input_ID);
		Screenshots.takeScreenshot(driver, "User entered ID value as "+ input_ID);
		test.log(Status.INFO, "User entered ID value as "+ input_ID);
	}
	
	public void enter_AttributeOneOnDataCenter(String input_ID) throws IOException {				
		applyWait.waitForElementToBeClickable(attribute_One, 30).sendKeys(input_ID);
		Screenshots.takeScreenshot(driver, "User entered attribute one value as "+ input_ID);
		test.log(Status.INFO, "User entered attribute one value as "+ input_ID);
	}

	public void enter_AttributeTwoOnDataCenter(String input_Value) throws IOException {	
		driver.switchTo().frame("lastNamerich_ifr");
		applyWait.waitForElementToBeClickable(attribute_Two, 30).sendKeys(input_Value);
		driver.switchTo().defaultContent();
		Screenshots.takeScreenshot(driver, "User entered attribute two value as "+ input_Value);
		test.log(Status.INFO, "User entered attribute two value as "+ input_Value);
	}
	
	public void click_AttributeThreeOnDataCenter() throws IOException {				
		applyWait.waitForElementToBeClickable(attribute_Three, 30).click();		
		Screenshots.takeScreenshot(driver, "User enabled male button");
		test.log(Status.INFO, "User enabled male button");
	}
	
	
	public void enter_AttributeFourOnDataCenter(String input_Value) throws IOException {				
		applyWait.waitForElementToBeClickable(attribute_Four, 30).clear();
		attribute_Four.sendKeys(input_Value);
		Screenshots.takeScreenshot(driver, "User entered attribute three value as "+ input_Value);
		test.log(Status.INFO, "User entered attribute three value as "+ input_Value);
	}
	
	public void click_SaveButtonOnDataCenter() throws IOException {
		applyWait.waitForElementToBeClickable(save_Button, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked save button on app center");
		test.log(Status.INFO, "User clicked save button on app center");
		if(savedButton.getText().equals(DefineConstants.App_Center_Success_Message))
		{
			System.out.println("Passed");
			Screenshots.takeScreenshot(driver, "Passed");
			test.log(Status.INFO, "Passed");
		}
	}
}