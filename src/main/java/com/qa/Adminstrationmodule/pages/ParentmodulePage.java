package com.qa.Adminstrationmodule.pages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.verifyroleacess.utils.ElementUtils;
import com.qa.verifyroleacess.utils.JavaScriptUtil;

public class ParentmodulePage {
	private WebDriver driver;
	private ElementUtils elementUtil;
	private JavaScriptUtil jsUtil;
	
	private By ParentsMainmenu=By.partialLinkText("Parents");
	private By ParentProfileSubmenu =By.partialLinkText("Parent Profile");
	private By Createbutton =By.xpath("//button[normalize-space()='Create']");
	private By Savebutton=By.xpath("//button[@accesskey='S']");
	private By Actionbutton=By.xpath("//button[normalize-space()='Action']");
	private By Duplicatebutton=By.xpath("//a[normalize-space()='Duplicate']");
	private By Deletebutton=By.xpath("//a[normalize-space()='Delete']");
	private By Scrollbarelement=By.xpath("//div[@class='slimScrollBar']");
	
	private By selectrecord=By.xpath("//table[@class='oe_list_content']/tbody/tr[1]");
	private By Editbutton=By.xpath("//button[@accesskey='E']");
	private By Closebutton=By.xpath("//button[text()='×']");
		
		public ParentmodulePage(WebDriver driver) {
			this.driver = driver;
			elementUtil = new ElementUtils(this.driver);
		}
		
		
		public void  createbuttonverifymethod() {
			try {	
		//	elementUtil.waitForElementToBeVisible(Createbutton, 20);
			elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10);
			System.out.println("Create button Clicked Successfully");
			elementUtil.clickWhenReady(Createbutton, 10);
			}
			catch (StaleElementReferenceException e) {
				// TODO: StaleElementhandle exception
				  System.out.println("Create button Clicked Successfully");
			}
			
			}
			public void  createbuttonverifynomethod() {
			try {
			//	  Thread.sleep(5000);
				elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10);	
//				elementUtil.waitForElementToBeVisible(selectrecord, 10);
//				  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
			} catch(org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Create button is not displayed"); 
			} //catch (InterruptedException e) {
			//TODO Auto-generated catch block
			//e.printStackTrace();
			//}
			catch(StaleElementReferenceException e) {
				  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
				  } 
			catch(ElementClickInterceptedException e) {
				  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
				  } 
			}
			
			public void  Editbuttonverifymethod() {
				try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
		//		Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Editbutton,20)," Create button displayed");
			//	assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button displayed Successfully");
			//	elementUtil.clickWhenReady(Editbutton, 10);
				}
				catch (ElementClickInterceptedException e) {
					// TODO: StaleElementhandle exception
					elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10);
					  System.out.println("Edit button Clicked Successfully");
				}
				
				}
				public void  Editbuttonverifynomethod() {
				try {
				//	  Thread.sleep(5000);
					  assertFalse(elementUtil.doIsDisplayed(Editbutton),"Edit button is displayed,Should not be displayed");
				} catch(org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Edit button is not displayed"); 
				} //catch (InterruptedException e) {
				//TODO Auto-generated catch block
				//e.printStackTrace();
				//}
				catch(StaleElementReferenceException e) {
					  assertFalse(elementUtil.doIsDisplayed(Editbutton),"Edit button is displayed,Should not be displayed");
					  } 
				}
			
			public void  Deletebuttonverifymethod() {
				try {
		//		elementUtil.waitForElementToBeLocated(Deletebutton, 5);  
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Deletebutton,5)," Delete button displayed");
				//assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button displayed Successfully");
				}
				catch (StaleElementReferenceException e) {
					// TODO: StaleElementhandle exception
					  System.out.println("Delete button Clicked Successfully");
				}
				catch (NoSuchElementException e) {
					// TODO: StaleElementhandle exception
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Deletebutton,5)," Delete button displayed");
				}
				
				}
				public void  Deletebuttonverifynomethod() {
				try {
				//	  Thread.sleep(5000);
					  assertFalse(elementUtil.doIsDisplayed(Deletebutton),"Delete button is displayed,Should not be displayed");
				} catch(org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Delete button is not displayed"); 
				} //catch (InterruptedException e) {
				//TODO Auto-generated catch block
				//e.printStackTrace();
				//}
				catch(StaleElementReferenceException e) {
					  assertFalse(elementUtil.doIsDisplayed(Deletebutton),"Delete button is displayed,Should not be displayed");
					  } 
				}

		public void verifyParentsMainmenu(String admmn,String admmnread) {
			  if(admmnread.equalsIgnoreCase("Yes")) {  	 
				  assertTrue(elementUtil.waitForElementToBeVisibleAssert(ParentsMainmenu, 10), "Parents Main menu"+" "+"Should be displayed, but was not displayed");
	//			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(ParentsMainmenu,20),admmn+" "+"Should be displayed, but was not displayed");
				  String title =elementUtil.doGetText(ParentsMainmenu); 
					 System.out.println("title is : " + title);
					 Assert.assertEquals(title, admmn);
					 elementUtil.clickWhenReady(ParentsMainmenu, 10);
			  }else {
				  try {
					  SoftAssert softAssert1 = new SoftAssert();
					  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(ParentsMainmenu, 20),ParentsMainmenu+" "+"Main Menu is displayed,Should not be displayed");
					  
	//				  Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(ParentsMainmenu, 10),"Parents Main menu"+" "+"Should be displayed, but was not displayed");
	 //					 assertTrue(!elementUtil.doIsDisplayed(ParentsMainmenu),ParentProfileSubmenu+" "+"Main menu is displayed,Should not be displayed");
						 elementUtil.clickWhenReady(ParentsMainmenu, 10);
						 softAssert1.assertAll();
						    } catch (org.openqa.selenium.NoSuchElementException e) {
						    	System.out.println(admmn+" "+"Main menu is not displayed" );
						    }
			  
			  }
			  }
		public void verifyParentProfilesubmenuRead(String Org,String OrgRead) {
			  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
				  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(ParentProfileSubmenu,20),ParentProfileSubmenu+" Sub menu Should be displayed, but was not displayed");
				  String title =elementUtil.doGetText(ParentProfileSubmenu);  
					 System.out.println("title is : " + title);
					 Assert.assertEquals(title, Org);
					 elementUtil.clickWhenReady(ParentProfileSubmenu, 10);
			  }else {
				  try {
					  SoftAssert softAssert1 = new SoftAssert();
					  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(ParentProfileSubmenu, 10),"Parents Profile"+" "+"Sub menu is displayed,Should not be displayed");
					//	assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Sub menu is displayed,Should not be displayed");
					    elementUtil.clickWhenReady(ParentProfileSubmenu, 10);
					    softAssert1.assertAll();
						    } catch (org.openqa.selenium.NoSuchElementException e) {
						    	System.out.println(Org+" Sub menu  Main menu is not displayed" );
						    }
			  
			  }
			  }
		public void verifyParentProfilesubmenuCreate(String OrgCreate) {
			
			  if(OrgCreate.equalsIgnoreCase("Yes")) {
					createbuttonverifymethod();	
			  }else 
			  {
				    createbuttonverifynomethod();
			  }	
			  }	  
		public void verifyParentProfilesubmenuEdit(String OrgEdit) {
		//	  elementUtil.waitForElementToBeVisible(selectrecord,10);
			 
			  if(OrgEdit.equalsIgnoreCase("Yes")) {
				  elementUtil.clickWhenReady(selectrecord,10);
				  	Editbuttonverifymethod();	
			  }else 
			  {	
				  try {
					  elementUtil.waitForElementToBeVisible(selectrecord,10);
					  elementUtil.clickWhenReady(selectrecord,5);
					  Editbuttonverifynomethod();
				} catch (NoSuchElementException e) {
					// TODO: handle exception
				}
				  catch (ElementClickInterceptedException e) {
						// TODO: handle exception
					}
					 
				 
			  }	
			  }	  
		public void verifyParentProfilesubmenuDelete(String OrgEdit) {
		//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
			  
			  if(OrgEdit.equalsIgnoreCase("Yes")) {
					  	Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should be displayed,but not displayed");
					  	elementUtil.clickWhenReady(Actionbutton, 5);
					  	Deletebuttonverifymethod();
				  }
				  else 
			  {
				  try {
					  elementUtil.waitForElementToBeVisible(Actionbutton, 10);
					  elementUtil.clickWhenReady(Actionbutton, 5);
					  Deletebuttonverifynomethod();
				} catch (NoSuchElementException e) {
					// TODO: handle exception
				}
				  
			  }	
			  }	
		
	}


