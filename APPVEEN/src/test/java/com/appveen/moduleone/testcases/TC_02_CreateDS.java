package com.appveen.moduleone.testcases;

import java.util.List;
import org.testng.annotations.Test;
import com.appveen.pageobjects.DashBoardPage;
import com.appveen.pageobjects.DataServiceDesign;
import com.appveen.pageobjects.LoginPage;
import base.BaseClass;
import config.DefineConstants;
import helperMethods.ExcelUtils;
import helperMethods.JsonUtils;


public class TC_02_CreateDS extends BaseClass {

	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	DataServiceDesign dataServiceDesign;

	@Test(enabled=false)	
	public void createDataService2() throws Exception {
		    	   
		test = extent.createTest("TC_01_CreateDS", "Create DS with attributes");
		
		loginPage = new LoginPage(driver, test);
		dashBoardPage = new DashBoardPage(driver, test);
		dataServiceDesign = new DataServiceDesign(driver, test);
        System.out.println("2 started");
		List<String> testCaseActions = ExcelUtils.getExcelCellValue("Keywords", "TC_01");

		for (int testCaseAction = 0; testCaseAction < testCaseActions.size(); testCaseAction++) {
			if (testCaseActions.get(testCaseAction).equals("openAuthorUrl")) {
				loginPage.openAuthorUrl();
			}
			else if (testCaseActions.get(testCaseAction).equals("enterAuthorEmail")) {
				loginPage.enterAuthorEmail(JsonUtils.getData(DefineConstants.Authentication, "Author_Username"));
			}
			else if (testCaseActions.get(testCaseAction).equals("clickAuthorNextButton")) {
				loginPage.clickAuthorNextButton();
			}
			else if (testCaseActions.get(testCaseAction).equals("enterAuthorPassword")) {
				loginPage.enterAuthorPassword(JsonUtils.getData(DefineConstants.Authentication, "Author_Passoword"));
			}
			else if (testCaseActions.get(testCaseAction).equals("clickAuthorSignInButton")) {
				loginPage.clickAuthorSignInButton();
			}
			else if (testCaseActions.get(testCaseAction).equals("clickNewDataServiceButton")) {
				dashBoardPage.click_NewDataServiceButton();
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_NewDataServiceName")) {
				dashBoardPage.enter_NewDataServiceName(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "New Data Service Name"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_NewDataServiceDescription")) {
				dashBoardPage.enter_NewDataServiceDescription(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "New Data Service Description"));
			}
			else if (testCaseActions.get(testCaseAction).equals("click_CreateButtonNewDataService")) {
				dashBoardPage.click_CreateButtonNewDataService();
			}
			else if (testCaseActions.get(testCaseAction).equals("verify_SuccessMessage")) {
				dashBoardPage.verify_SuccessMessage(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Success Message"));
			}
			else if (testCaseActions.get(testCaseAction).equals("click_NewAttributeButton")) {
				dataServiceDesign.click_NewAttributeButton();
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_SecondAttributeName")) {
				dataServiceDesign.enter_AttributeName(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Second Attribute Name"));
			}
			else if (testCaseActions.get(testCaseAction).equals("click_TypeDropdown")) {
				dataServiceDesign.click_TypeDropdown();
			}
			else if (testCaseActions.get(testCaseAction).equals("click_LongTextRadioButton")) {
				dataServiceDesign.click_LongTextRadioButton();
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_LongTextCustomLabel")) {
				dataServiceDesign.enter_CustomLabel(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Long Text Custom Label"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_LongTextCustomError")) {
				dataServiceDesign.enter_CustomError(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Long Text Custom Error"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_LongTextTokens")) {
				dataServiceDesign.enter_Tokens(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Long Text Tokens"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_LongTextDescription")) {
				dataServiceDesign.enter_Description(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Long Text Description"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_ThirdAttributeName")) {
				dataServiceDesign.enter_AttributeName(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Third Attribute Name"));
			}
			else if (testCaseActions.get(testCaseAction).equals("click_RichTextRadioButton")) {
				dataServiceDesign.click_RichTextRadioButton();
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_RichTextCustomLabel")) {
				dataServiceDesign.enter_CustomLabel(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Rich Text Custom Label"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_RichTextCustomError")) {
				dataServiceDesign.enter_CustomError(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Rich Text Custom Error"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_RichTextTokens")) {
				dataServiceDesign.enter_Tokens(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Rich Text Tokens"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_RichTextDescription")) {
				dataServiceDesign.enter_Description(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Rich Text Description"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_FourthAttributeName")) {
				dataServiceDesign.enter_AttributeName(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Fourth Attribute Name"));
			}
			else if (testCaseActions.get(testCaseAction).equals("click_BooleanIcon")) {
				dataServiceDesign.click_BooleanIcon();
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_BooleanCustomLabel")) {
				dataServiceDesign.enter_CustomLabel(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Gender"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_BooleanCustomError")) {
				dataServiceDesign.enter_CustomError(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Gender Error"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_BooleanDescription")) {
				dataServiceDesign.enter_Description(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Gender Description"));
			}
			else if (testCaseActions.get(testCaseAction).equals("click_SaveAndDeploy")) {
				dataServiceDesign.click_SaveAndDeploy();
			}
			else if (testCaseActions.get(testCaseAction).equals("openAppCenterUrl")) {
				loginPage.openAppCenterUrl();
			}			
			else if (testCaseActions.get(testCaseAction).equals("enterAppCenterEmail")) {
				loginPage.enterAppCenterEmail(JsonUtils.getData(DefineConstants.Authentication, "AppCenter_Username"));
			}
			else if (testCaseActions.get(testCaseAction).equals("clickAppCenterNextButton")) {
				loginPage.clickAppCenterNextButton();
			}
			else if (testCaseActions.get(testCaseAction).equals("enterAppCenterPassword")) {
				loginPage.enterAppCenterPassword(JsonUtils.getData(DefineConstants.Authentication, "AppCenter_Passoword"));
			}
			else if (testCaseActions.get(testCaseAction).equals("clickAppCenterSignInButton")) {
				loginPage.clickAppCenterSignInButton();
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_FifthAttributeName")) {
				dataServiceDesign.enter_AttributeName(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Fifth Attribute Name"));
			}
			else if (testCaseActions.get(testCaseAction).equals("click_NumberIcon")) {
				dataServiceDesign.click_NumberIcon();
			}
			else if (testCaseActions.get(testCaseAction).equals("click_NumberRadioButton")) {
				dataServiceDesign.click_NumberRadioButton();
			}			
			else if (testCaseActions.get(testCaseAction).equals("enter_NumberCustomLabel")) {
				dataServiceDesign.enter_CustomLabel(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Number Custom Label"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_NumberCustomError")) {
				dataServiceDesign.enter_CustomError(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Number Custom Error"));
			}			
			else if (testCaseActions.get(testCaseAction).equals("enter_DefaultValue")) {
				dataServiceDesign.enter_DefaultValue(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Number Default Value"));
			}
			else if (testCaseActions.get(testCaseAction).equals("slidePrecison")) {
				dataServiceDesign.slidePrecison(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Precision"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_MinValue")) {
				dataServiceDesign.enter_MinValue(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Number Min Value"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_MaxValue")) {
				dataServiceDesign.enter_MaxValue(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Number Max Value"));
			}
			else if (testCaseActions.get(testCaseAction).equals("enter_NumberDescription")) {
				dataServiceDesign.enter_Description(JsonUtils.getData(DefineConstants.TC_01_CreateDS, "Number Description"));
			}
		}
	}
}
