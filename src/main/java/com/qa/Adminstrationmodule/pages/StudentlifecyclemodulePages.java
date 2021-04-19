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
import com.qa.verifyroleacess.utils.JavaScriptUtil;

public class StudentlifecyclemodulePages  {
	
	private WebDriver driver;
	private ElementUtils elementUtil;
	private JavaScriptUtil jsUtil;
	
	private By StudentLifeCycleMainmenu=By.partialLinkText("Student Life Cycle");
	private By EnquiryEntrySubmenu =By.partialLinkText("Enquiry Entry");
	private By EnquiryEntryChildmenu =By.xpath("(//a[normalize-space()='Enquiry Entry'])[2]");
	private By EnquiryEntryFollowUpChildmenu =By.partialLinkText("Enquiry Entry Follow Up");
	private By EnquiryEntryFollowUpDashboardChildmenu =By.partialLinkText("Enquiry Entry Follow-Up Dashboard");
	private By AdmissionSubmenu =By.partialLinkText("Admission");
	private By AdmissionsChildmenu =By.partialLinkText("Admissions");
	private By AdmissionsFollowupChildmenu =By.partialLinkText("Admissions Follow-up");
	private By AdmissionDashboardChildmenu =By.partialLinkText("Admission Dashboard");
	private By EmailsChildmenu =By.partialLinkText("Emails");
	private By ParentEmailFormChildmenu =By.partialLinkText("Parent Email Form");
	private By BulkFormDownloadChildmenu =By.partialLinkText("Bulk Form Download");
	private By AdmissionReportChildmenu =By.partialLinkText("Admission Report");

	
	
	private By Createbutton =By.xpath("//button[normalize-space()='Create']");
	private By Savebutton=By.xpath("//button[@accesskey='S']");
	private By Actionbutton=By.xpath("//button[normalize-space()='Action']");
	private By topbarname= By.className("oe_topbar_name");
	private By Duplicatebutton=By.xpath("//a[normalize-space()='Duplicate']");
	private By Deletebutton=By.xpath("//a[normalize-space()='Delete']");
	private By Scrollbarelement=By.xpath("//div[@class='slimScrollBar']");
	
	private By selectrecord=By.xpath("//table[@class='oe_list_content']/tbody/tr[1]");
	private By Editbutton=By.xpath("//button[@accesskey='E']");
	private By Closebutton=By.xpath("//button[text()='×']");
	private By EnquiryEntryChildmenutitle=By.xpath("//li[text()='Enquiry Entry']");
	private By AdmissionsFollowupstitle=By.xpath("//li[text()='AdmissionsFollowups']");
	
    SoftAssert softAssert1 = new SoftAssert();
    
    
	public StudentlifecyclemodulePages(WebDriver driver) {
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
				  elementUtil.waitForElementToBeVisible(Actionbutton, 10);
				  elementUtil.clickWhenReady(Actionbutton, 5);
				  Deletebuttonverifynomethod();
			} catch (NoSuchElementException e) {
				// TODO: handle exception
			}
			  
		  }	
		  }	
	
	
	
	public void createbuttonverifymethod() {
		try {	
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
		public void createbuttonverifynomethod() {
		try {
		//	  Thread.sleep(5000);
			elementUtil.waitForElementToBeVisibleAssert(selectrecord, 10);	
//			elementUtil.waitForElementToBeVisible(selectrecord, 10);
            assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
		} catch(org.openqa.selenium.NoSuchElementException e) {
		System.out.println("Create button is not displayed"); 
		} //catch (InterruptedException e) {
		//TODO Auto-generated catch block
		//e.printStackTrace();
		//}
		catch(StaleElementReferenceException e) {
			try {
			  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
			}
			catch(org.openqa.selenium.NoSuchElementException e1) {
				System.out.println("Create button is not displayed"); 
			  } 
		catch(ElementClickInterceptedException e2) {
			  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
			  }
		}
		
		}
		
		
		
		public void Editbuttonverifymethod() {
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

	public void verifySLCMainmenu(String admmn,String admmnread) {
		  if(admmnread.equalsIgnoreCase("Yes")) { 
			  elementUtil.waitForElementToBeVisible(topbarname, 10);
			  elementUtil.waitForElementToBeVisibleAssert(StudentLifeCycleMainmenu, 10);
			  String title =elementUtil.doGetText(StudentLifeCycleMainmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(StudentLifeCycleMainmenu, 10);
		  }else {
			  try {
				  SoftAssert softAssert1 = new SoftAssert();
				  softAssert1.assertFalse(elementUtil.waitForElementToBeVisibleAssert(StudentLifeCycleMainmenu, 20),StudentLifeCycleMainmenu+" "+"Main Menu is displayed,Should not be displayed");
					 elementUtil.clickWhenReady(StudentLifeCycleMainmenu, 10);
					 softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println((StudentLifeCycleMainmenu+" "+"Main menu is not displayed"));
					    }
		  
		  }
		  }
	public void verifyEnqEntsubmenuRead(String Org,String OrgRead) {
		  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.waitForElementToBeVisibleAssert(EnquiryEntrySubmenu,20),EnquiryEntrySubmenu+" Sub menu Should be displayed, but was not displayed");
	//		  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(EnquiryEntrySubmenu,20),EnquiryEntryChildmenu+" Sub menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(EnquiryEntrySubmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Org);
				 elementUtil.clickWhenReady(EnquiryEntrySubmenu, 10);
		  }else {
			  try {
	
				  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(EnquiryEntrySubmenu, 10),"EnquiryEntrySubmenu"+" "+"Sub menu is displayed,Should not be displayed");
				//	assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Sub menu is displayed,Should not be displayed");
				    elementUtil.clickWhenReady(EnquiryEntrySubmenu, 10);
				    softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Org+" Sub menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyEnqEntChildmenuRead(String Org,String OrgRead) {
		  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(EnquiryEntryChildmenu,20),EnquiryEntryChildmenu+" Sub menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(EnquiryEntryChildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Org);
				 elementUtil.clickWhenReady(EnquiryEntryChildmenu, 10);
				 elementUtil.waitForElementToBeVisible(EnquiryEntryChildmenutitle, 10);
		  }else {
			  try {
	
				  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(EnquiryEntryChildmenu, 10),"EnquiryEntryChildmenu"+" "+"Sub menu is displayed,Should not be displayed");
				//	assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Sub menu is displayed,Should not be displayed");
				    elementUtil.clickWhenReady(EnquiryEntryChildmenu, 10);
				    elementUtil.waitForElementToBeVisible(EnquiryEntryChildmenutitle, 10);
				    softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Org+" Sub menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyEnqEntChildmenuCreate(String OrgCreate) {
		
		  if(OrgCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyEnqEntChildmenuEdit(String OrgEdit) {
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
	public void verifyEnqEntChildmenuDelete(String OrgEdit) {
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
	public void verifyEEFChildmenuRead(String Org,String OrgRead) {
		  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(EnquiryEntryFollowUpChildmenu,20),EnquiryEntryFollowUpChildmenu+" Child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(EnquiryEntryFollowUpChildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Org);
				 elementUtil.clickWhenReady(EnquiryEntryFollowUpChildmenu, 10);
		  }else {
			  try {
	
				  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(EnquiryEntryFollowUpChildmenu, 10),"EnquiryEntryFollowUpChildmenu"+" "+"Sub menu is displayed,Should not be displayed");
			//	    assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Child menu is displayed,Should not be displayed");
				    elementUtil.clickWhenReady(EnquiryEntryFollowUpChildmenu, 10);
				    softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Org+" Child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyEEFChildmenuCreate(String OrgCreate) {
		
		  if(OrgCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyEEFChildmenuEdit(String OrgEdit) {
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
	public void verifyEEFChildmenuDelete(String OrgEdit) {
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
	public void verifyEEFDChildmenuRead(String Org,String OrgRead) {
		  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(EnquiryEntryFollowUpDashboardChildmenu,20),EnquiryEntryFollowUpDashboardChildmenu+" Child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(EnquiryEntryFollowUpDashboardChildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Org);
				 elementUtil.clickWhenReady(EnquiryEntryFollowUpDashboardChildmenu, 10);
		  }else {
			  try {
	
				  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(EnquiryEntryFollowUpDashboardChildmenu, 10),"EnquiryEntryFollowUpDashboardChildmenu"+" "+"Sub menu is displayed,Should not be displayed");
			//	    assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Child menu is displayed,Should not be displayed");
				    elementUtil.clickWhenReady(EnquiryEntryFollowUpDashboardChildmenu, 10);
				    softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Org+" Child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyEEFDChildmenuCreate(String OrgCreate) {
		
		  if(OrgCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyEEFDChildmenuEdit(String OrgEdit) {
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
	public void verifyEEFDChildmenuDelete(String OrgEdit) {
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
			}
			  catch (TimeoutException e) {
				}
			  
		  }	
		  }	
	public void verifyAdmissionSubmenuRead(String Org,String OrgRead) {
		  if(OrgRead.equalsIgnoreCase("Yes")) {  
			  elementUtil.mouseaction(Scrollbarelement);
			  
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AdmissionSubmenu,20),AdmissionSubmenu+" Child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(AdmissionSubmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Org);
				 elementUtil.clickWhenReady(AdmissionSubmenu, 10);
		  }else {
			  try { 
				  elementUtil.mouseaction(Scrollbarelement);
				  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(AdmissionSubmenu, 10),"AdmissionSubmenu"+" "+"Sub menu is displayed,Should not be displayed");
			//	    assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Child menu is displayed,Should not be displayed");
				    elementUtil.clickWhenReady(AdmissionSubmenu, 10);
				    softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Org+" Child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyAdmissionSubmenuCreate(String OrgCreate) {
		
		  if(OrgCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyAdmissionSubmenuEdit(String OrgEdit) {
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
	public void verifyAdmissionSubmenuDelete(String OrgEdit) {
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
	public void verifyAdmissionsChildmenuRead(String Org,String OrgRead) {
		  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AdmissionsChildmenu,20),AdmissionsChildmenu+" Child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(AdmissionsChildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Org);
				 elementUtil.clickWhenReady(AdmissionsChildmenu, 10);
		  }else {
			  try {
	
				  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(AdmissionsChildmenu, 10),"AdmissionsChildmenu"+" "+"Sub menu is displayed,Should not be displayed");
			//	    assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Child menu is displayed,Should not be displayed");
				    elementUtil.clickWhenReady(AdmissionsChildmenu, 10);
				    softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Org+" Child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyAdmissionsChildmenuCreate(String OrgCreate) {
		
		  if(OrgCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyAdmissionsChildmenuEdit(String OrgEdit) {
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
	public void verifyAdmissionsChildmenuDelete(String OrgEdit) {
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
		
	public void verifyAdmissionsFollowupChildmenuRead(String Org,String OrgRead) {
		  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AdmissionsFollowupChildmenu,20),AdmissionsFollowupChildmenu+" Child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(AdmissionsFollowupChildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Org);
				 elementUtil.clickWhenReady(AdmissionsFollowupChildmenu, 10);
		  }else {
			  try {
	
				  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(AdmissionsFollowupChildmenu, 10),"AdmissionsFollowupChildmenu"+" "+"Sub menu is displayed,Should not be displayed");
			//	    assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Child menu is displayed,Should not be displayed");
				    elementUtil.clickWhenReady(AdmissionsFollowupChildmenu, 10);
				    elementUtil.waitForElementToBeLocated(AdmissionsFollowupstitle, 10);
				    softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Org+" Child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyAdmissionsFollowupChildmenuCreate(String OrgCreate) {
		
		  if(OrgCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyAdmissionsFollowupChildmenuEdit(String OrgEdit) {
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
	public void verifyAdmissionsFollowupChildmenuDelete(String OrgEdit) {
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
	public void verifyAdmissionDashboardChildmenuRead(String Org,String OrgRead) {
		  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AdmissionDashboardChildmenu,20),AdmissionDashboardChildmenu+" Child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(AdmissionDashboardChildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Org);
				 elementUtil.clickWhenReady(AdmissionDashboardChildmenu, 10);
		  }else {
			  try {
	
				  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(AdmissionDashboardChildmenu, 10),"AdmissionDashboardChildmenu"+" "+"Sub menu is displayed,Should not be displayed");
			//	    assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Child menu is displayed,Should not be displayed");
				    elementUtil.clickWhenReady(AdmissionDashboardChildmenu, 10);
				    softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Org+" Child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyAdmissionDashboardChildmenuCreate(String OrgCreate) {
		
		  if(OrgCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyAdmissionDashboardChildmenuEdit(String OrgEdit) {
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
	public void verifyAdmissionDashboardChildmenuDelete(String OrgEdit) {
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
	public void verifyEmailsChildmenuRead(String Org,String OrgRead) {
		  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(EmailsChildmenu,20),EmailsChildmenu+" Child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(EmailsChildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Org);
				 elementUtil.clickWhenReady(EmailsChildmenu, 10);
		  }else {
			  try {
	
				  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(EmailsChildmenu, 10),"EmailsChildmenu"+" "+"Sub menu is displayed,Should not be displayed");
			//	    assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Child menu is displayed,Should not be displayed");
				    elementUtil.clickWhenReady(EmailsChildmenu, 10);
				    softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Org+" Child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyEmailsChildmenuCreate(String OrgCreate) {
		
		  if(OrgCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyEmailsChildmenuEdit(String OrgEdit) {
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
	public void verifyEmailsChildmenuDelete(String OrgEdit) {
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
	public void verifyParentEmailFormChildmenuRead(String Org,String OrgRead) {
		  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(ParentEmailFormChildmenu,20),ParentEmailFormChildmenu+" Child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(ParentEmailFormChildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Org);
				 elementUtil.clickWhenReady(ParentEmailFormChildmenu, 10);
		  }else {
			  try {
	
				  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(ParentEmailFormChildmenu, 10),"ParentEmailFormChildmenu"+" "+"Sub menu is displayed,Should not be displayed");
			//	    assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Child menu is displayed,Should not be displayed");
				    elementUtil.clickWhenReady(ParentEmailFormChildmenu, 10);
				    softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Org+" Child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyParentEmailFormChildmenuCreate(String OrgCreate) {
		
		  if(OrgCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyParentEmailFormChildmenuEdit(String OrgEdit) {
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
	public void verifyParentEmailFormChildmenuDelete(String OrgEdit) {
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
	public void verifyBulkFormDownloadChildmenuRead(String Org,String OrgRead) {
		  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(BulkFormDownloadChildmenu,20),BulkFormDownloadChildmenu+" Child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(BulkFormDownloadChildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Org);
				 elementUtil.clickWhenReady(BulkFormDownloadChildmenu, 10);
				 elementUtil.clickWhenReady(Closebutton, 10);
		  }else {
			  try {
	
				  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(BulkFormDownloadChildmenu, 10),"BulkFormDownloadChildmenu"+" "+"Sub menu is displayed,Should not be displayed");
			//	    assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Child menu is displayed,Should not be displayed");
				    elementUtil.clickWhenReady(BulkFormDownloadChildmenu, 10);
				    elementUtil.clickWhenReady(Closebutton, 10);
				    softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Org+" Child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyBulkFormDownloadChildmenuCreate(String OrgCreate) {
		
		  if(OrgCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyBulkFormDownloadChildmenuEdit(String OrgEdit) {
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
	public void verifyBulkFormDownloadChildmenuDelete(String OrgEdit) {
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
	public void verifyAdmissionReportChildmenuRead(String Org,String OrgRead) {
		  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AdmissionReportChildmenu,20),AdmissionReportChildmenu+" Child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(AdmissionReportChildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Org);
				 elementUtil.clickWhenReady(AdmissionReportChildmenu, 10);
				 elementUtil.clickWhenReady(Closebutton, 10);
		  }else {
			  try {
	
				  softAssert1.assertFalse(elementUtil.verifyelementIsDisplayed(AdmissionReportChildmenu, 10),"AdmissionReportChildmenu"+" "+"Sub menu is displayed,Should not be displayed");
			//	    assertFalse(elementUtil.doIsDisplayed(ParentProfileSubmenu),Org+" Child menu is displayed,Should not be displayed");
				    elementUtil.clickWhenReady(AdmissionReportChildmenu, 10);
				    elementUtil.clickWhenReady(Closebutton, 10);
				    softAssert1.assertAll();
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Org+" Child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyAdmissionReportChildmenuCreate(String OrgCreate) {
		
		  if(OrgCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyAdmissionReportChildmenuEdit(String OrgEdit) {
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
	public void verifyAdmissionReportChildmenuDelete(String OrgEdit) {
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









}
