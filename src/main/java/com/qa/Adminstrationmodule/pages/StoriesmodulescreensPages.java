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

public class StoriesmodulescreensPages {
	
	public WebDriver driver;
	public ElementUtils elementUtil;
	
	public StoriesmodulescreensPages(WebDriver driver) {
		this.driver=driver;
		elementUtil= new ElementUtils(driver);
	}
		
		private By StoriesMainmenu= By.partialLinkText("Stories");
		private By CreateNewStorySubmenu= By.partialLinkText("Create New Story");
		private By ApproveRejectStorySubmenu= By.partialLinkText("Approve/Reject Story");
		private By ViewStoriesSubmenu= By.partialLinkText("View Stories");
		private By Scrollbarelement=By.xpath("//div[@class='slimScrollBar']");
		private By CreateNewStorySubMenulistpagetitle=By.xpath("//li[text()='Create a New Story']");
		private By ApproveRejectStorySubMenulistpagetitle=By.xpath("//li[text()='Approve/Reject Stories']");
		private By ViewStoriesSubMenulistpagetitle=By.xpath("//li[text()='View Stories']");
		
		
		
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
		private By Closebutton=By.xpath("//button[text()='??']");
		private By selectrecordremove=By.xpath("//span[@class='oe_facet_remove']");
		private By visiblityofallrecords= By.xpath("//table[@class='oe_list_content']/tbody/tr");
		
		
		public void verifyStoriesMainMenu(String admmn,String admmnread)   {
			SoftAssert softAssert1 = new SoftAssert();
			  if(admmnread.equalsIgnoreCase("Yes")) {  	
				  try {
					  elementUtil.waitForElementToBeVisibleAssert(StoriesMainmenu, 10);
					  String title =elementUtil.doGetText(StoriesMainmenu); 
					 System.out.println("title is : " + title);
//					 Assert.assertEquals(title, admmn);
					 elementUtil.clickWhenReady(StoriesMainmenu, 10);	
					}
				  	 catch (NoSuchElementException |TimeoutException e) {	
				  		try {
				  			elementUtil.mouseaction(Scrollbarelement);
				  			 elementUtil.waitForElementToBeVisibleAssert(StoriesMainmenu, 10);
				  			String title =elementUtil.doGetText(StoriesMainmenu); 
							 System.out.println("title is : " + title);
							 Assert.assertEquals(title, admmn);
							 elementUtil.clickWhenReady(StoriesMainmenu, 10);
						} catch (NoSuchElementException e2) {
							// TODO: handle exception
							Assert.fail(StoriesMainmenu+" "+"Sub Menu Should be display,but not displayed");
						}
//				  	  Assert.fail(ConfMenuMenu+" "+"Main Menu Should be display,but not displayed");
				  	}  
				  
			  }else {
				  try {
					  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(StoriesMainmenu, 20),StoriesMainmenu+" "+"Sub Menu is displayed,Should not be displayed");
						 elementUtil.clickWhenReady(StoriesMainmenu, 10);
						 softAssert1.assertAll();
						    } 
				  catch (TimeoutException e) {
					// TODO: handle exception
				  }
				  catch (org.openqa.selenium.NoSuchElementException e) {
						    	try {
						    		elementUtil.mouseaction(Scrollbarelement);
						    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(StoriesMainmenu, 20),StoriesMainmenu+" "+"Sub Menu is displayed,Should not be displayed");
									 elementUtil.clickWhenReady(StoriesMainmenu, 10);
							} catch (Exception e2) {
								// TODO: handle exception
								System.out.println((StoriesMainmenu+" "+"Sub menu is not displayed"));
							}					    	
						    }
			  
			  }
			  }
		public void verifyCreateNewStorySubMenu(String admmn,String admmnread)   {
			SoftAssert softAssert1 = new SoftAssert();
			  if(admmnread.equalsIgnoreCase("Yes")) {  	
				  try {
					  elementUtil.waitForElementToBeVisibleAssert(CreateNewStorySubmenu, 10);
					  String title =elementUtil.doGetText(CreateNewStorySubmenu); 
					 System.out.println("title is : " + title);
					 Assert.assertEquals(title, admmn);
					 elementUtil.clickWhenReady(CreateNewStorySubmenu, 10);	
					}
				  	 catch (NoSuchElementException e) {	
				  		try {
				  			elementUtil.mouseaction(Scrollbarelement);
				  			String title =elementUtil.doGetText(CreateNewStorySubmenu); 
							 System.out.println("title is : " + title);
							 Assert.assertEquals(title, admmn);
							 elementUtil.clickWhenReady(CreateNewStorySubmenu, 10);
						} catch (NoSuchElementException e2) {
							// TODO: handle exception
							Assert.fail(CreateNewStorySubmenu+" "+"Sub Menu Should be display,but not displayed");
						}
//				  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
				  	}  
				  
			  }else {
				  try {
					 
					  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(CreateNewStorySubmenu, 20),CreateNewStorySubmenu+" "+"Sub Menu is displayed,Should not be displayed");
						 elementUtil.clickWhenReady(CreateNewStorySubmenu, 10);
						 softAssert1.assertAll();
						    } catch (org.openqa.selenium.NoSuchElementException e) {
						    	try {
						    		elementUtil.mouseaction(Scrollbarelement);
						    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(CreateNewStorySubmenu, 20),CreateNewStorySubmenu+" "+"Sub Menu is displayed,Should not be displayed");
									 elementUtil.clickWhenReady(CreateNewStorySubmenu, 10);
							} catch (Exception e2) {
								// TODO: handle exception
								System.out.println((CreateNewStorySubmenu+" "+"Sub menu is not displayed"));
							}					    	
						    }
			  
			  }
			  }
		
		public void verifyCreateNewStorySubMenuCreate(String admmn,String admmnread) {
			SoftAssert softAssert1 = new SoftAssert();
			if (admmnread.equalsIgnoreCase("Yes")) {
				try {
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(CreateNewStorySubMenulistpagetitle, 10),"The List Page title was not displayed");
//					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
						Assert.assertEquals(elementUtil.doGetText(CreateNewStorySubMenulistpagetitle), "Create a New Story");
						softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				       }
				catch (StaleElementReferenceException e) {
					try {
						softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
					} catch (org.openqa.selenium.NoSuchElementException e1) {
						// TODO: handle exception
						Assert.fail(Createbutton+" "+"not Found in the"+" "+CreateNewStorySubmenu+" "+"menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+CreateNewStorySubmenu+" "+"menu");
				}
				
				} 
			else{
				try {
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(CreateNewStorySubMenulistpagetitle, 10),"The List Page title was not displayed");

//					softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
						Assert.assertEquals(elementUtil.doGetText(CreateNewStorySubMenulistpagetitle), "Create a New Story");
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
		
		public void verifyCreateNewStorySubMenuEdit(String admmn,String admmnread) {
			SoftAssert softAssert1 = new SoftAssert();
			if (admmnread.equalsIgnoreCase("Yes")) {
				try {
		//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(CreateNewStorySubMenulistpagetitle, 3),
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
						Assert.fail("Edit button not Found in the"+" "+CreateNewStorySubmenu+" "+"menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+CreateNewStorySubmenu+" "+"menu");
				}
				catch (TimeoutException e) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+CreateNewStorySubmenu+" "+"menu");
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
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+CreateNewStorySubmenu+" Menu Should not be displayed");
					
				       }
				catch (StaleElementReferenceException e) {
					try {
						Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
								edittitle + " Edit Page Title Should be displayed, but was not displayed");
							Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
						
					} catch (org.openqa.selenium.NoSuchElementException e1) {
						// TODO: handle exception
						System.out.println("Edit button was not displayed in the"+" "+CreateNewStorySubmenu+" Menu");
					}
					catch (TimeoutException e1) {
						// TODO: handle exception
						System.out.println("Edit button was not displayed in the"+" "+CreateNewStorySubmenu+" Menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+CreateNewStorySubmenu+" Menu");
				}
				catch (TimeoutException e) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+CreateNewStorySubmenu+" Menu");
				}
				}
			softAssert1.assertAll();
		}
		public void verifyCreateNewStorySubMenuDelete(String admmn,String admmnread) {
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
						Assert.fail("Action/Delete button not Found in the"+" "+CreateNewStorySubmenu+" "+"menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					Assert.fail("Action/Delete button not Found in the"+" "+CreateNewStorySubmenu+" "+"menu");
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
						System.out.println("Action/Delete button was not displayed in the"+" "+CreateNewStorySubmenu+" Menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					System.out.println("Action/Delete button was not displayed in the"+" "+CreateNewStorySubmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Action/Delete button was not displayed in the"+" "+CreateNewStorySubmenu+" Menu");
				}
				
				}
			softAssert1.assertAll();
		}
		
		public void verifyApproveRejectStorySubMenu(String admmn,String admmnread)   {
			SoftAssert softAssert1 = new SoftAssert();
			  if(admmnread.equalsIgnoreCase("Yes")) {  	
				  try {
					  elementUtil.waitForElementToBeVisibleAssert(ApproveRejectStorySubmenu, 10);
					  String title =elementUtil.doGetText(ApproveRejectStorySubmenu); 
					 System.out.println("title is : " + title);
					 Assert.assertEquals(title, admmn);
					 elementUtil.clickWhenReady(ApproveRejectStorySubmenu, 10);	
					}
				  	 catch (NoSuchElementException e) {	
				  		try {
				  			elementUtil.mouseaction(Scrollbarelement);
				  			String title =elementUtil.doGetText(ApproveRejectStorySubmenu); 
							 System.out.println("title is : " + title);
							 Assert.assertEquals(title, admmn);
							 elementUtil.clickWhenReady(ApproveRejectStorySubmenu, 10);
						} catch (NoSuchElementException e2) {
							// TODO: handle exception
							Assert.fail(ApproveRejectStorySubmenu+" "+"Sub Menu Should be display,but not displayed");
						}
//				  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
				  	}  
				  
			  }else {
				  try {
					 
					  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(ApproveRejectStorySubmenu, 20),ApproveRejectStorySubmenu+" "+"Sub Menu is displayed,Should not be displayed");
						 elementUtil.clickWhenReady(ApproveRejectStorySubmenu, 10);
						 softAssert1.assertAll();
						    } catch (org.openqa.selenium.NoSuchElementException e) {
						    	try {
						    		elementUtil.mouseaction(Scrollbarelement);
						    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(ApproveRejectStorySubmenu, 20),ApproveRejectStorySubmenu+" "+"Sub Menu is displayed,Should not be displayed");
									 elementUtil.clickWhenReady(ApproveRejectStorySubmenu, 10);
							} catch (Exception e2) {
								// TODO: handle exception
								System.out.println((CreateNewStorySubmenu+" "+"Sub menu is not displayed"));
							}					    	
						    }
			  
			  }
			  }
		
		public void verifyApproveRejectStorySubMenuCreate(String admmn,String admmnread) {
			SoftAssert softAssert1 = new SoftAssert();
			if (admmnread.equalsIgnoreCase("Yes")) {
				try {
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(ApproveRejectStorySubMenulistpagetitle, 10),"The List Page title was not displayed");
//					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
						Assert.assertEquals(elementUtil.doGetText(ApproveRejectStorySubMenulistpagetitle), "Approve/Reject Stories");
						softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				       }
				catch (StaleElementReferenceException e) {
					try {
						softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
					} catch (org.openqa.selenium.NoSuchElementException e1) {
						// TODO: handle exception
						Assert.fail(Createbutton+" "+"not Found in the"+" "+ApproveRejectStorySubmenu+" "+"menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+ApproveRejectStorySubmenu+" "+"menu");
				}
				
				} 
			else{
				try {
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(ApproveRejectStorySubMenulistpagetitle, 10),"The List Page title was not displayed");

//					softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
						Assert.assertEquals(elementUtil.doGetText(ApproveRejectStorySubMenulistpagetitle), "Approve/Reject Stories");
						softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
						softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,but Should not be displayed");	
					
				       }
				catch (StaleElementReferenceException e) {
					try {
						softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
						softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button displayed,Should not be displayed");	
						
					} catch (org.openqa.selenium.NoSuchElementException e1) {
						// TODO: handle exception
						System.out.println(Createbutton+" "+" was not displayed in the Incident Management Menu");
					}
					catch (StaleElementReferenceException e2) {
						// TODO: handle exception
						System.out.println("Create button displayed,Should not be displayed");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					System.out.println(Createbutton+" "+" was not displayed in the Incident Management Menu");
				}
				
				}
			softAssert1.assertAll();
		}
		
		public void verifyApproveRejectStorySubMenuEdit(String admmn,String admmnread) {
			SoftAssert softAssert1 = new SoftAssert();
			if (admmnread.equalsIgnoreCase("Yes")) {
				try {
		//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(ApproveRejectStorySubMenulistpagetitle, 3),
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
						Assert.fail("Edit button not Found in the"+" "+ApproveRejectStorySubmenu+" "+"menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+ApproveRejectStorySubmenu+" "+"menu");
				}
				catch (TimeoutException e) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+ApproveRejectStorySubmenu+" "+"menu");
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
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+CreateNewStorySubmenu+" Menu Should not be displayed");
					
				       }
				catch (StaleElementReferenceException e) {
					try {
						Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
								edittitle + " Edit Page Title Should be displayed, but was not displayed");
							Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
						
					} catch (org.openqa.selenium.NoSuchElementException e1) {
						// TODO: handle exception
						System.out.println("Edit button was not displayed in the"+" "+CreateNewStorySubmenu+" Menu");
					}
					catch (TimeoutException e1) {
						// TODO: handle exception
						System.out.println("Edit button was not displayed in the"+" "+CreateNewStorySubmenu+" Menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+CreateNewStorySubmenu+" Menu");
				}
				catch (TimeoutException e) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+CreateNewStorySubmenu+" Menu");
				}
				}
			softAssert1.assertAll();
		}
		public void verifyApproveRejectStorySubMenuDelete(String admmn,String admmnread) {
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
						Assert.fail("Action/Delete button not Found in the"+" "+ApproveRejectStorySubmenu+" "+"menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					Assert.fail("Action/Delete button not Found in the"+" "+ApproveRejectStorySubmenu+" "+"menu");
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
						System.out.println("Action/Delete button was not displayed in the"+" "+ApproveRejectStorySubmenu+" Menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					System.out.println("Action/Delete button was not displayed in the"+" "+ApproveRejectStorySubmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Action/Delete button was not displayed in the"+" "+ApproveRejectStorySubmenu+" Menu");
				}
				
				}
			softAssert1.assertAll();
		}
		
		public void verifyViewStoriesSubMenu(String admmn,String admmnread)   {
			SoftAssert softAssert1 = new SoftAssert();
			  if(admmnread.equalsIgnoreCase("Yes")) {  	
				  try {
					  elementUtil.waitForElementToBeVisibleAssert(ViewStoriesSubmenu, 10);
					  String title =elementUtil.doGetText(ViewStoriesSubmenu); 
					 System.out.println("title is : " + title);
					 Assert.assertEquals(title, admmn);
					 elementUtil.clickWhenReady(ViewStoriesSubmenu, 10);	
					}
				  	 catch (NoSuchElementException e) {	
				  		try {
				  			elementUtil.mouseaction(Scrollbarelement);
				  			String title =elementUtil.doGetText(ViewStoriesSubmenu); 
							 System.out.println("title is : " + title);
							 Assert.assertEquals(title, admmn);
							 elementUtil.clickWhenReady(ViewStoriesSubmenu, 10);
						} catch (NoSuchElementException e2) {
							// TODO: handle exception
							Assert.fail(ViewStoriesSubmenu+" "+"Sub Menu Should be display,but not displayed");
						}
//				  	  Assert.fail(GroupMenuMenu+" "+"Main Menu Should be display,but not displayed");
				  	}  
				  
			  }else {
				  try {
					 
					  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(ViewStoriesSubmenu, 20),ViewStoriesSubmenu+" "+"Sub Menu is displayed,Should not be displayed");
						 elementUtil.clickWhenReady(ViewStoriesSubmenu, 10);
						 softAssert1.assertAll();
						    } catch (org.openqa.selenium.NoSuchElementException e) {
						    	try {
						    		elementUtil.mouseaction(Scrollbarelement);
						    		softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(ViewStoriesSubmenu, 20),ViewStoriesSubmenu+" "+"Sub Menu is displayed,Should not be displayed");
									 elementUtil.clickWhenReady(ViewStoriesSubmenu, 10);
							} catch (Exception e2) {
								// TODO: handle exception
								System.out.println((ViewStoriesSubmenu+" "+"Sub menu is not displayed"));
							}					    	
						    }
			  
			  }
			  }
		
		public void verifyViewStoriesSubMenuCreate(String admmn,String admmnread) {
			SoftAssert softAssert1 = new SoftAssert();
			if (admmnread.equalsIgnoreCase("Yes")) {
				try {
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(ViewStoriesSubMenulistpagetitle, 10),"The List Page title was not displayed");
//					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
						Assert.assertEquals(elementUtil.doGetText(ViewStoriesSubMenulistpagetitle), "View Stories");
						softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
				       }
				catch (StaleElementReferenceException e) {
					try {
						softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
						Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");	
					} catch (org.openqa.selenium.NoSuchElementException e1) {
						// TODO: handle exception
						Assert.fail(Createbutton+" "+"not Found in the"+" "+ViewStoriesSubmenu+" "+"menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					Assert.fail(Createbutton+" "+"not Found in the"+" "+ViewStoriesSubmenu+" "+"menu");
				}
				
				} 
			else{
				try {
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(ViewStoriesSubMenulistpagetitle, 10),"The List Page title was not displayed");

//					softAssert1.assertTrue(elementUtil.verifyelementIsDisplayed(getlistpagetitle, 10),getlistpagetitle + " Sub menu Should be displayed, but was not displayed");
						Assert.assertEquals(elementUtil.doGetText(ViewStoriesSubMenulistpagetitle), "View Stories");
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
		
		public void verifyViewStoriesSubMenuEdit(String admmn,String admmnread) {
			SoftAssert softAssert1 = new SoftAssert();
			if (admmnread.equalsIgnoreCase("Yes")) {
				try {
		//			elementUtil.waitForElementToBeVisibleAssert(GroupMenulistpagetitle, 5);
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(ViewStoriesSubMenulistpagetitle, 3),
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
						Assert.fail("Edit button not Found in the"+" "+ViewStoriesSubmenu+" "+"menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+ViewStoriesSubmenu+" "+"menu");
				}
				catch (TimeoutException e) {
					// TODO: handle exception
					Assert.fail("Edit button not Found in the"+" "+ViewStoriesSubmenu+" "+"menu");
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
						Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10),"Edit Button was displayed in the,"+ " "+ViewStoriesSubmenu+" Menu Should not be displayed");
					
				       }
				catch (StaleElementReferenceException e) {
					try {
						Assert.assertTrue(elementUtil.verifyelementIsDisplayed(edittitle, 10),
								edittitle + " Edit Page Title Should be displayed, but was not displayed");
							Assert.assertFalse(elementUtil.waitForElementToBeVisibleAssert(Editbutton, 10));
						
					} catch (org.openqa.selenium.NoSuchElementException e1) {
						// TODO: handle exception
						System.out.println("Edit button was not displayed in the"+" "+ViewStoriesSubmenu+" Menu");
					}
					catch (TimeoutException e1) {
						// TODO: handle exception
						System.out.println("Edit button was not displayed in the"+" "+ViewStoriesSubmenu+" Menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+ViewStoriesSubmenu+" Menu");
				}
				catch (TimeoutException e) {
					// TODO: handle exception
					System.out.println("Edit button was not displayed in the"+" "+ViewStoriesSubmenu+" Menu");
				}
				}
			softAssert1.assertAll();
		}
		public void verifyViewStoriesSubMenuDelete(String admmn,String admmnread) {
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
						Assert.fail("Action/Delete button not Found in the"+" "+ViewStoriesSubmenu+" "+"menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					Assert.fail("Action/Delete button not Found in the"+" "+ViewStoriesSubmenu+" "+"menu");
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
						System.out.println("Action/Delete button was not displayed in the"+" "+ViewStoriesSubmenu+" Menu");
					}
					// TODO: handle exception
					
				}
				catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO: handle exception
					System.out.println("Action/Delete button was not displayed in the"+" "+ViewStoriesSubmenu+" Menu");
				}
				catch (TimeoutException e1) {
					// TODO: handle exception
					System.out.println("Action/Delete button was not displayed in the"+" "+ViewStoriesSubmenu+" Menu");
				}
				
				}
			softAssert1.assertAll();
		}
	

}
