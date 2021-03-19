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

import helperMethods.DropDown;
import helperMethods.JavascriptClick;
import helperMethods.Screenshots;
import helperMethods.WaitTypes;

public class DataServiceDesign {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
    private JavascriptClick javascriptClick;

	public DataServiceDesign(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		javascriptClick= new JavascriptClick(driver);
	}

	@FindBy(xpath = "//span[contains(text(),'New Attribute')]")
	private WebElement newAttributeButton;

	@FindBy(xpath = "//span[contains(text(),'New Attribute')]//preceding::input[1]")
	private WebElement attributeNameTextbox;

	@FindBy(xpath = "//div[contains(text(),'Type')]//following::button[1]")
	private WebElement typeDropdown;

	@FindBy(xpath = "//span[@class='odp-boolean']")
	private WebElement booleanIcon;
	
	@FindBy(xpath = "//span[@class='odp-123']")
	private WebElement numberIcon;
	
	@FindBy(xpath = "//label[normalize-space()='Text']")
	private WebElement text_RadioButton;
	
	@FindBy(xpath = "//label[normalize-space()='Long Text']")
	private WebElement longText_RadioButton;
	
	@FindBy(xpath = "//label[normalize-space()='Rich Text']")
	private WebElement richText_RadioButton;
	
	// Long
	@FindBy(xpath = "//div[contains(text(),'Custom Label')]//following::input[1]")
	private WebElement longTextCustomLabel;
	
	@FindBy(xpath = "//input[@id='errorMessage']")
	private WebElement longTextCustomError;
	
	@FindBy(xpath = "//div[contains(text(),'Tokens')]//following::input[1]")
	private WebElement longTextTokens;
	
	@FindBy(xpath = "//div[contains(text(),'Description')]//following::textarea[1]")
	private WebElement longTextDescription;
	
	@FindBy(xpath = "//span[contains(text(),'Save & Deploy')]")
	private WebElement saveAndDeploy;
	
	@FindBy(xpath = "//label[normalize-space()='Number']")
	private WebElement number_RadioButton;
	
	@FindBy(xpath = "//input[@id='_default']")
	private WebElement defaultTextBox;
	
	@FindBy(xpath = "//input[@id='_minNumber']")
	private WebElement minTextbox;
	
	@FindBy(xpath = "//input[@id='_maxNumber']")
	private WebElement maxTextbox;
	
	@FindBy(xpath = "//input[@type='range']")
	private WebElement precision;
	
	@FindBy(xpath = "//span[contains(text(),'Groups')]")
	private WebElement groups;
	
	@FindBy(xpath = "//*[text()='Admins']//preceding::span[1]")
	private WebElement admins;
	
	@FindBy(xpath = "//span[contains(text(),'App Center Roles')]")
	private WebElement appCenterRoles;
	
	@FindBy(xpath = "//span[contains(text(),'Manage')]//following::span[@class='slider']")
	private WebElement manageButton;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement saveButtonAppCenterRoles;
				
	public void click_NewAttributeButton() throws IOException {
		applyWait.waitForElementToBeClickable(newAttributeButton, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked new attribute button");
		test.log(Status.INFO, "User clicked new attribute button");
	}

	public void enter_AttributeName(String input_AttributeName) throws IOException {
		applyWait.waitForElementToBeClickable(attributeNameTextbox, 30).sendKeys(input_AttributeName);
		Screenshots.takeScreenshot(driver, "User entered attribute name as " + input_AttributeName);
		test.log(Status.INFO, "User entered attribute name as " + input_AttributeName);
	}

	public void click_TypeDropdown() throws IOException {
		applyWait.waitForElementToBeClickable(typeDropdown, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked type dropdown");
		test.log(Status.INFO, "User clicked type dropdown");
	}
	
	public void click_LongTextRadioButton() throws IOException {
		applyWait.waitForElementToBeClickable(longText_RadioButton, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked long text radio button");
		test.log(Status.INFO, "User clicked long text radio button");
	}
	
	public void enter_CustomLabel(String input_LongTextCustomLabel) throws IOException {
		applyWait.waitForElementToBeClickable(longTextCustomLabel, 30).click();
		applyWait.waitForElementToBeClickable(longTextCustomLabel, 30).sendKeys(input_LongTextCustomLabel);
		Screenshots.takeScreenshot(driver, "User entered long text custom label as " + input_LongTextCustomLabel);
		test.log(Status.INFO, "User entered long text custom label as " + input_LongTextCustomLabel);
	}
	
	public void enter_CustomError(String input_LongTextCustomError) throws IOException {
		applyWait.waitForElementToBeClickable(longTextCustomError, 30).sendKeys(input_LongTextCustomError);
		Screenshots.takeScreenshot(driver, "User entered long text custom error as " + input_LongTextCustomError);
		test.log(Status.INFO, "User entered long text custom error as " + input_LongTextCustomError);
	}
	
	public void enter_Tokens(String input_LongTextTokens) throws IOException {
		applyWait.waitForElementToBeClickable(longTextTokens, 30).sendKeys(input_LongTextTokens);
		Screenshots.takeScreenshot(driver, "User entered long text tokens as " + input_LongTextTokens);
		test.log(Status.INFO, "User entered long text tokens as " + input_LongTextTokens);
	}
	
	
	public void enter_Description(String input_LongTextDescription) throws IOException {
		applyWait.waitForElementToBeClickable(longTextDescription, 30).sendKeys(input_LongTextDescription);
		Screenshots.takeScreenshot(driver, "User entered long text description as " + input_LongTextDescription);
		test.log(Status.INFO, "User entered long text description as " + input_LongTextDescription);
	}
	
	public void click_RichTextRadioButton() throws IOException {
		applyWait.waitForElementToBeClickable(richText_RadioButton, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked rich text radio button");
		test.log(Status.INFO, "User clicked rich text radio button");
	}
	
	public void click_BooleanIcon() throws IOException {
		applyWait.waitForElementToBeClickable(booleanIcon, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked boolean icon");
		test.log(Status.INFO, "User clicked boolean icon");
	}
	
	public void click_NumberIcon() throws IOException {
		applyWait.waitForElementToBeClickable(numberIcon, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked number icon");
		test.log(Status.INFO, "User clicked number icon");
	}
	
	public void click_NumberRadioButton() throws IOException {
		applyWait.waitForElementToBeClickable(number_RadioButton, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked number radio button");
		test.log(Status.INFO, "User clicked number radio button");
	}
		
	public void click_SaveAndDeploy() throws IOException, InterruptedException {
		applyWait.waitForElementToBeClickable(saveAndDeploy, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked save and deploy button");
		test.log(Status.INFO, "User clicked save and deploy button");
		TimeUnit.SECONDS.sleep(15);
	}
	
	public void enter_DefaultValue(String input_DefaultValue) throws IOException {
		applyWait.waitForElementToBeClickable(defaultTextBox, 30).sendKeys(input_DefaultValue);
		Screenshots.takeScreenshot(driver, "User entered default value as " + input_DefaultValue);
		test.log(Status.INFO, "User entered default value as " + input_DefaultValue);
	}
		
	public void enter_MinValue(String input_MinValue) throws IOException {
		applyWait.waitForElementToBeClickable(minTextbox, 30).sendKeys(input_MinValue);
		Screenshots.takeScreenshot(driver, "User entered min value as " + input_MinValue);
		test.log(Status.INFO, "User entered min value as " + input_MinValue);
	}
	
	public void enter_MaxValue(String input_MaxValue) throws IOException {
		applyWait.waitForElementToBeClickable(maxTextbox, 30).sendKeys(input_MaxValue);
		Screenshots.takeScreenshot(driver, "User entered max value as " + input_MaxValue);
		test.log(Status.INFO, "User entered max value as " + input_MaxValue);
	}
	
	public void slidePrecison(String input_PrecisonValue) throws IOException {
		applyWait.waitForElementToBeClickable(precision, 30);
		DropDown dropdown = new DropDown(driver);
		dropdown.dragAndDrop(precision, Integer.parseInt(input_PrecisonValue));
		Screenshots.takeScreenshot(driver, "User changed precison ");
		test.log(Status.INFO, "User changed precison ");
	}
	
	public void click_Groups() throws IOException {
		applyWait.waitForElementToBeClickable(groups, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked groups link");
		test.log(Status.INFO, "User clicked groups link");
	}
	
	public void click_Admins() throws IOException {
		applyWait.waitForElementToBeClickable(admins, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked groups admins");
		test.log(Status.INFO, "User clicked groups admins");
	}
	
	public void click_AppCenterRoles() throws IOException {
		applyWait.waitForElementToBeClickable(appCenterRoles, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked app center roles");
		test.log(Status.INFO, "User clicked app center roles");
	}
	
	public void click_SaveButtonAppCenterRoles() throws IOException {
		applyWait.waitForElementToBeClickable(saveButtonAppCenterRoles, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked saved button on app center roles page");
		test.log(Status.INFO, "User clicked saved button on app center roles page");
	}
	
	public void select_DataServiceInAppCenterRoles(String input_DataServiceName) throws IOException {
		WebElement dataServiceName=driver.findElement(By.xpath("//span[normalize-space()='"+input_DataServiceName+"']//following::span[@class='fa fa-angle-down ng-star-inserted']"));
		applyWait.waitForElementToBeClickable(dataServiceName, 30).click();
		Screenshots.takeScreenshot(driver, "User selected " +input_DataServiceName);
		test.log(Status.INFO, "User selected " +input_DataServiceName);
	}
	
	public void enable_DataServiceManageButton() throws IOException {
		applyWait.waitForElementToBeClickable(manageButton, 30);
		javascriptClick.click(manageButton);
		Screenshots.takeScreenshot(driver, "User enabled manage button for selected data service");
		test.log(Status.INFO, "User enabled manage button for selected data service");
	}
}