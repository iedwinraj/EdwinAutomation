package com.qa.verifyroleacess.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.Errors;
import com.qa.verifyroleaccess.base.roleaccessBaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Epic - 200: Feature Name : Accounts Page for Demo Shop Application")
@Story("User Story - 301: Desgin Accounts Page for application with different test cases")
public class DashboadPageTest extends roleaccessBaseTest {

	@BeforeClass
	public void DashboadPageSetup() {
		dashboardpage = loginpage1.doLogin(prop.getProperty("username1"), prop.getProperty("password1"));
	}

	@Description("dashboard Page Title Test")
	@Severity(SeverityLevel.MINOR)
	@Test(priority = 1)
	public void dashboardPageTitleTest() {
		String title = dashboardpage.getAccountsPageTitle();
		System.out.println("acc page title is: " + title);
		Assert.assertEquals(title, Constants.ACCOUNTS_PAGE_TITLE, Errors.TITLE_NOT_MATCHED_ERROR);
	}
	
	@Test(priority = 2)
	@Description("verify Accounts Page Header Test")
	@Severity(SeverityLevel.NORMAL)
	public void verifydashboardpageHeaderTest() {
//		String header = dashboardpage.getHeaderValue();
//		System.out.println("Acc page header is : " + header);
//		Assert.assertEquals(header, Constants.ACCOUNTS_PAGE_HEADER, Errors.HEADER_NOT_MATCHED_ERROR);
	}

	@Test(priority = 3)
	@Description("verify Acc Page Sections Count Test")
	@Severity(SeverityLevel.NORMAL)
	public void verifyAccPageSectionsCountTest() {
//		Assert.assertTrue(dashboardpage.getdashboardpageSectionsCount() == Constants.ACCOUNTS_PAGE_SECTIONS_COUNT, "Accoint section count is not matched...");
	}

	@Test(priority = 4)
	@Description("verify Acc Page Sections List Test")
	@Severity(SeverityLevel.NORMAL)
	public void verifydashboardpagePageSectionsListTest() {
//		List<String> accSecList = dashboardpage.getdashboardpageSectionsList();
//		System.out.println(accSecList);
//		Assert.assertEquals(accSecList, Constants.getAccSectionsList());
	}
	
	@DataProvider
	public Object[][] searchData() {
		return new Object[][] {{"iMac"}, 
							   {"iPhone"}, 
							   {"Macbook"}};
	}
	
	@Test(priority = 5, dataProvider = "searchData")
	@Description("product search with Macbook")
	@Severity(SeverityLevel.CRITICAL)
	public void searchTest(String productName) {
//		Assert.assertTrue(dashboardpage.doSearch(productName));
	}

	@Test(priority = 6)
	@Description("verify Product Results Test for iMac")
	@Severity(SeverityLevel.CRITICAL)
	public void verifyProductResultsTest() {
//		dashboardpage.doSearch("iMac");
//		dashboardpage.selectProductFromResults("iMac");
	}
	
	@Description("dashboard  Administration Verify Test")
	@Severity(SeverityLevel.MINOR)
	@Test(priority = 7)
	public void dashboardPageAdministrationMenuVerifyTest() {
//		String title = dashboardpage.getadministrationMainMenuname();
//		System.out.println("Administration Menu title is: " + title);
//		Assert.assertEquals(title,"Administration");
	}
	
	@Test(priority = 8)
	public void dashboardPageAdministrationMenunotdisplayedTest() {
//		dashboardpage.verifyMenunamesnotdisplayed();
		System.out.println("Administration Menu title is: " + "Menus not displayed");
	}
	@Test(priority = 9)
	@Description("verify Administration Main menu Clicked Successfully")
	@Severity(SeverityLevel.CRITICAL)
	public void administrationMainmenuTest() {
//		dashboardpage.clickadministrationMainmenu();
		
	}
	
}
