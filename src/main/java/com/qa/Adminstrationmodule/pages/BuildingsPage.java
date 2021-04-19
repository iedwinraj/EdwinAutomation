package com.qa.Adminstrationmodule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.verifyroleacess.utils.ElementUtils;
import com.qa.verifyroleacess.utils.JavaScriptUtil;

public class BuildingsPage {
	
	private WebDriver driver;
	private ElementUtils elementUtil;
	private JavaScriptUtil JavaScriptUtils;
	
	private By BuildingsMainmenu= By.linkText("Building");

	public BuildingsPage(WebDriver driver) {
		this.driver=driver;
		elementUtil= new ElementUtils(driver);
		System.out.println("Edwin");
	}
	
public void verifyOnlineVideosMainMenu(String admmn,String admmnread)   {
	/*
	 * SoftAssert softAssert1 = new SoftAssert();
	 * if(admmnread.equalsIgnoreCase("Yes")) { try {
	 * elementUtil.waitForElementToBeVisibleAssert(OnlineVideosMainmenu, 10); String
	 * title =elementUtil.doGetText(OnlineVideosMainmenu);
	 * System.out.println("title is : " + title); // Assert.assertEquals(title,
	 * admmn); elementUtil.clickWhenReady(OnlineVideosMainmenu, 10); } catch
	 * (NoSuchElementException |TimeoutException e) { try {
	 * elementUtil.mouseaction(Scrollbarelement);
	 * elementUtil.waitForElementToBeVisibleAssert(OnlineVideosMainmenu, 10); String
	 * title =elementUtil.doGetText(OnlineVideosMainmenu);
	 * System.out.println("title is : " + title); Assert.assertEquals(title, admmn);
	 * elementUtil.clickWhenReady(OnlineVideosMainmenu, 10); } catch
	 * (NoSuchElementException e2) { // TODO: handle exception
	 * Assert.fail(OnlineVideosMainmenu+" "
	 * +"Sub Menu Should be display,but not displayed"); } //
	 * Assert.fail(ConfMenuMenu+" "+"Main Menu Should be display,but not displayed"
	 * ); }
	 * 
	 * }else { try {
	 * softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(
	 * OnlineVideosMainmenu,
	 * 20),OnlineVideosMainmenu+" "+"Sub Menu is displayed,Should not be displayed"
	 * ); elementUtil.clickWhenReady(OnlineVideosMainmenu, 10);
	 * softAssert1.assertAll(); } catch (TimeoutException e) { // TODO: handle
	 * exception } catch (org.openqa.selenium.NoSuchElementException e) { try {
	 * elementUtil.mouseaction(Scrollbarelement);
	 * softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(
	 * OnlineVideosMainmenu,
	 * 20),OnlineVideosMainmenu+" "+"Sub Menu is displayed,Should not be displayed"
	 * ); elementUtil.clickWhenReady(OnlineVideosMainmenu, 10); } catch (Exception
	 * e2) { // TODO: handle exception
	 * System.out.println((OnlineVideosMainmenu+" "+"Sub menu is not displayed")); }
	 * }
	 * 
	 * }
	 */
	  }
}
