package com.qa.verifyroleacess.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.verifyroleaccess.base.roleaccessBaseTest;

public class NiyogaaFinanceHeadOnlineVideosmoduletest extends roleaccessBaseTest{
@BeforeClass
	
	public void DashboadPageSetup() {
//	dataSheetName = "TC001";
//	dataSheetName = "CADMINOnlineVideosmodule";
//	dataSheetName = "SchoolERPAdminOnlineVideosmodulesmodule";
//	dataSheetName = "LibrarianOnlineVideosmodule";
//	dataSheetName = "PrincipalloginOnlineVideosmodule";
//	dataSheetName = "VicePrincipalloginOnlineVideosmodule";
//	dataSheetName = "NiyogaaMarketingHeadOnlineVideosmodule";
//	dataSheetName = "SchoolERPAdminOnlineVideosmodulesmodule";
	dataSheetName = "NiyogaaFinanceHeadOnlineVideosmodule";
//	dataSheetName = "SchoolAccountHeadOnlineVideosmodule";
	
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("SchoolERPAdminpassword"));
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("Librarianusername"), prop.getProperty("Librarianpassword"));
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("Principalusername"), prop.getProperty("Principalpassword"));
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("VicePrincipalusername"), prop.getProperty("VicePrincipalpassword"));
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("NiyogaaMarketingHeadusername"), prop.getProperty("NiyogaaMarketingHeadpassword"));
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("NiyogaaAdministartionHeadusername"), prop.getProperty("NiyogaaAdministartionHeadpassword"));
		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("NiyogaaFinanceHeadusername"), prop.getProperty("NiyogaaFinanceHeadpassword"));
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("SchoolAccountHeadusername"), prop.getProperty("SchoolAccountHeadpassword"));
	}
	
	
	@Test(priority = 1,dataProvider="getdata") 
	  public void  NiyogaaFinanceHeadloginOnlineVideosMainmenureadTest(String OnlineVideosMainMenu, String OnlineVideosMainMenuRead,String OnlineVideosSubMenu,String OnlineVideosSubMenuRead,String OnlineVideosSubMenuCreate,String OnlineVideosSubMenuEdit,String OnlineVideosSubMenuDelete) {
		OnlineVideosmodulescreenspages.verifyOnlineVideosMainMenu(OnlineVideosMainMenu, OnlineVideosMainMenuRead);
		
		  
	  }
	@Test(priority = 2,dataProvider="getdata") 
	  public void  NiyogaaFinanceHeadloginOnlineVideossubmenuReadTest(String OnlineVideosMainMenu, String OnlineVideosMainMenuRead,String OnlineVideosSubMenu,String OnlineVideosSubMenuRead,String OnlineVideosSubMenuCreate,String OnlineVideosSubMenuEdit,String OnlineVideosSubMenuDelete) {
		OnlineVideosmodulescreenspages.verifyOnlineVideosSubMenu(OnlineVideosSubMenu,OnlineVideosSubMenuRead);
	
		  
	  }
	@Test(priority = 3,dataProvider="getdata") 
	  public void  NiyogaaFinanceHeadloginOnlineVideossubmenuCreateTest(String OnlineVideosMainMenu, String OnlineVideosMainMenuRead,String OnlineVideosSubMenu,String OnlineVideosSubMenuRead,String OnlineVideosSubMenuCreate,String OnlineVideosSubMenuEdit,String OnlineVideosSubMenuDelete) {
		OnlineVideosmodulescreenspages.verifyOnlineVideosSubMenuCreate(OnlineVideosSubMenu,OnlineVideosSubMenuCreate);
	
	  }
	@Test(priority = 4,dataProvider="getdata") 
	  public void  NiyogaaFinanceHeadloginOnlineVideossubmenuEditTest(String OnlineVideosMainMenu, String OnlineVideosMainMenuRead,String OnlineVideosSubMenu,String OnlineVideosSubMenuRead,String OnlineVideosSubMenuCreate,String OnlineVideosSubMenuEdit,String OnlineVideosSubMenuDelete) {
		OnlineVideosmodulescreenspages.verifyOnlineVideosSubMenuEdit(OnlineVideosSubMenu,OnlineVideosSubMenuEdit);
	
	  }
	
	@Test(priority = 5,dataProvider="getdata") 
	  public void  NiyogaaFinanceHeadloginOnlineVideossubmenuDeleteTest(String OnlineVideosMainMenu, String OnlineVideosMainMenuRead,String OnlineVideosSubMenu,String OnlineVideosSubMenuRead,String OnlineVideosSubMenuCreate,String OnlineVideosSubMenuEdit,String OnlineVideosSubMenuDelete) {
		OnlineVideosmodulescreenspages.verifyOnlineVideosSubMenuDelete(OnlineVideosSubMenu,OnlineVideosSubMenuDelete);
	
	  }	
	
	
}
