package com.qa.verifyroleacess.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.utils.Constants;
import com.qa.verifyroleaccess.base.roleaccessBaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

//@Listeners(ExtentReportListener.class)
@Epic("Epic - 100: Feature Name : Login Page for Demo Application")
@Story("User Story - 300: Desgin Login Page for application with different test cases")
public class LoginPageTest extends roleaccessBaseTest {
	
	/*
	 * @Test
	 * 
	 * @Description("login page title test...")
	 * 
	 * @Severity(SeverityLevel.MINOR) public void loginPageTitleTest() {
	 * 
	 * String title = loginpage1.getLoginPageTitle(); // String title =
	 * loginPage.getLoginPageTitle(); System.out.println("login page title is : " +
	 * title); Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE); }
	 */
	/*
	 * @Test
	 * 
	 * @Description("verify forgot pwd link test...")
	 * 
	 * @Severity(SeverityLevel.CRITICAL) public void forgotPwdLinkTest() {
	 * System.out.println("verifying forgot pwd link on login page");
	 * Assert.assertTrue(loginpage1.isForgotPwdLinkExist()); }
	 */

	@Test
	@Description("login test ...")
	@Severity(SeverityLevel.BLOCKER)
	public void loginTest() {
		dashboardpage = loginpage1.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(dashboardpage.getHeaderValue(),Constants.ACCOUNTS_PAGE_TITLE);
	}

}
