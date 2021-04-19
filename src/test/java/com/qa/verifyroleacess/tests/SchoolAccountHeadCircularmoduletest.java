package com.qa.verifyroleacess.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.verifyroleaccess.base.roleaccessBaseTest;

public class SchoolAccountHeadCircularmoduletest extends roleaccessBaseTest {

@BeforeClass
	
	public void DashboadPageSetup() {
//		dataSheetName = "TC001";
//		dataSheetName = "CADMINCircularmodulesmodule";
//		dataSheetName = "SchoolERPAdminCircularmodulesmodule";
//		dataSheetName = "LibrarianCircularmodule";
//		dataSheetName = "PrincipalCircularmodulesmodule";
//		dataSheetName = "VicePrincipalCircularmodule";
//		dataSheetName = "PrincipalloginCircularmodule";
//		dataSheetName = "NiyogaaMarketingHeadCircularmodule";
//		dataSheetName = "NiyogaaAdministartionHeadCircularmodule";
//		dataSheetName = "NiyogaaFinanceHeadCircularmodule";
		dataSheetName = "SchoolAccountHeadCircularmodule";
		
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("SchoolERPAdminpassword"));
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("Librarianusername"), prop.getProperty("Librarianpassword"));
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("Principalusername"), prop.getProperty("Principalpassword"));
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("VicePrincipalusername"), prop.getProperty("VicePrincipalpassword"));
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("NiyogaaMarketingHeadusername"), prop.getProperty("NiyogaaMarketingHeadpassword"));
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("NiyogaaAdministartionHeadusername"), prop.getProperty("NiyogaaAdministartionHeadpassword"));
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("NiyogaaFinanceHeadusername"), prop.getProperty("NiyogaaFinanceHeadpassword"));
		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("SchoolAccountHeadusername"), prop.getProperty("SchoolAccountHeadpassword"));
	}
	
	
	@Test(priority = 1,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginCircularMainmenureadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.menucount();
		Circularmodulescreenspages.verifyCircularMainmenu(CircularMainMenu, CircularMainMenuRead);
		
		  
	  }
	@Test(priority = 2,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginHomeworkssubmenuReadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyHWmenu(HWMenu,HWMenuRead);
	
		  
	  }
	@Test(priority = 3,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginHomeworkssubmenuCreateTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyHWMenuCreate(HWMenu,HWCreate);
	
	  }
	@Test(priority = 4,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginHomeworkssubmenuEditTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyHWMenuEdit(HWMenu,HWMenuEdit);
	
	  }
	
	@Test(priority = 5,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginHomeworkssubmenuDeleteTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyHWMenuDelete(HWMenu,HWMenuDelete);
	
	  }
	
	@Test(priority = 6,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginAnnouncementssubmenuReadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyANTmenu(ANMenu,ANMenuRead);
	
		  
	  }
	@Test(priority = 7,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginAnnouncementssubmenuCreateTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyANTMenuCreate(ANMenu,ANCreate);
	
	  }
	@Test(priority = 8,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginAnnouncementssubmenuEditTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyANTMenuEdit(ANMenu,ANMenuEdit);
	
	  }
	
	@Test(priority = 9,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginAnnouncementssubmenuDeleteTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyANTMenuDelete(ANMenu,ANMenuDelete);
	
	  }
	@Test(priority = 10,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginDiarysubmenuReadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyDiarymenu(DiaryMenu,DiaryMenuRead);
	
		  
	  }
	@Test(priority = 11,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginDiarysubmenuCreateTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyDiaryMenuCreate(DiaryMenu,DiaryCreate);
	
	  }
	@Test(priority = 12,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginDiarysubmenuEditTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyDiaryMenuEdit(DiaryMenu,DiaryMenuEdit);
	
	  }
	
	@Test(priority = 13,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginDiarysubmenuDeleteTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyDiaryMenuDelete(DiaryMenu,DiaryMenuDelete);
	
	  }
	@Test(priority = 14,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginworksheetsubmenuReadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyWHMenu(WSMenu,WSMenuRead);
		  
	  }
	@Test(priority = 15,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginWorksheetsubmenuCreateTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyWHMenuCreate(WSMenu,WSCreate);
		  
	  }
	@Test(priority = 16,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginWorksheetsubmenuEditTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyWHMenuEdit(WSMenu,WSMenuEdit);
		  
	  }
	@Test(priority = 17,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginWorksheetsubmenuDeleteTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyWHMenuDelete(WSMenu,WSMenuDelete);
		  
	  }
	
	@Test(priority = 18,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginNewslettersubmenuReadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyNLMenu(NLMenu,NLMenuRead);
		  
	  }
	@Test(priority = 19,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginNewslettersubmenuCreateTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyNLMenuCreate(NLMenu,NLCreate);
		  
	  }
	@Test(priority = 20,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginNewslettersubmenuEditTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyNLMenuEdit(NLMenu,NLMenuEdit);
		  
	  }
	@Test(priority = 21,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginNewslettersubmenuDeleteTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyNLMenuDelete(NLMenu,NLMenuDelete);
		  
	  }
	@Test(priority = 22,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginConfigurationsubmenureadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyConfMenu(ConfMenu,ConfMenuRead);
		  
	  }
	@Test(priority = 23,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginGroupsubmenureadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyGroupMenu(GroupMenu,GroupMenuRead);
		  
	  }
	@Test(priority = 24,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginGroupsubmenuCreateTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyGroupMenuCreate(GroupMenu,GroupCreate);
		  
	  }
	@Test(priority = 25,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginGroupsubmenuEditTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyGroupMenuEdit(GroupMenu,GroupMenuEdit);
		  
	  }
	@Test(priority = 26,dataProvider="getdata") 
	  public void  SchoolAccountHeadloginGroupsubmenuDeleteTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyGroupMenuDelete(GroupMenu,GroupMenuDelete);
		  
	  }
	
}
