package com.qa.verifyroleacess.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.verifyroleaccess.base.roleaccessBaseTest;

public class NiyogaaMarketingHeadIncidentmoduletest extends roleaccessBaseTest {

	
@BeforeClass
	
	public void DashboadPageSetup() {
//		dataSheetName = "TC001";
//		dataSheetName = "CADMINIncidentmodule";
//		dataSheetName = "SchoolERPAdminIncidentmodulesmodule";
//		dataSheetName = "PrincipalIncidentmodule";
//		dataSheetName = "VicePrincipalIncidentmodule";
//		dataSheetName = "LibrarianIncidentmodule";
		dataSheetName = "NiyogaaMarketingHeadIncidentmodule";
//		dataSheetName = "NiyogaaAdministartionHeadIncidentmodule";
//		dataSheetName = "NiyogaaFinanceIncidentmodule";
//		dataSheetName = "SchoolAccountHeadIncidentmodule";
		
//		Incidentmodulescreenspages = loginpage1.dousersIncidentmoduleLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("SchoolERPAdminpassword"));
//		Incidentmodulescreenspages = loginpage1.dousersIncidentmoduleLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
//		Incidentmodulescreenspages = loginpage1.dousersIncidentmoduleLogin(prop.getProperty("Librarianusername"), prop.getProperty("Librarianpassword"));
//		Incidentmodulescreenspages = loginpage1.dousersIncidentmoduleLogin(prop.getProperty("Principalusername"), prop.getProperty("Principalpassword"));
//		Incidentmodulescreenspages = loginpage1.dousersIncidentmoduleLogin(prop.getProperty("VicePrincipalusername"), prop.getProperty("VicePrincipalpassword"));
		Incidentmodulescreenspages = loginpage1.dousersIncidentmoduleLogin(prop.getProperty("NiyogaaMarketingHeadusername"), prop.getProperty("NiyogaaMarketingHeadpassword"));
//		Incidentmodulescreenspages = loginpage1.dousersIncidentmoduleLogin(prop.getProperty("NiyogaaAdministartionHeadusername"), prop.getProperty("NiyogaaAdministartionHeadpassword"));
//		Incidentmodulescreenspages = loginpage1.dousersIncidentmoduleLogin(prop.getProperty("NiyogaaFinanceHeadusername"), prop.getProperty("NiyogaaFinanceHeadpassword"));
//		Incidentmodulescreenspages = loginpage1.dousersIncidentmoduleLogin(prop.getProperty("SchoolAccountHeadusername"), prop.getProperty("SchoolAccountHeadpassword"));
	}
	
	
	@Test(priority = 1,dataProvider="getdata") 
	  public void  VicePrincipalloginIncidentMainmenureadTest(String IncidentMainMenu, String IncidentMainMenuRead,String IRMenu,String IRMenuRead,String IRCreate,String IRMenuEdit,String IRMenuDelete,String IMMenu,String IMMenuRead,String IMCreate,String IMMenuEdit,String IMMenuDelete) {
		Incidentmodulescreenspages.verifyIncidentMainMenu(IncidentMainMenu, IncidentMainMenuRead);
		
		  
	  }
	@Test(priority = 2,dataProvider="getdata") 
	  public void  VicePrincipalloginIncidentReportingsubmenuReadTest(String IncidentMainMenu, String IncidentMainMenuRead,String IRMenu,String IRMenuRead,String IRCreate,String IRMenuEdit,String IRMenuDelete,String IMMenu,String IMMenuRead,String IMCreate,String IMMenuEdit,String IMMenuDelete) {
		Incidentmodulescreenspages.verifyIncidentReportingMenu(IRMenu,IRMenuRead);
	
		  
	  }
	@Test(priority = 3,dataProvider="getdata") 
	  public void  VicePrincipalloginIncidentReportingsubmenuCreateTest(String IncidentMainMenu, String IncidentMainMenuRead,String IRMenu,String IRMenuRead,String IRCreate,String IRMenuEdit,String IRMenuDelete,String IMMenu,String IMMenuRead,String IMCreate,String IMMenuEdit,String IMMenuDelete) {
		Incidentmodulescreenspages.verifyIncidentReportingMenuCreate(IRMenu,IRCreate);
	
	  }
	@Test(priority = 4,dataProvider="getdata") 
	  public void  VicePrincipalloginIncidentReportingsubmenuEditTest(String IncidentMainMenu, String IncidentMainMenuRead,String IRMenu,String IRMenuRead,String IRCreate,String IRMenuEdit,String IRMenuDelete,String IMMenu,String IMMenuRead,String IMCreate,String IMMenuEdit,String IMMenuDelete) {
		Incidentmodulescreenspages.verifyIncidentReportingMenuEdit(IRMenu,IRMenuEdit);
	
	  }
	
	@Test(priority = 5,dataProvider="getdata") 
	  public void  VicePrincipalloginIncidentReportingsubmenuDeleteTest(String IncidentMainMenu, String IncidentMainMenuRead,String IRMenu,String IRMenuRead,String IRCreate,String IRMenuEdit,String IRMenuDelete,String IMMenu,String IMMenuRead,String IMCreate,String IMMenuEdit,String IMMenuDelete) {
		Incidentmodulescreenspages.verifyIncidentReportingMenuDelete(IRMenu,IRMenuDelete);
	
	  }	
	
	@Test(priority = 6,dataProvider="getdata") 
	  public void  VicePrincipalloginIncidentManagementsubmenuReadTest(String IncidentMainMenu, String IncidentMainMenuRead,String IRMenu,String IRMenuRead,String IRCreate,String IRMenuEdit,String IRMenuDelete,String IMMenu,String IMMenuRead,String IMCreate,String IMMenuEdit,String IMMenuDelete) {
		Incidentmodulescreenspages.verifyIncidentManagementMenu(IMMenu,IMMenuRead);
	
		  
	  }
	@Test(priority = 7,dataProvider="getdata") 
	  public void  VicePrincipalloginIncidentManagementsubmenuCreateTest(String IncidentMainMenu, String IncidentMainMenuRead,String IRMenu,String IRMenuRead,String IRCreate,String IRMenuEdit,String IRMenuDelete,String IMMenu,String IMMenuRead,String IMCreate,String IMMenuEdit,String IMMenuDelete) {
		Incidentmodulescreenspages.verifyIncidentManagementMenuCreate(IMMenu,IMCreate);
	
	  }
	@Test(priority = 8,dataProvider="getdata") 
	  public void  VicePrincipalloginIncidentManagementsubmenuEditTest(String IncidentMainMenu, String IncidentMainMenuRead,String IRMenu,String IRMenuRead,String IRCreate,String IRMenuEdit,String IRMenuDelete,String IMMenu,String IMMenuRead,String IMCreate,String IMMenuEdit,String IMMenuDelete) {
		Incidentmodulescreenspages.verifyIncidentManagementMenuEdit(IMMenu,IMMenuEdit);
	
	  }
	
	@Test(priority = 9,dataProvider="getdata") 
	  public void  VicePrincipalloginIncidentManagementsubmenuDeleteTest(String IncidentMainMenu, String IncidentMainMenuRead,String IRMenu,String IRMenuRead,String IRCreate,String IRMenuEdit,String IRMenuDelete,String IMMenu,String IMMenuRead,String IMCreate,String IMMenuEdit,String IMMenuDelete) {
		Incidentmodulescreenspages.verifyIncidentManagementMenuDelete(IMMenu,IMMenuDelete);
	
	  }	
	
}
