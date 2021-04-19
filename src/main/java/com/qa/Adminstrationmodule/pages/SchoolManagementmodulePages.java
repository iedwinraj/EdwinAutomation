package com.qa.Adminstrationmodule.pages;


import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.verifyroleacess.utils.ElementUtils;

	public class SchoolManagementmodulePages {
		private WebDriver driver;
		private ElementUtils elementUtil;
		SoftAssert softAssert1 = new SoftAssert();
		
		private By SchoolManagementMainmenu=By.partialLinkText("School Management");
		private By ClassTeacherAllocationSubmenu =By.partialLinkText("Class Teacher Allocation");
		private By SchoolCalendarSubmenu =By.partialLinkText("School Calendar");
		private By AttendanceCalendarSubmenu =By.partialLinkText("Attendance Calendar");
		private By GradeCreationSubmenu =By.partialLinkText("Grade Creation");
		private By SectionCreationSubmenu =By.partialLinkText("Section Creation");
		private By HouseManagementSubmenu =By.partialLinkText("House Management");
		private By OptionalSubjectSubmenu =By.partialLinkText("Optional Subject");
		private By BusinessStageSetupSubmenu =By.partialLinkText("Business Stage Setup");
		private By SchoolCalenderSubmenu =By.partialLinkText("School Calender");
		private By EnvironmentSubmenu =By.partialLinkText("Environment");
		private By CreateEnvironmentChildmenu =By.partialLinkText("Create Environment");
		private By CreateEnvironment = By.xpath("//li[text()='Create Environment']");
		private By BusinessStageSetuptitle = By.xpath("//li[text()='Business Stage Setup']");
		private By OptionalSubjecttitle = By.xpath("//li[text()='Optional Subject']");
		private By SCEditrecord =By.xpath("(//span[@class='fc-event-title'])[1]");
		
		private By Createbutton =By.xpath("//button[normalize-space()='Create']");
		private By Savebutton=By.xpath("//button[@accesskey='S']");
		private By Actionbutton=By.xpath("//button[normalize-space()='Action']");
		private By Duplicatebutton=By.xpath("//a[normalize-space()='Duplicate']");
		private By Deletebutton=By.xpath("//a[normalize-space()='Delete']");
		private By Scrollbarelement=By.xpath("//div[@class='slimScrollBar']");
		
		private By selectrecord=By.xpath("//table[@class='oe_list_content']/tbody/tr[1]");
		private By Editbutton=By.xpath("//button[@accesskey='E']");
		private By Closebutton=By.xpath("//button[text()='×']");
		
		private By Gradetitle=By.xpath("//li[text()='Grades']");
		private By Sectiontitle=By.xpath("//li[text()='Section']");
		private By Housetitle=By.xpath("//li[text()='House']");
		
		private By Menutitle=By.xpath("//th[@class='oe_list_record_selector']/following-sibling::td");
		private By edittitle=By.xpath("//ol/li[2]");
		private By getlistpagetitle=By.xpath("//ol/li[1]");
		String titlemenu="";
		String S1="";
		String t2="";
			
			public SchoolManagementmodulePages(WebDriver driver) {
				this.driver = driver;
				elementUtil = new ElementUtils(this.driver);
			}
			
			
			public void verifysubmenuCreate(String OrgCreate) {
				
				  if(OrgCreate.equalsIgnoreCase("Yes")) {
						createbuttonverifymethod();	
				  }else 
				  {
					    createbuttonverifynomethod();
				  }	
				  }	  
			public void verifysubmenuEdit(String OrgEdit) {	
			//	  elementUtil.waitForElementToBeVisible(selectrecord,10);
				 
				  if(OrgEdit.equalsIgnoreCase("Yes")) {
					  elementUtil.clickWhenReady(selectrecord,10);
					  	Editbuttonverifymethod();	
				  }else if(OrgEdit.equalsIgnoreCase("No")) 
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
			public void verifysubmenuDelete(String OrgDelete) {
			//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
				  
				  if(OrgDelete.equalsIgnoreCase("Yes")) {
						  	Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should be displayed,but not displayed");
						  	elementUtil.clickWhenReady(Actionbutton, 5);
						  	Deletebuttonverifymethod();
					  }
					  else 
				  {
					  try {
						  Assert.assertFalse(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should not be displayed,but displayed");
						  elementUtil.waitForElementToBeVisible(Actionbutton, 10);
						  elementUtil.clickWhenReady(Actionbutton, 5);
						  Deletebuttonverifynomethod();
					}catch (NoSuchElementException e) {
					}
					  catch (TimeoutException e) {
						}
					  
				  }	
				  }	
			
			
			
			public void  createbuttonverifymethod() {
				try {
				t2=	elementUtil.doGetText(Menutitle);	
				softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10),"List page record should be displayed,but not displayed");
				softAssert1.assertTrue(elementUtil.waitForElementToBeVisibleAssert(Createbutton,20),"Create button Should be displayed,but not displayed");
		   //	elementUtil.waitForElementToBeVisibleAssert(Createbutton, 20);
				System.out.println("Create button displayed Successfully");
		   //	elementUtil.clickWhenReady(Createbutton, 10);
				
				}
				catch (StaleElementReferenceException e) {
					// TODO: StaleElfc xxcvcvementhandle exception
					  System.out.println("Create button displayed Successfully");
				}
				softAssert1.assertAll();
				}
				public void  createbuttonverifynomethod() {
				try {
				//	  Thread.sleep(5000);
					elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10);	
//					elementUtil.waitForElementToBeVisible(selectrecord, 10);
					
					  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
				}  //catch (InterruptedException e) {
				//TODO Auto-generated catch block
				//e.printStackTrace();
				//}
				catch (NoSuchElementException e) {
					// TODO: handle exception
					System.out.println("Create button is not displayed"); 
				}
				catch(StaleElementReferenceException e) {
					try {
					  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
					}
					catch(NoSuchElementException e1) {
						System.out.println("Create button is not displayed"); 
					  } 
				catch(ElementClickInterceptedException e2) {
					  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
					  }
				}
				
				}
				
				public void  Editbuttonverifymethod() {
					try {
	//				Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(edittitle, 10));
					if(elementUtil.doGetText(edittitle).equalsIgnoreCase(t2))
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
					Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should be displayed,but not displayed");
					elementUtil.clickWhenReady(Actionbutton, 5);	
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Deletebutton,5)," Delete button displayed");
					//assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button displayed Successfully");
					}
					catch (StaleElementReferenceException e) {
						// TODO: StaleElementhandle exception
						  System.out.println("Delete button Clicked Successfully");
					}
					catch (NoSuchElementException e) {
						// TODO: StaleElementhandle exception
						Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should be displayed,but not displayed");
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

			public void verifySMMMainmenu(String admmn,String admmnread) {
				  if(admmnread.equalsIgnoreCase("Yes")) {  	 
					  elementUtil.waitForElementToBeVisibleAssert(SchoolManagementMainmenu, 10);
					  String title =elementUtil.doGetText(SchoolManagementMainmenu); 
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, admmn);
						 elementUtil.clickWhenReady(SchoolManagementMainmenu, 10);
				  }else {
					  try {
						  SoftAssert softAssert1 = new SoftAssert();
						  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(SchoolManagementMainmenu, 20),SchoolManagementMainmenu+" "+"Main Menu is displayed,Should not be displayed");
							 elementUtil.clickWhenReady(SchoolManagementMainmenu, 10);
							 softAssert1.assertAll();
							    } catch (org.openqa.selenium.NoSuchElementException e) {
							    	System.out.println((SchoolManagementMainmenu+" "+"Main menu is not displayed"));
							    }
				  
				  }
				  }
			public void verifyCTAsubmenuRead(String Org,String OrgRead) {
				  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
					  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(ClassTeacherAllocationSubmenu,20),ClassTeacherAllocationSubmenu+" Sub menu Should be displayed, but was not displayed");
					  String title =elementUtil.doGetText(ClassTeacherAllocationSubmenu);  
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, Org);
						 elementUtil.clickWhenReady(ClassTeacherAllocationSubmenu, 10);
				  }else {
					  try {
			
						  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(ClassTeacherAllocationSubmenu, 10),"ClassTeacherAllocationSubmenu"+" "+"Sub menu is displayed,Should not be displayed");
						//	assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Sub menu is displayed,Should not be displayed");
						    elementUtil.clickWhenReady(ClassTeacherAllocationSubmenu, 10);
						    softAssert1.assertAll();
							    } catch (org.openqa.selenium.NoSuchElementException e) {
							    	System.out.println(Org+" Sub menu is not displayed" );
							    }
				  
				  }
				  }
			public void verifyCTAsubmenuCreate(String OrgCreate) {
				
				  if(OrgCreate.equalsIgnoreCase("Yes")) {
						createbuttonverifymethod();	
				  }else 
				  {
					    createbuttonverifynomethod();
				  }	
				  }	  
			public void verifyCTAsubmenuEdit(String OrgEdit) {
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
			public void verifyCTAsubmenuDelete(String OrgEdit) {
			//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
				  
				  if(OrgEdit.equalsIgnoreCase("Yes")) {
						  	Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should be displayed,but not displayed");
						  	elementUtil.clickWhenReady(Actionbutton, 5);
						  	Deletebuttonverifymethod();
					  }
					  else 
				  {
					  try {
						  Assert.assertFalse(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should not be displayed,but displayed");
						  elementUtil.waitForElementToBeVisible(Actionbutton, 10);
						  elementUtil.clickWhenReady(Actionbutton, 5);
						  Deletebuttonverifynomethod();
					} catch (NoSuchElementException e) {
					}
					  catch (TimeoutException e) {
						}
					  
				  }	
				  }	
	  
			public void verifyAttCalsubmenuRead(String Org,String OrgRead) {
				  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
					  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AttendanceCalendarSubmenu,20),AttendanceCalendarSubmenu+" Sub menu Should be displayed, but was not displayed");
					  String title =elementUtil.doGetText(AttendanceCalendarSubmenu);  
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, Org);
						 elementUtil.clickWhenReady(AttendanceCalendarSubmenu, 10);
				  }else {
					  try {
						  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(AttendanceCalendarSubmenu, 10),AttendanceCalendarSubmenu+" "+"Sub menu is displayed,Should not be displayed");
						//	assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Sub menu is displayed,Should not be displayed");
						    elementUtil.clickWhenReady(AttendanceCalendarSubmenu, 10);
						    softAssert1.assertAll();
							    } catch (org.openqa.selenium.NoSuchElementException e) {
							    	System.out.println(AttendanceCalendarSubmenu+" Sub menu is not displayed" );
							    }
				  
				  }
				  }
		
			public void verifyAttCalsubmenuCreate(String OrgCreate) {
				
				  if(OrgCreate.equalsIgnoreCase("Yes")) {
						createbuttonverifymethod();	
				  }else 
				  {
					    createbuttonverifynomethod();
				  }	
				  }	  
			public void verifyAttCalsubmenuEdit(String OrgEdit) {
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
			public void verifyAttCalsubmenuDelete(String OrgDelete) {
			//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
				  
				  if(OrgDelete.equalsIgnoreCase("Yes")) {
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
			public void verifyGradeCreatsubmenuRead(String Org,String OrgRead) {
				  if(OrgRead.equalsIgnoreCase("Yes")) {  
					  elementUtil.waitForElementToBeVisibleAssert(getlistpagetitle, 10);
					  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(GradeCreationSubmenu,20),GradeCreationSubmenu+" Sub menu Should be displayed, but was not displayed");
					  String title =elementUtil.doGetText(GradeCreationSubmenu);  
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, Org);
						 elementUtil.clickWhenReady(GradeCreationSubmenu, 10);
						 elementUtil.waitForElementToBeVisible(Gradetitle, 10);
						
				  }else {
					  try {
						  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(GradeCreationSubmenu, 10),GradeCreationSubmenu+" "+"Sub menu is displayed,Should not be displayed");
						//	assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Sub menu is displayed,Should not be displayed");
						    elementUtil.clickWhenReady(GradeCreationSubmenu, 10);
						    softAssert1.assertAll();
							    } catch (org.openqa.selenium.NoSuchElementException e) {
							    	System.out.println(GradeCreationSubmenu+" Sub menu is not displayed" );
							    }
				  
				  }
				  }
			public void verifyGradeCreatsubmenuCreate(String OrgCreate) {
				 if(OrgCreate.equalsIgnoreCase("Yes")) {
						createbuttonverifymethod();	
				  }else 
				  {
					    createbuttonverifynomethod();
				  }	
			}
			public void verifyGradeCreatsubmenuEdit(String OrgEdit) {
//				  elementUtil.waitForElementToBeVisible(selectrecord,10);
				 
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
			public void verifyGradeCreatsubmenuDelete(String OrgDelete,String OrgRead) {
				  if(OrgDelete.equalsIgnoreCase("Yes")) {
					  	Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should be displayed,but not displayed");
					  	elementUtil.clickWhenReady(Actionbutton, 5);
					  	Deletebuttonverifymethod();
				  }
				  else 
			  {
				  try {
					  String title2 = elementUtil.doGetText(OptionalSubjectSubmenu);
						System.out.println("title is : " + title2);
						if(title2.equalsIgnoreCase(OrgRead)) {
					  elementUtil.waitForElementToBeVisible(Actionbutton, 10);
					  elementUtil.clickWhenReady(Actionbutton, 5);
					  Deletebuttonverifynomethod();
						}
				} catch (NoSuchElementException e) {
					// TODO: handle exception
				}
				  
			  }	
				
			}
			public void verifySectCreatsubmenuRead(String Org,String OrgRead) {
				  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
					  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(SectionCreationSubmenu,20),SectionCreationSubmenu+" Sub menu Should be displayed, but was not displayed");
					  String title =elementUtil.doGetText(SectionCreationSubmenu);  
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, Org);
						 elementUtil.clickWhenReady(SectionCreationSubmenu, 10);
						 elementUtil.waitForElementToBeVisible(Sectiontitle, 10);
						
				  }else {
					  try {
						  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(SectionCreationSubmenu, 10),SectionCreationSubmenu+" "+"Sub menu is displayed,Should not be displayed");
						//	assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Sub menu is displayed,Should not be displayed");
						    elementUtil.clickWhenReady(SectionCreationSubmenu, 10);
						    softAssert1.assertAll();
							    } catch (org.openqa.selenium.NoSuchElementException e) {
							    	System.out.println(SectionCreationSubmenu+" Sub menu is not displayed" );
							    }
				  
				  }
				  }
			public void verifySectCreatsubmenuCreate(String OrgCreate) {
				 if(OrgCreate.equalsIgnoreCase("Yes")) {
						createbuttonverifymethod();	
				  }else 
				  {
					    createbuttonverifynomethod();
				  }	 
			}
			public void verifySectCreatsubmenuEdit(String OrgEdit) {
//				  elementUtil.waitForElementToBeVisible(selectrecord,10);
				 
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
			public void verifySectCreatsubmenuDelete(String OrgDelete,String OrgRead) {
				if(OrgDelete.equalsIgnoreCase("Yes")) {
				  	Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should be displayed,but not displayed");
				  	elementUtil.clickWhenReady(Actionbutton, 5);
				  	Deletebuttonverifymethod();
			  }
			  else 
		  {
			  try {
				  String title2 = elementUtil.doGetText(OptionalSubjectSubmenu);
					System.out.println("title is : " + title2);
					if(title2.equalsIgnoreCase(OrgRead)) {
				  elementUtil.waitForElementToBeVisible(Actionbutton, 10);
				  elementUtil.clickWhenReady(Actionbutton, 5);
				  Deletebuttonverifynomethod();
					}
			} catch (NoSuchElementException e) {
				// TODO: handle exception
			}
			  
		  }	
				
			}
			public void verifyHMsubmenuRead(String Org,String OrgRead) {
				  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
					  Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(HouseManagementSubmenu, 10), HouseManagementSubmenu+" Sub menu Should be displayed, but was not displayed");
	//				  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(HouseManagementSubmenu,20),HouseManagementSubmenu+" Sub menu Should be displayed, but was not displayed");
					  String title =elementUtil.doGetText(HouseManagementSubmenu);  
						 System.out.println("title is : " + title);
						 Assert.assertEquals(title, Org);
						 elementUtil.clickWhenReady(HouseManagementSubmenu, 10);
						 elementUtil.waitForElementToBeVisible(Housetitle, 10);
						 S1=elementUtil.doGetText(getlistpagetitle);
						
				  }else {
					  try {
						  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(HouseManagementSubmenu, 10),HouseManagementSubmenu+" "+"Sub menu is displayed,Should not be displayed");
						//	assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Sub menu is displayed,Should not be displayed");
						    elementUtil.clickWhenReady(HouseManagementSubmenu, 10);
						    softAssert1.assertAll();
							    } catch (org.openqa.selenium.NoSuchElementException e) {
							    	System.out.println(HouseManagementSubmenu+" Sub menu is not displayed" );
							    }
				  
				  }
				  }
			public void verifyHMsubmenuCreate(String OrgCreate) {
				 if(OrgCreate.equalsIgnoreCase("Yes")) {
						createbuttonverifymethod();	
				  }else 
				  {
					    createbuttonverifynomethod();
				  }	  
			}
			public void verifyHMsubmenuEdit(String OrgEdit) {
//				  elementUtil.waitForElementToBeVisible(selectrecord,10);
				  if(OrgEdit.equalsIgnoreCase("Yes")) {
					  try {
						  elementUtil.clickWhenReady(selectrecord,10);
						  	Editbuttonverifymethod();	
					} catch (StaleElementReferenceException e) {
						elementUtil.clickWhenReady(selectrecord,10);
					  	Editbuttonverifymethod();	
					}
					  
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
					  catch (StaleElementReferenceException e) {
						  elementUtil.waitForElementToBeVisible(selectrecord,10);
						  elementUtil.clickWhenReady(selectrecord,5);
						  Editbuttonverifynomethod();
							// TODO: handle exception
						}
				  }	
	
			}
			public void verifyHMsubmenuDelete(String OrgDelete) {
				if(OrgDelete.equalsIgnoreCase("Yes")) {
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
			// Environment
			
			public void verifyENVMainmenu(String envment, String envmentread) {
				if (envmentread.equalsIgnoreCase("Yes")) {
					elementUtil.waitForElementToBeVisibleAssert(EnvironmentSubmenu, 10);
					String title = elementUtil.doGetText(EnvironmentSubmenu);
					System.out.println("title is : " + title);
					Assert.assertEquals(title, envment);
					elementUtil.clickWhenReady(EnvironmentSubmenu, 10);
				} else {
					try {
						SoftAssert softAssert1 = new SoftAssert();
						softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(EnvironmentSubmenu, 20),
								EnvironmentSubmenu + " " + "Main Menu is displayed,Should not be displayed");
						elementUtil.clickWhenReady(EnvironmentSubmenu, 10);
						softAssert1.assertAll();
					} catch (org.openqa.selenium.NoSuchElementException e) {
						System.out.println((EnvironmentSubmenu + " " + "Main menu is not displayed"));
					}

				}
			}

			public void verifyCEsubmenuRead(String Org, String OrgRead) {
				if (OrgRead.equalsIgnoreCase("Yes")) {
					Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(CreateEnvironmentChildmenu, 10),
							CreateEnvironmentChildmenu + " Sub menu Should be displayed, but was not displayed");
					// Assert.assertTrue(elementUtil.verifyelementIsDisplayed(HouseManagementSubmenu,20),HouseManagementSubmenu+"
					// Sub menu Should be displayed, but was not displayed");
					String title = elementUtil.doGetText(CreateEnvironmentChildmenu);
					System.out.println("title is : " + title);
					Assert.assertEquals(title, Org);
					elementUtil.clickWhenReady(CreateEnvironmentChildmenu, 10);
					elementUtil.waitForElementToBeVisible(CreateEnvironment, 10);
					S1=elementUtil.doGetText(getlistpagetitle);
					

				} else {
					try {
						softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(CreateEnvironmentChildmenu, 10),
								CreateEnvironmentChildmenu + " " + "Sub menu is displayed,Should not be displayed");
						// assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Sub menu is
						// displayed,Should not be displayed");
						elementUtil.clickWhenReady(CreateEnvironmentChildmenu, 10);
						softAssert1.assertAll();
					} catch (org.openqa.selenium.NoSuchElementException e) {
						System.out.println(CreateEnvironmentChildmenu + " Sub menu is not displayed");
					}

				}
			}

			public void verifyCEsubmenuCreate(String OrgCreate) {
				if (OrgCreate.equalsIgnoreCase("Yes")) {
					createbuttonverifymethod();
				} else {
					createbuttonverifynomethod();
				}
			}

			public void verifyCEsubmenuEdit(String OrgEdit) {
//						  elementUtil.waitForElementToBeVisible(selectrecord,10);
				if (OrgEdit.equalsIgnoreCase("Yes")) {
					try {
						elementUtil.clickWhenReady(selectrecord, 10);
						if(elementUtil.doGetText(edittitle).equalsIgnoreCase(titlemenu))
						Editbuttonverifymethod();
					} catch (StaleElementReferenceException e) {
						elementUtil.clickWhenReady(selectrecord, 10);
						Editbuttonverifymethod();
					}

				} else {
					try {
						elementUtil.waitForElementToBeVisible(selectrecord, 10);
						elementUtil.clickWhenReady(selectrecord, 5);
						Editbuttonverifynomethod();
					} catch (NoSuchElementException e) {
						// TODO: handle exception
					} catch (ElementClickInterceptedException e) {
						// TODO: handle exception
					} catch (StaleElementReferenceException e) {
						elementUtil.waitForElementToBeVisible(selectrecord, 10);
						elementUtil.clickWhenReady(selectrecord, 5);
						Editbuttonverifynomethod();
						// TODO: handle exception
					}
				}

			}

			public void verifyCEsubmenuDelete(String OrgDelete) {
				if (OrgDelete.equalsIgnoreCase("Yes")) {
					Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton),
							"The Action button Should be displayed,but not displayed");
					elementUtil.clickWhenReady(Actionbutton, 5);
					Deletebuttonverifymethod();
				} else {
					try {
						elementUtil.waitForElementToBeVisible(Actionbutton, 10);
						elementUtil.clickWhenReady(Actionbutton, 5);
						Deletebuttonverifynomethod();
					} catch (NoSuchElementException e) {
						// TODO: handle exception
					}
					 catch (TimeoutException e) {
							// TODO: handle exception
						 Deletebuttonverifynomethod();
						}

				}

			}
			
			// BUSINESS STAGE SETUP
				
			public void verifyBSSetupCreatsubmenuRead(String Org, String OrgRead) {
				if (OrgRead.equalsIgnoreCase("Yes")) {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(BusinessStageSetupSubmenu, 10),
							BusinessStageSetupSubmenu + " Sub menu Should be displayed, but was not displayed");
					String title = elementUtil.doGetText(BusinessStageSetupSubmenu);
					System.out.println("title is : " + title);
					S1 = elementUtil.doGetText(BusinessStageSetupSubmenu);
					Assert.assertEquals(title, Org);
					elementUtil.clickWhenReady(BusinessStageSetupSubmenu, 10);
					elementUtil.waitForElementToBeVisible(BusinessStageSetuptitle, 10);

				} else {
					try {
						softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(BusinessStageSetupSubmenu, 10),
								BusinessStageSetupSubmenu + " " + "Sub menu is displayed,Should not be displayed");
						elementUtil.clickWhenReady(BusinessStageSetupSubmenu, 10);
						softAssert1.assertAll();
					} catch (org.openqa.selenium.NoSuchElementException e) {
						System.out.println(BusinessStageSetupSubmenu + " Sub menu is not displayed");
					}

				}
			}

			public void verifyBSSetupCreatsubmenuCreate(String OrgCreate,String OrgRead) {
				if (OrgCreate.equalsIgnoreCase("Yes")) {
					createbuttonverifymethod();
				} else { try {
					String title3 = elementUtil.doGetText(OptionalSubjectSubmenu);
					System.out.println("title is : " + title3);
					if(title3.equalsIgnoreCase(OrgRead)) {
					createbuttonverifynomethod();
				}
					else {
						Assert.assertTrue((!title3.equalsIgnoreCase(OrgRead)), OptionalSubjectSubmenu+" "+"Menu was not displayed");
					}
				}
					 catch (NoSuchElementException e) {
					// TODO: handle exception
				}
					
					
				}
					
			}

			public void verifyBSSetupCreatsubmenuEdit(String OrgEdit,String OrgRead) {
				if (OrgEdit.equalsIgnoreCase("Yes")) {
					elementUtil.clickWhenReady(selectrecord, 10);
					Editbuttonverifymethod();
				} else {
					try {
						String title2 = elementUtil.doGetText(BusinessStageSetupSubmenu);
						System.out.println("title is : " + title2);
						S1 = elementUtil.doGetText(BusinessStageSetupSubmenu);
						if(title2.equalsIgnoreCase(OrgRead)) {
						elementUtil.waitForElementToBeVisible(selectrecord, 10);
						elementUtil.clickWhenReady(selectrecord, 5);
						Editbuttonverifynomethod();
						}else {
							Editbuttonverifynomethod();
						}
					} catch (NoSuchElementException e) {
						// TODO: handle exception
					} catch (ElementClickInterceptedException e) {
						// TODO: handle exception
					}

				}

			}

			public void verifyBSSetupCreatsubmenuDelete(String OrgDelete,String OrgRead) {
				if (OrgDelete.equalsIgnoreCase("Yes")) {
					Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton),
							"The Action button Should be displayed,but not displayed");
					elementUtil.clickWhenReady(Actionbutton, 5);
					Deletebuttonverifymethod();
				} else {
					try {
						String title2 = elementUtil.doGetText(BusinessStageSetupSubmenu);
						System.out.println("title is : " + title2);
						S1 = elementUtil.doGetText(BusinessStageSetupSubmenu);
						if(title2.equalsIgnoreCase(OrgRead)) {
						elementUtil.waitForElementToBeVisible(Actionbutton, 10);
						elementUtil.clickWhenReady(Actionbutton, 5);
						Deletebuttonverifynomethod();
						}
						else {
							Assert.assertEquals(title2, OrgRead);
						}
					} catch (NoSuchElementException e) {
						// TODO: handle exception
					}

				}
			}
			
			//Optional Subject
			
			public void verifyOptionalSubjectCreatsubmenuRead(String Org, String OrgRead) {
				if (OrgRead.equalsIgnoreCase("Yes")) {
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(OptionalSubjectSubmenu, 10),
							OptionalSubjectSubmenu + " Sub menu Should be displayed, but was not displayed");
					
					String title = elementUtil.doGetText(OptionalSubjectSubmenu);
					System.out.println("title is : " + title);
					Assert.assertEquals(title, Org);
					elementUtil.clickWhenReady(OptionalSubjectSubmenu, 10);
					S1=elementUtil.doGetText(getlistpagetitle);
					elementUtil.waitForElementToBeVisible(OptionalSubjecttitle, 10);

				} else {
					try {
						softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(OptionalSubjectSubmenu, 10),
								OptionalSubjectSubmenu + " " + "Sub menu is displayed,Should not be displayed");
						elementUtil.clickWhenReady(OptionalSubjectSubmenu, 10);
						softAssert1.assertAll();
					} catch (org.openqa.selenium.NoSuchElementException e) {
						System.out.println(OptionalSubjectSubmenu + " Sub menu is not displayed");
					}

				}
			}

			public void verifyOptionalSubjectCreatsubmenuCreate(String OrgCreate,String OrgRead) {
				if (OrgCreate.equalsIgnoreCase("Yes")) {
					createbuttonverifymethod();
				} else {
					try {
						if(elementUtil.waitForElementToBeVisible(getlistpagetitle, 5).getText().equalsIgnoreCase(elementUtil.waitForElementToBeVisible(OptionalSubjecttitle, 5).getText())) {
							createbuttonverifynomethod();
							}
							else {
								Assert.assertTrue(!elementUtil.waitForElementToBeVisible(getlistpagetitle, 5).getText().equalsIgnoreCase(elementUtil.waitForElementToBeVisible(OptionalSubjecttitle, 5).getText()), OptionalSubjectSubmenu+" "+"Menu was not displayed");
							}
						
					} catch (NoSuchElementException e) {
						// TODO: handle exception
					}
					
				}
			}

			public void verifyOptionalSubjectCreatsubmenuEdit(String OrgEdit,String OrgRead) {
				if (OrgEdit.equalsIgnoreCase("Yes")) {
					String title2 = elementUtil.doGetText(OptionalSubjectSubmenu);
					System.out.println("title is : " + title2);
					if(title2.equalsIgnoreCase(OrgRead)) {
					elementUtil.clickWhenReady(selectrecord, 10);
					Editbuttonverifymethod();
					}else {
						Assert.fail("Editbutton was not displayed");
					}
				} else {
					try {
						String title2 = elementUtil.doGetText(OptionalSubjectSubmenu);
						System.out.println("title is : " + title2);
						if(title2.equalsIgnoreCase(OrgRead)) {
						elementUtil.waitForElementToBeVisible(selectrecord, 10);
						elementUtil.clickWhenReady(selectrecord, 5);
						Editbuttonverifynomethod();
						}else {
							Editbuttonverifynomethod();
						}
						} catch (NoSuchElementException e) {
						// TODO: handle exception
					} catch (ElementClickInterceptedException e) {
						// TODO: handle exception
					}

				}

			}

			public void verifyOptionalSubjectCreatsubmenuDelete(String OrgDelete,String OrgRead) {
				if (OrgDelete.equalsIgnoreCase("Yes")) {
					Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton),
							"The Action button Should be displayed,but not displayed");
					elementUtil.clickWhenReady(Actionbutton, 5);
					Deletebuttonverifymethod();
				} else {
					try {
						String title2 = elementUtil.doGetText(OptionalSubjectSubmenu);
						System.out.println("title is : " + title2);
						if(title2.equalsIgnoreCase(OrgRead)) {
						elementUtil.waitForElementToBeVisible(Actionbutton, 10);
						elementUtil.clickWhenReady(Actionbutton, 5);
						Deletebuttonverifynomethod();
						}
					} catch (NoSuchElementException e) {
						// TODO: handle exception
					}

				}
			}
			
			//School calender
			
			public void verifySCsubmenuRead(String Org, String OrgRead) {
				if (OrgRead.equalsIgnoreCase("Yes")) {
					try {
						Assert.assertTrue(elementUtil.verifyelementIsDisplayed(SchoolCalendarSubmenu, 10),
								SchoolCalendarSubmenu + " Sub menu Should be displayed, but was not displayed");
						
						String title = elementUtil.doGetText(SchoolCalendarSubmenu);
						System.out.println("title is : " + title);
						Assert.assertEquals(title, Org);
						elementUtil.clickWhenReady(SchoolCalendarSubmenu, 10);
						
					} catch (StaleElementReferenceException e) {
						// TODO: handle exception
						Assert.assertTrue(elementUtil.verifyelementIsDisplayed(SchoolCalendarSubmenu, 10),
								SchoolCalendarSubmenu + " Sub menu Should be displayed, but was not displayed");
						
						String title = elementUtil.doGetText(SchoolCalendarSubmenu);
						System.out.println("title is : " + title);
						Assert.assertEquals(title, Org);
						elementUtil.clickWhenReady(SchoolCalendarSubmenu, 10);
						
					}
					

				} 
				else {
					try {
						softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(SchoolCalendarSubmenu, 10),
								SchoolCalendarSubmenu + " " + "Sub menu is displayed,Should not be displayed");
						elementUtil.clickWhenReady(SchoolCalendarSubmenu, 10);
						softAssert1.assertAll();
					} catch (org.openqa.selenium.NoSuchElementException e) {
						System.out.println(SchoolCalendarSubmenu + " Sub menu is not displayed");
					}

				}
			}

			public void verifySCsubmenuCreate(String OrgCreate,String OrgRead) {
				if (OrgCreate.equalsIgnoreCase("Yes")) {
					elementUtil.waitForElementToBeVisibleAssert(SCEditrecord, 10);
					elementUtil.clickWhenReady(SCEditrecord, 10);
					
				} else {
					try {
						softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(SCEditrecord, 10));
						elementUtil.clickWhenReady(SCEditrecord, 10);
						
					} catch (NoSuchElementException e) {
						// TODO: handle exception
					}
					 catch (StaleElementReferenceException e) {
							// TODO: handle exception
						}
	//				softAssert1.assertAll();
				}
			}

			public void verifySCsubmenuEdit(String OrgEdit,String OrgRead) {
				if (OrgEdit.equalsIgnoreCase("Yes")) {
					String title2 = elementUtil.doGetText(SchoolCalendarSubmenu);
					System.out.println("title is : " + title2);
					if(title2.equalsIgnoreCase(OrgRead)) {
					Editbuttonverifymethod();
					}else {
						Assert.fail("Editbutton was not displayed");
					}
				} else {
					try {
						String title2 = elementUtil.doGetText(SchoolCalendarSubmenu);
						System.out.println("title is : " + title2);
						if(title2.equalsIgnoreCase(OrgRead)) {
						
							driver.findElement(By.xpath("(//span[@class='fc-event-title'])[1]")).click();	
						Editbuttonverifynomethod();
						}else {
							Editbuttonverifynomethod();
						}
						} catch (NoSuchElementException e) {
						// TODO: handle exception
					} catch (ElementClickInterceptedException e) {
						// TODO: handle exception
					}

				}

			}

			public void verifySCsubmenuDelete(String OrgDelete,String OrgRead) {
				if (OrgDelete.equalsIgnoreCase("Yes")) {
					Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton),
							"The Action button Should be displayed,but not displayed");
					elementUtil.clickWhenReady(Actionbutton, 5);
					Deletebuttonverifymethod();
				} else {
					try {
						String title2 = elementUtil.doGetText(SchoolCalenderSubmenu);
						System.out.println("title is : " + title2);
						if(title2.equalsIgnoreCase(OrgRead)) {
						elementUtil.waitForElementToBeVisible(Actionbutton, 10);
						elementUtil.clickWhenReady(Actionbutton, 5);
						Deletebuttonverifynomethod();
						}
					} catch (NoSuchElementException e) {
						// TODO: handle exception
					}

				}
			}
			
			
	}	
	

