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

public class ConfigurationsmodulescreensPages {
	
	private WebDriver driver;
	private ElementUtils elementUtil;
	
	private By ConfigurationsMainmenu= By.linkText("Configurations");
	private By FeesManagementSubmenu= By.linkText("Fees Management");
	private By FeesHeadChildmenu= By.linkText("Fees Head");
	private By FeesTermChildmenu= By.linkText("Fees Term");
	private By FeesGroupChildmenu= By.linkText("Fees Group");
	private By FeesStructureChildmenu= By.linkText("Fees Structure");
	private By FeesConcessionConfigurationChildmenu= By.linkText("Fees Concession Configuration");
	private By BulkDiscountConfigurationChildmenu= By.linkText("Bulk Discount Configuration");
	private By SiblingFeesConcessionChildmenu= By.linkText("Sibling Fees Concession");
	private By GenderOtherFeesConcessionChildmenu= By.linkText("Gender/ Other Fees Concession");
	private By ChequeBounceReasonChildmenu= By.linkText("Cheque Bounce Reason");
	private By BankMasterChildmenu= By.linkText("Bank Master");
	
	private By Scrollbarelement=By.xpath("//div[@class='slimScrollBar']");
	private By FeesHeadChildmenulistpagetitle=By.xpath("//li[text()='Fees Head']");
	private By FeesTermChildmenulistpagetitle=By.xpath("//li[text()='Fees Term']");
	private By FeesGroupChildmenulistpagetitle=By.xpath("//li[text()='Fees Group']");
	private By FeesStructureChildmenulistpagetitle=By.xpath("//li[text()='Fees Structure']");
	private By FeesConcessionConfigurationChildmenulistpagetitle=By.xpath("//li[text()='Fees Concession Configuration']");
	private By BulkDiscountConfigurationChildmenulistpagetitle=By.xpath("//li[text()='Bulk Discount Configuration']");
	private By SiblingFeesConcessionChildmenulistpagetitle=By.xpath("//li[text()='Sibling Fees Concession Configuration']");
	private By GenderOtherFeesConcessionChildmenulistpagetitle=By.xpath("//li[text()='Gender/ Other Fees Concession']");
	private By ChequeBounceReasonChildmenulistpagetitle=By.xpath("//li[text()='Cheque Bounce Reason']");
	private By BankMasterChildmenulistpagetitle=By.xpath("//li[text()='Bank Master']");
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
	
	public ConfigurationsmodulescreensPages(WebDriver driver) {
		this.driver=driver;
		elementUtil= new ElementUtils(driver);
	}
	
	public void verifyConfigurationsMainMenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(ConfigurationsMainmenu, 10);
				  String title =elementUtil.doGetText(ConfigurationsMainmenu); 
				 System.out.println("title is : " + title);
//				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(ConfigurationsMainmenu, 10);	
				}
			  	 catch (NoSuchElementException |TimeoutException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			 elementUtil.waitForElementToBeVisibleAssert(ConfigurationsMainmenu, 10);
			  			String title =elementUtil.doGetText(ConfigurationsMainmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(ConfigurationsMainmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(ConfigurationsMainmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(ConfMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(ConfigurationsMainmenu, 20),ConfigurationsMainmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(ConfigurationsMainmenu, 10);
					 softAssert1.assertAll();
					    } 
			  catch (TimeoutException e) {
				// TODO: handle exception
			  }
			  catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(ConfigurationsMainmenu, 20),ConfigurationsMainmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(ConfigurationsMainmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((ConfigurationsMainmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyFeesManagementSubmenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(FeesManagementSubmenu, 10);
				  String title =elementUtil.doGetText(FeesManagementSubmenu); 
				 System.out.println("title is : " + title);
//				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(FeesManagementSubmenu, 10);	
				}
			  	 catch (NoSuchElementException |TimeoutException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			 elementUtil.waitForElementToBeVisibleAssert(FeesManagementSubmenu, 10);
			  			String title =elementUtil.doGetText(FeesManagementSubmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(FeesManagementSubmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(FeesManagementSubmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(ConfMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(FeesManagementSubmenu, 20),FeesManagementSubmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(FeesManagementSubmenu, 10);
					 softAssert1.assertAll();
					    } 
			  catch (TimeoutException e) {
				// TODO: handle exception
			  }
			  catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(FeesManagementSubmenu, 20),FeesManagementSubmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(FeesManagementSubmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((FeesManagementSubmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }

	public void verifyFeesHeadChildmenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(FeesHeadChildmenu, 10);
				  String title =elementUtil.doGetText(FeesHeadChildmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(FeesHeadChildmenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(FeesHeadChildmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(FeesHeadChildmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(FeesHeadChildmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(FeesHeadChildmenu, 20),FeesHeadChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(FeesHeadChildmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(FeesHeadChildmenu, 20),FeesHeadChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(FeesHeadChildmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((FeesHeadChildmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyFeesHeadChildmenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(FeesHeadChildmenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(FeesHeadChildmenulistpagetitle), "Fees Head");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+FeesHeadChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+FeesHeadChildmenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(FeesHeadChildmenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(FeesHeadChildmenulistpagetitle), "Fees Head");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,but Should not be displayed");	
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,Should not be displayed");	
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println(Createbutton+" "+" was not displayed in the Fees Head Menu");
				}
				catch (StaleElementReferenceException e2) {
					// TODO: handle exception
					System.out.println("Create button displayed,Should not be displayed");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(Createbutton+" "+" was not displayed in the Fees Head Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyFeesHeadChildmenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(FeesHeadChildmenulistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selecteditpagerecord);
				elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
				Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), t4);
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+FeesHeadChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+FeesHeadChildmenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+FeesHeadChildmenu+" "+"menu");
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+FeesHeadChildmenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+FeesHeadChildmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+FeesHeadChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+FeesHeadChildmenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+FeesHeadChildmenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyFeesHeadChildmenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+FeesHeadChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+FeesHeadChildmenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+FeesHeadChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+FeesHeadChildmenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+FeesHeadChildmenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyFeesTermChildmenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(FeesTermChildmenu, 10);
				  String title =elementUtil.doGetText(FeesTermChildmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(FeesTermChildmenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(FeesTermChildmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(FeesTermChildmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(FeesTermChildmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(FeesTermChildmenu, 20),FeesTermChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(FeesTermChildmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(FeesTermChildmenu, 20),FeesTermChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(FeesTermChildmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((FeesTermChildmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyFeesTermChildmenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(FeesTermChildmenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(FeesTermChildmenulistpagetitle), "Fees Term");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+FeesTermChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+FeesTermChildmenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(FeesTermChildmenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(FeesTermChildmenulistpagetitle), "Fees Term");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,but Should not be displayed");	
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,Should not be displayed");	
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println(Createbutton+" "+" was not displayed in the Fees Term Menu");
				}
				catch (StaleElementReferenceException e2) {
					// TODO: handle exception
					System.out.println("Create button displayed,Should not be displayed");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(Createbutton+" "+" was not displayed in the Fees Head Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyFeesTermChildmenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(FeesTermChildmenulistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selecteditpagerecord);
				elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
				Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), t4);
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+FeesTermChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+FeesTermChildmenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+FeesTermChildmenu+" "+"menu");
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+FeesTermChildmenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+FeesTermChildmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+FeesTermChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+FeesTermChildmenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+FeesTermChildmenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyFeesTermChildmenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+FeesTermChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+FeesTermChildmenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+FeesTermChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+FeesTermChildmenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+FeesTermChildmenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}

	public void verifyFeesGroupChildmenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(FeesGroupChildmenu, 10);
				  String title =elementUtil.doGetText(FeesGroupChildmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(FeesGroupChildmenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(FeesGroupChildmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(FeesGroupChildmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(FeesGroupChildmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(FeesGroupChildmenu, 20),FeesGroupChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(FeesGroupChildmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(FeesGroupChildmenu, 20),FeesGroupChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(FeesGroupChildmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((FeesGroupChildmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyFeesGroupChildmenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(FeesGroupChildmenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(FeesGroupChildmenulistpagetitle), "Fees Group");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+FeesGroupChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+FeesGroupChildmenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(FeesGroupChildmenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(FeesGroupChildmenulistpagetitle), "Fees Group");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,but Should not be displayed");	
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,Should not be displayed");	
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println(Createbutton+" "+" was not displayed in the Fees Term Menu");
				}
				catch (StaleElementReferenceException e2) {
					// TODO: handle exception
					System.out.println("Create button displayed,Should not be displayed");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(Createbutton+" "+" was not displayed in the Fees Head Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyFeesGroupChildmenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(FeesGroupChildmenulistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selecteditpagerecord);
				elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
				Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), t4);
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+FeesGroupChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+FeesGroupChildmenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+FeesGroupChildmenu+" "+"menu");
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+FeesGroupChildmenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+FeesGroupChildmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+FeesGroupChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+FeesGroupChildmenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+FeesGroupChildmenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyFeesGroupChildmenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+FeesGroupChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+FeesGroupChildmenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+FeesGroupChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+FeesGroupChildmenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+FeesGroupChildmenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyFeesStructureChildmenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(FeesStructureChildmenu, 10);
				  String title =elementUtil.doGetText(FeesStructureChildmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(FeesStructureChildmenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(FeesStructureChildmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(FeesStructureChildmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(FeesStructureChildmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(FeesStructureChildmenu, 20),FeesStructureChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(FeesStructureChildmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(FeesStructureChildmenu, 20),FeesStructureChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(FeesStructureChildmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((FeesStructureChildmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyFeesStructureChildmenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(FeesStructureChildmenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(FeesStructureChildmenulistpagetitle), "Fees Structure");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+FeesStructureChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+FeesStructureChildmenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(FeesStructureChildmenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(FeesStructureChildmenulistpagetitle), "Fees Structure");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,but Should not be displayed");	
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,Should not be displayed");	
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println(Createbutton+" "+" was not displayed in the Fees Term Menu");
				}
				catch (StaleElementReferenceException e2) {
					// TODO: handle exception
					System.out.println("Create button displayed,Should not be displayed");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(Createbutton+" "+" was not displayed in the Fees Head Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyFeesStructureChildmenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(FeesStructureChildmenulistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selecteditpagerecord);
				elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
				Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), t4);
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+FeesStructureChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+FeesStructureChildmenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+FeesStructureChildmenu+" "+"menu");
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+FeesStructureChildmenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+FeesStructureChildmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+FeesStructureChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+FeesStructureChildmenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+FeesStructureChildmenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyFeesStructureChildmenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+FeesStructureChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+FeesStructureChildmenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+FeesStructureChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+FeesStructureChildmenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+FeesStructureChildmenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}

	public void verifyFeesConcessionConfigurationChildmenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(FeesConcessionConfigurationChildmenu, 10);
				  String title =elementUtil.doGetText(FeesConcessionConfigurationChildmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(FeesConcessionConfigurationChildmenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(FeesConcessionConfigurationChildmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(FeesConcessionConfigurationChildmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(FeesConcessionConfigurationChildmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(FeesConcessionConfigurationChildmenu, 20),FeesConcessionConfigurationChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(FeesConcessionConfigurationChildmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(FeesConcessionConfigurationChildmenu, 20),FeesConcessionConfigurationChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(FeesConcessionConfigurationChildmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((FeesConcessionConfigurationChildmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyFeesConcessionConfigurationChildmenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(FeesConcessionConfigurationChildmenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(FeesConcessionConfigurationChildmenulistpagetitle), "Fees Concession Configuration");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+FeesConcessionConfigurationChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+FeesConcessionConfigurationChildmenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(FeesConcessionConfigurationChildmenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(FeesConcessionConfigurationChildmenulistpagetitle), "Fees Concession Configuration");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,but Should not be displayed");	
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,Should not be displayed");	
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println(Createbutton+" "+" was not displayed in the Fees Term Menu");
				}
				catch (StaleElementReferenceException e2) {
					// TODO: handle exception
					System.out.println("Create button displayed,Should not be displayed");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(Createbutton+" "+" was not displayed in the Fees Head Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyFeesConcessionConfigurationChildmenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(FeesConcessionConfigurationChildmenulistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selecteditpagerecord);
				elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
				Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), t4);
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+FeesConcessionConfigurationChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+FeesConcessionConfigurationChildmenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+FeesConcessionConfigurationChildmenu+" "+"menu");
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+FeesConcessionConfigurationChildmenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+FeesConcessionConfigurationChildmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+FeesConcessionConfigurationChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+FeesConcessionConfigurationChildmenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+FeesConcessionConfigurationChildmenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyFeesConcessionConfigurationChildmenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+FeesConcessionConfigurationChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+FeesConcessionConfigurationChildmenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+FeesConcessionConfigurationChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+FeesConcessionConfigurationChildmenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+FeesConcessionConfigurationChildmenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}

	public void verifyBulkDiscountConfigurationChildmenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(BulkDiscountConfigurationChildmenu, 10);
				  String title =elementUtil.doGetText(BulkDiscountConfigurationChildmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(BulkDiscountConfigurationChildmenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(BulkDiscountConfigurationChildmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(BulkDiscountConfigurationChildmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(BulkDiscountConfigurationChildmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(BulkDiscountConfigurationChildmenu, 20),BulkDiscountConfigurationChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(BulkDiscountConfigurationChildmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(BulkDiscountConfigurationChildmenu, 20),BulkDiscountConfigurationChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(BulkDiscountConfigurationChildmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((BulkDiscountConfigurationChildmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyBulkDiscountConfigurationChildmenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(BulkDiscountConfigurationChildmenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(BulkDiscountConfigurationChildmenulistpagetitle), "Bulk Discount Configuration");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+BulkDiscountConfigurationChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+BulkDiscountConfigurationChildmenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(BulkDiscountConfigurationChildmenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(BulkDiscountConfigurationChildmenulistpagetitle), "Bulk Discount Configuration");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,but Should not be displayed");	
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,Should not be displayed");	
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println(Createbutton+" "+" was not displayed in the Fees Term Menu");
				}
				catch (StaleElementReferenceException e2) {
					// TODO: handle exception
					System.out.println("Create button displayed,Should not be displayed");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(Createbutton+" "+" was not displayed in the Fees Head Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyBulkDiscountConfigurationChildmenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(BulkDiscountConfigurationChildmenulistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selecteditpagerecord);
				elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
				Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), t4);
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+BulkDiscountConfigurationChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+BulkDiscountConfigurationChildmenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+BulkDiscountConfigurationChildmenu+" "+"menu");
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+BulkDiscountConfigurationChildmenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+BulkDiscountConfigurationChildmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+BulkDiscountConfigurationChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+BulkDiscountConfigurationChildmenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+BulkDiscountConfigurationChildmenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyBulkDiscountConfigurationChildmenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+BulkDiscountConfigurationChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+BulkDiscountConfigurationChildmenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+BulkDiscountConfigurationChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+BulkDiscountConfigurationChildmenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+BulkDiscountConfigurationChildmenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifySiblingFeesConcessionChildmenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(SiblingFeesConcessionChildmenu, 10);
				  String title =elementUtil.doGetText(SiblingFeesConcessionChildmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(SiblingFeesConcessionChildmenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(SiblingFeesConcessionChildmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(SiblingFeesConcessionChildmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(SiblingFeesConcessionChildmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(SiblingFeesConcessionChildmenu, 20),SiblingFeesConcessionChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(SiblingFeesConcessionChildmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(SiblingFeesConcessionChildmenu, 20),SiblingFeesConcessionChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(SiblingFeesConcessionChildmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((SiblingFeesConcessionChildmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifySiblingFeesConcessionChildmenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(SiblingFeesConcessionChildmenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(SiblingFeesConcessionChildmenulistpagetitle), "Sibling Fees Concession Configuration");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+SiblingFeesConcessionChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+SiblingFeesConcessionChildmenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(SiblingFeesConcessionChildmenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(SiblingFeesConcessionChildmenulistpagetitle), "Sibling Fees Concession Configuration");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,but Should not be displayed");	
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,Should not be displayed");	
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println(Createbutton+" "+" was not displayed in the Fees Term Menu");
				}
				catch (StaleElementReferenceException e2) {
					// TODO: handle exception
					System.out.println("Create button displayed,Should not be displayed");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(Createbutton+" "+" was not displayed in the Fees Head Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifySiblingFeesConcessionChildmenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(SiblingFeesConcessionChildmenulistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selecteditpagerecord);
				elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
				Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), t4);
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+SiblingFeesConcessionChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+SiblingFeesConcessionChildmenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+SiblingFeesConcessionChildmenu+" "+"menu");
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+SiblingFeesConcessionChildmenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+SiblingFeesConcessionChildmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+SiblingFeesConcessionChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+SiblingFeesConcessionChildmenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+SiblingFeesConcessionChildmenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifySiblingFeesConcessionChildmenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+SiblingFeesConcessionChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+SiblingFeesConcessionChildmenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+SiblingFeesConcessionChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+SiblingFeesConcessionChildmenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+SiblingFeesConcessionChildmenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyGenderOtherFeesConcessionChildmenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(GenderOtherFeesConcessionChildmenu, 10);
				  String title =elementUtil.doGetText(GenderOtherFeesConcessionChildmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(GenderOtherFeesConcessionChildmenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(GenderOtherFeesConcessionChildmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(GenderOtherFeesConcessionChildmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(GenderOtherFeesConcessionChildmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(GenderOtherFeesConcessionChildmenu, 20),GenderOtherFeesConcessionChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(GenderOtherFeesConcessionChildmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(GenderOtherFeesConcessionChildmenu, 20),GenderOtherFeesConcessionChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(GenderOtherFeesConcessionChildmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((GenderOtherFeesConcessionChildmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyGenderOtherFeesConcessionChildmenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(GenderOtherFeesConcessionChildmenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(GenderOtherFeesConcessionChildmenulistpagetitle), "Gender/ Other Fees Concession");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+GenderOtherFeesConcessionChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+GenderOtherFeesConcessionChildmenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(GenderOtherFeesConcessionChildmenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(GenderOtherFeesConcessionChildmenulistpagetitle), "Gender/ Other Fees Concession");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,but Should not be displayed");	
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,Should not be displayed");	
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println(Createbutton+" "+" was not displayed in the Fees Term Menu");
				}
				catch (StaleElementReferenceException e2) {
					// TODO: handle exception
					System.out.println("Create button displayed,Should not be displayed");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(Createbutton+" "+" was not displayed in the Fees Head Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyGenderOtherFeesConcessionChildmenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(GenderOtherFeesConcessionChildmenulistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selecteditpagerecord);
				elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
				Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), t4);
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+GenderOtherFeesConcessionChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+GenderOtherFeesConcessionChildmenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+GenderOtherFeesConcessionChildmenu+" "+"menu");
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+GenderOtherFeesConcessionChildmenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+GenderOtherFeesConcessionChildmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+GenderOtherFeesConcessionChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+GenderOtherFeesConcessionChildmenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+GenderOtherFeesConcessionChildmenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyGenderOtherFeesConcessionChildmenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+GenderOtherFeesConcessionChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+GenderOtherFeesConcessionChildmenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+GenderOtherFeesConcessionChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+GenderOtherFeesConcessionChildmenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+GenderOtherFeesConcessionChildmenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}

	public void verifyChequeBounceReasonChildmenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(ChequeBounceReasonChildmenu, 10);
				  String title =elementUtil.doGetText(ChequeBounceReasonChildmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(ChequeBounceReasonChildmenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(ChequeBounceReasonChildmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(ChequeBounceReasonChildmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(ChequeBounceReasonChildmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(ChequeBounceReasonChildmenu, 20),ChequeBounceReasonChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(ChequeBounceReasonChildmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(ChequeBounceReasonChildmenu, 20),ChequeBounceReasonChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(ChequeBounceReasonChildmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((ChequeBounceReasonChildmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyChequeBounceReasonChildmenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(ChequeBounceReasonChildmenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(ChequeBounceReasonChildmenulistpagetitle), "Cheque Bounce Reason");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+ChequeBounceReasonChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+ChequeBounceReasonChildmenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(ChequeBounceReasonChildmenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(ChequeBounceReasonChildmenulistpagetitle), "Cheque Bounce Reason");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,but Should not be displayed");	
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,Should not be displayed");	
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println(Createbutton+" "+" was not displayed in the Fees Term Menu");
				}
				catch (StaleElementReferenceException e2) {
					// TODO: handle exception
					System.out.println("Create button displayed,Should not be displayed");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(Createbutton+" "+" was not displayed in the Fees Head Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyChequeBounceReasonChildmenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(ChequeBounceReasonChildmenulistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selecteditpagerecord);
				elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
				Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), t4);
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+ChequeBounceReasonChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+ChequeBounceReasonChildmenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+ChequeBounceReasonChildmenu+" "+"menu");
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+ChequeBounceReasonChildmenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+ChequeBounceReasonChildmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+ChequeBounceReasonChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+ChequeBounceReasonChildmenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+ChequeBounceReasonChildmenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyChequeBounceReasonChildmenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+ChequeBounceReasonChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+ChequeBounceReasonChildmenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+ChequeBounceReasonChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+ChequeBounceReasonChildmenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+ChequeBounceReasonChildmenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}

	public void verifyBankMasterChildmenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(BankMasterChildmenu, 10);
				  String title =elementUtil.doGetText(BankMasterChildmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(BankMasterChildmenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(BankMasterChildmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(BankMasterChildmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(BankMasterChildmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(BankMasterChildmenu, 20),BankMasterChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(BankMasterChildmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(BankMasterChildmenu, 20),BankMasterChildmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(BankMasterChildmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((BankMasterChildmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyBankMasterChildmenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(BankMasterChildmenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(BankMasterChildmenulistpagetitle), "Bank Master");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+BankMasterChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+BankMasterChildmenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(BankMasterChildmenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(BankMasterChildmenulistpagetitle), "Bank Master");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,but Should not be displayed");	
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,Should not be displayed");	
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println(Createbutton+" "+" was not displayed in the Fees Term Menu");
				}
				catch (StaleElementReferenceException e2) {
					// TODO: handle exception
					System.out.println("Create button displayed,Should not be displayed");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(Createbutton+" "+" was not displayed in the Fees Head Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyBankMasterChildmenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(BankMasterChildmenulistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selecteditpagerecord);
				elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
				Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), t4);
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+BankMasterChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+BankMasterChildmenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+BankMasterChildmenu+" "+"menu");
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
					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+BankMasterChildmenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+BankMasterChildmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+BankMasterChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+BankMasterChildmenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+BankMasterChildmenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyBankMasterChildmenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+BankMasterChildmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+BankMasterChildmenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+BankMasterChildmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+BankMasterChildmenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+BankMasterChildmenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}


	
}
