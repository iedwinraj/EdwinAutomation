package com.qa.Adminstrationmodule.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;

import io.qameta.allure.Step;

public class testLoginPage {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(testLoginPage.class));
	
	private WebDriver driver;
	private ElementUtil elementUtil;
	
	//1. By Locator / OR
	private By username = By.id("login");
	private By password = By.id("password");
	private By loginButton = By.xpath("//button[text()='Log in']");
//	private By loginButton = By.cssSelector("button[value='Log in']");
	private By ForgotPwdLink = By.linkText("Forgot Password");
	private By registerLink = By.linkText("Register");
	
	//2. Constructor of page class:
	
	public testLoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	//3. page actions/methods/libs:
	@Step("get Login Page Title")
	public String getLoginPageTitle() {
		LOGGER.info("getting page title");
		return elementUtil.waitForPageTitlePresent(Constants.LOGIN_PAGE_TITLE, 5);
	}
	
	@Step("checking is Forgot Pwd Link Exist")
	public boolean isForgotPwdLinkExist() {
		LOGGER.info("checking forgot pwd link");
		return elementUtil.doIsDisplayed(ForgotPwdLink);
	}
	
	@Step("Login with username : {0} and password : {1}")
	public DashboardPage doLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new DashboardPage(driver);
	}
	
	public DashboardPage2 doLogin2(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new DashboardPage2(driver);
	}
	
	@Step("Login with username : {0} and password : {1}")
	public Dashboardpageparameterized douserLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new Dashboardpageparameterized(driver);
	}
	
	@Step("Login with username : {0} and password : {1}")
	public ParentmodulePage dousersLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new ParentmodulePage(driver);
	}
	@Step("Login with username : {0} and password : {1}")
	public SchoolManagementmodulePages dousersSMMLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new SchoolManagementmodulePages(driver);
	}
	
	@Step("Login with username : {0} and password : {1}")
	public StudentlifecyclemodulePages dousersSLCLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new StudentlifecyclemodulePages(driver);
	}
	
	@Step("Login with username : {0} and password : {1}")
	public CircularmodulescreensPages dousersCircularmoduleLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new CircularmodulescreensPages(driver);
	}
	

	@Step("Login with username : {0} and password : {1}")
	public IncidentmodulescreensPages dousersIncidentmoduleLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new IncidentmodulescreensPages(driver);
	}
	
	@Step("Login with username : {0} and password : {1}")
	public StoriesmodulescreensPages dousersStoriesmoduleLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new StoriesmodulescreensPages(driver);
	}
	
	@Step("Login with username : {0} and password : {1}")
	public OnlineVideosmodulescreensPages dousersOnlineVideosmoduleLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new OnlineVideosmodulescreensPages(driver);
	}
	@Step("Login with username : {0} and password : {1}")
	public SendEmailmodulescreensPages dousersSendEmailmoduleLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new SendEmailmodulescreensPages(driver);
	}
	
	@Step("Login with username : {0} and password : {1}")
	public FeesManagementmodulescreensPages dousersFeesManagementmoduleLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new FeesManagementmodulescreensPages(driver);
	}
	
	@Step("Login with username : {0} and password : {1}")
	public StudentManagementmodulescreensPages dousersStudentManagementmoduleLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new StudentManagementmodulescreensPages(driver);
	}
	
	@Step("Login with username : {0} and password : {1}")
	public EmployeesmodulescreensPages dousersEmployeesmoduleLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new EmployeesmodulescreensPages(driver);
	}
	
	@Step("Login with username : {0} and password : {1}")
	public ReportCardmodulescreensPages dousersReportCardmoduleLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new ReportCardmodulescreensPages(driver);
	}
	
	@Step("Login with username : {0} and password : {1}")
	public ConfigurationsmodulescreensPages dousersConfigurationsmoduleLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new ConfigurationsmodulescreensPages(driver);
	}
	
	@Step("Login with username : {0} and password : {1}")
	public BuildingsPage dousersBuildingtestmoduleLogin(String un, String pwd) {
		LOGGER.info("Login with : " + un + " " + pwd);
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		return new BuildingsPage(driver);
	}

	
	
	/*
	 * @Step("navigate To Register Page") public RegisterPage
	 * navigateToRegisterPage() { LOGGER.info("Navigate to Register page....");
	 * elementUtil.doClick(registerLink); return new RegisterPage(driver); }
	 */
	

}
