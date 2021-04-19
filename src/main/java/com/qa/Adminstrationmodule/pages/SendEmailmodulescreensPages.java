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

public class SendEmailmodulescreensPages {

	private WebDriver driver;
	private ElementUtils elementUtil;
	
	private By SendEmailMainmenu= By.partialLinkText("Send Email");
	private By SendEmailSubMenu= By.xpath("//a[@class='oe_menu_leaf'][normalize-space()='Send Email']");	
	private By SendEmailSubMenulistpagetitle=By.xpath("//li[text()='Send Email']");

	
	
	private By Scrollbarelement=By.xpath("//div[@class='slimScrollBar']");
	private By Createbutton =By.xpath("//button[normalize-space()='Create']");
	private By Savebutton=By.xpath("//button[@accesskey='S']");
	private By Actionbutton=By.xpath("//button[normalize-space()='Action']");
	private By Duplicatebutton=By.xpath("//a[normalize-space()='Duplicate']");
	private By Deletebutton=By.xpath("//a[normalize-space()='Delete']");
	private By edittitle=By.xpath("//ol/li[2]");
	private By getlistpagetitle=By.xpath("//ol/li[1]");
	
	
	private By selectrecord=By.xpath("//table[@class='oe_list_content']/tbody/tr[1]");
	private By selecteditpagerecord=By.xpath("//th[@class='oe_list_record_selector']/following-sibling::td[1]");
	private By Editbutton=By.xpath("//button[@accesskey='E']");
	private By Closebutton=By.xpath("//button[text()='×']");
	private By selectrecordremove=By.xpath("//span[@class='oe_facet_remove']");
	private By visiblityofallrecords= By.xpath("//table[@class='oe_list_content']/tbody/tr");
	
	public SendEmailmodulescreensPages(WebDriver driver) {
		this.driver=driver;
		elementUtil= new ElementUtils(driver);
	}
	
	public void verifySendEmailMainMenu(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(SendEmailMainmenu, 10);
				  String title =elementUtil.doGetText(SendEmailMainmenu); 
				 System.out.println("title is : " + title);
//				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(SendEmailMainmenu, 10);	
				}
			  	 catch (NoSuchElementException |TimeoutException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			 elementUtil.waitForElementToBeVisibleAssert(SendEmailMainmenu, 10);
			  			String title =elementUtil.doGetText(SendEmailMainmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(SendEmailMainmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(SendEmailMainmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(ConfMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(SendEmailMainmenu, 20),SendEmailMainmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(SendEmailMainmenu, 10);
					 softAssert1.assertAll();
					    } 
			  catch (TimeoutException e) {
				// TODO: handle exception
			  }
			  catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(SendEmailMainmenu, 20),SendEmailMainmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(SendEmailMainmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((SendEmailMainmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	public void verifySendEmailSubMenu(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(SendEmailSubMenu, 10);
				  String title =elementUtil.doGetText(SendEmailSubMenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(SendEmailSubMenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(SendEmailSubMenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(SendEmailSubMenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(SendEmailSubMenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(SendEmailSubMenu, 20),SendEmailSubMenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(SendEmailSubMenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(SendEmailSubMenu, 20),SendEmailSubMenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(SendEmailSubMenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((SendEmailSubMenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifySendEmailSubMenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(SendEmailSubMenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(SendEmailSubMenulistpagetitle), "Send Email");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+SendEmailSubMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+SendEmailSubMenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(SendEmailSubMenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(SendEmailSubMenulistpagetitle), "Send Email");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,but Should not be displayed");	
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,Should not be displayed");	
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println(Createbutton+" "+" was not displayed in the SendEmail Menu");
				}
				catch (StaleElementReferenceException e2) {
					// TODO: handle exception
					System.out.println("Create button displayed,Should not be displayed");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(Createbutton+" "+" was not displayed in the SendEmail Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifySendEmailSubMenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(SendEmailSubMenulistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selecteditpagerecord);
				elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
//				Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 30));
			       }
			catch (StaleElementReferenceException e) {
				// TODO: handle exception
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 30));
			}
			catch (ElementClickInterceptedException e) {
				try {
					String t4=elementUtil.doGetText(selecteditpagerecord);
					elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
					elementUtil.clickWhenReady(selectrecord, 3);
					softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
//					Assert.assertEquals(elementUtil.doGetText(edittitle), t4);
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+SendEmailSubMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+SendEmailSubMenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+SendEmailSubMenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 3),
						getlistpagetitle + " List Page title Should be displayed, but was not displayed");
				String selectrecordtitle=	elementUtil.doGetText(selecteditpagerecord);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
//					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+SendEmailSubMenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+SendEmailSubMenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+SendEmailSubMenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+SendEmailSubMenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+SendEmailSubMenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifySendEmailSubMenuDelete(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Actionbutton, 3),
						"Action button Should be displayed, but was not displayed");
				elementUtil.clickWhenReady(Actionbutton, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Deletebutton,5)," Delete button displayed");
			       }
			catch (ElementClickInterceptedException e) {
				try {
					elementUtil.clickWhenReady(Actionbutton, 3);
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Deletebutton,5)," Delete button displayed");
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Action/Delete button not Found in the"+" "+SendEmailSubMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+SendEmailSubMenu+" "+"menu");
			}
			
			} 
		else{
			try {
				elementUtil.verifyelementIsDisplayed(Actionbutton, 3);
				elementUtil.clickWhenReady(Actionbutton, 3);
				Assert.assertFalse(elementUtil.verifyelementIsDisplayed(Deletebutton,5)," Delete button Should not be displayed, but was displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertFalse(elementUtil.verifyelementIsDisplayed(Deletebutton,5)," Delete button Should not be displayed, but was displayed");
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Action/Delete button was not displayed in the"+" "+SendEmailSubMenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+SendEmailSubMenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+SendEmailSubMenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}
}
