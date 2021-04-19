package com.qa.Adminstrationmodule.pages;

import static org.testng.Assert.assertFalse;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.opencart.utils.Constants;
import com.qa.verifyroleacess.utils.ElementUtils;
import com.qa.verifyroleacess.utils.JavaScriptUtil;

public class DashboardPage2 {

	private WebDriver driver;
	private ElementUtils elementUtil;
	private JavaScriptUtil jsUtil;
	
//	private By administrationMainmenu= By.xpath("//i[@class='fa fa-menu-administration']/following-sibling::span[contains(text(),'Administration')]");
//	private By ParentsMainmenu=By.xpath("//i[@class='fa fa-menu-parents']/following-sibling::span[contains(text(),'Parents')]");
	private String administrationMainmenu1="Administration";
	
	private By administrationMainmenu= By.partialLinkText("Administration");
	private By ParentsMainmenu=By.partialLinkText("Parents");
	
	private By OrganizationsSubmenu =By.partialLinkText("Organizations");	
	private By Createbutton =By.xpath("//button[normalize-space()='Create']");
	private By ParentProfileSubmenu =By.partialLinkText("Parent Profile");
	private By UsersSubmenu =By.partialLinkText("Users");
	
	private By Savebutton=By.xpath("//button[@accesskey='S']");
	
	public DashboardPage2(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtils(this.driver);
	}

	
		  public void verifytheReaddataexcel(String data,String data1,String data2) {
			  if(data.equalsIgnoreCase("Yes")) {
				  Assert.assertTrue(elementUtil.doIsDisplayed(administrationMainmenu),"Administration Main Menu is displayed");
				  String title =elementUtil.doGetText(administrationMainmenu); 
					 System.out.println("title is : " + title);
					 Assert.assertEquals(title, data1);
					 elementUtil.clickWhenReady(administrationMainmenu, 10);
					  elementUtil.waitForElementToBeLocated(OrganizationsSubmenu, 20);
					  String title1 =elementUtil.doGetText(OrganizationsSubmenu); 
						 System.out.println("title is : " + title1);
						 Assert.assertEquals(title1, data2);
					  elementUtil.clickWhenReady(OrganizationsSubmenu, 10);
			  }else {
				  try {
						assertFalse(elementUtil.doIsDisplayed(administrationMainmenu),"Administration Main menu is displayed,Should not be displayed");
						    } catch (org.openqa.selenium.NoSuchElementException e) {
						    	System.out.println("Administration Main menu is not displayed" );
						    }
			  
			  
			  }
		  }
		  
	
	  public void verifythewritedataexcel(String data3) { 
	  if(data3.equalsIgnoreCase("Yes")) {
		  try {
			  elementUtil.waitForElementToBeLocated(Createbutton, 10);
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton, 20),"The Create button displayed Successfully");
			//     assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton),"The Create button displayed Successfully");
				 
//				  assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button displayed Successfully");
				  elementUtil.clickWhenReady(Createbutton, 10);
				  System.out.println("The Create button Clicked Successfully");
		//		  elementUtil.verifyelementIsDisplayed(Savebutton);
		} catch (StaleElementReferenceException e) {
			System.out.println("The Create button displayed Successfully");
		}
		  catch (TimeoutException e) {
				// TODO: handle exception
		  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton,20),"The Create button displayed Successfully");
			}
		  	
		} else { 
		  try {
			  Assert.assertFalse(elementUtil.verifyelementIsDisplayed(Createbutton,20),"Create button is displayed,Should not be displayed");
	//		  elementUtil.waitForElementToBeLocated(Createbutton, 30);
	//  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
	  } catch
	  (org.openqa.selenium.NoSuchElementException e) {
	  System.out.println("Create button is not displayed" ); 
	  }catch(Exception e) {
		  System.out.println("Create button is not displayed" ); 
	  }
	  }
	  }
	 
		  
	  public void verifytheParentsmenuReaddataexcel(String data4,String data5,String data6) {
		  if(data4.equalsIgnoreCase("Yes")) {
			  elementUtil.waitForElementToBeLocated(ParentsMainmenu, 10);
			  Assert.assertTrue(elementUtil.doIsDisplayed(ParentsMainmenu),"Parents Main Menu is displayed");
			  String title1 =elementUtil.doGetText(ParentsMainmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data5);
				 elementUtil.clickWhenReady(ParentsMainmenu, 10);
				  elementUtil.waitForElementToBeLocated(ParentProfileSubmenu, 20);
				  String title2 =elementUtil.doGetText(ParentProfileSubmenu); 
					 System.out.println("title is : " + title2);
					 Assert.assertEquals(title2, data6);
					 elementUtil.clickWhenReady(ParentProfileSubmenu, 10); 
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(ParentsMainmenu),"Parents Main Menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("Parents Main Menu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	  }
	  

  public void verifytheParentsmenuwritedataexcel(String data7) {
 
  if(data7.equalsIgnoreCase("Yes")) {
	  try {
	  elementUtil.waitForElementToBeLocated(Createbutton, 10);  
	  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton,20),"The Create button displayed Successfully");
//	  assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button displayed Successfully");
	  elementUtil.clickWhenReady(Createbutton, 10);
	  }
	  catch (StaleElementReferenceException e) {
		// TODO: StaleElementhandle exception
		  System.out.println("The Create button Clicked Successfully");
	}
	 
  }else { 
	  try {
//		  Thread.sleep(5000);
		  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
  } catch(org.openqa.selenium.NoSuchElementException e) {
  System.out.println("Create button is not displayed"); 
  } //catch (InterruptedException e) {
	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
	  catch(StaleElementReferenceException e) {
		  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
		  } 
  }
  }
  
	/*
	 * public void verifytheUsersSubmenuReaddataexcel(String data8,String data9) {
	 * if(data8.equalsIgnoreCase("Yes")) {
	 * 
	 * Assert.assertTrue(elementUtil.verifyelementIsDisplayed(UsersSubmenu,
	 * 20),"Parents Main Menu is displayed"); //
	 * Assert.assertTrue(elementUtil.waitForElementToBeLocated(ParentsMainmenu,
	 * 10),"Parents Main Menu is displayed"); //
	 * assertTrue(elementUtil.doIsDisplayed(ParentsMainmenu)
	 * ,"Parents Main Menu is displayed"); String title1
	 * =elementUtil.doGetText(UsersSubmenu); System.out.println("title is : " +
	 * title1); Assert.assertEquals(title1, data9);
	 * elementUtil.clickWhenReady(UsersSubmenu, 10);
	 * 
	 * }else { try { Thread.sleep(2000);
	 * assertFalse(elementUtil.doIsDisplayed(UsersSubmenu)
	 * ,"UsersSubmenu is displayed,Should not be displayed"); } catch
	 * (org.openqa.selenium.NoSuchElementException e) {
	 * System.out.println("Users Submenu is not displayed" ); } catch
	 * (InterruptedException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } } }
	 * 
	 * 
	 * 
	 * public void verifytheUsersSubmenuwritedataexcel(String data10) {
	 * 
	 * if(data10.equalsIgnoreCase("Yes")) { try { //
	 * elementUtil.waitForElementToBeLocated(Createbutton, 10);
	 * Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton,20)
	 * ,"The Create button displayed Successfully"); //
	 * assertTrue(elementUtil.doIsDisplayed(Createbutton),
	 * "The Create button displayed Successfully");
	 * elementUtil.clickWhenReady(Createbutton, 10); } catch
	 * (StaleElementReferenceException e) { // TODO: StaleElementhandle exception
	 * System.out.println("The Create button Clicked Successfully"); }
	 * 
	 * }else { try { // Thread.sleep(5000);
	 * assertFalse(elementUtil.doIsDisplayed(Createbutton)
	 * ,"Create button is displayed,Should not be displayed"); }
	 * catch(org.openqa.selenium.NoSuchElementException e) {
	 * System.out.println("Create button is not displayed"); } //catch
	 * (InterruptedException e) { // TODO Auto-generated catch block
	 * //e.printStackTrace(); //} catch(StaleElementReferenceException e) {
	 * assertFalse(elementUtil.doIsDisplayed(Createbutton)
	 * ,"Create button is displayed,Should not be displayed"); } } }
	 */  
		  
	//Search features Page Actions:
	/*
	 * public boolean doSearch(String productName) {
	 * elementUtil.doSendKeys(searchText, productName);
	 * elementUtil.doClick(searchButton);
	 * if(elementUtil.getElements(searchItemResult).size() > 0) { return true; }
	 * return false; }
	 */
	
}
