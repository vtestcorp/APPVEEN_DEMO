package com.appveen.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import config.DefineConstants;
import helperMethods.Screenshots;
import helperMethods.WaitTypes;

public class DashBoardPage {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;

	public DashBoardPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
	}

	@FindBy(xpath = "//span[contains(text(),'New Data Service')]")
	private WebElement newDataServiceButton;

	@FindBy(xpath = "//input[@id='name']")
	private WebElement newDataServiceName;

	@FindBy(xpath = "//textarea[@id='description']")
	private WebElement newDataServiceDescription;

	@FindBy(xpath = "//button[@id='newServiceModalYes']")
	private WebElement createButton;

	@FindBy(xpath = "//div[@id='toast-container']")
	private WebElement successMessage;
	
	public void click_NewDataServiceButton() throws IOException {
		applyWait.waitForElementToBeClickable(newDataServiceButton, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked new data service button on dashboard");
		test.log(Status.INFO, "User clicked new data service button on dashboard");
	}

	public void enter_NewDataServiceName(String input_NewDataServiceName) throws IOException {
		applyWait.waitForElementToBeClickable(newDataServiceName, 30).sendKeys(input_NewDataServiceName);
		Screenshots.takeScreenshot(driver, "User entered new data service name as " + input_NewDataServiceName);
		test.log(Status.INFO, "User entered new data service name as " + input_NewDataServiceName);
	}

	public void enter_NewDataServiceDescription(String input_NewDataServiceDescription) throws IOException {
		applyWait.waitForElementToBeClickable(newDataServiceDescription, 30).sendKeys(input_NewDataServiceDescription);
		Screenshots.takeScreenshot(driver,"User entered new data service Description as " + input_NewDataServiceDescription);
		test.log(Status.INFO, "User entered new data service Description as " + input_NewDataServiceDescription);
	}

	public void click_CreateButtonNewDataService() throws IOException {
		applyWait.waitForElementToBeClickable(createButton, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked create button on new data service pop up");
		test.log(Status.INFO, "User clicked create button on new data service pop up");
	}

	public void verify_SuccessMessage(String success_Message) throws IOException {
		applyWait.waitForElementToBeClickable(successMessage, 30);
		if (successMessage.getText().equals(success_Message));
		Screenshots.takeScreenshot(driver, DefineConstants.Success_Message + " is displayed");
		test.log(Status.INFO, DefineConstants.Success_Message + " is displayed");				
	}
}