package com.qa.verifyroleacess.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.verifyroleaccess.base.roleaccessBaseTest;

public class ReportCardmodulescreenstest extends roleaccessBaseTest {
	
@BeforeClass
	
	public void DashboadPageSetup() {
//		dataSheetName = "TC001";
		dataSheetName = "CADMINReportCardmodule";
//		dataSheetName = "SchoolERPAdminReportCardmodulesmodule";
//		ReportCardmodulescreenspages = loginpage1.dousersReportCardmoduleLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("SchoolERPAdminpassword"));
		ReportCardmodulescreenspages = loginpage1.dousersReportCardmoduleLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
//		ReportCardmodulescreenspages = loginpage1.dousersReportCardmoduleLogin(prop.getProperty("Librarianusername"), prop.getProperty("Librarianpassword"));
//		ReportCardmodulescreenspages = loginpage1.dousersReportCardmoduleLogin(prop.getProperty("Principalusername"), prop.getProperty("Principalpassword"));
//		ReportCardmodulescreenspages = loginpage1.dousersReportCardmoduleLogin(prop.getProperty("VicePrincipalusername"), prop.getProperty("VicePrincipalpassword"));
//		ReportCardmodulescreenspages = loginpage1.dousersReportCardmoduleLogin(prop.getProperty("NiyogaaMarketingHeadusername"), prop.getProperty("NiyogaaMarketingHeadpassword"));
//		ReportCardmodulescreenspages = loginpage1.dousersReportCardmoduleLogin(prop.getProperty("NiyogaaAdministartionHeadusername"), prop.getProperty("NiyogaaAdministartionHeadpassword"));
//		ReportCardmodulescreenspages = loginpage1.dousersReportCardmoduleLogin(prop.getProperty("NiyogaaFinanceHeadusername"), prop.getProperty("NiyogaaFinanceHeadpassword"));
//		ReportCardmodulescreenspages = loginpage1.dousersReportCardmoduleLogin(prop.getProperty("SchoolAccountHeadusername"), prop.getProperty("SchoolAccountHeadpassword"));
	}
	
	
	@Test(priority = 1,dataProvider="getdata") 
	  public void  AdmloginReportCardMainmenuReadTest(String ReportCardMainMenu, String ReportCardMainMenuRead,String DownloadReportCardSubmenu,String DownloadReportCardSubmenuRead,String DownloadReportCardSubmenuCreate,String DownloadReportCardSubmenuEdit,String DownloadReportCardSubmenuDelete,String WithholdResultSubmenu,String WithholdResultSubmenuRead,String WithholdResultSubmenuCreate,String WithholdResultSubmenuEdit,String WithholdResultSubmenuDelete) {
		ReportCardmodulescreenspages.verifyReportCardMainMenuRead(ReportCardMainMenu, ReportCardMainMenuRead);
		
		  
	  }
	
	@Test(priority = 2,dataProvider="getdata") 
	  public void  AdmloginDownloadReportCardSubmenuReadTest(String ReportCardMainMenu, String ReportCardMainMenuRead,String DownloadReportCardSubmenu,String DownloadReportCardSubmenuRead,String DownloadReportCardSubmenuCreate,String DownloadReportCardSubmenuEdit,String DownloadReportCardSubmenuDelete,String WithholdResultSubmenu,String WithholdResultSubmenuRead,String WithholdResultSubmenuCreate,String WithholdResultSubmenuEdit,String WithholdResultSubmenuDelete) {
		ReportCardmodulescreenspages.verifyDownloadReportCardSubmenuRead(DownloadReportCardSubmenu, DownloadReportCardSubmenuRead);
		
		  
	  }

	
	@Test(priority = 3,dataProvider="getdata") 
	  public void  AdmloginDownloadReportCardSubmenuCreateTest(String ReportCardMainMenu, String ReportCardMainMenuRead,String DownloadReportCardSubmenu,String DownloadReportCardSubmenuRead,String DownloadReportCardSubmenuCreate,String DownloadReportCardSubmenuEdit,String DownloadReportCardSubmenuDelete,String WithholdResultSubmenu,String WithholdResultSubmenuRead,String WithholdResultSubmenuCreate,String WithholdResultSubmenuEdit,String WithholdResultSubmenuDelete) {
		ReportCardmodulescreenspages.verifyDownloadReportCardSubmenuCreate(DownloadReportCardSubmenu, DownloadReportCardSubmenuCreate);
		
		  
	  }
	
	@Test(priority = 4,dataProvider="getdata") 
	  public void  AdmloginWithholdResultSubmenuReadTest(String ReportCardMainMenu, String ReportCardMainMenuRead,String DownloadReportCardSubmenu,String DownloadReportCardSubmenuRead,String DownloadReportCardSubmenuCreate,String DownloadReportCardSubmenuEdit,String DownloadReportCardSubmenuDelete,String WithholdResultSubmenu,String WithholdResultSubmenuRead,String WithholdResultSubmenuCreate,String WithholdResultSubmenuEdit,String WithholdResultSubmenuDelete) {
		ReportCardmodulescreenspages.verifyWithholdResultSubmenuRead(WithholdResultSubmenu,WithholdResultSubmenuRead);
	
		  
	  }
	@Test(priority = 5,dataProvider="getdata") 
	  public void  AdmloginWithholdResultSubmenuCreateTest(String ReportCardMainMenu, String ReportCardMainMenuRead,String DownloadReportCardSubmenu,String DownloadReportCardSubmenuRead,String DownloadReportCardSubmenuCreate,String DownloadReportCardSubmenuEdit,String DownloadReportCardSubmenuDelete,String WithholdResultSubmenu,String WithholdResultSubmenuRead,String WithholdResultSubmenuCreate,String WithholdResultSubmenuEdit,String WithholdResultSubmenuDelete) {
		ReportCardmodulescreenspages.verifyWithholdResultSubmenuCreate(WithholdResultSubmenu,WithholdResultSubmenuCreate);
	
	  }
	@Test(priority = 6,dataProvider="getdata") 
	  public void  AdmloginWithholdResultSubmenuEditTest(String ReportCardMainMenu, String ReportCardMainMenuRead,String DownloadReportCardSubmenu,String DownloadReportCardSubmenuRead,String DownloadReportCardSubmenuCreate,String DownloadReportCardSubmenuEdit,String DownloadReportCardSubmenuDelete,String WithholdResultSubmenu,String WithholdResultSubmenuRead,String WithholdResultSubmenuCreate,String WithholdResultSubmenuEdit,String WithholdResultSubmenuDelete) {
		ReportCardmodulescreenspages.verifyWithholdResultSubmenuEdit(WithholdResultSubmenu,WithholdResultSubmenuEdit);
	
	  }
	
	@Test(priority = 7,dataProvider="getdata") 
	  public void  AdmloginWithholdResultSubmenuDeleteTest(String ReportCardMainMenu, String ReportCardMainMenuRead,String DownloadReportCardSubmenu,String DownloadReportCardSubmenuRead,String DownloadReportCardSubmenuCreate,String DownloadReportCardSubmenuEdit,String DownloadReportCardSubmenuDelete,String WithholdResultSubmenu,String WithholdResultSubmenuRead,String WithholdResultSubmenuCreate,String WithholdResultSubmenuEdit,String WithholdResultSubmenuDelete) {
		ReportCardmodulescreenspages.verifyWithholdResultSubmenuDelete(WithholdResultSubmenu,WithholdResultSubmenuDelete);
	
	  }	
}
