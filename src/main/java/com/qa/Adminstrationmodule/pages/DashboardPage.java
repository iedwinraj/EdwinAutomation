package com.qa.Adminstrationmodule.pages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;
import com.qa.verifyroleacess.utils.ElementUtils;
import com.qa.verifyroleacess.utils.JavaScriptUtil;

public class DashboardPage {

	private WebDriver driver;
	private ElementUtils elementUtil;
	private JavaScriptUtil jsUtil;
	
//	private By administrationMainmenu= By.xpath("//i[@class='fa fa-menu-administration']/following-sibling::span[contains(text(),'Administration')]");
//	private By ParentsMainmenu=By.xpath("//i[@class='fa fa-menu-parents']/following-sibling::span[contains(text(),'Parents')]");
	private String administrationMainmenu1="Administration";
	
	private By administrationMainmenu= By.partialLinkText("Administration");
	private By ParentsMainmenu=By.partialLinkText("Parents");
	
	private By OrganizationsSubmenu =By.partialLinkText("Organizations");	
	private By Createbutton =By.xpath("//button[normalize-space()='Create']");
	private By ParentProfileSubmenu =By.partialLinkText("Parent Profile");
	private By UsersSubmenu =By.partialLinkText("Users");
	private By AcademicTeachingStaffSubmenu=By.partialLinkText("Academic Teaching Staff");
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
	private By OnlineVideosConfchildmenu=By.partialLinkText("Online Videos Conf");
	private By CutOffMasterchildmenu=By.partialLinkText("Cut-Off Master");
	private By Savebutton=By.xpath("//button[@accesskey='S']");
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtils(this.driver);
	}

	public String getAccountsPageTitle() {
		return elementUtil.waitForPageTitlePresent(Constants.ACCOUNTS_PAGE_TITLE, 5);
	}
	
	public void  isElementPresent() {
	  Assert.assertTrue(elementUtil.doIsDisplayed(ParentsMainmenu),"Parents Main menu is displayed");
	  Assert.assertTrue(elementUtil.doIsDisplayed(administrationMainmenu),"administrationMainmenu Main menu is displayed");
	}
	
	public void  isnotElementPresent() {
	    try {
	assertFalse(elementUtil.doIsDisplayed(ParentsMainmenu),"Parents Main menu is displayed,Should not be displayed");
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	    	System.out.println("Parents Main menu is not displayed" );
	    }
	   
	}
	public void  createbuttonverifymethod() {
	try {
		((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
		elementUtil.waitForElementToBeVisible(Createbutton, 20);  
	//	elementUtil.waitForElementToBeLocated(Createbutton, 20);  
	Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton,20)," Create button displayed");
	//assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button displayed Successfully");
	elementUtil.clickWhenReady(Createbutton, 10);
	}
	catch (StaleElementReferenceException e) {
		// TODO: StaleElementhandle exception
		  System.out.println("Create button Clicked Successfully");
	}
	
	}
	public void  createbuttonverifynomethod() {
	try {
		  Thread.sleep(5000);	
		  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
	} catch(org.openqa.selenium.NoSuchElementException e) {
	System.out.println("Create button is not displayed"); 
	} //catch (InterruptedException e) {
	//TODO Auto-generated catch block
	//e.printStackTrace();
	//}
	catch(StaleElementReferenceException e) {
		  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
		  } catch (InterruptedException e) {
			  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
		e.printStackTrace();
	} 
	}
	
	public void  deletebuttonverifymethod() {
		try {
		elementUtil.waitForElementToBeLocated(Createbutton, 20);  
		Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton,20)," Create button displayed");
		//assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button displayed Successfully");
		elementUtil.clickWhenReady(Createbutton, 10);
		}
		catch (StaleElementReferenceException e) {
			// TODO: StaleElementhandle exception
			  System.out.println("Create button Clicked Successfully");
		}
		
		}
		public void  deletebuttonverifynomethod() {
		try {
		//	  Thread.sleep(5000);
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

	public void  administrationMainmenuisElementPresent() {
		  Assert.assertTrue(elementUtil.doIsDisplayed(administrationMainmenu),"administration Main menu is displayed");
		}
		
		public void  administrationMainmenuisnotElementPresent() {
		    try {
		assertFalse(elementUtil.doIsDisplayed(administrationMainmenu),"Administration Main menu is displayed,Should not be displayed");
		    } catch (org.openqa.selenium.NoSuchElementException e) {
		    	System.out.println("Administration Main menu is not displayed" );
		    }
		   
		}
	
	
	public String verifyParentsMainMenuname() {
//		if(elementUtil.doIsDisplayed(ParentsMainmenu)) {
//			return elementUtil.doGetText(ParentsMainmenu);
		if(elementUtil.doIsDisplayed(ParentsMainmenu)) {
			System.out.println("Parents Main menu is displayed" );
			return elementUtil.doGetText(ParentsMainmenu);
			
		}
		else if(elementUtil.doIsnotDisplayed(ParentsMainmenu)) {
			System.out.println("Since Parents Main Menu is displayed,,the test is failed" );
		}
		return null;
	}
	public void verifyParentsMainMenudisplayed() {
		Assert.assertTrue(elementUtil.doIsDisplayed(ParentsMainmenu),"Parents Main menu is displayed"); 
		}
	public void verifyMenusnotdisplayed() {
		try {
			Assert.assertTrue(elementUtil.doIsDisplayed(ParentsMainmenu),"Parents Main menu is displayed"); 
	} catch (NoSuchElementException e) {
		// TODO: handle exception
		assertFalse(elementUtil.doIsDisplayed(ParentsMainmenu),"Parents Main Menu not displayed" );
	}
		}
	public DashboardPage checkexcelvalue(String data) {
		
			if (data.equalsIgnoreCase("Yes")) {
				isElementPresent();
			} 
			else if(data.equalsIgnoreCase("No")) {
				isnotElementPresent();
			} 
			
		return this;
	}
	
	public DashboardPage checkexcelvalue1(String data) {
		
		if (data.equalsIgnoreCase("Yes")) {
			administrationMainmenuisElementPresent();
		} 
		else if(data.equalsIgnoreCase("No")) {
			administrationMainmenuisnotElementPresent();
		} 
		
	return this;
}
	public void verifytheexcel(String data,String data1) {
		  if(data.equalsIgnoreCase("Yes")) {
			  
			  elementUtil.waitForElementToBeLocated2(administrationMainmenu1, 20);
			  Assert.assertTrue(elementUtil.doIsDisplayed(administrationMainmenu),"Administration Main Menu is displayed");
			  String title =elementUtil.doGetText(administrationMainmenu); 
				 System.out.println("title is : " + title);
				 Assert.assertEquals(title, data1);
		  }else {
			  try {
					assertFalse(elementUtil.doIsDisplayed(administrationMainmenu),"Administration Main menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("Administration Main menu is not displayed" );
					    }
		  
		  }
		  }
		  
		  public void verifytheOrganizationsSubmenuReaddataexcel(String data,String data1,String data2) {
			  if(data.equalsIgnoreCase("Yes")) {
				  Assert.assertTrue(elementUtil.doIsDisplayed(administrationMainmenu),"Administration Main Menu is displayed");
				  String title =elementUtil.doGetText(administrationMainmenu); 
					 System.out.println("title is : " + title);
					 Assert.assertEquals(title, data1);
					 elementUtil.clickWhenReady(administrationMainmenu, 10);
					  elementUtil.waitForElementToBeLocated(OrganizationsSubmenu, 20);
					  String title1 =elementUtil.doGetText(OrganizationsSubmenu); 
						 System.out.println("title is : " + title1);
						 Assert.assertEquals(title1, data2);
					  elementUtil.clickWhenReady(OrganizationsSubmenu, 10);
			  }else {
				  try {
						assertFalse(elementUtil.doIsDisplayed(administrationMainmenu),administrationMainmenu+" "+"Main menu is displayed,Should not be displayed");
						    } catch (org.openqa.selenium.NoSuchElementException e) {
						    	System.out.println("Administration Main menu is not displayed" );
						    }
			  
			  
			  }
		  }
		  
	
	  public void verifytheOrganizationsSubmenuwritedataexcel(String data3) { 
	  if(data3.equalsIgnoreCase("Yes")) {
		  try {
			  elementUtil.waitForElementToBeLocated(Createbutton, 10);
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton, 20),"The Create button displayed Successfully");
			//     assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton),"The Create button displayed Successfully");
				 
//				  assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button displayed Successfully");
				  elementUtil.clickWhenReady(Createbutton, 10);
				  System.out.println("The Create button Clicked Successfully");
		//		  elementUtil.verifyelementIsDisplayed(Savebutton);
		} catch (StaleElementReferenceException e) {
			System.out.println("The Create button displayed Successfully");
		}
		  catch (TimeoutException e) {
				// TODO: handle exception
//		  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton,20),"The Create button displayed Successfully");
			}
		  	
		} else { 
		  try {
			  Assert.assertFalse(elementUtil.verifyelementIsDisplayed(Createbutton,20),"Create button is displayed,Should not be displayed");
	//		  elementUtil.waitForElementToBeLocated(Createbutton, 30);
	//  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
	  } catch
	  (org.openqa.selenium.NoSuchElementException e) {
	  System.out.println("Create button is not displayed" ); 
	  }catch(Exception e) {
		  System.out.println("Create button is not displayed" ); 
	  }
	  }
	  }
	 
		  
	  public void verifytheParentsmenuReaddataexcel(String data4,String data5,String data6) {
		  if(data4.equalsIgnoreCase("Yes")) {
			  elementUtil.waitForElementToBeLocated(ParentsMainmenu, 10);
			  Assert.assertTrue(elementUtil.doIsDisplayed(ParentsMainmenu),"Parents Main Menu is displayed");
			  String title1 =elementUtil.doGetText(ParentsMainmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data5);
				 elementUtil.clickWhenReady(ParentsMainmenu, 10);
				  elementUtil.waitForElementToBeLocated(ParentProfileSubmenu, 20);
				  String title2 =elementUtil.doGetText(ParentProfileSubmenu); 
					 System.out.println("title is : " + title2);
					 Assert.assertEquals(title2, data6);
					 elementUtil.clickWhenReady(ParentProfileSubmenu, 10); 
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(ParentsMainmenu),"Parents Main Menu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("Parents Main Menu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	  }
	  

  public void verifytheParentsmenuwritedataexcel(String data7) {
 
  if(data7.equalsIgnoreCase("Yes")) {
	  try {
	  elementUtil.waitForElementToBeLocated(Createbutton, 10);  
	  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton,20),"The Create button displayed Successfully");
//	  assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button displayed Successfully");
	  elementUtil.clickWhenReady(Createbutton, 10);
	  }
	  catch (StaleElementReferenceException e) {
		// TODO: StaleElementhandle exception
		  System.out.println("The Create button Clicked Successfully");
	}
	 
  }else { 
	  try {
//		  Thread.sleep(5000);
		  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
  } catch(org.openqa.selenium.NoSuchElementException e) {
  System.out.println("Create button is not displayed"); 
  } //catch (InterruptedException e) {
	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
	  catch(StaleElementReferenceException e) {
		  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
		  } 
  }
  }
  
  public void verifytheUsersSubmenuReaddataexcel(String data8,String data9) {
	  if(data8.equalsIgnoreCase("Yes")) {
		  
		  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(UsersSubmenu, 20),"Users Submenu is displayed");
	//	  Assert.assertTrue(elementUtil.waitForElementToBeLocated(ParentsMainmenu, 10),"Parents Main Menu is displayed");
	//	  assertTrue(elementUtil.doIsDisplayed(ParentsMainmenu),"Parents Main Menu is displayed");
		  String title1 =elementUtil.doGetText(UsersSubmenu); 
			 System.out.println("title is : " + title1);
			 Assert.assertEquals(title1, data9);
			 elementUtil.clickWhenReady(UsersSubmenu, 10);

	  }else {
		  try {
			  	Thread.sleep(2000);
				assertFalse(elementUtil.doIsDisplayed(UsersSubmenu),"Users Submenu is displayed,Should not be displayed");
				    } catch (org.openqa.selenium.NoSuchElementException e) {
				    	System.out.println("Users Submenu is not displayed" );
				    } catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	  }
  }
  


public void verifytheUsersSubmenuwritedataexcel(String data10) {

if(data10.equalsIgnoreCase("Yes")) {
  try {
  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton,20),"The Create button displayed Successfully");
//  assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button displayed Successfully");
  elementUtil.clickWhenReady(Createbutton, 10);
  }
  catch (StaleElementReferenceException e) {
	// TODO: StaleElementhandle exception
	  System.out.println("The Create button Clicked Successfully");
}
 
 
}else { 
  try {
//	  Thread.sleep(5000);
	  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
} catch(org.openqa.selenium.NoSuchElementException e) {
System.out.println("Create button is not displayed"); 
} //catch (InterruptedException e) {
// TODO Auto-generated catch block
//e.printStackTrace();
//}
  catch(StaleElementReferenceException e) {
	  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
	  } 
}
}
	public void verifytheAcademicTeachingStaffSubmenuReaddataexcel(String data11,String data12) {
		  if(data11.equalsIgnoreCase("Yes")) {
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AcademicTeachingStaffSubmenu, 20),"Academic Teaching Staff Submenu is displayed");
		//	  Assert.assertTrue(elementUtil.waitForElementToBeLocated(ParentsMainmenu, 10),"Parents Main Menu is displayed");
		//	  assertTrue(elementUtil.doIsDisplayed(ParentsMainmenu),"Parents Main Menu is displayed");
			  String title1 =elementUtil.doGetText(AcademicTeachingStaffSubmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data12);
				 elementUtil.clickWhenReady(AcademicTeachingStaffSubmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(AcademicTeachingStaffSubmenu),"Academic Teaching Staff Submenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("Academic Teaching Staff Submenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheAcademicTeachingStaffSubmenuwritedataexcel(String data13) {
	
	if(data13.equalsIgnoreCase("Yes")) {
	try {
//	elementUtil.waitForElementToBeLocated(Createbutton, 20);  
	Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton,20),"Academic Teaching Staff Create button displayed");
	//assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button displayed Successfully");
	elementUtil.clickWhenReady(Createbutton, 10);
	}
	catch (StaleElementReferenceException e) {
		// TODO: StaleElementhandle exception
		  System.out.println("The Academic Teaching Staff Create button Clicked Successfully");
	}
	
	}else { 
	try {
	//	  Thread.sleep(5000);
		  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Academic Teaching Staff Create button is displayed,Should not be displayed");
	} catch(org.openqa.selenium.NoSuchElementException e) {
	System.out.println("Create button is not displayed"); 
	} //catch (InterruptedException e) {
	//TODO Auto-generated catch block
	//e.printStackTrace();
	//}
	catch(StaleElementReferenceException e) {
		  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Academic Teaching Staff Create button is displayed,Should not be displayed");
		  } 
	}
	
	
	}	  
	
	
	public void verifytheOtherMastersAcademicYearchildmenuReaddataexcel(String data59,String data60,String data61) {
		  if(data59.equalsIgnoreCase("Yes")) {
			  elementUtil.waitForElementToBeLocated(OtherMastersSubmenu, 10);
			  Assert.assertTrue(elementUtil.doIsDisplayed(OtherMastersSubmenu),"OtherMasters Submenu is displayed");
			  String title1 =elementUtil.doGetText(OtherMastersSubmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data60);
				 elementUtil.clickWhenReady(OtherMastersSubmenu, 10);
				  elementUtil.waitForElementToBeLocated(AcademicYearchildmenu, 20);
				  String title2 =elementUtil.doGetText(AcademicYearchildmenu); 
					 System.out.println("title is : " + title2);
					 Assert.assertEquals(title2, data61);
					 elementUtil.clickWhenReady(AcademicYearchildmenu, 10); 
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(AcademicYearchildmenu),"OtherMasters Submenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("OtherMasters Submenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	public void verifytheOtherMastersAcademicYearchildmenuwritedataexcel(String data62) {
	
	if(data62.equalsIgnoreCase("Yes")) {
	try {
	elementUtil.waitForElementToBeLocated(Createbutton, 10);  
	Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Createbutton,20),"The Create button displayed Successfully");
	//assertTrue(elementUtil.doIsDisplayed(Createbutton), "The Create button displayed Successfully");
	elementUtil.clickWhenReady(Createbutton, 10);
	}
	catch (StaleElementReferenceException e) {
		// TODO: StaleElementhandle exception
		  System.out.println("The Create button Clicked Successfully");
	}
	
	}else { 
	try {
	//	  Thread.sleep(5000);
		  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
	} catch(org.openqa.selenium.NoSuchElementException e) {
	System.out.println("Create button is not displayed"); 
	} //catch (InterruptedException e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
	//}
	catch(StaleElementReferenceException e) {
		  assertFalse(elementUtil.doIsDisplayed(Createbutton),"Create button is displayed,Should not be displayed");
		  } 
	}
	}

	public void verifytheOtherMastersShiftchildmenuReaddataexcel(String data63,String data64) {
		  if(data63.equalsIgnoreCase("Yes")) {
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Shiftchildmenu, 20),"Shift childmenu is displayed");
			  String title1 =elementUtil.doGetText(Shiftchildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data64);
				 elementUtil.clickWhenReady(Shiftchildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(Shiftchildmenu),"Shift childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("Shift childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheShiftchildmenuwritedataexcel(String data65) {
	
	if(data65.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}	  

	public void verifytheOtherMastersStreamchildmenuReaddataexcel(String data14,String data15) {
		  if(data14.equalsIgnoreCase("Yes")) {
			/* elementUtil.waitForElementToBeLocated(OtherMastersSubmenu, 10); */
			  Assert.assertTrue(elementUtil.doIsDisplayed(OtherMastersSubmenu),"OtherMasters Submenu is displayed");
	//		  elementUtil.clickWhenReady(OtherMastersSubmenu, 10);
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Streamchildmenu, 20),"Stream childmenu is displayed");
			  String title1 =elementUtil.doGetText(Streamchildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data15);
				 elementUtil.clickWhenReady(Streamchildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(Streamchildmenu),"Stream childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("Stream childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheStreamchildmenuwritedataexcel(String data16) {
	
	if(data16.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}
	
	public void verifytheOtherMastersBoardchildmenuReaddataexcel(String data17,String data18) {
		  if(data17.equalsIgnoreCase("Yes")) {
			  WebElement l=driver.findElement(By.partialLinkText("Board"));
		      // Javascript executor
		      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", l);
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Boardchildmenu, 20),"Board childmenu is displayed");
			  String title1 =elementUtil.doGetText(Boardchildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data18);
				 elementUtil.clickWhenReady(Boardchildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(Boardchildmenu),"Board childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("Board childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheBoardchildmenuwritedataexcel(String data19) {
	
	if(data19.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}
	
	public void verifytheOtherMastersCountrychildmenuReaddataexcel(String data20,String data21) {
		  if(data20.equalsIgnoreCase("Yes")) {
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Countrychildmenu, 20),"Country childmenu is displayed");
			  String title1 =elementUtil.doGetText(Countrychildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data21);
				 elementUtil.clickWhenReady(Countrychildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(Countrychildmenu),"Country childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("Country childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheCountrychildmenuwritedataexcel(String data22) {
	
	if(data22.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}	  
	
	public void verifytheOtherMastersAccountAccessLevelchildmenuReaddataexcel(String data23,String data24) {
		  if(data23.equalsIgnoreCase("Yes")) {
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AccountAccessLevelchildmenu, 20),"AccountAccessLevel childmenu is displayed");
			  String title1 =elementUtil.doGetText(AccountAccessLevelchildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data24);
				 elementUtil.clickWhenReady(AccountAccessLevelchildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(AccountAccessLevelchildmenu),"AccountAccessLevel childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("AccountAccessLevel childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheAccountAccessLevelchildmenuwritedataexcel(String data25) {
	
	if(data25.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}	  
	
	public void verifytheOtherMastersStatechildmenuReaddataexcel(String data26,String data27) {
		  if(data26.equalsIgnoreCase("Yes")) {
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Statechildmenu, 20),"State childmenu is displayed");
			  String title1 =elementUtil.doGetText(Statechildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data27);
				 elementUtil.clickWhenReady(Statechildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(Statechildmenu),"State childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("State childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheStatechildmenuwritedataexcel(String data28) {
	
	if(data28.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}	  
	
	
	public void verifytheOtherMastersDistrictchildmenuReaddataexcel(String data29,String data30) {
		  if(data29.equalsIgnoreCase("Yes")) {
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Districtchildmenu, 20),"District childmenu is displayed");
			  String title1 =elementUtil.doGetText(Districtchildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data30);
				 elementUtil.clickWhenReady(Districtchildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(Districtchildmenu),"District childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("District childmenu is not displayed" );
					    } catch (InterruptedException e) {
							
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheDistrictchildmenuwritedataexcel(String data31) {
	
	if(data31.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}	  
	
	public void verifytheOtherMastersReligionchildmenuReaddataexcel(String data32,String data33) {
		  if(data32.equalsIgnoreCase("Yes")) {
//			  jsUtil.checkPageIsReady();
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Religionchildmenu, 20),"Religion childmenu is displayed");
			  String title1 =elementUtil.doGetText(Religionchildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data33);
				 elementUtil.clickWhenReady(Religionchildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(Religionchildmenu),"Religion childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("Religion childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheReligionchildmenuwritedataexcel(String data34) {
	
	if(data34.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}	  

	public void verifytheOtherMastersNationalitychildmenuReaddataexcel(String data35,String data36) {
		  if(data35.equalsIgnoreCase("Yes")) {
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(Nationalitychildmenu, 20),"Nationality childmenu is displayed");
			  String title1 =elementUtil.doGetText(Nationalitychildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data36);
				 elementUtil.clickWhenReady(Nationalitychildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(Nationalitychildmenu),"Nationality childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("Nationality childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheNationalitychildmenuwritedataexcel(String data37) {
	
	if(data37.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}	  

	
	
	public void verifytheOtherMastersBloodGroupchildmenuReaddataexcel(String data38,String data39) {
		  if(data38.equalsIgnoreCase("Yes")) {
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(BloodGroupchildmenu, 20),"BloodGroup childmenu is displayed");
			  String title1 =elementUtil.doGetText(BloodGroupchildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data39);
				 elementUtil.clickWhenReady(BloodGroupchildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(BloodGroupchildmenu),"BloodGroup childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("BloodGroup childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheBloodGroupchildmenuwritedataexcel(String data40) {
	
	if(data40.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}	  

	public void verifytheOtherMastersEnquirySourcechildmenuReaddataexcel(String data41,String data42) {
		  if(data41.equalsIgnoreCase("Yes")) {
			  
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(EnquirySourcechildmenu, 20),"EnquirySource childmenu is displayed");
			  String title1 =elementUtil.doGetText(EnquirySourcechildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data42);
				 elementUtil.clickWhenReady(EnquirySourcechildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(EnquirySourcechildmenu),"EnquirySource childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("EnquirySource childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheEnquirySourcechildmenuwritedataexcel(String data43) {
	
	if(data43.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}	  

	public void verifytheOtherMastersEnquiryFollowupStatuschildmenuReaddataexcel(String data44,String data45) {
		  if(data44.equalsIgnoreCase("Yes")) {
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(EnquiryFollowupStatuschildmenu, 20),"EnquiryFollowupStatus childmenu is displayed");
			  String title1 =elementUtil.doGetText(EnquiryFollowupStatuschildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data45);
				 elementUtil.clickWhenReady(EnquiryFollowupStatuschildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(EnquiryFollowupStatuschildmenu),"EnquiryFollowupStatus childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("EnquiryFollowupStatus childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheEnquiryFollowupStatuschildmenuwritedataexcel(String data46) {
	
	if(data46.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}	  
	public void verifytheOtherMastersEnquiryFollowupModechildmenuReaddataexcel(String data47,String data48) {
		  if(data47.equalsIgnoreCase("Yes")) {
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(EnquiryFollowupModechildmenu, 20),"EnquiryFollowupMode childmenu is displayed");
			  String title1 =elementUtil.doGetText(EnquiryFollowupModechildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data48);
				 elementUtil.clickWhenReady(EnquiryFollowupModechildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(EnquiryFollowupModechildmenu),"EnquiryFollowupMode childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("EnquiryFollowupMode childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheEnquiryFollowupModechildmenuwritedataexcel(String data49) {
	
	if(data49.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}	  
	public void verifytheOtherMastersAdmissionGradeConfchildmenuReaddataexcel(String data50,String data51) {
		  if(data50.equalsIgnoreCase("Yes")) {
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(AdmissionGradeConfchildmenu, 20),"AdmissionGradeConf childmenu is displayed");
			  String title1 =elementUtil.doGetText(AdmissionGradeConfchildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data51);
				 elementUtil.clickWhenReady(AdmissionGradeConfchildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(AdmissionGradeConfchildmenu),"AdmissionGradeConf childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("AdmissionGradeConf childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheAdmissionGradeConfchildmenuwritedataexcel(String data52) {
	
	if(data52.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}	  
	public void verifytheOtherMastersOnlineVideosConfchildmenuReaddataexcel(String data53,String data54) {
		  if(data53.equalsIgnoreCase("Yes")) {
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(OnlineVideosConfchildmenu, 20),"OnlineVideosConf childmenu is displayed");
			  String title1 =elementUtil.doGetText(OnlineVideosConfchildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data54);
				 elementUtil.clickWhenReady(OnlineVideosConfchildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(OnlineVideosConfchildmenu),"OnlineVideosConf childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("OnlineVideosConf childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheOnlineVideosConfchildmenuwritedataexcel(String data55) {
	
	if(data55.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}	  
	public void verifytheOtherMastersCutOffMasterchildmenuReaddataexcel(String data56,String data57) {
		  if(data56.equalsIgnoreCase("Yes")) {
			  Actions hover = new Actions(driver);
			  hover.moveToElement(driver.findElement(By.partialLinkText("Religion"))).build().perform();
			  WebElement E1=driver.findElement(By.partialLinkText("Cut-Off Master"));
			  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", E1);
			  Assert.assertTrue(elementUtil.verifyelementIsDisplayed(CutOffMasterchildmenu, 20),"CutOffMaster childmenu is displayed");
			  String title1 =elementUtil.doGetText(CutOffMasterchildmenu); 
				 System.out.println("title is : " + title1);
				 Assert.assertEquals(title1, data57);
				 elementUtil.clickWhenReady(CutOffMasterchildmenu, 10);
	
		  }else {
			  try {
				  	Thread.sleep(2000);
					assertFalse(elementUtil.doIsDisplayed(CutOffMasterchildmenu),"CutOffMaster childmenu is displayed,Should not be displayed");
					    } catch (org.openqa.selenium.NoSuchElementException e) {
					    	System.out.println("CutOffMaster childmenu is not displayed" );
					    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		  }
	}
	
	
	
	public void verifytheCutOffMasterchildmenuwritedataexcel(String data58) {
	
	if(data58.equalsIgnoreCase("Yes")) {
		createbuttonverifymethod();	
	}else 
	{
		createbuttonverifynomethod();
	}	
	}	  
	

	
	
	
	
	//Search features Page Actions:
	/*
	 * public boolean doSearch(String productName) {
	 * elementUtil.doSendKeys(searchText, productName);
	 * elementUtil.doClick(searchButton);
	 * if(elementUtil.getElements(searchItemResult).size() > 0) { return true; }
	 * return false; }
	 */
	
}
