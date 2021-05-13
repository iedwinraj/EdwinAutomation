package com.qa.Adminstrationmodule.pages;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

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
					  // elementUtil.clickWhenReady(selectrecord,10);
					  	Editbuttonverifymethod();	
				  }else if(OrgEdit.equalsIgnoreCase("No")) 
				  {	
					  try {
						  // elementUtil.waitForElementToBeVisible(selectrecord,10);
						  // elementUtil.clickWhenReady(selectrecord,10);
						  Editbuttonverifynomethod();
					} catch (NoSuchElementException|TimeoutException e) {
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
	//					  	Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should be displayed,but not displayed");
	//					  	elementUtil.clickWhenReady(Actionbutton, 5);
						  	Deletebuttonverifymethod();
					  }
					  else 
				  {
					  try {
	//					  Assert.assertFalse(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should not be displayed,but displayed");
	//					  elementUtil.waitForElementToBeVisible(Actionbutton, 10);
	//					  elementUtil.clickWhenReady(Actionbutton, 5);
						  Deletebuttonverifynomethod();
					}catch (NoSuchElementException|TimeoutException e) {
					}
					
				  }	
			}
			
			
			public void createbuttonverifymethod() {
				try {
					// elementUtil.waitForElementToBeVisible(Createbutton, 20);
					elementUtil.waitForElementToBeVisible(selectrecord, 10);
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton, 5), " Create button displayed");
					// assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button
					// displayed Successfully");
					System.out.println("Create button Clicked Successfully");
					// elementUtil.clickWhenReady(Createbutton, 10);
				} catch (StaleElementReferenceException e) {
					// TODO: StaleElementhandle exception
					System.out.println("Create button Clicked Successfully");
				} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
					Assert.fail("Create button is not displayed,it should be displayed");
				}

			}

			public void createbuttonverifynomethod() {
				SoftAssert assert1= new SoftAssert();
				try {
					// Thread.sleep(5000);
					elementUtil.waitForElementToBeVisible(selectrecord, 10);
					assert1.assertFalse(elementUtil.doIsDisplayed(Createbutton), "Create button is displayed,Should not be displayed");
				} catch (StaleElementReferenceException e) {
					try {
					assert1.assertFalse(elementUtil.doIsDisplayed(Createbutton), "Create button is displayed,Should not be displayed");
				} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e2) {
					// TODO: handle exception
					System.out.println("Create button was not displayed");
				}
					
				} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
					System.out.println("Create button was not displayed");
				} // catch (InterruptedException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					// }
				assert1.assertAll();
			}

			public void Editbuttonverifymethod() {
				try {
					SoftAssert assert1 = new SoftAssert();
					elementUtil.clickWhenReady(selectrecord, 10);
					elementUtil.waitForElementToBeLocated(Editbutton, 20);
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Editbutton, 20), " Create button displayed");
					// assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button
					// displayed Successfully");
					// elementUtil.clickWhenReady(Editbutton, 10);
					assert1.assertAll();
				} catch (StaleElementReferenceException e) {
					SoftAssert assert1 = new SoftAssert();
					// TODO: StaleElementhandle exception
					elementUtil.waitForElementToBeLocated(Editbutton, 20);
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Editbutton, 20), " Create button displayed");
					assert1.assertAll();
				} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
					Assert.fail("Edit button is not displayed,Should be displayed");
				}
				
			}

			public void Editbuttonverifynomethod() {
				SoftAssert assert1 = new SoftAssert();
				try {
					// Thread.sleep(5000);
					elementUtil.clickWhenReady(selectrecord, 10);
					elementUtil.waitForElementToBeLocated(Editbutton, 20);
					assert1.assertFalse(elementUtil.doIsDisplayed(Editbutton), "Edit button is displayed,Should not be displayed");
				} // catch (InterruptedException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					// }
				catch (StaleElementReferenceException e) {
					assert1.assertFalse(elementUtil.doIsDisplayed(Editbutton), "Edit button is displayed,Should not be displayed");
				}

				catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
					System.out.println("Edit button was not displayed");
				}
				assert1.assertAll();
			}

			public void Deletebuttonverifymethod() {
				SoftAssert assert1 = new SoftAssert();
				try {
					// elementUtil.waitForElementToBeLocated(Deletebutton, 5);
					Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should be displayed,but not displayed");
					elementUtil.clickWhenReady(Actionbutton, 5);
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Deletebutton, 5), " Delete button displayed");
					// assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button
					// displayed Successfully");
				} catch (StaleElementReferenceException e) {
					// TODO: StaleElementhandle exception
					Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Deletebutton, 5), " Delete button displayed");
				} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
					Assert.fail("Delete button is not displayed");
				}
				assert1.assertAll();
			}

			public void Deletebuttonverifynomethod() {
				SoftAssert assert1= new SoftAssert();
				try {
					// Thread.sleep(5000);
					elementUtil.doIsDisplayed(Actionbutton);
					elementUtil.clickWhenReady(Actionbutton, 5);
					assert1.assertFalse(elementUtil.doIsDisplayed(Deletebutton), "Delete button is displayed,Should not be displayed");
				} // catch (InterruptedException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					// }
				catch (StaleElementReferenceException e) {
					assert1.assertFalse(elementUtil.doIsDisplayed(Deletebutton), "Delete button is displayed,Should not be displayed");
				} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
					System.out.println("Delete button is not displayed");
				}
				assert1.assertAll();
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
							    } catch (org.openqa.selenium.NoSuchElementException|TimeoutException e) {
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
							    } catch (org.openqa.selenium.NoSuchElementException|TimeoutException e) {
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
					  // elementUtil.clickWhenReady(selectrecord,10);
					  	Editbuttonverifymethod();	
				  }else 
				  {	
					  try {
						  // elementUtil.waitForElementToBeVisible(selectrecord,10);
						  // elementUtil.clickWhenReady(selectrecord,10);
						  Editbuttonverifynomethod();
					} catch (NoSuchElementException|TimeoutException e) {
						// TODO: handle exception
					}
					  catch (ElementClickInterceptedException e) {
							// TODO: handle exception
						}
						 
					 
				  }	
				  }	  
			public void verifyCTAsubmenuDelete(String OrgEdit) {
			//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
				  
				  if(OrgEdit.equalsIgnoreCase("Yes")) {try {
					  elementUtil.waitForTitleContains(5, "Calender");
					  	Deletebuttonverifymethod();
				} catch (NoSuchElementException|TimeoutException e) {
					Assert.fail("Delete button Should be displayed,but was not displayed");
					// TODO: handle exception
				}
//						  	Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should be displayed,but not displayed");
//					  	elementUtil.clickWhenReady(Actionbutton, 5);
					  		
					  }
					  else 
				  {
					  try {
//						  Assert.assertFalse(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should not be displayed,but displayed");
//						  elementUtil.waitForElementToBeVisible(Actionbutton, 10);
//						  elementUtil.clickWhenReady(Actionbutton, 5);
						  elementUtil.waitForTitleContains(5, "Calender");
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
							    } catch (org.openqa.selenium.NoSuchElementException|TimeoutException e) {
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
					  // elementUtil.clickWhenReady(selectrecord,10);
					  	Editbuttonverifymethod();	
				  }else 
				  {	
					  try {
						  // elementUtil.waitForElementToBeVisible(selectrecord,10);
						  // elementUtil.clickWhenReady(selectrecord,10);
						  Editbuttonverifynomethod();
					} catch (NoSuchElementException|TimeoutException e) {
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
//						  	Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should be displayed,but not displayed");
//						  	elementUtil.clickWhenReady(Actionbutton, 5);
						  	Deletebuttonverifymethod();
					  }
					  else 
				  {
					  try {
//						  elementUtil.waitForElementToBeVisible(Actionbutton, 10);
//						  elementUtil.clickWhenReady(Actionbutton, 5);
						  Deletebuttonverifynomethod();
					} catch (NoSuchElementException|TimeoutException e) {
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
							    } catch (org.openqa.selenium.NoSuchElementException|TimeoutException e) {
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
//				  // elementUtil.waitForElementToBeVisible(selectrecord,10);
				 
				  if(OrgEdit.equalsIgnoreCase("Yes")) {
					  // elementUtil.clickWhenReady(selectrecord,10);
					  	Editbuttonverifymethod();	
				  }else 
				  {	
					  try {
						  // elementUtil.waitForElementToBeVisible(selectrecord,10);
						  // elementUtil.clickWhenReady(selectrecord,10);
						  Editbuttonverifynomethod();
					} catch (NoSuchElementException|TimeoutException e) {
						// TODO: handle exception
					}
					  catch (ElementClickInterceptedException e) {
							// TODO: handle exception
						}
						 					 
				  }	
  	
			}
			public void verifyGradeCreatsubmenuDelete(String OrgDelete,String OrgRead) {
				  if(OrgDelete.equalsIgnoreCase("Yes")) {
	//				  	Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should be displayed,but not displayed");
	//				  	elementUtil.clickWhenReady(Actionbutton, 5);
					  	Deletebuttonverifymethod();
				  }
				  else 
			  {
				  try {
					  String title2 = elementUtil.doGetText(OptionalSubjectSubmenu);
						System.out.println("title is : " + title2);
						if(title2.equalsIgnoreCase(OrgRead)) {
//					  elementUtil.waitForElementToBeVisible(Actionbutton, 10);
//					  elementUtil.clickWhenReady(Actionbutton, 5);
					  Deletebuttonverifynomethod();
						}
				} catch (NoSuchElementException|TimeoutException e) {
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
							    } catch (org.openqa.selenium.NoSuchElementException|TimeoutException e) {
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
//				  // elementUtil.waitForElementToBeVisible(selectrecord,10);
				 
				  if(OrgEdit.equalsIgnoreCase("Yes")) {
					  // elementUtil.clickWhenReady(selectrecord,10);
					  	Editbuttonverifymethod();	
				  }else 
				  {	
					  try {
						  // elementUtil.waitForElementToBeVisible(selectrecord,10);
						  // elementUtil.clickWhenReady(selectrecord,10);
						  Editbuttonverifynomethod();
					} catch (NoSuchElementException|TimeoutException e) {
						// TODO: handle exception
					}
					  catch (ElementClickInterceptedException e) {
							// TODO: handle exception
						}					 
				  }	
 	
			}
			public void verifySectCreatsubmenuDelete(String OrgDelete,String OrgRead) {
				if(OrgDelete.equalsIgnoreCase("Yes")) {
//				  	Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should be displayed,but not displayed");
//				  	elementUtil.clickWhenReady(Actionbutton, 5);
				  	Deletebuttonverifymethod();
			  }
			  else 
		  {
			  try {
				  String title2 = elementUtil.doGetText(OptionalSubjectSubmenu);
					System.out.println("title is : " + title2);
					if(title2.equalsIgnoreCase(OrgRead)) {
//				  elementUtil.waitForElementToBeVisible(Actionbutton, 10);
//				  elementUtil.clickWhenReady(Actionbutton, 5);
				  Deletebuttonverifynomethod();
					}
			} catch (NoSuchElementException|TimeoutException e) {
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
							    } catch (org.openqa.selenium.NoSuchElementException|TimeoutException e) {
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
						  // elementUtil.clickWhenReady(selectrecord,10);
						  	Editbuttonverifymethod();	
					} catch (StaleElementReferenceException e) {
						// elementUtil.clickWhenReady(selectrecord,10);
					  	Editbuttonverifymethod();	
					}
					  
				  }else 
				  {	
					  try {
						  // elementUtil.waitForElementToBeVisible(selectrecord,10);
						  // elementUtil.clickWhenReady(selectrecord,10);
						  Editbuttonverifynomethod();
					} catch (NoSuchElementException|TimeoutException e) {
						// TODO: handle exception
					}
					  catch (ElementClickInterceptedException e) {
							// TODO: handle exception
						}	
					  catch (StaleElementReferenceException e) {
						  // elementUtil.waitForElementToBeVisible(selectrecord,10);
						  // elementUtil.clickWhenReady(selectrecord,10);
						  Editbuttonverifynomethod();
							// TODO: handle exception
						}
				  }	
	
			}
			public void verifyHMsubmenuDelete(String OrgDelete) {
				if(OrgDelete.equalsIgnoreCase("Yes")) {
					try {
						elementUtil.waitForTitleContains(5, "House Management");
						Deletebuttonverifymethod();
					} catch (NoSuchElementException|TimeoutException e) {
						// TODO: handle exception
						Assert.fail("Delete button Should be displayed,but was not displayed");
					}
//				  	Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton), "The Action button Should be displayed,but not displayed");
//				  	elementUtil.clickWhenReady(Actionbutton, 5);
				  	
			  }
			  else 
		  {
			  try {
//				  elementUtil.waitForElementToBeVisible(Actionbutton, 10);
//				  elementUtil.clickWhenReady(Actionbutton, 5);
				  elementUtil.waitForTitleContains(5, "House Management");
				  Deletebuttonverifynomethod();
			} catch (NoSuchElementException|TimeoutException e) {
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
					} catch (org.openqa.selenium.NoSuchElementException|TimeoutException e) {
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
					} catch (org.openqa.selenium.NoSuchElementException|TimeoutException e) {
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
						// elementUtil.clickWhenReady(selectrecord,10);
//						if(elementUtil.doGetText(edittitle).equalsIgnoreCase(titlemenu))
						elementUtil.waitForTitleContains(5, "House Management");
						Editbuttonverifymethod();
					} catch (StaleElementReferenceException e) {
						// elementUtil.clickWhenReady(selectrecord,10);
						Editbuttonverifymethod();
					}
					catch (NoSuchElementException|TimeoutException e) {
						// TODO: handle exception
						Assert.fail("The Edit button Should be displayed,but not displayed");
					}

				} else {
					try {
						// elementUtil.waitForElementToBeVisible(selectrecord, 10);
						// elementUtil.clickWhenReady(selectrecord,10);
						Editbuttonverifynomethod();
					} 	// TODO: handle exception
				catch (StaleElementReferenceException e) {
						// elementUtil.waitForElementToBeVisible(selectrecord, 10);
						// elementUtil.clickWhenReady(selectrecord,10);
						Editbuttonverifynomethod();
						// TODO: handle exception
					}
					 catch (ElementClickInterceptedException e) {
					
				}
					catch (NoSuchElementException|TimeoutException e) {
						// TODO: handle exception
					}
				} 
			}

			public void verifyCEsubmenuDelete(String OrgDelete) {
				if (OrgDelete.equalsIgnoreCase("Yes")) {
//					Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton),"The Action button Should be displayed,but not displayed");
//					elementUtil.clickWhenReady(Actionbutton, 5);
					Deletebuttonverifymethod();
				} else {
					try {
//						elementUtil.waitForElementToBeVisible(Actionbutton, 10);
//						elementUtil.clickWhenReady(Actionbutton, 5);
						Deletebuttonverifynomethod();
					} catch (NoSuchElementException e) {
						// TODO: handle exception
					}
					 catch (TimeoutException e) {
							// TODO: handle exception
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
					} catch (org.openqa.selenium.NoSuchElementException|TimeoutException e) {
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
					 catch (NoSuchElementException|TimeoutException e) {
					// TODO: handle exception
				}
					
					
				}
					
			}

			public void verifyBSSetupCreatsubmenuEdit(String OrgEdit,String OrgRead) {
				if (OrgEdit.equalsIgnoreCase("Yes")) {
					// elementUtil.clickWhenReady(selectrecord,10);
					Editbuttonverifymethod();
				} else {
					try {
						String title2 = elementUtil.doGetText(BusinessStageSetupSubmenu);
						System.out.println("title is : " + title2);
						S1 = elementUtil.doGetText(BusinessStageSetupSubmenu);
						if(title2.equalsIgnoreCase(OrgRead)) {
						// elementUtil.waitForElementToBeVisible(selectrecord, 10);
						// elementUtil.clickWhenReady(selectrecord,10);
						Editbuttonverifynomethod();
						}else {
							Editbuttonverifynomethod();
						}
					} catch (NoSuchElementException|TimeoutException e) {
						// TODO: handle exception
					} catch (ElementClickInterceptedException e) {
						// TODO: handle exception
					}

				}

			}

			public void verifyBSSetupCreatsubmenuDelete(String OrgDelete,String OrgRead) {
				if (OrgDelete.equalsIgnoreCase("Yes")) {
//					Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton),"The Action button Should be displayed,but not displayed");
//					elementUtil.clickWhenReady(Actionbutton, 5);
					Deletebuttonverifymethod();
				} else {
					try {
						String title2 = elementUtil.doGetText(BusinessStageSetupSubmenu);
						System.out.println("title is : " + title2);
						S1 = elementUtil.doGetText(BusinessStageSetupSubmenu);
						if(title2.equalsIgnoreCase(OrgRead)) {
//						elementUtil.waitForElementToBeVisible(Actionbutton, 10);
//						elementUtil.clickWhenReady(Actionbutton, 5);
						Deletebuttonverifynomethod();
						}
						else {
							Assert.assertEquals(title2, OrgRead);
						}
					} catch (NoSuchElementException|TimeoutException e) {
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
					} catch (org.openqa.selenium.NoSuchElementException|TimeoutException e) {
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
						
					} catch (NoSuchElementException|TimeoutException e) {
						// TODO: handle exception
					}
					
				}
			}

			public void verifyOptionalSubjectCreatsubmenuEdit(String OrgEdit,String OrgRead) {
				if (OrgEdit.equalsIgnoreCase("Yes")) {
					String title2 = elementUtil.doGetText(OptionalSubjectSubmenu);
					System.out.println("title is : " + title2);
					if(title2.equalsIgnoreCase(OrgRead)) {
					// elementUtil.clickWhenReady(selectrecord,10);
					Editbuttonverifymethod();
					}else {
						Assert.fail("Editbutton was not displayed");
					}
				} else {
					try {
						String title2 = elementUtil.doGetText(OptionalSubjectSubmenu);
						System.out.println("title is : " + title2);
						if(title2.equalsIgnoreCase(OrgRead)) {
						// elementUtil.waitForElementToBeVisible(selectrecord, 10);
						// elementUtil.clickWhenReady(selectrecord,10);
						Editbuttonverifynomethod();
						}else {
							Editbuttonverifynomethod();
						}
						} catch (NoSuchElementException|TimeoutException e) {
						// TODO: handle exception
					} catch (ElementClickInterceptedException e) {
						// TODO: handle exception
					}

				}

			}

			public void verifyOptionalSubjectCreatsubmenuDelete(String OrgDelete,String OrgRead) {
				if (OrgDelete.equalsIgnoreCase("Yes")) {
//					Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton),"The Action button Should be displayed,but not displayed");
//					elementUtil.clickWhenReady(Actionbutton, 5);
					Deletebuttonverifymethod();
				} else {
					try {
						String title2 = elementUtil.doGetText(OptionalSubjectSubmenu);
						System.out.println("title is : " + title2);
						if(title2.equalsIgnoreCase(OrgRead)) {
//						elementUtil.waitForElementToBeVisible(Actionbutton, 10);
//						elementUtil.clickWhenReady(Actionbutton, 5);
						Deletebuttonverifynomethod();
						}
					} catch (NoSuchElementException|TimeoutException e) {
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
					} catch (org.openqa.selenium.NoSuchElementException|TimeoutException e) {
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
						
					} catch (NoSuchElementException|TimeoutException e) {
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
						} catch (NoSuchElementException|TimeoutException e) {
						// TODO: handle exception
					} catch (ElementClickInterceptedException e) {
						// TODO: handle exception
					}

				}

			}

			public void verifySCsubmenuDelete(String OrgDelete,String OrgRead) {
				if (OrgDelete.equalsIgnoreCase("Yes")) {
//					Assert.assertTrue(elementUtil.doIsDisplayed(Actionbutton),"The Action button Should be displayed,but not displayed");
//					elementUtil.clickWhenReady(Actionbutton, 5);
					Deletebuttonverifymethod();
				} else {
					try {
						String title2 = elementUtil.doGetText(SchoolCalenderSubmenu);
						System.out.println("title is : " + title2);
						if(title2.equalsIgnoreCase(OrgRead)) {
//						elementUtil.waitForElementToBeVisible(Actionbutton, 10);
//						elementUtil.clickWhenReady(Actionbutton, 5);
						Deletebuttonverifynomethod();
						}
					} catch (NoSuchElementException|TimeoutException e) {
						// TODO: handle exception
					}

				}
			}
			
			public void verifySchoolCalenderSubmenu(String SCCmenu, String SCCread) {
				if (SCCread.equalsIgnoreCase("Yes")) {
					try {
						elementUtil.waitForElementToBeVisibleAssert(EnvironmentSubmenu, 10);
					} catch (TimeoutException|NoSuchElementException e) {
						// TODO: handle exception
						Assert.fail("School Calender Submenu was not displayed");
					}
					
				} else {
					try {
						SoftAssert softAssert1 = new SoftAssert();
						softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(EnvironmentSubmenu, 20),
								EnvironmentSubmenu + " " + "Main Menu is displayed,Should not be displayed");
						softAssert1.assertAll();
					} catch (org.openqa.selenium.NoSuchElementException|TimeoutException e) {
						System.out.println((EnvironmentSubmenu + " " + "Main menu is not displayed"));
					}

				}
			}	
			
			
	}	
	

