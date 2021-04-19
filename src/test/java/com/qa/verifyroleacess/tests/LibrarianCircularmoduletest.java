package com.qa.verifyroleacess.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.verifyroleaccess.base.roleaccessBaseTest;

public class LibrarianCircularmoduletest extends roleaccessBaseTest{

@BeforeClass
	
	public void DashboadPageSetup() {
//		dataSheetName = "TC001";
//		dataSheetName = "CADMINCircularmodulesmodule";
//		dataSheetName = "SchoolERPAdminCircularmodulesmodule";
//		dataSheetName = "PrincipalCircularmodulesmodule";
//		dataSheetName = "LibrarianloginCircularmodulesmodule";
		dataSheetName = "LibrarianCircularmodule";
//		dataSheetName = "NiyogaaMarketingHead";
		
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("SchoolERPAdminpassword"));
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("Librarianusername"), prop.getProperty("Librarianpassword"));
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("Principalusername"), prop.getProperty("Principalpassword"));
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("Librarianloginusername"), prop.getProperty("Librarianloginpassword"));
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("NiyogaaMarketingHeadusername"), prop.getProperty("NiyogaaMarketingHeadpassword"));
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("NiyogaaAdministartionHeadusername"), prop.getProperty("NiyogaaAdministartionHeadpassword"));
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("NiyogaaFinanceHeadusername"), prop.getProperty("NiyogaaFinanceHeadpassword"));
//		Circularmodulescreenspages = loginpage1.dousersCircularmoduleLogin(prop.getProperty("SchoolAccountHeadusername"), prop.getProperty("SchoolAccountHeadpassword"));
	}
	
	
	@Test(priority = 1,dataProvider="getdata") 
	  public void  LibrarianloginCircularMainmenureadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.menucount();
		Circularmodulescreenspages.verifyCircularMainmenu(CircularMainMenu, CircularMainMenuRead);
		
		  
	  }
	@Test(priority = 2,dataProvider="getdata") 
	  public void  LibrarianloginHomeworkssubmenuReadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyHWmenu(HWMenu,HWMenuRead);
	
		  
	  }
	@Test(priority = 3,dataProvider="getdata") 
	  public void  LibrarianloginHomeworkssubmenuCreateTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyHWMenuCreate(HWMenu,HWCreate);
	
	  }
	@Test(priority = 4,dataProvider="getdata") 
	  public void  LibrarianloginHomeworkssubmenuEditTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyHWMenuEdit(HWMenu,HWMenuEdit);
	
	  }
	
	@Test(priority = 5,dataProvider="getdata") 
	  public void  LibrarianloginHomeworkssubmenuDeleteTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyHWMenuDelete(HWMenu,HWMenuDelete);
	
	  }
	
	@Test(priority = 6,dataProvider="getdata") 
	  public void  LibrarianloginAnnouncementssubmenuReadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyANTmenu(ANMenu,ANMenuRead);
	
		  
	  }
	@Test(priority = 7,dataProvider="getdata") 
	  public void  LibrarianloginAnnouncementssubmenuCreateTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyANTMenuCreate(ANMenu,ANCreate);
	
	  }
	@Test(priority = 8,dataProvider="getdata") 
	  public void  LibrarianloginAnnouncementssubmenuEditTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyANTMenuEdit(ANMenu,ANMenuEdit);
	
	  }
	
	@Test(priority = 9,dataProvider="getdata") 
	  public void  LibrarianloginAnnouncementssubmenuDeleteTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyANTMenuDelete(ANMenu,ANMenuDelete);
	
	  }
	@Test(priority = 10,dataProvider="getdata") 
	  public void  LibrarianloginDiarysubmenuReadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyDiarymenu(DiaryMenu,DiaryMenuRead);
	
		  
	  }
	@Test(priority = 11,dataProvider="getdata") 
	  public void  LibrarianloginDiarysubmenuCreateTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyDiaryMenuCreate(DiaryMenu,DiaryCreate);
	
	  }
	@Test(priority = 12,dataProvider="getdata") 
	  public void  LibrarianloginDiarysubmenuEditTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyDiaryMenuEdit(DiaryMenu,DiaryMenuEdit);
	
	  }
	
	@Test(priority = 13,dataProvider="getdata") 
	  public void  LibrarianloginDiarysubmenuDeleteTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyDiaryMenuDelete(DiaryMenu,DiaryMenuDelete);
	
	  }
	@Test(priority = 14,dataProvider="getdata") 
	  public void  LibrarianloginworksheetsubmenuReadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyWHMenu(WSMenu,WSMenuRead);
		  
	  }
	@Test(priority = 15,dataProvider="getdata") 
	  public void  LibrarianloginWorksheetsubmenuCreateTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyWHMenuCreate(WSMenu,WSCreate);
		  
	  }
	@Test(priority = 16,dataProvider="getdata") 
	  public void  LibrarianloginWorksheetsubmenuEditTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyWHMenuEdit(WSMenu,WSMenuEdit);
		  
	  }
	@Test(priority = 17,dataProvider="getdata") 
	  public void  LibrarianloginWorksheetsubmenuDeleteTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyWHMenuDelete(NLMenu,NLMenuDelete);
		  
	  }
	
	@Test(priority = 18,dataProvider="getdata") 
	  public void  LibrarianloginNewslettersubmenuReadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyNLMenu(NLMenu,NLMenuRead);
		  
	  }
	@Test(priority = 19,dataProvider="getdata") 
	  public void  LibrarianloginNewslettersubmenuCreateTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyNLMenuCreate(NLMenu,NLCreate);
		  
	  }
	@Test(priority = 20,dataProvider="getdata") 
	  public void  LibrarianloginNewslettersubmenuEditTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyNLMenuEdit(NLMenu,NLMenuEdit);
		  
	  }
	@Test(priority = 21,dataProvider="getdata") 
	  public void  LibrarianloginNewslettersubmenuDeleteTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyNLMenuDelete(NLMenu,NLMenuDelete);
		  
	  }
	@Test(priority = 22,dataProvider="getdata") 
	  public void  LibrarianloginConfigurationsubmenureadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyConfMenu(ConfMenu,ConfMenuRead);
		  
	  }
	@Test(priority = 23,dataProvider="getdata") 
	  public void  LibrarianloginGroupsubmenureadTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyGroupMenu(GroupMenu,GroupMenuRead);
		  
	  }
	@Test(priority = 24,dataProvider="getdata") 
	  public void  LibrarianloginGroupsubmenuCreateTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyGroupMenuCreate(GroupMenu,GroupCreate);
		  
	  }
	@Test(priority = 25,dataProvider="getdata") 
	  public void  LibrarianloginGroupsubmenuEditTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyGroupMenuEdit(GroupMenu,GroupMenuEdit);
		  
	  }
	@Test(priority = 26,dataProvider="getdata") 
	  public void  LibrarianloginGroupsubmenuDeleteTest(String CircularMainMenu, String CircularMainMenuRead,String HWMenu,String HWMenuRead,String HWCreate,String HWMenuEdit,String HWMenuDelete,String ANMenu,String ANMenuRead,String ANCreate,String ANMenuEdit,String ANMenuDelete,String DiaryMenu,String DiaryMenuRead,String DiaryCreate,String DiaryMenuEdit,String DiaryMenuDelete,String WSMenu,String WSMenuRead,String WSCreate,String WSMenuEdit,String WSMenuDelete,String NLMenu,String NLMenuRead,String NLCreate,String NLMenuEdit,String NLMenuDelete,String ConfMenu,String ConfMenuRead,String ConfCreate,String ConfMenuEdit,String ConfMenuDelete,String GroupMenu,String GroupMenuRead,String GroupCreate,String GroupMenuEdit,String GroupMenuDelete) {
		Circularmodulescreenspages.verifyGroupMenuDelete(GroupMenu,GroupMenuDelete);
		  
	  }

}
