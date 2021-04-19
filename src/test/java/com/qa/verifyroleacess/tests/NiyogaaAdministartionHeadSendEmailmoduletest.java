package com.qa.verifyroleacess.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.verifyroleaccess.base.roleaccessBaseTest;

public class NiyogaaAdministartionHeadSendEmailmoduletest extends roleaccessBaseTest{
@BeforeClass
	
	public void DashboadPageSetup() {
//	dataSheetName = "TC001";
//	dataSheetName = "CADMINSendEmailmodule";
//	dataSheetName = "SchoolERPAdminSendEmailmodules";
//	dataSheetName = "LibrarianSendEmailmodule";
//	dataSheetName = "PrincipalloginSendEmailmodule";
//	dataSheetName = "VicePrincipalloginSendEmailmodule";
//	dataSheetName = "NiyogaaMarketingHeadmodule";
	dataSheetName = "NiyogaaAdministartionHeadSendEmailmodule";
//	dataSheetName = "NiyogaaFinanceHeadSendEmailmodule";
//	dataSheetName = "SchoolAccountHeadSendEmailmodule";
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("SchoolERPAdminpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("Librarianusername"), prop.getProperty("Librarianpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("Principalusername"), prop.getProperty("Principalpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("VicePrincipalusername"), prop.getProperty("VicePrincipalpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("NiyogaaMarketingHeadusername"), prop.getProperty("NiyogaaMarketingHeadpassword"));
	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("NiyogaaAdministartionHeadusername"), prop.getProperty("NiyogaaAdministartionHeadpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("NiyogaaFinanceHeadusername"), prop.getProperty("NiyogaaFinanceHeadpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("SchoolAccountHeadusername"), prop.getProperty("SchoolAccountHeadpassword"));
	}
	
	
	@Test(priority = 1,dataProvider="getdata") 
	  public void  NiyogaaAdministartionHeadloginSendEmailMainmenureadTest(String SendEmailMainMenu, String SendEmailMainMenuRead,String SendEmailSubMenu,String SendEmailSubMenuRead,String SendEmailSubMenuCreate,String SendEmailSubMenuEdit,String SendEmailSubMenuDelete) {
		SendEmailmodulescreenspages.verifySendEmailMainMenu(SendEmailMainMenu, SendEmailMainMenuRead);
		
		  
	  }
	@Test(priority = 2,dataProvider="getdata") 
	  public void  NiyogaaAdministartionHeadloginSendEmailsubmenuReadTest(String SendEmailMainMenu, String SendEmailMainMenuRead,String SendEmailSubMenu,String SendEmailSubMenuRead,String SendEmailSubMenuCreate,String SendEmailSubMenuEdit,String SendEmailSubMenuDelete) {
		SendEmailmodulescreenspages.verifySendEmailSubMenu(SendEmailSubMenu, SendEmailSubMenuRead);
	
		  
	  }
	@Test(priority = 3,dataProvider="getdata") 
	  public void  NiyogaaAdministartionHeadloginSendEmailsubmenuCreateTest(String SendEmailMainMenu, String SendEmailMainMenuRead,String SendEmailSubMenu,String SendEmailSubMenuRead,String SendEmailSubMenuCreate,String SendEmailSubMenuEdit,String SendEmailSubMenuDelete) {
		SendEmailmodulescreenspages.verifySendEmailSubMenuCreate(SendEmailSubMenu, SendEmailSubMenuCreate);
	
	  }
	@Test(priority = 4,dataProvider="getdata") 
	  public void  NiyogaaAdministartionHeadloginSendEmailsubmenuEditTest(String SendEmailMainMenu, String SendEmailMainMenuRead,String SendEmailSubMenu,String SendEmailSubMenuRead,String SendEmailSubMenuCreate,String SendEmailSubMenuEdit,String SendEmailSubMenuDelete) {
		SendEmailmodulescreenspages.verifySendEmailSubMenuEdit(SendEmailSubMenu, SendEmailSubMenuEdit);
	
	  }
	
	@Test(priority = 5,dataProvider="getdata") 
	  public void  NiyogaaAdministartionHeadloginSendEmailsubmenuDeleteTest(String SendEmailMainMenu, String SendEmailMainMenuRead,String SendEmailSubMenu,String SendEmailSubMenuRead,String SendEmailSubMenuCreate,String SendEmailSubMenuEdit,String SendEmailSubMenuDelete) {
		SendEmailmodulescreenspages.verifySendEmailSubMenuDelete(SendEmailSubMenu, SendEmailSubMenuDelete);
	
	  }	


}
