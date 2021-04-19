package com.qa.verifyroleacess.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Adminstrationmodule.pages.BuildingsPage;
import com.qa.verifyroleaccess.base.roleaccessBaseTest;

public class Buildingstest extends roleaccessBaseTest {
	
@BeforeClass
	
	public void DashboadPageSetup() {
//	dataSheetName = "TC001";
//	dataSheetName = "CADMINOnlineVideosmodule";
//	dataSheetName = "SchoolERPAdminOnlineVideosmodulesmodule";
	dataSheetName = "buildingmenu";
//	dataSheetName = "PrincipalloginOnlineVideosmodule";
//	dataSheetName = "VicePrincipalloginOnlineVideosmodule";
//	dataSheetName = "NiyogaaMarketingHeadOnlineVideosmodule";
//	dataSheetName = "SchoolERPAdminOnlineVideosmodulesmodule";
//	dataSheetName = "NiyogaaFinanceHeadOnlineVideosmodule";
//	dataSheetName = "SchoolAccountHeadOnlineVideosmodule";
	
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("SchoolERPAdminpassword"));
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		Buildingspage = loginpage1.dousersBuildingtestmoduleLogin(prop.getProperty("buildinguser"), prop.getProperty("buildingpassword"));
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("Principalusername"), prop.getProperty("Principalpassword"));
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("VicePrincipalusername"), prop.getProperty("VicePrincipalpassword"));
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("NiyogaaMarketingHeadusername"), prop.getProperty("NiyogaaMarketingHeadpassword"));
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("NiyogaaAdministartionHeadusername"), prop.getProperty("NiyogaaAdministartionHeadpassword"));
//		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("NiyogaaFinanceHeadusername"), prop.getProperty("NiyogaaFinanceHeadpassword"));		OnlineVideosmodulescreenspages = loginpage1.dousersOnlineVideosmoduleLogin(prop.getProperty("SchoolAccountHeadusername"), prop.getProperty("SchoolAccountHeadpassword"));
	}
	
	
	@Test(priority = 1,dataProvider="getdata") 
	  public void  BuildingsMainmenuread(String OnlineVideosMainMenu, String OnlineVideosMainMenuRead,String OnlineVideosSubMenu,String OnlineVideosSubMenuRead,String OnlineVideosSubMenuCreate,String OnlineVideosSubMenuEdit,String OnlineVideosSubMenuDelete) {
	//	BuildingsPage.verifyOnlineVideosMainMenu(OnlineVideosMainMenu, OnlineVideosMainMenuRead);
		
		  
	  }
		

	

}
