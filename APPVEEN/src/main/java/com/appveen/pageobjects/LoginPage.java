package com.appveen.pageobjects;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import config.DefineConstants;
import helperMethods.Keyboard;
import helperMethods.Screenshots;
import helperMethods.SwitchWindow;
import helperMethods.WaitTypes;

public class LoginPage {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;

	public LoginPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement emailIDTextBox;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	private WebElement nextButton;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTextBox;

	@FindBy(xpath = "//span[contains(text(),'Login')]")
	private WebElement signInBtn;

	@FindBy(xpath = "//div[@id='toast-container']")
	private WebElement started;

	public void openAuthorUrl() throws IOException {
		driver.get(DefineConstants.AUTHOR_URL);
		Screenshots.takeScreenshot(driver, "User opened author url ");
		test.log(Status.INFO, "User opened author url ");
	}

	public void openAppCenterUrl() throws IOException, AWTException {
		// applyWait.waitForElementToBeClickable(started, 30);
		// if(started.getText().contains("Started")){
		SwitchWindow.openNewTab(driver);
		driver.get(DefineConstants.APP_CENTER_URL);
		// }
		Screenshots.takeScreenshot(driver, "User opened app center url");
		test.log(Status.INFO, "User opened app center url ");
	}

	public void enterAuthorEmail(String inputEmailID) throws IOException {
		applyWait.waitForElementToBeClickable(emailIDTextBox, 30).sendKeys(inputEmailID);
		Screenshots.takeScreenshot(driver, "User entered email address as " + inputEmailID);
		test.log(Status.INFO, "User entered email address as " + inputEmailID);
	}

	public void clickAuthorNextButton() throws IOException {
		applyWait.waitForElementToBeClickable(nextButton, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked next button");
		test.log(Status.INFO, "User clicked next button");
	}

	public void enterAuthorPassword(String inputPassword) throws IOException {
		applyWait.waitForElementToBeClickable(passwordTextBox, 30).sendKeys(inputPassword);
		Screenshots.takeScreenshot(driver, "User enter password as" + inputPassword);
		test.log(Status.INFO, "User enter password as" + inputPassword);
	}

	public void clickAuthorSignInButton() throws IOException {
		applyWait.waitForElementToBeClickable(signInBtn, 30).click();
		Screenshots.takeScreenshot(driver, "User click sign button");
		test.log(Status.INFO, "User enter sign button");
	}

	public void enterAppCenterEmail(String inputEmailID) throws IOException {
		applyWait.waitForElementToBeClickable(emailIDTextBox, 30).sendKeys(inputEmailID);
		Screenshots.takeScreenshot(driver, "User entered email address for app center as " + inputEmailID);
		test.log(Status.INFO, "User entered email address for app center as " + inputEmailID);
	}

	public void clickAppCenterNextButton() throws IOException {
		applyWait.waitForElementToBeClickable(nextButton, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked next button on app center");
		test.log(Status.INFO, "User clicked next button on app center");
	}

	public void enterAppCenterPassword(String inputPassword) throws IOException {
		applyWait.waitForElementToBeClickable(passwordTextBox, 30).sendKeys(inputPassword);
		Screenshots.takeScreenshot(driver, "User enter password for app center as " + inputPassword);
		test.log(Status.INFO, "User enter password for app center as " + inputPassword);
	}

	public void clickAppCenterSignInButton() throws IOException, InterruptedException {
		applyWait.waitForElementToBeClickable(signInBtn, 30).click();
		Screenshots.takeScreenshot(driver, "User click sign button on app center");
		test.log(Status.INFO, "User enter sign button on app center");
		Thread.sleep(3000L);
		Keyboard.refreshPage();
	}
}