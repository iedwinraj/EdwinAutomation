package com.qa.Adminstrationmodule.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.verifyroleacess.utils.ElementUtils;
import com.qa.verifyroleacess.utils.JavaScriptUtil;

public class CircularmodulescreensPages  {
	private WebDriver driver;
	private ElementUtils elementUtil;
	private JavaScriptUtil JavaScriptUtils;
	
	
	private By Menucount=By.xpath("(//ul[@id='side-menu']/li)[19]");
//	private By CircularMainmenu=By.xpath("(//ul[@id='side-menu']/li)[19]");
	private By CircularMainmenu= By.partialLinkText("Circular");
	private By HomeWorksmenu= By.partialLinkText("Home Works");
	private By AnnouncementsMenu= By.partialLinkText("Announcements");
	private By DiaryMenu= By.partialLinkText("Diary");
	private By Newslettermenu= By.partialLinkText("Newsletter");
	private By ConfMenu= By.xpath("//span[normalize-space() ='Circular']//following::a[normalize-space() ='Configuration']");
//	private By ConfMenu= By.partialLinkText("Configuration");
	private By WorksheetMenu=By.partialLinkText("Worksheet");
	private By GroupMenu= By.partialLinkText("Group");
	
	private By Menutitle=By.xpath("//th[@class='oe_list_record_selector']/following-sibling::td");
	
	private By ANMenutitle=By.xpath("//th[@class='oe_list_record_selector']/following-sibling::td[3]");
	private By HomeWorkslistpagetitle=By.xpath("//li[text()='Homework']");
	private By Announcementslistpagetitle=By.xpath("//li[text()='Announcements']");
	private By Diarylistpagetitle=By.xpath("//li[text()='Diary']");
	private By WorksheetMenulistpagetitle=By.xpath("//li[text()='Worksheet']");
	private By Newslettermenulistpagetitle=By.xpath("//li[text()='Newsletter']");
	private By GroupMenulistpagetitle=By.xpath("//li[text()='SMS Groups']");

	
	private By edittitle=By.xpath("//ol/li[2]");
	private By getlistpagetitle=By.xpath("//ol/li[1]");
	private By IncidentMainmenu= By.partialLinkText("Incident");
	private By IncidentReportingmenu= By.partialLinkText("Incident Reporting");
	private By Scrollbarelement=By.xpath("//div[@class='slimScrollBar']");
	
	
	private By Createbutton =By.xpath("//button[normalize-space()='Create']");
	private By Savebutton=By.xpath("//button[@accesskey='S']");
	private By Actionbutton=By.xpath("//button[normalize-space()='Action']");
	private By Duplicatebutton=By.xpath("//a[normalize-space()='Duplicate']");
	private By Deletebutton=By.xpath("//a[normalize-space()='Delete']");
	
	
	private By selectrecord=By.xpath("//table[@class='oe_list_content']/tbody/tr[1]");
	private By Editbutton=By.xpath("//button[@accesskey='E']");
	private By Closebutton=By.xpath("//button[text()='×']");
	private By selectrecordremove=By.xpath("//span[@class='oe_facet_remove']");
	private By visiblityofallrecords= By.xpath("//table[@class='oe_list_content']/tbody/tr");
	
	
	public CircularmodulescreensPages (WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtils(this.driver);
		JavaScriptUtils = new JavaScriptUtil(this.driver);
	}
	public void menucount() {
	List<WebElement> a1=	elementUtil.getElements(Menucount);
	System.out.println(a1.size());
	
	}
	public void verifyCircularMainmenu(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(CircularMainmenu, 10);
				  String title =elementUtil.doGetText(CircularMainmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(CircularMainmenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.getcoordinates(Scrollbarelement);
//			  			elementUtil.doMoveToElement(Scrollbarelement, CircularMainmenu);
			  			String title =elementUtil.doGetText(CircularMainmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(CircularMainmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(CircularMainmenu+" "+"Main Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(IncidentMainmenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(CircularMainmenu, 20),CircularMainmenu+" "+"Main Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(CircularMainmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println((CircularMainmenu+" "+"Main menu is not displayed"));
					    }
		  
		  }
		  }
	public void verifyHWmenu(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(HomeWorksmenu, 10);
				  String title =elementUtil.doGetText(HomeWorksmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(HomeWorksmenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(HomeWorksmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(HomeWorksmenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(HomeWorksmenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(IncidentMainmenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(HomeWorksmenu, 20),HomeWorksmenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(HomeWorksmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(HomeWorksmenu, 20),HomeWorksmenu+" "+"Sub Menu is displayed,Should not be displayed");
									 elementUtil.clickWhenReady(HomeWorksmenu, 10);
									 softAssert1.assertAll();
							} catch (Exception e2) {
								System.out.println((HomeWorksmenu+" "+"Sub menu is not displayed"));
							}
					    }
		  
		  }
		  }
	
	public void verifyHWMenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(HomeWorkslistpagetitle, 10),"The list Page title was not displayed");
				
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),
//						getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(HomeWorkslistpagetitle), "Homework");
					elementUtil.clickWhenReady(selectrecordremove, 5);
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+HomeWorksmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+HomeWorksmenu+" "+"menu");
			}
			
			} 
		else{
			try {
				try {
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(HomeWorkslistpagetitle, 10),"The list Page title was not displayed");
				} catch (NoSuchElementException e) {
					// TODO: handle exception
					System.out.println(admmn);
				}
				

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),
//						getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
				System.out.println(elementUtil.doGetText(HomeWorkslistpagetitle));
					Assert.assertEquals(elementUtil.doGetText(HomeWorkslistpagetitle), "Homework");
					elementUtil.clickWhenReady(selectrecordremove, 5);
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
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(Createbutton+" "+" was not displayed in the Homeworks Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyHWMenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(edittitle), "Homework");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
			       }
			catch (ElementClickInterceptedException e) {
				try {
					softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertEquals(elementUtil.doGetText(edittitle), "Homework");
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+HomeWorksmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+HomeWorksmenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+HomeWorksmenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 3),
						getlistpagetitle + " List Page title Should be displayed, but was not displayed");
				String selectrecordtitle=	elementUtil.doGetText(Menutitle);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(edittitle), "Homework");
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+HomeWorksmenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+HomeWorksmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+HomeWorksmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+HomeWorksmenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+HomeWorksmenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyHWMenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+HomeWorksmenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+HomeWorksmenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+HomeWorksmenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+HomeWorksmenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+HomeWorksmenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	
	public void verifyANTmenu(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(AnnouncementsMenu, 10);
				  String title =elementUtil.doGetText(AnnouncementsMenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(AnnouncementsMenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(AnnouncementsMenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(AnnouncementsMenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(AnnouncementsMenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(IncidentMainmenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(AnnouncementsMenu, 20),AnnouncementsMenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(AnnouncementsMenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(AnnouncementsMenu, 20),AnnouncementsMenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(AnnouncementsMenu, 10);
								 softAssert1.assertAll();
							} catch (Exception e2) {
								// TODO: handle exception
								System.out.println((AnnouncementsMenu+" "+"Sub menu is not displayed"));
							}
					    	
					    }
		  
		  }
		  }
	
	public void verifyANTMenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Announcementslistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(Announcementslistpagetitle), "Announcements");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+AnnouncementsMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+AnnouncementsMenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Announcementslistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(Announcementslistpagetitle), "Announcements");
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
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(Createbutton+" "+" was not displayed in the Homeworks Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyANTMenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(ANMenutitle);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
		//			Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
			       }
			catch (ElementClickInterceptedException e) {
				try {
					softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+AnnouncementsMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+AnnouncementsMenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+AnnouncementsMenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 3),
						getlistpagetitle + " List Page title Should be displayed, but was not displayed");
				String selectrecordtitle=	elementUtil.doGetText(ANMenutitle);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
			//		Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+AnnouncementsMenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+AnnouncementsMenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+AnnouncementsMenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+AnnouncementsMenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+AnnouncementsMenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyANTMenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+AnnouncementsMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+AnnouncementsMenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+AnnouncementsMenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+AnnouncementsMenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+AnnouncementsMenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyDiarymenu(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(DiaryMenu, 10);
				  String title =elementUtil.doGetText(DiaryMenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(DiaryMenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(DiaryMenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(DiaryMenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(DiaryMenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(DiaryMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(DiaryMenu, 20),DiaryMenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(DiaryMenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(DiaryMenu, 20),DiaryMenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(DiaryMenu, 10);
								 softAssert1.assertAll();
							} catch (org.openqa.selenium.NoSuchElementException e2) {
								// TODO: handle exception
								System.out.println((DiaryMenu+" "+"Sub menu is not displayed"));
							}
					   
					    }
		  
		  }
		  }
	
	public void verifyDiaryMenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Diarylistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(Diarylistpagetitle), "Diary");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+DiaryMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+DiaryMenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Diarylistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(Diarylistpagetitle), "Diary");
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
	
	public void verifyDiaryMenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selectrecord);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
//					Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
			       }
			catch (ElementClickInterceptedException e) {
				try {
					softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+DiaryMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+DiaryMenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+DiaryMenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 3),
						getlistpagetitle + " List Page title Should be displayed, but was not displayed");
				String selectrecordtitle=	elementUtil.doGetText(selectrecord);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
//					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+DiaryMenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+DiaryMenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+DiaryMenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+DiaryMenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+DiaryMenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyDiaryMenuDelete(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Actionbutton, 10),
						"Action button Should be displayed, but was not displayed");
				elementUtil.clickWhenReady(Actionbutton, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Deletebutton,5)," Delete button displayed");
			       }
			catch (StaleElementReferenceException e) {
				// TODO: handle exception
				elementUtil.clickWhenReady(Actionbutton, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Deletebutton,30)," Delete button displayed");
			}
			catch (ElementClickInterceptedException e) {
				try {
					elementUtil.clickWhenReady(Actionbutton, 10);
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Deletebutton,5)," Delete button displayed");
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Action/Delete button not Found in the"+" "+DiaryMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+DiaryMenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+DiaryMenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+DiaryMenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+DiaryMenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	

	public void verifyNLMenu(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(Newslettermenu, 10);
				  String title =elementUtil.doGetText(Newslettermenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(Newslettermenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(Newslettermenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(Newslettermenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(Newslettermenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(NewslettermenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Newslettermenu, 20),Newslettermenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(Newslettermenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Newslettermenu, 20),Newslettermenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(Newslettermenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((Newslettermenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyNLMenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Newslettermenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(Newslettermenulistpagetitle), "Newsletter");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+Newslettermenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+Newslettermenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Newslettermenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(Newslettermenulistpagetitle), "Newsletter");
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
	
	public void verifyNLMenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(Newslettermenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Newslettermenulistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selectrecord);
				elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
//					Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 30));
			       }
			catch (StaleElementReferenceException e) {
				// TODO: handle exception
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 30));
			}
			catch (ElementClickInterceptedException e) {
				try {
					elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
					elementUtil.clickWhenReady(selectrecord, 3);
					softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+Newslettermenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+Newslettermenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+Newslettermenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 3),
						getlistpagetitle + " List Page title Should be displayed, but was not displayed");
				String selectrecordtitle=	elementUtil.doGetText(selectrecord);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
//					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+Newslettermenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+Newslettermenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+Newslettermenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+Newslettermenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+Newslettermenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyNLMenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+Newslettermenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+Newslettermenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+Newslettermenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+Newslettermenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+Newslettermenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	
	public void verifyWHMenu(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(WorksheetMenu, 10);
				  String title =elementUtil.doGetText(WorksheetMenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(WorksheetMenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(WorksheetMenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(WorksheetMenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(WorksheetMenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(WorksheetMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(WorksheetMenu, 20),WorksheetMenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(WorksheetMenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(WorksheetMenu, 20),WorksheetMenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(WorksheetMenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((WorksheetMenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyWHMenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(WorksheetMenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(WorksheetMenulistpagetitle), "Worksheet");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+WorksheetMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+WorksheetMenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(WorksheetMenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(WorksheetMenulistpagetitle), "Worksheet");
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
	
	public void verifyWHMenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(WorksheetMenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(WorksheetMenulistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selectrecord);
				elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
//					Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 30));
			       }
			catch (StaleElementReferenceException e) {
				// TODO: handle exception
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 30));
			}
			catch (ElementClickInterceptedException e) {
				try {
					elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
					elementUtil.clickWhenReady(selectrecord, 3);
					softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+WorksheetMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+WorksheetMenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+WorksheetMenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 3),
						getlistpagetitle + " List Page title Should be displayed, but was not displayed");
				String selectrecordtitle=	elementUtil.doGetText(selectrecord);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
//					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+WorksheetMenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+WorksheetMenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+WorksheetMenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+WorksheetMenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+WorksheetMenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyWHMenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+WorksheetMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+WorksheetMenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+WorksheetMenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+WorksheetMenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+WorksheetMenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}
	public void verifyConfMenu(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(ConfMenu, 10);
				  String title =elementUtil.doGetText(ConfMenu); 
				 System.out.println("title is : " + title);
//				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(ConfMenu, 10);	
				}
			  	 catch (NoSuchElementException |TimeoutException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			 elementUtil.waitForElementToBeVisibleAssert(ConfMenu, 10);
			  			String title =elementUtil.doGetText(ConfMenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(ConfMenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(ConfMenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(ConfMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(ConfMenu, 20),ConfMenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(ConfMenu, 10);
					 softAssert1.assertAll();
					    } 
			  catch (TimeoutException e) {
				// TODO: handle exception
			  }
			  catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(ConfMenu, 20),ConfMenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(ConfMenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((ConfMenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	public void verifyGroupMenu(String admmn,String admmnread)   {
		SoftAssert softAssert1 = new SoftAssert();
		  if(admmnread.equalsIgnoreCase("Yes")) {  	
			  try {
				  elementUtil.waitForElementToBeVisibleAssert(GroupMenu, 10);
				  String title =elementUtil.doGetText(GroupMenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(GroupMenu, 10);	
				}
			  	 catch (NoSuchElementException e) {	
			  		try {
			  			elementUtil.mouseaction(Scrollbarelement);
			  			String title =elementUtil.doGetText(GroupMenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(GroupMenu, 10);
					} catch (NoSuchElementException e2) {
						// TODO: handle exception
						Assert.fail(GroupMenu+" "+"Sub Menu Should be display,but not displayed");
					}
//			  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
			  	}  
			  
		  }else {
			  try {
				 
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(GroupMenu, 20),GroupMenu+" "+"Sub Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(GroupMenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	try {
					    		elementUtil.mouseaction(Scrollbarelement);
					    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(GroupMenu, 20),GroupMenu+" "+"Sub Menu is displayed,Should not be displayed");
								 elementUtil.clickWhenReady(GroupMenu, 10);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println((GroupMenu+" "+"Sub menu is not displayed"));
						}					    	
					    }
		  
		  }
		  }
	
	public void verifyGroupMenuCreate(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 10),"The List Page title was not displayed");
//				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(GroupMenulistpagetitle), "SMS Groups");
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
			       }
			catch (StaleElementReferenceException e) {
				try {
					softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+GroupMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail(Createbutton+" "+"not Found in the"+" "+GroupMenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 10),"The List Page title was not displayed");

//				softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
					Assert.assertEquals(elementUtil.doGetText(GroupMenulistpagetitle), "SMS Groups");
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
	
	public void verifyGroupMenuEdit(String admmn,String admmnread) {
		SoftAssert softAssert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
	//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(GroupMenulistpagetitle, 3),
						getlistpagetitle + "List Page title Should be displayed, but was not displayed");
				String t3=elementUtil.doGetText(selectrecord);
				elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
//					Assert.assertEquals(elementUtil.doGetText(edittitle), t3);
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 30));
			       }
			catch (StaleElementReferenceException e) {
				// TODO: handle exception
				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 30));
			}
			catch (ElementClickInterceptedException e) {
				try {
					elementUtil.visibilityOfAllElements(visiblityofallrecords, 30);
					elementUtil.clickWhenReady(selectrecord, 3);
					softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+GroupMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+GroupMenu+" "+"menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				Assert.fail("Edit button not Found in the"+" "+GroupMenu+" "+"menu");
			}
			
			} 
		else{
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 3),
						getlistpagetitle + " List Page title Should be displayed, but was not displayed");
				String selectrecordtitle=	elementUtil.doGetText(selectrecord);
				elementUtil.clickWhenReady(selectrecord, 3);
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
						edittitle + " Edit Page Title Should be displayed, but was not displayed");
//					Assert.assertEquals(elementUtil.doGetText(edittitle), selectrecordtitle);
					Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+GroupMenu+" Menu Should not be displayed");
				
			       }
			catch (StaleElementReferenceException e) {
				try {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
							edittitle + " Edit Page Title Should be displayed, but was not displayed");
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
					
				} catch (org.openqa.selenium.NoSuchElementException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+GroupMenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+GroupMenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+GroupMenu+" Menu");
			}
			catch (TimeoutException e) {
				// TODO: handle exception
				System.out.println("Edit button was not displayed in the"+" "+GroupMenu+" Menu");
			}
			}
		softAssert1.assertAll();
	}
	public void verifyGroupMenuDelete(String admmn,String admmnread) {
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
					Assert.fail("Action/Delete button not Found in the"+" "+GroupMenu+" "+"menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				Assert.fail("Action/Delete button not Found in the"+" "+GroupMenu+" "+"menu");
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
					System.out.println("Action/Delete button was not displayed in the"+" "+GroupMenu+" Menu");
				}
				// TODO: handle exception
				
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+GroupMenu+" Menu");
			}
			catch (TimeoutException e1) {
				// TODO: handle exception
				System.out.println("Action/Delete button was not displayed in the"+" "+GroupMenu+" Menu");
			}
			
			}
		softAssert1.assertAll();
	}
}
