package com.qa.verifyroleacess.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.verifyroleaccess.base.roleaccessBaseTest;

public class SchoolERPAdminStoriesmodulescreenstest extends roleaccessBaseTest {
	
@BeforeClass
	
	public void DashboadPageSetup() {
//	dataSheetName = "TC001";
//	dataSheetName = "CADMINStoriesmodule";
//	dataSheetName = "LibrarianStoriesmodule";
//	dataSheetName = "NiyogaaAdministartionHeadmodule";
//	dataSheetName = "NiyogaaFinanceHeadmodule";
//	dataSheetName = "NiyogaaMarketingHeadmodule";
//	dataSheetName = "PrincipalStoriesmodule";
//	dataSheetName = "SchoolAccountHeadmodule";
	dataSheetName = "SchoolERPAdminStoriesmodulesmodule";
//	dataSheetName = "VicePrincipalStoriesmodule";
	
		Storiesmodulescreenspages = loginpage1.dousersStoriesmoduleLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("SchoolERPAdminpassword"));
//		Storiesmodulescreenspages = loginpage1.dousersStoriesmoduleLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
//		Storiesmodulescreenspages = loginpage1.dousersStoriesmoduleLogin(prop.getProperty("Librarianusername"), prop.getProperty("Librarianpassword"));
//		Storiesmodulescreenspages = loginpage1.dousersStoriesmoduleLogin(prop.getProperty("Principalusername"), prop.getProperty("Principalpassword"));
//		Storiesmodulescreenspages = loginpage1.dousersStoriesmoduleLogin(prop.getProperty("VicePrincipalusername"), prop.getProperty("VicePrincipalpassword"));
//		Storiesmodulescreenspages = loginpage1.dousersStoriesmoduleLogin(prop.getProperty("NiyogaaMarketingHeadusername"), prop.getProperty("NiyogaaMarketingHeadpassword"));
//		Storiesmodulescreenspages = loginpage1.dousersStoriesmoduleLogin(prop.getProperty("NiyogaaAdministartionHeadusername"), prop.getProperty("NiyogaaAdministartionHeadpassword"));
//		Storiesmodulescreenspages = loginpage1.dousersStoriesmoduleLogin(prop.getProperty("NiyogaaFinanceHeadusername"), prop.getProperty("NiyogaaFinanceHeadpassword"));
//		Storiesmodulescreenspages = loginpage1.dousersStoriesmoduleLogin(prop.getProperty("SchoolAccountHeadusername"), prop.getProperty("SchoolAccountHeadpassword"));
	}
	
	

@Test(priority = 1,dataProvider="getdata") 
  public void  SchoolERPloginStoriesMainmenureadTest(String StoriesMainMenu, String StoriesMainMenuRead,String CreateNewStoryMenu,String CreateNewStoryMenuRead,String CreateNewStoryCreate,String CreateNewStoryMenuEdit,String CreateNewStoryMenuDelete,String ApproveRejectStoryMenu,String ApproveRejectStoryMenuRead,String ApproveRejectStoryCreate,String ApproveRejectStoryMenuEdit,String ApproveRejectStoryMenuDelete,String ViewStoriesMenu,String ViewStoriesMenuRead,String ViewStoriesCreate,String ViewStoriesMenuEdit,String ViewStoriesMenuDelete) {
	Storiesmodulescreenspages.verifyStoriesMainMenu(StoriesMainMenu, StoriesMainMenuRead);
	
	  
  }
@Test(priority = 2,dataProvider="getdata") 
  public void  SchoolERPloginCreateNewStorysubmenuReadTest(String StoriesMainMenu, String StoriesMainMenuRead,String CreateNewStoryMenu,String CreateNewStoryMenuRead,String CreateNewStoryCreate,String CreateNewStoryMenuEdit,String CreateNewStoryMenuDelete,String ApproveRejectStoryMenu,String ApproveRejectStoryMenuRead,String ApproveRejectStoryCreate,String ApproveRejectStoryMenuEdit,String ApproveRejectStoryMenuDelete,String ViewStoriesMenu,String ViewStoriesMenuRead,String ViewStoriesCreate,String ViewStoriesMenuEdit,String ViewStoriesMenuDelete) {
	Storiesmodulescreenspages.verifyCreateNewStorySubMenu(CreateNewStoryMenu, CreateNewStoryMenuRead);
  }
@Test(priority = 3,dataProvider="getdata") 
  public void  SchoolERPloginCreateNewStorysubmenuCreateTest(String StoriesMainMenu, String StoriesMainMenuRead,String CreateNewStoryMenu,String CreateNewStoryMenuRead,String CreateNewStoryCreate,String CreateNewStoryMenuEdit,String CreateNewStoryMenuDelete,String ApproveRejectStoryMenu,String ApproveRejectStoryMenuRead,String ApproveRejectStoryCreate,String ApproveRejectStoryMenuEdit,String ApproveRejectStoryMenuDelete,String ViewStoriesMenu,String ViewStoriesMenuRead,String ViewStoriesCreate,String ViewStoriesMenuEdit,String ViewStoriesMenuDelete) {
	Storiesmodulescreenspages.verifyCreateNewStorySubMenuCreate(CreateNewStoryMenu,CreateNewStoryCreate);

  }
@Test(priority = 4,dataProvider="getdata") 
  public void  SchoolERPloginCreateNewStorysubmenuEditTest(String StoriesMainMenu, String StoriesMainMenuRead,String CreateNewStoryMenu,String CreateNewStoryMenuRead,String CreateNewStoryCreate,String CreateNewStoryMenuEdit,String CreateNewStoryMenuDelete,String ApproveRejectStoryMenu,String ApproveRejectStoryMenuRead,String ApproveRejectStoryCreate,String ApproveRejectStoryMenuEdit,String ApproveRejectStoryMenuDelete,String ViewStoriesMenu,String ViewStoriesMenuRead,String ViewStoriesCreate,String ViewStoriesMenuEdit,String ViewStoriesMenuDelete) {
	Storiesmodulescreenspages.verifyCreateNewStorySubMenuEdit(CreateNewStoryMenu, CreateNewStoryMenuEdit);
  }

@Test(priority = 5,dataProvider="getdata") 
  public void  SchoolERPloginCreateNewStorysubmenuDeleteTest(String StoriesMainMenu, String StoriesMainMenuRead,String CreateNewStoryMenu,String CreateNewStoryMenuRead,String CreateNewStoryCreate,String CreateNewStoryMenuEdit,String CreateNewStoryMenuDelete,String ApproveRejectStoryMenu,String ApproveRejectStoryMenuRead,String ApproveRejectStoryCreate,String ApproveRejectStoryMenuEdit,String ApproveRejectStoryMenuDelete,String ViewStoriesMenu,String ViewStoriesMenuRead,String ViewStoriesCreate,String ViewStoriesMenuEdit,String ViewStoriesMenuDelete) {
	Storiesmodulescreenspages.verifyCreateNewStorySubMenuDelete(CreateNewStoryMenu,CreateNewStoryMenuDelete);

  }	

@Test(priority = 6,dataProvider="getdata") 
  public void  SchoolERPloginApproveRejectStorysubmenuReadTest(String StoriesMainMenu, String StoriesMainMenuRead,String CreateNewStoryMenu,String CreateNewStoryMenuRead,String CreateNewStoryCreate,String CreateNewStoryMenuEdit,String CreateNewStoryMenuDelete,String ApproveRejectStoryMenu,String ApproveRejectStoryMenuRead,String ApproveRejectStoryCreate,String ApproveRejectStoryMenuEdit,String ApproveRejectStoryMenuDelete,String ViewStoriesMenu,String ViewStoriesMenuRead,String ViewStoriesCreate,String ViewStoriesMenuEdit,String ViewStoriesMenuDelete) {
	Storiesmodulescreenspages.verifyApproveRejectStorySubMenu(ApproveRejectStoryMenu, ApproveRejectStoryMenuRead);

	  
  }
@Test(priority = 7,dataProvider="getdata") 
  public void  SchoolERPloginApproveRejectStorysubmenuCreateTest(String StoriesMainMenu, String StoriesMainMenuRead,String CreateNewStoryMenu,String CreateNewStoryMenuRead,String CreateNewStoryCreate,String CreateNewStoryMenuEdit,String CreateNewStoryMenuDelete,String ApproveRejectStoryMenu,String ApproveRejectStoryMenuRead,String ApproveRejectStoryCreate,String ApproveRejectStoryMenuEdit,String ApproveRejectStoryMenuDelete,String ViewStoriesMenu,String ViewStoriesMenuRead,String ViewStoriesCreate,String ViewStoriesMenuEdit,String ViewStoriesMenuDelete) {
	Storiesmodulescreenspages.verifyApproveRejectStorySubMenuCreate(ApproveRejectStoryMenu,ApproveRejectStoryCreate);

  }
@Test(priority = 8,dataProvider="getdata") 
  public void  SchoolERPloginApproveRejectStorysubmenuEditTest(String StoriesMainMenu, String StoriesMainMenuRead,String CreateNewStoryMenu,String CreateNewStoryMenuRead,String CreateNewStoryCreate,String CreateNewStoryMenuEdit,String CreateNewStoryMenuDelete,String ApproveRejectStoryMenu,String ApproveRejectStoryMenuRead,String ApproveRejectStoryCreate,String ApproveRejectStoryMenuEdit,String ApproveRejectStoryMenuDelete,String ViewStoriesMenu,String ViewStoriesMenuRead,String ViewStoriesCreate,String ViewStoriesMenuEdit,String ViewStoriesMenuDelete) {
	Storiesmodulescreenspages.verifyApproveRejectStorySubMenuEdit(ApproveRejectStoryMenu,ApproveRejectStoryMenuEdit);

  }

@Test(priority = 9,dataProvider="getdata") 
  public void  SchoolERPloginApproveRejectStorysubmenuDeleteTest(String StoriesMainMenu, String StoriesMainMenuRead,String CreateNewStoryMenu,String CreateNewStoryMenuRead,String CreateNewStoryCreate,String CreateNewStoryMenuEdit,String CreateNewStoryMenuDelete,String ApproveRejectStoryMenu,String ApproveRejectStoryMenuRead,String ApproveRejectStoryCreate,String ApproveRejectStoryMenuEdit,String ApproveRejectStoryMenuDelete,String ViewStoriesMenu,String ViewStoriesMenuRead,String ViewStoriesCreate,String ViewStoriesMenuEdit,String ViewStoriesMenuDelete) {
	Storiesmodulescreenspages.verifyApproveRejectStorySubMenuDelete(ApproveRejectStoryMenu,ApproveRejectStoryMenuDelete);

  }	

@Test(priority = 10,dataProvider="getdata") 
public void  SchoolERPloginViewStoriessubmenuReadTest(String StoriesMainMenu, String StoriesMainMenuRead,String CreateNewStoryMenu,String CreateNewStoryMenuRead,String CreateNewStoryCreate,String CreateNewStoryMenuEdit,String CreateNewStoryMenuDelete,String ApproveRejectStoryMenu,String ApproveRejectStoryMenuRead,String ApproveRejectStoryCreate,String ApproveRejectStoryMenuEdit,String ApproveRejectStoryMenuDelete,String ViewStoriesMenu,String ViewStoriesMenuRead,String ViewStoriesCreate,String ViewStoriesMenuEdit,String ViewStoriesMenuDelete) {
	Storiesmodulescreenspages.verifyViewStoriesSubMenu(ViewStoriesMenu, ViewStoriesMenuRead);
}
@Test(priority = 11,dataProvider="getdata") 
public void  SchoolERPloginViewStoriessubmenuCreateTest(String StoriesMainMenu, String StoriesMainMenuRead,String CreateNewStoryMenu,String CreateNewStoryMenuRead,String CreateNewStoryCreate,String CreateNewStoryMenuEdit,String CreateNewStoryMenuDelete,String ApproveRejectStoryMenu,String ApproveRejectStoryMenuRead,String ApproveRejectStoryCreate,String ApproveRejectStoryMenuEdit,String ApproveRejectStoryMenuDelete,String ViewStoriesMenu,String ViewStoriesMenuRead,String ViewStoriesCreate,String ViewStoriesMenuEdit,String ViewStoriesMenuDelete) {
	Storiesmodulescreenspages.verifyViewStoriesSubMenuCreate(ViewStoriesMenu,ViewStoriesCreate);

}
@Test(priority = 12,dataProvider="getdata") 
public void  SchoolERPloginViewStoriessubmenuEditTest(String StoriesMainMenu, String StoriesMainMenuRead,String CreateNewStoryMenu,String CreateNewStoryMenuRead,String CreateNewStoryCreate,String CreateNewStoryMenuEdit,String CreateNewStoryMenuDelete,String ApproveRejectStoryMenu,String ApproveRejectStoryMenuRead,String ApproveRejectStoryCreate,String ApproveRejectStoryMenuEdit,String ApproveRejectStoryMenuDelete,String ViewStoriesMenu,String ViewStoriesMenuRead,String ViewStoriesCreate,String ViewStoriesMenuEdit,String ViewStoriesMenuDelete) {
	Storiesmodulescreenspages.verifyViewStoriesSubMenuEdit(ViewStoriesMenu, ViewStoriesMenuEdit);
}

@Test(priority = 13,dataProvider="getdata") 
public void  SchoolERPloginViewStoriessubmenuDeleteTest(String StoriesMainMenu, String StoriesMainMenuRead,String CreateNewStoryMenu,String CreateNewStoryMenuRead,String CreateNewStoryCreate,String CreateNewStoryMenuEdit,String CreateNewStoryMenuDelete,String ApproveRejectStoryMenu,String ApproveRejectStoryMenuRead,String ApproveRejectStoryCreate,String ApproveRejectStoryMenuEdit,String ApproveRejectStoryMenuDelete,String ViewStoriesMenu,String ViewStoriesMenuRead,String ViewStoriesCreate,String ViewStoriesMenuEdit,String ViewStoriesMenuDelete) {
	Storiesmodulescreenspages.verifyViewStoriesSubMenuDelete(ViewStoriesMenu,ViewStoriesMenuDelete);

}

}
