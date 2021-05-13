package com.qa.Adminstrationmodule.pages;

import static org.testng.Assert.assertFalse;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.verifyroleacess.utils.ElementUtils;
import com.qa.verifyroleacess.utils.JavaScriptUtil;

public class Dashboardpageparameterized {

	private WebDriver driver;
	private ElementUtils elementUtil;
	private JavaScriptUtil jsUtil;

	private String administrationMainmenu1 = "Administration";

	private By administrationMainmenu = By.partialLinkText("Administration");
	private By ParentsMainmenu = By.partialLinkText("Parents");

	private By OrganizationsSubmenu = By.partialLinkText("Organizations");
	private By Createbutton = By.xpath("//button[normalize-space()='Create']");
	private By ParentProfileSubmenu = By.partialLinkText("Parent Profile");
	private By UsersSubmenu = By.partialLinkText("Users");
	private By AcademicTeachingStaffSubmenu = By.partialLinkText("Academic Teaching Staff");
	private By MasterDataCopySubmenu = By.partialLinkText("Master Data Copy");

	private By OtherMastersSubmenu = By.partialLinkText("Other Masters");
	private By AcademicYearchildmenu = By.partialLinkText("Academic Year");
	private By Shiftchildmenu = By.partialLinkText("Shift");
	private By Streamchildmenu = By.partialLinkText("Stream");
	private By Boardchildmenu = By.partialLinkText("Board");
	private By Countrychildmenu = By.partialLinkText("Country");
	private By AccountAccessLevelchildmenu = By.partialLinkText("Account Access Level");
	private By Statechildmenu = By.partialLinkText("State");
	private By Districtchildmenu = By.partialLinkText("District");
	private By Religionchildmenu = By.partialLinkText("Religion");
	private By Communitychildmenu = By.partialLinkText("Community");
	private By Nationalitychildmenu = By.partialLinkText("Nationality");
	private By BloodGroupchildmenu = By.partialLinkText("Blood Group");
	private By EnquirySourcechildmenu = By.partialLinkText("Enquiry Source");
	private By EnquiryFollowupStatuschildmenu = By.partialLinkText("Enquiry Follow-up Status");
	private By EnquiryFollowupModechildmenu = By.partialLinkText("Enquiry Follow-up Mode");
	private By AdmissionGradeConfchildmenu = By.partialLinkText("Admission Grade Conf");
	private By AdmissionConfchildmenu = By.partialLinkText("Admission Conf");
	private By OnlineVideosConfchildmenu = By.partialLinkText("Online Videos Conf");
	private By CutOffMasterchildmenu = By.partialLinkText("Cut-Off Master");
	private By Savebutton = By.xpath("//button[@accesskey='S']");
	private By Actionbutton = By.xpath("//button[normalize-space()='Action']");
	private By Duplicatebutton = By.xpath("//a[normalize-space()='Duplicate']");
	private By Deletebutton = By.xpath("//a[normalize-space()='Delete']");
	private By Scrollbarelement = By.xpath("//div[@class='slimScrollBar']");

	private By selectrecord = By.xpath("//table[@class='oe_list_content']/tbody/tr[1]");
	private By Editbutton = By.xpath("//button[@accesskey='E']");
	private By Closebutton = By.xpath("//button[text()='×']");

	public Dashboardpageparameterized(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtils(this.driver);
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
		try {
			// elementUtil.waitForElementToBeLocated(Deletebutton, 5);
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

	}

	public void Deletebuttonverifynomethod() {
		SoftAssert assert1= new SoftAssert();
		try {
			// Thread.sleep(5000);
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

	public void verifyadministrationMainmenu(String admmn, String admmnread) {
		SoftAssert assert1 = new SoftAssert();
		if (admmnread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(administrationMainmenu, 20),
						admmn + " " + "Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(administrationMainmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, admmn);
				elementUtil.clickWhenReady(administrationMainmenu, 10);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The administrationMainmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(administrationMainmenu),
						admmn + " " + "Main menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(administrationMainmenu, 10);
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println(admmn + " " + "Main menu is not displayed");
			}
		}
		assert1.assertAll();
	}

	public void verifyorgsubmenuRead(String Org, String OrgRead) {
		SoftAssert assert1 = new SoftAssert();
		if (OrgRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(OrganizationsSubmenu, 20),
						Org + " Sub menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(OrganizationsSubmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, Org);
				elementUtil.clickWhenReady(OrganizationsSubmenu, 10);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The Organization Submenu Should be displayed,but not displayed");
			}

		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(OrganizationsSubmenu),
						Org + " Sub menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(OrganizationsSubmenu, 10);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(Org + " Sub menu  Main menu is not displayed");
			}

		}
		assert1.assertAll();
	}

	public void verifyorgsubmenuCreate(String OrgCreate) {

		if (OrgCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyorgsubmenuEdit(String OrgEdit) {
		elementUtil.waitForElementToBeVisible(selectrecord, 10);
		elementUtil.clickWhenReady(selectrecord, 5);
		if (OrgEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyorgsubmenuDelete(String OrgEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (OrgEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyUserssubmenuRead(String Users, String UsersRead) {
		SoftAssert assert1 = new SoftAssert();
		if (UsersRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(UsersSubmenu, 20),
						Users + " Sub menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(UsersSubmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, Users);
				elementUtil.clickWhenReady(UsersSubmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The UsersSubmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(UsersSubmenu),
						Users + " Sub menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(UsersSubmenu, 10);
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println(Users + " Sub menu is not displayed");
			}
		}
		assert1.assertAll();
	}

	public void verifyUserssubmenuCreate(String UsersCreate) {

		if (UsersCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyUserssubmenuEdit(String UsersEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (UsersEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyUserssubmenuDelete(String UsersEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);

		if (UsersEdit.equalsIgnoreCase("Yes")) {
			// elementUtil.clickWhenReady(Actionbutton, 5);
			Deletebuttonverifymethod();
		} else {
			try {
				// elementUtil.clickWhenReady(Actionbutton, 5);
			} catch (Exception e) {
				// TODO: handle exception
			}

			Deletebuttonverifynomethod();
		}
	}

	public void verifyATSsubmenuRead(String ATS, String ATSRead) {
		SoftAssert assert1 = new SoftAssert();
		if (ATSRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AcademicTeachingStaffSubmenu, 20),
						ATS + " Sub menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(AcademicTeachingStaffSubmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, ATS);
				elementUtil.clickWhenReady(AcademicTeachingStaffSubmenu, 10);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The AcademicTeachingStaffSubmenu Should be displayed,but not displayed");
			}

		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(AcademicTeachingStaffSubmenu),
						ATS + " Sub menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(AcademicTeachingStaffSubmenu, 10);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(ATS + " Sub menu is not displayed");
			}
		}
		assert1.assertAll();
	}

	public void verifyATSsubmenuCreate(String ATSCreate) {

		if (ATSCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyATSsubmenuEdit(String ATSEdit) {
//		  elementUtil.waitForElementToBeVisible(selectrecord, 20);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (ATSEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyATSsubmenuDelete(String ATSEdit) {
//		  elementUtil.waitForElementToBeVisible(Actionbutton, 20);
//		  elementUtil.clickWhenReady(Actionbutton,5);
		if (ATSEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyMasterDataCopysubmenuRead(String MasterDataCopy, String MasterDataCopyRead) {
		SoftAssert assert1 = new SoftAssert();
		if (MasterDataCopyRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(MasterDataCopySubmenu, 20),
						MasterDataCopy + " Sub menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(MasterDataCopySubmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, MasterDataCopy);
				elementUtil.clickWhenReady(MasterDataCopySubmenu, 5);
				elementUtil.clickWhenReady(Closebutton, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The MasterDataCopySubmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(MasterDataCopySubmenu),
						MasterDataCopy + " Sub menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(MasterDataCopySubmenu, 5);
				elementUtil.clickWhenReady(Closebutton, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(MasterDataCopy + " Sub menu is not displayed");
			}
		}
		assert1.assertAll();
	}

	public void verifyMasterDataCopysubmenuCreate(String MasterDataCopyCreate) {

		if (MasterDataCopyCreate.equalsIgnoreCase("Yes")) {
//			createbuttonverifymethod();
		} else {
//			createbuttonverifynomethod();
		}
	}

	public void verifyMasterDataCopysubmenuEdit(String MasterDataCopy, String MasterDataCopyEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);

		if (MasterDataCopyEdit.equalsIgnoreCase("Yes")) {
//			Editbuttonverifymethod();
		} else {
			try {
				if (elementUtil.doGetText(MasterDataCopySubmenu).equalsIgnoreCase(MasterDataCopy)) {
					// elementUtil.clickWhenReady(selectrecord, 10);
				}
	//			Editbuttonverifynomethod();
			} catch (NoSuchElementException|TimeoutException e) {
				// TODO: handle exception
				System.out.println(MasterDataCopy + " Sub menu is not displayed");
			}

		}
	}

	public void verifyMasterDataCopysubmenuDelete(String MasterDataCopyEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (MasterDataCopyEdit.equalsIgnoreCase("Yes")) {
//			Deletebuttonverifymethod();
		} else {
//			Deletebuttonverifynomethod();
		}
	}

	public void verifyOtherMasterssubmenuRead(String OtherMasters, String OtherMastersread) {
		SoftAssert assert1 = new SoftAssert();
		if (OtherMastersread.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(OtherMastersSubmenu, 20),
						OtherMasters + " " + "Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(OtherMastersSubmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, OtherMasters);
				elementUtil.clickWhenReady(OtherMastersSubmenu, 10);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The OtherMastersSubmenu Submenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(OtherMastersSubmenu),
						OtherMastersSubmenu + " " + "Main menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(OtherMastersSubmenu, 10);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(OtherMasters + " " + "Main menu is not displayed");
			}
		}
		assert1.assertAll();
	}

	public void verifyAcademicYearChildmenuRead(String AcademicYear, String AcademicYearRead) {
		SoftAssert assert1 = new SoftAssert();
		if (AcademicYearRead.equalsIgnoreCase("Yes")) {
			Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AcademicYearchildmenu, 20),
					AcademicYear + " child menu Should be displayed, but was not displayed");
			String title = elementUtil.doGetText(AcademicYearchildmenu);
			System.out.println("title is : " + title);
			Assert.assertEquals(title, AcademicYear);
			elementUtil.clickWhenReady(AcademicYearchildmenu, 5);
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(AcademicYearchildmenu),
						AcademicYear + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(AcademicYearchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(AcademicYear + " child menu is not displayed");
			}

		}
		assert1.assertAll();
	}

	public void verifyAcademicYearChildmenuCreate(String AcademicYearCreate) {

		if (AcademicYearCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyAcademicYearChildmenuEdit(String AcademicYearEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (AcademicYearEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyAcademicYearChildmenuDelete(String AcademicYearEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (AcademicYearEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyShiftChildmenuRead(String Shift, String ShiftRead) {
		SoftAssert assert1 = new SoftAssert();
		if (ShiftRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Shiftchildmenu, 20),
						Shift + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(Shiftchildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, Shift);
				elementUtil.clickWhenReady(Shiftchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The Shiftchildmenu Submenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(Shiftchildmenu),
						Shift + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(Shiftchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(Shift + " child menu is not displayed");
			}
		}
		assert1.assertAll();
	}

	public void verifyShiftChildmenuCreate(String ShiftCreate) {

		if (ShiftCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyShiftChildmenuEdit(String ShiftEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (ShiftEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyShiftChildmenuDelete(String ShiftDelete) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (ShiftDelete.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyStreamChildmenuRead(String Stream, String StreamRead) {
		SoftAssert assert1 = new SoftAssert();
		if (StreamRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Streamchildmenu, 20),
						Stream + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(Streamchildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, Stream);
				elementUtil.clickWhenReady(Streamchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The Streamchildmenu Submenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(Streamchildmenu),
						Stream + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(Streamchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(Stream + " child menu is not displayed");
			}

		}
		assert1.assertAll();
	}

	public void verifyStreamChildmenuCreate(String StreamCreate) {

		if (StreamCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyStreamChildmenuEdit(String StreamEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (StreamEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyStreamChildmenuDelete(String StreamEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (StreamEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyBoardChildmenuRead(String Board, String BoardRead) {
		SoftAssert assert1 = new SoftAssert();
		if (BoardRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Boardchildmenu, 20),
						Board + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(Boardchildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, Board);
				elementUtil.clickWhenReady(Boardchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The Boardchildmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(Boardchildmenu),
						Board + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(Boardchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(Board + " child menu is not displayed");
			}

		}
		assert1.assertAll();
	}

	public void verifyBoardChildmenuCreate(String BoardCreate) {

		if (BoardCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyBoardChildmenuEdit(String BoardEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (BoardEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyBoardChildmenuDelete(String BoardEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (BoardEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyCountryChildmenuRead(String Country, String CountryRead) {

		SoftAssert assert1 = new SoftAssert();
		if (CountryRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Countrychildmenu, 20),
						Country + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(Countrychildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, Country);
				elementUtil.clickWhenReady(Countrychildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The Countrychildmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(Countrychildmenu),
						Country + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(Countrychildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(Country + " child menu is not displayed");
			}
		}
		assert1.assertAll();
	}

	public void verifyCountryChildmenuCreate(String CountryCreate) {

		if (CountryCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyCountryChildmenuEdit(String CountryEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (CountryEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyCountryChildmenuDelete(String CountryEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (CountryEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyAccountAccessLevelChildmenuRead(String AccountAccessLevel, String AccountAccessLevelRead) {
		SoftAssert assert1 = new SoftAssert();
		if (AccountAccessLevelRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AccountAccessLevelchildmenu, 20),
						AccountAccessLevel + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(AccountAccessLevelchildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, AccountAccessLevel);
				elementUtil.clickWhenReady(AccountAccessLevelchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The AccountAccessLevelchildmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(AccountAccessLevelchildmenu),
						AccountAccessLevel + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(AccountAccessLevelchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(AccountAccessLevel + " child menu is not displayed");
			}

		}
		assert1.assertAll();
	}

	public void verifyAccountAccessLevelChildmenuCreate(String AccountAccessLevelCreate) {

		if (AccountAccessLevelCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyAccountAccessLevelChildmenuEdit(String AccountAccessLevelEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (AccountAccessLevelEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyAccountAccessLevelChildmenuDelete(String AccountAccessLevelEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (AccountAccessLevelEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyStateChildmenuRead(String State, String StateRead) {
		SoftAssert assert1 = new SoftAssert();
		if (StateRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Statechildmenu, 20),
						State + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(Statechildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, State);
				elementUtil.clickWhenReady(Statechildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The Statechildmenu Submenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(Statechildmenu),
						State + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(Statechildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(State + " child menu is not displayed");
			}

		}
		assert1.assertAll();
	}

	public void verifyStateChildmenuCreate(String StateCreate) {

		if (StateCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyStateChildmenuEdit(String StateEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (StateEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyStateChildmenuDelete(String StateEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (StateEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyDistrictChildmenuRead(String District, String DistrictRead) {
		SoftAssert assert1 = new SoftAssert();
		if (DistrictRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Districtchildmenu, 20),
						District + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(Districtchildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, District);
				elementUtil.clickWhenReady(Districtchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The Districtchildmenu Submenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(Districtchildmenu),
						District + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(Districtchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(District + " child menu is not displayed");
			}

		}
		assert1.assertAll();
	}

	public void verifyDistrictChildmenuCreate(String DistrictCreate) {

		if (DistrictCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyDistrictChildmenuEdit(String DistrictEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (DistrictEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyDistrictChildmenuDelete(String DistrictEdit) {

//			elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (DistrictEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
		elementUtil.mouseaction(Scrollbarelement);
	}

	public void verifyReligionChildmenuRead(String Religion, String ReligionRead) {
		SoftAssert assert1 = new SoftAssert();
//		  elementUtil.mouseaction(Scrollbarelement);
		if (ReligionRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Religionchildmenu, 20),
						Religion + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(Religionchildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, Religion);
				elementUtil.clickWhenReady(Religionchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The Religionchildmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(Religionchildmenu),
						Religion + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(Religionchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println(Religion + " child menu is not displayed");
			}
		}

		if (ReligionRead.equalsIgnoreCase("Yes")) {

			Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Religionchildmenu, 20),
					Religion + " child menu Should be displayed, but was not displayed");
			String title = elementUtil.doGetText(Religionchildmenu);
			System.out.println("title is : " + title);
			Assert.assertEquals(title, Religion);
			elementUtil.clickWhenReady(Religionchildmenu, 5);

		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(Religionchildmenu),
						Religion + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(Religionchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(Religion + " child menu is not displayed");
			}

		}
		assert1.assertAll();
	}

	public void verifyReligionChildmenuCreate(String ReligionCreate) {

		if (ReligionCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyReligionChildmenuEdit(String ReligionEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (ReligionEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyReligionChildmenuDelete(String ReligionEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (ReligionEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyCommunityChildmenuRead(String Community, String CommunityRead) {
		SoftAssert assert1 = new SoftAssert();
		if (CommunityRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Communitychildmenu, 20),
						Community + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(Communitychildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, Community);
				elementUtil.clickWhenReady(Communitychildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The Communitychildmenu Submenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(Communitychildmenu),
						Community + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(Communitychildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(Community + " child menu is not displayed");
			}
		}
		assert1.assertAll();
	}

	public void verifyCommunityChildmenuCreate(String CommunityCreate) {

		if (CommunityCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyCommunityChildmenuEdit(String CommunityEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (CommunityEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyCommunityChildmenuDelete(String CommunityEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (CommunityEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyNationalityChildmenuRead(String Nationality, String NationalityRead) {
		SoftAssert assert1 = new SoftAssert();
		if (NationalityRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Nationalitychildmenu, 20),
						Nationality + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(Nationalitychildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, Nationality);
				elementUtil.clickWhenReady(Nationalitychildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The Nationalitychildmenu Submenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(Nationalitychildmenu),
						Nationality + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(Nationalitychildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(Nationality + " child menu is not displayed");
			}
		}
		assert1.assertAll();
	}

	public void verifyNationalityChildmenuCreate(String NationalityCreate) {

		if (NationalityCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyNationalityChildmenuEdit(String NationalityEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (NationalityEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyNationalityChildmenuDelete(String NationalityEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (NationalityEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyBloodGroupChildmenuRead(String BloodGroup, String BloodGroupRead) {
		SoftAssert assert1 = new SoftAssert();
		if (BloodGroupRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(BloodGroupchildmenu, 20),
						BloodGroup + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(BloodGroupchildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, BloodGroup);
				elementUtil.clickWhenReady(BloodGroupchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The BloodGroupchildmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(BloodGroupchildmenu),
						BloodGroup + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(BloodGroupchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(BloodGroup + " child menu is not displayed");
			}
		}
		assert1.assertAll();
	}

	public void verifyBloodGroupChildmenuCreate(String BloodGroupCreate) {

		if (BloodGroupCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyBloodGroupChildmenuEdit(String BloodGroupEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (BloodGroupEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyBloodGroupChildmenuDelete(String BloodGroupEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (BloodGroupEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyEnquirySourceChildmenuRead(String EnquirySource, String EnquirySourceRead) {
		SoftAssert assert1 = new SoftAssert();
		if (EnquirySourceRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(EnquirySourcechildmenu, 20),
						EnquirySource + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(EnquirySourcechildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, EnquirySource);
				elementUtil.clickWhenReady(EnquirySourcechildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The EnquirySourcechildmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(EnquirySourcechildmenu),
						EnquirySource + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(EnquirySourcechildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(EnquirySource + " child menu is not displayed");
			}

		}
		assert1.assertAll();
	}

	public void verifyEnquirySourceChildmenuCreate(String EnquirySourceCreate) {

		if (EnquirySourceCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyEnquirySourceChildmenuEdit(String EnquirySourceEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (EnquirySourceEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyEnquirySourceChildmenuDelete(String EnquirySourceEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (EnquirySourceEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyEnquiryFollowupStatusChildmenuRead(String EnquiryFollowupStatus,
			String EnquiryFollowupStatusRead) {
		SoftAssert assert1 = new SoftAssert();
		if (EnquiryFollowupStatusRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(EnquiryFollowupStatuschildmenu, 20),
						EnquiryFollowupStatus + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(EnquiryFollowupStatuschildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, EnquiryFollowupStatus);
				elementUtil.clickWhenReady(EnquiryFollowupStatuschildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The EnquiryFollowupStatuschildmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(EnquiryFollowupStatuschildmenu),
						EnquiryFollowupStatus + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(EnquiryFollowupStatuschildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(EnquiryFollowupStatus + " child menu is not displayed");
			}
		}
		assert1.assertAll();
	}

	public void verifyEnquiryFollowupStatusChildmenuCreate(String EnquiryFollowupStatusCreate) {

		if (EnquiryFollowupStatusCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyEnquiryFollowupStatusChildmenuEdit(String EnquiryFollowupStatusEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (EnquiryFollowupStatusEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyEnquiryFollowupStatusChildmenuDelete(String EnquiryFollowupStatusEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (EnquiryFollowupStatusEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyEnquiryFollowupModeChildmenuRead(String EnquiryFollowupMode, String EnquiryFollowupModeRead) {
		SoftAssert assert1 = new SoftAssert();
		if (EnquiryFollowupModeRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(EnquiryFollowupModechildmenu, 20),
						EnquiryFollowupMode + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(EnquiryFollowupModechildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, EnquiryFollowupMode);
				elementUtil.clickWhenReady(EnquiryFollowupModechildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The EnquiryFollowupModechildmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(EnquiryFollowupModechildmenu),
						EnquiryFollowupMode + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(EnquiryFollowupModechildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(EnquiryFollowupMode + " child menu is not displayed");
			}

		}
		assert1.assertAll();
	}

	public void verifyEnquiryFollowupModeChildmenuCreate(String EnquiryFollowupModeCreate) {

		if (EnquiryFollowupModeCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyEnquiryFollowupModeChildmenuEdit(String EnquiryFollowupModeEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (EnquiryFollowupModeEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyEnquiryFollowupModeChildmenuDelete(String EnquiryFollowupModeEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (EnquiryFollowupModeEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyGradeConfChildmenuRead(String GradeConf, String GradeConfRead) {
		SoftAssert assert1 = new SoftAssert();
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView();", elementUtil.getElement(AdmissionGradeConfchildmenu));
//			elementUtil.doActionsClick(AdmissionGradeConfchildmenu);
		if (GradeConfRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AdmissionGradeConfchildmenu, 20),
						GradeConf + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(AdmissionGradeConfchildmenu);
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
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The AdmissionGradeConfchildmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(AdmissionGradeConfchildmenu),
						GradeConf + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(AdmissionGradeConfchildmenu, 10);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(GradeConf + " child menu is not displayed");
			}
		}
		assert1.assertAll();
	}

	public void verifyGradeConfChildmenuCreate(String GradeConfCreate) {

		if (GradeConfCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyGradeConfChildmenuEdit(String GradeConfEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (GradeConfEdit.equalsIgnoreCase("Yes")) {
			try {
				Thread.sleep(5000);
				Editbuttonverifymethod();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else {
			try {
				Thread.sleep(5000);
				Editbuttonverifynomethod();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public void verifyGradeConfChildmenuDelete(String GradeConfEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (GradeConfEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyAdmConfigurationChildmenuRead(String AdmConfiguration, String AdmConfigurationRead) {
		SoftAssert assert1 = new SoftAssert();
		if (AdmConfigurationRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AdmissionConfchildmenu, 20),
						AdmConfiguration + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(AdmissionConfchildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, AdmConfiguration);
				elementUtil.clickWhenReady(AdmissionConfchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The AdmissionConfchildmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(AdmissionConfchildmenu),
						AdmConfiguration + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(AdmissionConfchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(AdmConfiguration + " child menu is not displayed");
			}

		}
		assert1.assertAll();
	}

	public void verifyAdmConfigurationChildmenuCreate(String AdmConfigurationCreate) {

		if (AdmConfigurationCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyAdmConfigurationChildmenuEdit(String AdmConfigurationEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (AdmConfigurationEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyAdmConfigurationChildmenuDelete(String AdmConfigurationEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (AdmConfigurationEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod();
		}
	}

	public void verifyOnlineVideosConfChildmenuRead(String OnlineVideosConf, String OnlineVideosConfRead) {
		SoftAssert assert1 = new SoftAssert();
		if (OnlineVideosConfRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(OnlineVideosConfchildmenu, 20),
						OnlineVideosConf + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(OnlineVideosConfchildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, OnlineVideosConf);
				elementUtil.clickWhenReady(OnlineVideosConfchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The OnlineVideosConfchildmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(OnlineVideosConfchildmenu),
						OnlineVideosConf + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(OnlineVideosConfchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(OnlineVideosConf + " child menu is not displayed");
			}
		}
		assert1.assertAll();
	}

	public void verifyOnlineVideosConfChildmenuCreate(String OnlineVideosConfCreate) {

		if (OnlineVideosConfCreate.equalsIgnoreCase("Yes")) {
//			createbuttonverifymethod();
		} else {
//			createbuttonverifynomethod();
		}
	}

	public void verifyOnlineVideosConfChildmenuEdit(String OnlineVideosConfEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (OnlineVideosConfEdit.equalsIgnoreCase("Yes")) {
//			Editbuttonverifymethod();
		} else {
//			Editbuttonverifynomethod();
		}
	}

	public void verifyOnlineVideosConfChildmenuDelete(String OnlineVideosConfEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (OnlineVideosConfEdit.equalsIgnoreCase("Yes")) {
//			Deletebuttonverifymethod();
		} else {
//			Deletebuttonverifynomethod();
		}
	}

	public void verifyCutOffMasterChildmenuRead(String CutOffMaster, String CutOffMasterRead) {
		SoftAssert assert1 = new SoftAssert();
		if (CutOffMasterRead.equalsIgnoreCase("Yes")) {
			try {
				Assert.assertTrue(elementUtil.verifyelementIsDisplayed(CutOffMasterchildmenu, 20),
						CutOffMaster + " child menu Should be displayed, but was not displayed");
				String title = elementUtil.doGetText(CutOffMasterchildmenu);
				System.out.println("title is : " + title);
				Assert.assertEquals(title, CutOffMaster);
				elementUtil.clickWhenReady(CutOffMasterchildmenu, 5);
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				Assert.fail("The CutOffMasterchildmenu Should be displayed,but not displayed");
			}
		} else {
			try {
				assert1.assertFalse(elementUtil.doIsDisplayed(CutOffMasterchildmenu),
						CutOffMaster + " child menu is displayed,Should not be displayed");
				elementUtil.clickWhenReady(CutOffMasterchildmenu, 5);
				
			} catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
				System.out.println(CutOffMaster + " child menu is not displayed");
			}

		}
		assert1.assertAll();
	}

	public void verifyCutOffMasterChildmenuCreate(String CutOffMasterCreate) {

		if (CutOffMasterCreate.equalsIgnoreCase("Yes")) {
			createbuttonverifymethod();
		} else {
			createbuttonverifynomethod();
		}
	}

	public void verifyCutOffMasterChildmenuEdit(String CutOffMasterEdit) {
		// elementUtil.waitForElementToBeVisible(selectrecord, 10);
		// elementUtil.clickWhenReady(selectrecord, 10);
		if (CutOffMasterEdit.equalsIgnoreCase("Yes")) {
			Editbuttonverifymethod();
		} else {
			Editbuttonverifynomethod();
		}
	}

	public void verifyCutOffMasterChildmenuDelete(String CutOffMasterEdit) {
		// elementUtil.waitForElementToBeVisible(Actionbutton, 20);
		// elementUtil.clickWhenReady(Actionbutton, 5);
		if (CutOffMasterEdit.equalsIgnoreCase("Yes")) {
			Deletebuttonverifymethod();
		} else {
			Deletebuttonverifynomethod(); 
		}
	}

}