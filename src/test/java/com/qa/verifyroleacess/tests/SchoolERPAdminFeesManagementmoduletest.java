package com.qa.verifyroleacess.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.verifyroleaccess.base.roleaccessBaseTest;

public class SchoolERPAdminFeesManagementmoduletest extends roleaccessBaseTest{
	
@BeforeClass
	
	public void DashboadPageSetup() {
//	dataSheetName = "TC001";
//	dataSheetName = "CADMINFeesManagementmodule";
	dataSheetName = "SchoolERPAdminFeesManagementmodule";
//	dataSheetName = "PrincipalloginFeesManagementmoduletest";
//	dataSheetName = "VicePrincipalloginFeesManagementmoduletest";
//	dataSheetName = "LibrarianFeesManagementmoduletest";
//	dataSheetName = "NiyogaaMarketingHeadFeesManagementmoduletest";
//	dataSheetName = "NiyogaaFinanceHeadFeesManagementmoduletest";
//	dataSheetName = "NiyogaaAdministartionHeadFeesManagementmoduletest";
//	dataSheetName = "SchoolAccountHeadFeesManagementmoduletest";
	
		FeesManagementmodulescreenspages = loginpage1.dousersFeesManagementmoduleLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("SchoolERPAdminpassword"));
//		FeesManagementmodulescreenspages = loginpage1.dousersFeesManagementmoduleLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
//		FeesManagementmodulescreenspages = loginpage1.dousersFeesManagementmoduleLogin(prop.getProperty("Librarianusername"), prop.getProperty("Librarianpassword"));
//		FeesManagementmodulescreenspages = loginpage1.dousersFeesManagementmoduleLogin(prop.getProperty("Principalusername"), prop.getProperty("Principalpassword"));
//		FeesManagementmodulescreenspages = loginpage1.dousersFeesManagementmoduleLogin(prop.getProperty("VicePrincipalusername"), prop.getProperty("VicePrincipalpassword"));
//		FeesManagementmodulescreenspages = loginpage1.dousersFeesManagementmoduleLogin(prop.getProperty("NiyogaaMarketingHeadusername"), prop.getProperty("NiyogaaMarketingHeadpassword"));
//		FeesManagementmodulescreenspages = loginpage1.dousersFeesManagementmoduleLogin(prop.getProperty("NiyogaaAdministartionHeadusername"), prop.getProperty("NiyogaaAdministartionHeadpassword"));
//		FeesManagementmodulescreenspages = loginpage1.dousersFeesManagementmoduleLogin(prop.getProperty("NiyogaaFinanceHeadusername"), prop.getProperty("NiyogaaFinanceHeadpassword"));
//		FeesManagementmodulescreenspages = loginpage1.dousersFeesManagementmoduleLogin(prop.getProperty("SchoolAccountHeadusername"), prop.getProperty("SchoolAccountHeadpassword"));
	}
	
	
	@Test(priority = 1,dataProvider="getdata") 
	  public void  SchoolERPloginFeesManagementMainmenureadTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyFeesManagementMainMenu(FeesManagementMainMenu, FeesManagementMainMenuRead);
		
		  
	  }
	@Test(priority = 2,dataProvider="getdata") 
	  public void  SchoolERPloginMiscellaneousFeesCollectionSubMenuReadTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyMiscellaneousFeesCollectionSubMenu(MFCMenu, MFCMenuRead);
	
		  
	  }
	@Test(priority = 3,dataProvider="getdata") 
	  public void  SchoolERPloginMiscellaneousFeesCollectionSubMenuCreateTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyMiscellaneousFeesCollectionSubMenuCreate(MFCMenu, MFCMenuCreate);
	
	  }
	@Test(priority = 4,dataProvider="getdata") 
	  public void  SchoolERPloginMiscellaneousFeesCollectionSubMenuEditTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyMiscellaneousFeesCollectionSubMenuEdit(MFCMenu, MFCMenuEdit);
	  }
	
	@Test(priority = 5,dataProvider="getdata") 
	  public void  SchoolERPloginMiscellaneousFeesCollectionSubMenuDeleteTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyMiscellaneousFeesCollectionSubMenuDelete(MFCMenu, MFCMenuDelete);
	
	  }	
	
	@Test(priority = 6,dataProvider="getdata") 
	  public void  SchoolERPloginStandardFeeCollectionSubMenuReadTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyStandardFeeCollectionSubMenu(SFCMenu, SFCMenuRead);
	
		  
	  }
	@Test(priority = 7,dataProvider="getdata") 
	  public void  SchoolERPloginStandardFeeCollectionSubMenuCreateTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyStandardFeeCollectionSubMenuCreate(SFCMenu, SFCMenuCreate);
	
	  }
	@Test(priority = 8,dataProvider="getdata") 
	  public void  SchoolERPloginStandardFeeCollectionSubMenuEditTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyStandardFeeCollectionSubMenuEdit(SFCMenu, SFCMenuEdit);
	
	  }
	
	@Test(priority = 9,dataProvider="getdata") 
	  public void  SchoolERPloginStandardFeeCollectionSubMenuDeleteTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyStandardFeeCollectionSubMenuDelete(SFCMenu, SFCMenuDelete);
	
	  }	
	
	@Test(priority = 10,dataProvider="getdata") 
	  public void  SchoolERPloginFeeCollectionSubMenuReadTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyFeesCollectionSubMenu(FCMenu, FCMenuRead);
	
		  
	  }
	@Test(priority = 11,dataProvider="getdata") 
	  public void  SchoolERPloginFeeCollectionSubMenuCreateTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyFeesCollectionSubMenuCreate(FCMenu, FCMenuCreate);
	
	  }
	@Test(priority = 12,dataProvider="getdata") 
	  public void  SchoolERPloginFeeCollectionSubMenuEditTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyFeesCollectionSubMenuEdit(FCMenu, FCMenuEdit);
	  }
	
	@Test(priority = 13,dataProvider="getdata") 
	  public void  SchoolERPloginFeeCollectionSubMenuDeleteTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyFeesCollectionSubMenuDelete(FCMenu, FCMenuDelete);
	
	  }	
	
	@Test(priority = 14,dataProvider="getdata") 
	  public void  SchoolERPloginFeesCollectionbytermSubMenuReadTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyFeesCollectionbytermSubMenu(FCTMenu, FCTMenuRead);
	
		  
	  }
	@Test(priority = 15,dataProvider="getdata") 
	  public void  SchoolERPloginFeesCollectionbytermSubMenuCreateTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyFeesCollectionbytermSubMenuCreate(FCTMenu, FCTMenuCreate);
	
	  }
	@Test(priority = 16,dataProvider="getdata") 
	  public void  SchoolERPloginFeesCollectionbytermSubMenuEditTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyFeesCollectionbytermSubMenuEdit(FCTMenu, FCTMenuEdit);
	  }
	
	@Test(priority = 17,dataProvider="getdata") 
	  public void  SchoolERPloginFeesCollectionbytermSubMenuDeleteTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyFeesCollectionbytermSubMenuDelete(FCTMenu, FCTMenuDelete);
	
	  }
	
	@Test(priority = 18,dataProvider="getdata") 
	  public void  SchoolERPloginChequeReconciliationSubMenuReadTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyChequeReconciliationSubMenu(CHQRMenu,CHQRMenuRead);
	
		  
	  }
	@Test(priority = 19,dataProvider="getdata") 
	  public void  SchoolERPloginChequeReconciliationSubMenuCreateTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyChequeReconciliationSubMenuCreate(CHQRMenu,CHQRMenuCreate);
	
	  }
	@Test(priority = 20,dataProvider="getdata") 
	  public void  SchoolERPloginChequeReconciliationSubMenuEditTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyChequeReconciliationSubMenuEdit(CHQRMenu,CHQRMenuEdit);
	  }
	
	@Test(priority = 21,dataProvider="getdata") 
	  public void  SchoolERPloginChequeReconciliationSubMenuDeleteTest(String FeesManagementMainMenu, String FeesManagementMainMenuRead,String MFCMenu,String MFCMenuRead,String MFCMenuCreate,String MFCMenuEdit,String MFCMenuDelete,String SFCMenu,String SFCMenuRead,String SFCMenuCreate,String SFCMenuEdit,String SFCMenuDelete,String FCMenu,String FCMenuRead,String FCMenuCreate,String FCMenuEdit,String FCMenuDelete,String FCTMenu,String FCTMenuRead,String FCTMenuCreate,String FCTMenuEdit,String FCTMenuDelete,String CHQRMenu,String CHQRMenuRead,String CHQRMenuCreate,String CHQRMenuEdit,String CHQRMenuDelete) {
		FeesManagementmodulescreenspages.verifyChequeReconciliationSubMenuDelete(CHQRMenu,CHQRMenuDelete);
	
	  }


}