package com.qa.verifyroleacess.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.verifyroleaccess.base.roleaccessBaseTest;

public class SchoolERPAdminSendEmailmodulesmoduletest extends roleaccessBaseTest  {
	
@BeforeClass
	
	public void DashboadPageSetup() {

//	dataSheetName = "TC001";
//	dataSheetName = "CADMINSendEmailmodule";
	dataSheetName = "SchoolERPAdminSendEmailmodule";
//	dataSheetName = "LibrarianSendEmailmodule";
//	dataSheetName = "PrincipalloginSendEmailmodule";
//	dataSheetName = "VicePrincipalloginSendEmailmodule";
//	dataSheetName = "NiyogaaMarketingHeadSendEmailmodule";
//	dataSheetName = "NiyogaaAdministartionHeadSendEmailmodule";
//	dataSheetName = "NiyogaaFinanceHeadSendEmailmodule";
//	dataSheetName = "SchoolAccountHeadSendEmailmodule";
	
	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("SchoolERPAdminpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("Librarianusername"), prop.getProperty("Librarianpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("Principalusername"), prop.getProperty("Principalpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("VicePrincipalusername"), prop.getProperty("VicePrincipalpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("NiyogaaMarketingHeadusername"), prop.getProperty("NiyogaaMarketingHeadpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("NiyogaaAdministartionHeadusername"), prop.getProperty("NiyogaaAdministartionHeadpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("NiyogaaFinanceHeadusername"), prop.getProperty("NiyogaaFinanceHeadpassword"));
//	SendEmailmodulescreenspages = loginpage1.dousersSendEmailmoduleLogin(prop.getProperty("SchoolAccountHeadusername"), prop.getProperty("SchoolAccountHeadpassword"));

}
	
	
	@Test(priority = 1,dataProvider="getdata") 
	  public void  SchoolERPloginSendEmailMainmenureadTest(String SendEmailMainMenu, String SendEmailMainMenuRead,String SendEmailSubMenu,String SendEmailSubMenuRead,String SendEmailSubMenuCreate,String SendEmailSubMenuEdit,String SendEmailSubMenuDelete) {
		SendEmailmodulescreenspages.verifySendEmailMainMenu(SendEmailMainMenu, SendEmailMainMenuRead);
		
		  
	  }
	@Test(priority = 2,dataProvider="getdata") 
	  public void  SchoolERPAdmloginSendEmailsubmenuReadTest(String SendEmailMainMenu, String SendEmailMainMenuRead,String SendEmailSubMenu,String SendEmailSubMenuRead,String SendEmailSubMenuCreate,String SendEmailSubMenuEdit,String SendEmailSubMenuDelete) {
		SendEmailmodulescreenspages.verifySendEmailSubMenu(SendEmailSubMenu, SendEmailSubMenuRead);
	
		  
	  }
	@Test(priority = 3,dataProvider="getdata") 
	  public void  SchoolERPAdmloginSendEmailsubmenuCreateTest(String SendEmailMainMenu, String SendEmailMainMenuRead,String SendEmailSubMenu,String SendEmailSubMenuRead,String SendEmailSubMenuCreate,String SendEmailSubMenuEdit,String SendEmailSubMenuDelete) {
		SendEmailmodulescreenspages.verifySendEmailSubMenuCreate(SendEmailSubMenu, SendEmailSubMenuCreate);
	
	  }
	@Test(priority = 4,dataProvider="getdata") 
	  public void  SchoolERPAdmloginSendEmailsubmenuEditTest(String SendEmailMainMenu, String SendEmailMainMenuRead,String SendEmailSubMenu,String SendEmailSubMenuRead,String SendEmailSubMenuCreate,String SendEmailSubMenuEdit,String SendEmailSubMenuDelete) {
		SendEmailmodulescreenspages.verifySendEmailSubMenuEdit(SendEmailSubMenu, SendEmailSubMenuEdit);
	
	  }
	
	@Test(priority = 5,dataProvider="getdata") 
	  public void  SchoolERPAdmloginSendEmailsubmenuDeleteTest(String SendEmailMainMenu, String SendEmailMainMenuRead,String SendEmailSubMenu,String SendEmailSubMenuRead,String SendEmailSubMenuCreate,String SendEmailSubMenuEdit,String SendEmailSubMenuDelete) {
		SendEmailmodulescreenspages.verifySendEmailSubMenuDelete(SendEmailSubMenu, SendEmailSubMenuDelete);
	
	  }	

}
