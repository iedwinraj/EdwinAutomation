package com.qa.verifyroleacess.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.verifyroleaccess.base.roleaccessBaseTest;

public class LibrarianEmployeesmoduletest extends roleaccessBaseTest{
	
@BeforeClass
	
	public void DashboadPageSetup() {

//	dataSheetName = "TC001";
//	dataSheetName = "CADMINEmployeesmodule";
//	dataSheetName = "SchoolERPAdminEmployeesmodulesmodule";
//	dataSheetName = "PrincipalloginEmployeesmodule";
//	dataSheetName = "VicePrincipalloginEmployeesmodule";
	dataSheetName = "LibrarianEmployeesmodule";
//	dataSheetName = "NiyogaaMarketingHeadEmployeesmodule";
//	dataSheetName = "NiyogaaFinanceHeadEmployeesmodule";
//	dataSheetName = "NiyogaaAdministartionHeadEmployeesmodule";
//	dataSheetName = "SchoolAccountHeadEmployeesmodule";

//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("SchoolERPAdminpassword"));
//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("Librarianusername"), prop.getProperty("Librarianpassword"));
//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("Principalusername"), prop.getProperty("Principalpassword"));
//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("VicePrincipalusername"), prop.getProperty("VicePrincipalpassword"));
//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("NiyogaaMarketingHeadusername"), prop.getProperty("NiyogaaMarketingHeadpassword"));
//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("NiyogaaAdministartionHeadusername"), prop.getProperty("NiyogaaAdministartionHeadpassword"));
//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("NiyogaaFinanceHeadusername"), prop.getProperty("NiyogaaFinanceHeadpassword"));
//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("SchoolAccountHeadusername"), prop.getProperty("SchoolAccountHeadpassword"));
	}
	
	
	@Test(priority = 1,dataProvider="getdata") 
	  public void  LibrarianloginEmployeesMainmenureadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeesMainMenuRead(EmployeesMainMenu, EmployeesMainMenuRead);
		
		  
	  }
	@Test(priority = 2,dataProvider="getdata") 
	  public void  LibrarianloginEmployeessubmenuReadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeesSubMenuRead(EmployeesSubMenu,EmployeesSubMenuRead);
	
		  
	  }
	@Test(priority = 3,dataProvider="getdata") 
	  public void  LibrarianloginEmployeessubmenuCreateTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeesSubMenuCreate(EmployeesSubMenu,EmployeesSubMenuCreate);
	
	  }
	@Test(priority = 4,dataProvider="getdata") 
	  public void  LibrarianloginEmployeessubmenuEditTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeesSubMenuEdit(EmployeesSubMenu,EmployeesSubMenuEdit);
	
	  }
	
	@Test(priority = 5,dataProvider="getdata") 
	  public void  LibrarianloginEmployeessubmenuDeleteTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeesSubMenuDelete(EmployeesSubMenu,EmployeesSubMenuDelete);
	
	  }	
	
	@Test(priority = 6,dataProvider="getdata") 
	  public void  LibrarianloginEmployeesConfSubmenureadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeesConfSubmenuRead(EmployeesConfSubmenu, EmployeesConfSubmenuRead);
		
		  
	  }
	@Test(priority = 7,dataProvider="getdata") 
	  public void  LibrarianloginEmployeeTypeChildmenuReadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeeTypeChildmenuRead(EmployeeTypeChildmenu,EmployeeTypeChildmenuRead);
	
		  
	  }
	@Test(priority = 8,dataProvider="getdata") 
	  public void  LibrarianloginEmployeeTypeChildmenuCreateTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeeTypeChildmenuCreate(EmployeeTypeChildmenu,EmployeeTypeChildmenuCreate);
	
	  }
	@Test(priority = 9,dataProvider="getdata") 
	  public void  LibrarianloginEmployeeTypeChildmenuEditTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeeTypeChildmenuEdit(EmployeeTypeChildmenu,EmployeeTypeChildmenuEdit);
	
	  }
	
	@Test(priority = 10,dataProvider="getdata") 
	  public void  LibrarianloginEmployeeTypeChildmenuDeleteTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeesSubMenuDelete(EmployeeTypeChildmenu,EmployeeTypeChildmenuDelete);
	
	  }	
	
	@Test(priority = 11,dataProvider="getdata") 
	  public void  LibrarianloginDepartmentsChildmenuReadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDepartmentsChildmenuRead(DepartmentsChildmenu,DepartmentsChildmenuRead);
	
		  
	  }
	@Test(priority = 12,dataProvider="getdata") 
	  public void  LibrarianloginDepartmentsChildmenuCreateTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDepartmentsChildmenuCreate(DepartmentsChildmenu,DepartmentsChildmenuCreate);
	
	  }
	@Test(priority = 13,dataProvider="getdata") 
	  public void  LibrarianloginDepartmentsChildmenuEditTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDepartmentsChildmenuEdit(DepartmentsChildmenu,DepartmentsChildmenuEdit);
	
	  }
	
	@Test(priority = 14,dataProvider="getdata") 
	  public void  LibrarianloginDepartmentsChildmenuDeleteTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDepartmentsChildmenuDelete(DepartmentsChildmenu,DepartmentsChildmenuDelete);
	
	  }	
	@Test(priority = 15,dataProvider="getdata") 
	  public void  LibrarianloginDesignationChildmenuReadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDesignationChildmenuRead(DesignationChildmenu,DesignationChildmenuRead);
	
		  
	  }
	@Test(priority = 16,dataProvider="getdata") 
	  public void  LibrarianloginDesignationChildmenuCreateTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDesignationChildmenuCreate(DesignationChildmenu,DesignationChildmenuCreate);
	
	  }
	@Test(priority = 17,dataProvider="getdata") 
	  public void  LibrarianloginDesignationChildmenuEditTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDesignationChildmenuEdit(DesignationChildmenu,DesignationChildmenuEdit);
	
	  }
	
	@Test(priority = 18,dataProvider="getdata") 
	  public void  LibrarianloginDesignationChildmenuDeleteTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDesignationChildmenuDelete(DesignationChildmenu,DesignationChildmenuDelete);
	
	  }	
	
	@Test(priority = 19,dataProvider="getdata") 
	  public void  LibrarianloginFamilyRelationshipsChildmenuReadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyFamilyRelationshipsChildmenuRead(FamilyRelationshipsChildmenu,FamilyRelationshipsChildmenuRead);
	
		  
	  }
	@Test(priority = 20,dataProvider="getdata") 
	  public void  LibrarianloginFamilyRelationshipsChildmenuCreateTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyFamilyRelationshipsChildmenuCreate(FamilyRelationshipsChildmenu,FamilyRelationshipsChildmenuCreate);
	
	  }
	@Test(priority = 21,dataProvider="getdata") 
	  public void  LibrarianloginFamilyRelationshipsChildmenuEditTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyFamilyRelationshipsChildmenuEdit(FamilyRelationshipsChildmenu,FamilyRelationshipsChildmenuEdit);
	
	  }
	
	@Test(priority = 22,dataProvider="getdata") 
	  public void  LibrarianloginFamilyRelationshipsChildmenuDeleteTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyFamilyRelationshipsChildmenuDelete(FamilyRelationshipsChildmenu,FamilyRelationshipsChildmenuDelete);
	
	  }	
	
	@Test(priority = 23,dataProvider="getdata") 
	  public void  LibrarianloginAssetChildmenuReadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyAssetChildmenuRead(AssetChildmenu,AssetChildmenuRead);
	
		  
	  }
	@Test(priority = 24,dataProvider="getdata") 
	  public void  LibrarianloginAssetChildmenuCreateTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyAssetChildmenuCreate(AssetChildmenu,AssetChildmenuCreate);
	
	  }
	@Test(priority = 25,dataProvider="getdata") 
	  public void  LibrarianloginAssetChildmenuEditTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyAssetChildmenuEdit(AssetChildmenu,AssetChildmenuEdit);
	
	  }
	
	@Test(priority = 26,dataProvider="getdata") 
	  public void  LibrarianloginAssetChildmenuDeleteTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyAssetChildmenuDelete(AssetChildmenu,AssetChildmenuDelete);
	
	  }	

}
