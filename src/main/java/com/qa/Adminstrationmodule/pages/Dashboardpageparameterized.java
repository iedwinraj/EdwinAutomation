package com.qa.Adminstrationmodule.pages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.MoveToOffsetAction;
import org.testng.Assert;

import com.qa.verifyroleacess.utils.ElementUtils;
import com.qa.verifyroleacess.utils.JavaScriptUtil;



public class Dashboardpageparameterized {

	private WebDriver driver;
	private ElementUtils elementUtil;
	private JavaScriptUtil jsUtil;

private String administrationMainmenu1="Administration";
	
	private By administrationMainmenu= By.partialLinkText("Administration");
	private By ParentsMainmenu=By.partialLinkText("Parents");
	
	private By OrganizationsSubmenu =By.partialLinkText("Organizations");	
	private By Createbutton =By.xpath("//button[normalize-space()='Create']");
	private By ParentProfileSubmenu =By.partialLinkText("Parent Profile");
	private By UsersSubmenu =By.partialLinkText("Users");
	private By AcademicTeachingStaffSubmenu=By.partialLinkText("Academic Teaching Staff");
	private By MasterDataCopySubmenu=By.partialLinkText("Master Data Copy");
	
	private By OtherMastersSubmenu=By.partialLinkText("Other Masters");
	private By AcademicYearchildmenu=By.partialLinkText("Academic Year");
	private By Shiftchildmenu=By.partialLinkText("Shift");
	private By Streamchildmenu=By.partialLinkText("Stream");
	private By Boardchildmenu=By.partialLinkText("Board");
	private By Countrychildmenu=By.partialLinkText("Country");
	private By AccountAccessLevelchildmenu=By.partialLinkText("Account Access Level");
	private By Statechildmenu=By.partialLinkText("State");
	private By Districtchildmenu=By.partialLinkText("District");
	private By Religionchildmenu=By.partialLinkText("Religion");
	private By Communitychildmenu=By.partialLinkText("Community");
	private By Nationalitychildmenu=By.partialLinkText("Nationality");
	private By BloodGroupchildmenu=By.partialLinkText("Blood Group");
	private By EnquirySourcechildmenu=By.partialLinkText("Enquiry Source");
	private By EnquiryFollowupStatuschildmenu=By.partialLinkText("Enquiry Follow-up Status");
	private By EnquiryFollowupModechildmenu=By.partialLinkText("Enquiry Follow-up Mode");
	private By AdmissionGradeConfchildmenu=By.partialLinkText("Admission Grade Conf");
	private By AdmissionConfchildmenu=By.partialLinkText("Admission Conf");
	private By OnlineVideosConfchildmenu=By.partialLinkText("Online Videos Conf");
	private By CutOffMasterchildmenu=By.partialLinkText("Cut-Off Master");
	private By Savebutton=By.xpath("//button[@accesskey='S']");
	private By Actionbutton=By.xpath("//button[normalize-space()='Action']");
	private By Duplicatebutton=By.xpath("//a[normalize-space()='Duplicate']");
	private By Deletebutton=By.xpath("//a[normalize-space()='Delete']");
	private By Scrollbarelement=By.xpath("//div[@class='slimScrollBar']");
	
	private By selectrecord=By.xpath("//table[@class='oe_list_content']/tbody/tr[1]");
	private By Editbutton=By.xpath("//button[@accesskey='E']");
	private By Closebutton=By.xpath("//button[text()='×']");
	public Dashboardpageparameterized(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtils(this.driver);
	}
	
	
	public void  createbuttonverifymethod() {
		try {	
	//	elementUtil.waitForElementToBeVisible(Createbutton, 20);
			elementUtil.waitForElementToBeVisible(selectrecord, 10);	
		Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton,5)," Create button displayed");
	//  assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button displayed Successfully");
		 System.out.println("Create button Clicked Successfully");
	//	elementUtil.clickWhenReady(Createbutton, 10);
		}
		catch (StaleElementReferenceException e) {
			// TODO: StaleElementhandle exception
			  System.out.println("Create button Clicked Successfully");
		}
		
		}
		public void  createbuttonverifynomethod() {
		try {
		//	  Thread.sleep(5000);
			elementUtil.waitForElementToBeVisible(selectrecord, 10);
			  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
		} catch(org.openqa.selenium.NoSuchElementException e) {
		System.out.println("Create button is not displayed"); 
		} //catch (InterruptedException e) {
		//TODO Auto-generated catch block
		//e.printStackTrace();
		//}
		catch(StaleElementReferenceException e) {
			  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
			  } 
		}
		
		public void  Editbuttonverifymethod() {
			try {
			elementUtil.waitForElementToBeLocated(Editbutton, 20);  
			Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Editbutton,20)," Create button displayed");
		//	assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button displayed Successfully");
		//	elementUtil.clickWhenReady(Editbutton, 10);
			}
			catch (StaleElementReferenceException e) {
				// TODO: StaleElementhandle exception
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

	
	
	
	
	public void verifyadministrationMainmenu(String admmn,String admmnread) {
		  if(admmnread.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(administrationMainmenu,20),admmn+" "+"Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(administrationMainmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, admmn);
				 elementUtil.clickWhenReady(administrationMainmenu, 10);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(administrationMainmenu),admmn+" "+"Main menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(admmn+" "+"Main menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyorgsubmenuRead(String Org,String OrgRead) {
		  if(OrgRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(OrganizationsSubmenu,20),Org+" Sub menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(OrganizationsSubmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Org);
				 elementUtil.clickWhenReady(OrganizationsSubmenu, 10);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(OrganizationsSubmenu),Org+" Sub menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Org+" Sub menu  Main menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyorgsubmenuCreate(String OrgCreate) {
		
		  if(OrgCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyorgsubmenuEdit(String OrgEdit) {
		  elementUtil.waitForElementToBeVisible(selectrecord,10);
		  elementUtil.clickWhenReady(selectrecord,5);
		  if(OrgEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyorgsubmenuDelete(String OrgEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(OrgEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }	
	public void verifyUserssubmenuRead(String Users,String UsersRead) {
		  if(UsersRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(UsersSubmenu,20),Users+" Sub menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(UsersSubmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Users);
				 elementUtil.clickWhenReady(UsersSubmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(UsersSubmenu),Users+" Sub menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Users+" Sub menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyUserssubmenuCreate(String UsersCreate) {
		
		  if(UsersCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyUserssubmenuEdit(String UsersEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(UsersEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyUserssubmenuDelete(String UsersEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  
		  if(UsersEdit.equalsIgnoreCase("Yes")) {
			  elementUtil.clickWhenReady(Actionbutton, 5);
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  try {
				  elementUtil.clickWhenReady(Actionbutton, 5);
			} catch (Exception e) {
				// TODO: handle exception
			}
			  
			  Deletebuttonverifynomethod();
		  }	
		  }
	public void verifyATSsubmenuRead(String ATS,String ATSRead) {
		  if(ATSRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AcademicTeachingStaffSubmenu,20),ATS+" Sub menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(AcademicTeachingStaffSubmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, ATS);
				 elementUtil.clickWhenReady(AcademicTeachingStaffSubmenu, 10);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(AcademicTeachingStaffSubmenu),ATS+" Sub menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(ATS+" Sub menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyATSsubmenuCreate(String ATSCreate) {
		
		  if(ATSCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyATSsubmenuEdit(String ATSEdit) {
//		  elementUtil.waitForElementToBeVisible(selectrecord, 20);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(ATSEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyATSsubmenuDelete(String ATSEdit) {
//		  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton,5);
		  if(ATSEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }	  
	public void verifyMasterDataCopysubmenuRead(String MasterDataCopy,String MasterDataCopyRead) {
		  if(MasterDataCopyRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(MasterDataCopySubmenu,20),MasterDataCopy+" Sub menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(MasterDataCopySubmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, MasterDataCopy);
				 elementUtil.clickWhenReady(MasterDataCopySubmenu, 5);
				 elementUtil.clickWhenReady(Closebutton, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(MasterDataCopySubmenu),MasterDataCopy+" Sub menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(MasterDataCopy+" Sub menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyMasterDataCopysubmenuCreate(String MasterDataCopyCreate) {
		
		  if(MasterDataCopyCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyMasterDataCopysubmenuEdit(String MasterDataCopy,String MasterDataCopyEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		 
		  if(MasterDataCopyEdit.equalsIgnoreCase("Yes"))
		  {
		  	Editbuttonverifymethod();	  
	  }else 
	  {	
		  try {
			  if(elementUtil.doGetText(MasterDataCopySubmenu).equalsIgnoreCase(MasterDataCopy)) {
					elementUtil.clickWhenReady(selectrecord, 10);}
				    Editbuttonverifynomethod();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println(MasterDataCopy+" Sub menu is not displayed");
		}
		    
	  }
		  }
		 	
		  	  
	public void verifyMasterDataCopysubmenuDelete(String MasterDataCopyEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(MasterDataCopyEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	public void verifyOtherMasterssubmenuRead(String OtherMasters,String OtherMastersread) {
		  if(OtherMastersread.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(OtherMastersSubmenu,20),OtherMasters+" "+"Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(OtherMastersSubmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, OtherMasters);
				 elementUtil.clickWhenReady(OtherMastersSubmenu, 10);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(OtherMastersSubmenu),OtherMastersSubmenu+" "+"Main menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(OtherMasters+" "+"Main menu is not displayed" );
					    }
		  }
		  }
	public void verifyAcademicYearChildmenuRead(String AcademicYear,String AcademicYearRead) {
		  if(AcademicYearRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AcademicYearchildmenu,20),AcademicYear+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(AcademicYearchildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, AcademicYear);
				 elementUtil.clickWhenReady(AcademicYearchildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(AcademicYearchildmenu),AcademicYear+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(AcademicYear+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyAcademicYearChildmenuCreate(String AcademicYearCreate) {
		
		  if(AcademicYearCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyAcademicYearChildmenuEdit(String AcademicYearEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(AcademicYearEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyAcademicYearChildmenuDelete(String AcademicYearEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(AcademicYearEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	public void verifyShiftChildmenuRead(String Shift,String ShiftRead) {
		  if(ShiftRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Shiftchildmenu,20),Shift+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(Shiftchildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Shift);
				 elementUtil.clickWhenReady(Shiftchildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(Shiftchildmenu),Shift+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Shift+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyShiftChildmenuCreate(String ShiftCreate) {
		
		  if(ShiftCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyShiftChildmenuEdit(String ShiftEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(ShiftEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyShiftChildmenuDelete(String ShiftDelete) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(ShiftDelete.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	public void verifyStreamChildmenuRead(String Stream,String StreamRead) {
		  if(StreamRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Streamchildmenu,20),Stream+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(Streamchildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Stream);
				 elementUtil.clickWhenReady(Streamchildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(Streamchildmenu),Stream+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Stream+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyStreamChildmenuCreate(String StreamCreate) {
		
		  if(StreamCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyStreamChildmenuEdit(String StreamEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(StreamEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyStreamChildmenuDelete(String StreamEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(StreamEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	public void verifyBoardChildmenuRead(String Board,String BoardRead) {
		  if(BoardRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Boardchildmenu,20),Board+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(Boardchildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Board);
				 elementUtil.clickWhenReady(Boardchildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(Boardchildmenu),Board+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Board+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyBoardChildmenuCreate(String BoardCreate) {
		
		  if(BoardCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyBoardChildmenuEdit(String BoardEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(BoardEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyBoardChildmenuDelete(String BoardEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(BoardEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	
	public void verifyCountryChildmenuRead(String Country,String CountryRead) {
		  if(CountryRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Countrychildmenu,20),Country+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(Countrychildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Country);
				 elementUtil.clickWhenReady(Countrychildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(Countrychildmenu),Country+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Country+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyCountryChildmenuCreate(String CountryCreate) {
		
		  if(CountryCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyCountryChildmenuEdit(String CountryEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(CountryEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyCountryChildmenuDelete(String CountryEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(CountryEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	
	public void verifyAccountAccessLevelChildmenuRead(String AccountAccessLevel,String AccountAccessLevelRead) {
		  if(AccountAccessLevelRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AccountAccessLevelchildmenu,20),AccountAccessLevel+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(AccountAccessLevelchildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, AccountAccessLevel);
				 elementUtil.clickWhenReady(AccountAccessLevelchildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(AccountAccessLevelchildmenu),AccountAccessLevel+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(AccountAccessLevel+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyAccountAccessLevelChildmenuCreate(String AccountAccessLevelCreate) {
		
		  if(AccountAccessLevelCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyAccountAccessLevelChildmenuEdit(String AccountAccessLevelEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(AccountAccessLevelEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyAccountAccessLevelChildmenuDelete(String AccountAccessLevelEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(AccountAccessLevelEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	
	public void verifyStateChildmenuRead(String State,String StateRead) {
		  if(StateRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Statechildmenu,20),State+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(Statechildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, State);
				 elementUtil.clickWhenReady(Statechildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(Statechildmenu),State+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(State+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyStateChildmenuCreate(String StateCreate) {
		
		  if(StateCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyStateChildmenuEdit(String StateEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(StateEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyStateChildmenuDelete(String StateEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(StateEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	
	public void verifyDistrictChildmenuRead(String District,String DistrictRead) {
		  if(DistrictRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Districtchildmenu,20),District+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(Districtchildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, District);
				 elementUtil.clickWhenReady(Districtchildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(Districtchildmenu),District+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(District+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyDistrictChildmenuCreate(String DistrictCreate) {
		
		  if(DistrictCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyDistrictChildmenuEdit(String DistrictEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(DistrictEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyDistrictChildmenuDelete(String DistrictEdit) {
	
			elementUtil.waitForElementToBeVisible(Actionbutton, 20);
			  elementUtil.clickWhenReady(Actionbutton, 5);
			  if(DistrictEdit.equalsIgnoreCase("Yes")) {
				  Deletebuttonverifymethod();	
			  }else 
			  {
				  Deletebuttonverifynomethod();
			  }	  
			  elementUtil.mouseaction(Scrollbarelement);
		  }
	
	public void verifyReligionChildmenuRead(String Religion,String ReligionRead) {
//		  elementUtil.mouseaction(Scrollbarelement);
			  if(ReligionRead.equalsIgnoreCase("Yes")) {  	 
				  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Religionchildmenu,20),Religion+" child menu Should be displayed, but was not displayed");
				  String title =elementUtil.doGetText(Religionchildmenu);  
					 System.out.println("title is : " + title);
					 Assert.assertEquals(title, Religion);
					 elementUtil.clickWhenReady(Religionchildmenu, 5);
			  }else {
				  try {
						assertFalse(elementUtil.doIsDisplayed(Religionchildmenu),Religion+" child menu is displayed,Should not be displayed");
						    } catch (org.openqa.selenium.NoSuchElementException e) {
						    	System.out.println(Religion+" child menu is not displayed" );
						    }
			
		} 		  if(ReligionRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Religionchildmenu,20),Religion+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(Religionchildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Religion);
				 elementUtil.clickWhenReady(Religionchildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(Religionchildmenu),Religion+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Religion+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyReligionChildmenuCreate(String ReligionCreate) {
		
		  if(ReligionCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyReligionChildmenuEdit(String ReligionEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(ReligionEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyReligionChildmenuDelete(String ReligionEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(ReligionEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	
	public void verifyCommunityChildmenuRead(String Community,String CommunityRead) {
		  if(CommunityRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Communitychildmenu,20),Community+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(Communitychildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Community);
				 elementUtil.clickWhenReady(Communitychildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(Communitychildmenu),Community+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Community+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyCommunityChildmenuCreate(String CommunityCreate) {
		
		  if(CommunityCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyCommunityChildmenuEdit(String CommunityEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(CommunityEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyCommunityChildmenuDelete(String CommunityEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(CommunityEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	
	public void verifyNationalityChildmenuRead(String Nationality,String NationalityRead) {
		  if(NationalityRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Nationalitychildmenu,20),Nationality+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(Nationalitychildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, Nationality);
				 elementUtil.clickWhenReady(Nationalitychildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(Nationalitychildmenu),Nationality+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(Nationality+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyNationalityChildmenuCreate(String NationalityCreate) {
		
		  if(NationalityCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyNationalityChildmenuEdit(String NationalityEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(NationalityEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyNationalityChildmenuDelete(String NationalityEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(NationalityEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	public void verifyBloodGroupChildmenuRead(String BloodGroup,String BloodGroupRead) {
		  if(BloodGroupRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(BloodGroupchildmenu,20),BloodGroup+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(BloodGroupchildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, BloodGroup);
				 elementUtil.clickWhenReady(BloodGroupchildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(BloodGroupchildmenu),BloodGroup+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(BloodGroup+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyBloodGroupChildmenuCreate(String BloodGroupCreate) {
		
		  if(BloodGroupCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyBloodGroupChildmenuEdit(String BloodGroupEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(BloodGroupEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyBloodGroupChildmenuDelete(String BloodGroupEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(BloodGroupEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	
	public void verifyEnquirySourceChildmenuRead(String EnquirySource,String EnquirySourceRead) {
		  if(EnquirySourceRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(EnquirySourcechildmenu,20),EnquirySource+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(EnquirySourcechildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, EnquirySource);
				 elementUtil.clickWhenReady(EnquirySourcechildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(EnquirySourcechildmenu),EnquirySource+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(EnquirySource+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyEnquirySourceChildmenuCreate(String EnquirySourceCreate) {
		
		  if(EnquirySourceCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyEnquirySourceChildmenuEdit(String EnquirySourceEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(EnquirySourceEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyEnquirySourceChildmenuDelete(String EnquirySourceEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(EnquirySourceEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	
	public void verifyEnquiryFollowupStatusChildmenuRead(String EnquiryFollowupStatus,String EnquiryFollowupStatusRead) {
		  if(EnquiryFollowupStatusRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(EnquiryFollowupStatuschildmenu,20),EnquiryFollowupStatus+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(EnquiryFollowupStatuschildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, EnquiryFollowupStatus);
				 elementUtil.clickWhenReady(EnquiryFollowupStatuschildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(EnquiryFollowupStatuschildmenu),EnquiryFollowupStatus+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(EnquiryFollowupStatus+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyEnquiryFollowupStatusChildmenuCreate(String EnquiryFollowupStatusCreate) {
		
		  if(EnquiryFollowupStatusCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyEnquiryFollowupStatusChildmenuEdit(String EnquiryFollowupStatusEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(EnquiryFollowupStatusEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyEnquiryFollowupStatusChildmenuDelete(String EnquiryFollowupStatusEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(EnquiryFollowupStatusEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	
	public void verifyEnquiryFollowupModeChildmenuRead(String EnquiryFollowupMode,String EnquiryFollowupModeRead) {
		  if(EnquiryFollowupModeRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(EnquiryFollowupModechildmenu,20),EnquiryFollowupMode+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(EnquiryFollowupModechildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, EnquiryFollowupMode);
				 elementUtil.clickWhenReady(EnquiryFollowupModechildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(EnquiryFollowupModechildmenu),EnquiryFollowupMode+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(EnquiryFollowupMode+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyEnquiryFollowupModeChildmenuCreate(String EnquiryFollowupModeCreate) {
		
		  if(EnquiryFollowupModeCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyEnquiryFollowupModeChildmenuEdit(String EnquiryFollowupModeEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(EnquiryFollowupModeEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyEnquiryFollowupModeChildmenuDelete(String EnquiryFollowupModeEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(EnquiryFollowupModeEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	public void verifyGradeConfChildmenuRead(String GradeConf,String GradeConfRead) {
			
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView();", elementUtil.getElement(AdmissionGradeConfchildmenu));
//			elementUtil.doActionsClick(AdmissionGradeConfchildmenu);
		  if(GradeConfRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AdmissionGradeConfchildmenu,20),GradeConf+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(AdmissionGradeConfchildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, GradeConf);
				 elementUtil.clickWhenReady(AdmissionGradeConfchildmenu, 10);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 elementUtil.clickWhenReady(AdmissionGradeConfchildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(AdmissionGradeConfchildmenu),GradeConf+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(GradeConf+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyGradeConfChildmenuCreate(String GradeConfCreate) {
		
		  if(GradeConfCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyGradeConfChildmenuEdit(String GradeConfEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(GradeConfEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyGradeConfChildmenuDelete(String GradeConfEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(GradeConfEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	
	public void verifyAdmConfigurationChildmenuRead(String AdmConfiguration,String AdmConfigurationRead) {
		  if(AdmConfigurationRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AdmissionConfchildmenu,20),AdmConfiguration+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(AdmissionConfchildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, AdmConfiguration);
				 elementUtil.clickWhenReady(AdmissionConfchildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(AdmissionConfchildmenu),AdmConfiguration+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(AdmConfiguration+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyAdmConfigurationChildmenuCreate(String AdmConfigurationCreate) {
		
		  if(AdmConfigurationCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyAdmConfigurationChildmenuEdit(String AdmConfigurationEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(AdmConfigurationEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyAdmConfigurationChildmenuDelete(String AdmConfigurationEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(AdmConfigurationEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	
	public void verifyOnlineVideosConfChildmenuRead(String OnlineVideosConf,String OnlineVideosConfRead) {
		  if(OnlineVideosConfRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(OnlineVideosConfchildmenu,20),OnlineVideosConf+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(OnlineVideosConfchildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, OnlineVideosConf);
				 elementUtil.clickWhenReady(OnlineVideosConfchildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(OnlineVideosConfchildmenu),OnlineVideosConf+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(OnlineVideosConf+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyOnlineVideosConfChildmenuCreate(String OnlineVideosConfCreate) {
		
		  if(OnlineVideosConfCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyOnlineVideosConfChildmenuEdit(String OnlineVideosConfEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(OnlineVideosConfEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyOnlineVideosConfChildmenuDelete(String OnlineVideosConfEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(OnlineVideosConfEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }
	
	public void verifyCutOffMasterChildmenuRead(String CutOffMaster,String CutOffMasterRead) {
		  if(CutOffMasterRead.equalsIgnoreCase("Yes")) {  	 
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(CutOffMasterchildmenu,20),CutOffMaster+" child menu Should be displayed, but was not displayed");
			  String title =elementUtil.doGetText(CutOffMasterchildmenu);  
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, CutOffMaster);
				 elementUtil.clickWhenReady(CutOffMasterchildmenu, 5);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(CutOffMasterchildmenu),CutOffMaster+" child menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println(CutOffMaster+" child menu is not displayed" );
					    }
		  
		  }
		  }
	public void verifyCutOffMasterChildmenuCreate(String CutOffMasterCreate) {
		
		  if(CutOffMasterCreate.equalsIgnoreCase("Yes")) {
				createbuttonverifymethod();	
		  }else 
		  {
			    createbuttonverifynomethod();
		  }	
		  }	  
	public void verifyCutOffMasterChildmenuEdit(String CutOffMasterEdit) {
	//	  elementUtil.waitForElementToBeVisible(selectrecord, 10);
		  elementUtil.clickWhenReady(selectrecord, 10);
		  if(CutOffMasterEdit.equalsIgnoreCase("Yes")) {
			  	Editbuttonverifymethod();	
		  }else 
		  {
			  Editbuttonverifynomethod();
		  }	
		  }	  
	public void verifyCutOffMasterChildmenuDelete(String CutOffMasterEdit) {
	//	  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		  elementUtil.clickWhenReady(Actionbutton, 5);
		  if(CutOffMasterEdit.equalsIgnoreCase("Yes")) {
			  Deletebuttonverifymethod();	
		  }else 
		  {
			  Deletebuttonverifynomethod();
		  }	
		  }

}