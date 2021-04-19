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

public class ReportCardmodulescreensPages {
	
	private WebDriver driver;
	private ElementUtils elementUtil;
	
	private By ReportCardMainmenu= By.partialLinkText("Report Card");
	private By DownloadReportCardSubmenu= By.partialLinkText("Download Report Card");
	private By WithholdResultSubmenu = By.partialLinkText("Withhold Result");
	private By Scrollbarelement=By.xpath("//div[@class='slimScrollBar']");
	private By WithholdResultSubmenulistpagetitle=By.xpath("//li[text()='Withhold Result']");
	
	
	private By Createbutton =By.xpath("//button[normalize-space()='Create']");
	private By Savebutton=By.xpath("//button[@accesskey='S']");
	private By Actionbutton=By.xpath("//button[normalize-space()='Action']");
	private By Duplicatebutton=By.xpath("//a[normalize-space()='Duplicate']");
	private By Deletebutton=By.xpath("//a[normalize-space()='Delete']");
	private By edittitle=By.xpath("//ol/li[2]");
	private By DownloadReportCardbutton=By.xpath("//span[text()='Download Report Card']");
	private By getlistpagetitle=By.xpath("//ol/li[1]");
	private By selectrecord=By.xpath("//table[@class='oe_list_content']/tbody/tr[1]");
	private By selecteditpagerecord=By.xpath("//th[@class='oe_list_record_selector']/following-sibling::td[1]");
	private By Editbutton=By.xpath("//button[@accesskey='E']");
	private By Closebutton=By.xpath("//button[text()='×']");
	private By selectrecordremove=By.xpath("//span[@class='oe_facet_remove']");
	private By visiblityofallrecords= By.xpath("//table[@class='oe_list_content']/tbody/tr");
	
	public ReportCardmodulescreensPages(WebDriver driver) {
		this.driver=driver;
		elementUtil= new ElementUtils(driver);
	}
	
	public void verifyReportCardMainMenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(ReportCardMainmenu, 10);
				  String title =elementUtil.doGetText(ReportCardMainmenu); 
				 System.out.println("title is : " + title);
//				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(ReportCardMainmenu, 10);	
				}
			  	 catch (NoSuchElementException |TimeoutException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			 elementUtil.waitForElementToBeVisibleAssert(ReportCardMainmenu, 10);
			  			String title =elementUtil.doGetText(ReportCardMainmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(ReportCardMainmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(ReportCardMainmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(ConfMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(ReportCardMainmenu, 20),ReportCardMainmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(ReportCardMainmenu, 10);
					 softAssert1.assertAll();
					    } 
			  catch (TimeoutException e) {
				// TODO: handle exception
			  }
			  catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(ReportCardMainmenu, 20),ReportCardMainmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(ReportCardMainmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((ReportCardMainmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	public void verifyDownloadReportCardSubmenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(DownloadReportCardSubmenu, 10);
				  String title =elementUtil.doGetText(DownloadReportCardSubmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(DownloadReportCardSubmenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(DownloadReportCardSubmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(DownloadReportCardSubmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(DownloadReportCardSubmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(DownloadReportCardSubmenu, 20),DownloadReportCardSubmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(DownloadReportCardSubmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(DownloadReportCardSubmenu, 20),DownloadReportCardSubmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(DownloadReportCardSubmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((DownloadReportCardSubmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyDownloadReportCardSubmenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
//				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(AssetChildmenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
//					Assert.assertEquals(elementUtil.doGetText(AssetChildmenulistpagetitle), "Asset");
//					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord1, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(DownloadReportCardbutton,20),"Download Report Card button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
	//				softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord1, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(DownloadReportCardbutton,20),"Download Report Card button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Download Report Card button not Found in the Download Report Card menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Download Report Card button not Found in the Download Report Card menu");
			}
			
			} 
		else{
			try {
//				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(AssetChildmenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
//					Assert.assertEquals(elementUtil.doGetText(AssetChildmenulistpagetitle), "Asset");
//					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord1, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(DownloadReportCardbutton,20),"Create button displayed,but Should not be displayed");	
				
			       }
			catch (StaleElementReferenceException e) {
				try {
//					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord1, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(DownloadReportCardbutton,20),"Create button displayed,Should not be displayed");	
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Download Report Card button was not displayed in the Download Report Card Menu");
				}
				catch (StaleElementReferenceException e2) {
					// TODO: handle exception
					System.out.println("Download Report Card button displayed,Should not be displayed");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Download Report Card button was not displayed in the Download Report Card Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyWithholdResultSubmenuRead(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(WithholdResultSubmenu, 10);
				  String title =elementUtil.doGetText(WithholdResultSubmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(WithholdResultSubmenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(WithholdResultSubmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(WithholdResultSubmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(WithholdResultSubmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(WithholdResultSubmenu, 20),WithholdResultSubmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(WithholdResultSubmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(WithholdResultSubmenu, 20),WithholdResultSubmenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(WithholdResultSubmenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((WithholdResultSubmenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyWithholdResultSubmenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(WithholdResultSubmenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(WithholdResultSubmenulistpagetitle), "Withhold Result");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+WithholdResultSubmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+WithholdResultSubmenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(WithholdResultSubmenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(WithholdResultSubmenulistpagetitle), "Withhold Result");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,but Should not be displayed");	
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,Should not be displayed");	
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println(Createbutton+" "+" was not displayed in the Homeworks Menu");
				}
				catch (StaleElementReferenceException e2) {
					// TODO: handle exception
					System.out.println("Create button displayed,Should not be displayed");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(Createbutton+" "+" was not displayed in the Homeworks Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyWithholdResultSubmenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(WithholdResultSubmenulistpagetitle, 3),
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
					Assert.fail("Edit button not Found in the"+" "+WithholdResultSubmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+WithholdResultSubmenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+WithholdResultSubmenu+" "+"menu");
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
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+WithholdResultSubmenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+WithholdResultSubmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+WithholdResultSubmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+WithholdResultSubmenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+WithholdResultSubmenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyWithholdResultSubmenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+WithholdResultSubmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+WithholdResultSubmenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+WithholdResultSubmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+WithholdResultSubmenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+WithholdResultSubmenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}

	
}
