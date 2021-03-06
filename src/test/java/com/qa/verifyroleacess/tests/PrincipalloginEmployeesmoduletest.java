package com.qa.verifyroleacess.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.verifyroleaccess.base.roleaccessBaseTest;

public class PrincipalloginEmployeesmoduletest extends roleaccessBaseTest{

@BeforeClass
	
	public void DashboadPageSetup() {

//	dataSheetName = "TC001";
//	dataSheetName = "CADMINEmployeesmodule";
//	dataSheetName = "SchoolERPAdminEmployeesmodulesmodule";
	dataSheetName = "PrincipalloginEmployeesmodule";
//	dataSheetName = "VicePrincipalloginEmployeesmodule";
//	dataSheetName = "LibrarianEmployeesmodule";
//	dataSheetName = "NiyogaaMarketingHeadEmployeesmodule";
//	dataSheetName = "NiyogaaFinanceHeadEmployeesmodule";
//	dataSheetName = "NiyogaaAdministartionHeadEmployeesmodule";
//	dataSheetName = "SchoolAccountHeadEmployeesmodule";

//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("SchoolERPAdminpassword"));
//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("Librarianusername"), prop.getProperty("Librarianpassword"));
		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("Principalusername"), prop.getProperty("Principalpassword"));
//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("VicePrincipalusername"), prop.getProperty("VicePrincipalpassword"));
//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("NiyogaaMarketingHeadusername"), prop.getProperty("NiyogaaMarketingHeadpassword"));
//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("NiyogaaAdministartionHeadusername"), prop.getProperty("NiyogaaAdministartionHeadpassword"));
//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("NiyogaaFinanceHeadusername"), prop.getProperty("NiyogaaFinanceHeadpassword"));
//		Employeesmodulescreenspages = loginpage1.dousersEmployeesmoduleLogin(prop.getProperty("SchoolAccountHeadusername"), prop.getProperty("SchoolAccountHeadpassword"));
	}
	
	
	@Test(priority = 1,dataProvider="getdata") 
	  public void  PrincipalloginEmployeesMainmenureadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeesMainMenuRead(EmployeesMainMenu, EmployeesMainMenuRead);
		
		  
	  }
	@Test(priority = 2,dataProvider="getdata") 
	  public void  PrincipalloginEmployeessubmenuReadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeesSubMenuRead(EmployeesSubMenu,EmployeesSubMenuRead);
	
		  
	  }
	@Test(priority = 3,dataProvider="getdata") 
	  public void  PrincipalloginEmployeessubmenuCreateTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeesSubMenuCreate(EmployeesSubMenu,EmployeesSubMenuCreate);
	
	  }
	@Test(priority = 4,dataProvider="getdata") 
	  public void  PrincipalloginEmployeessubmenuEditTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeesSubMenuEdit(EmployeesSubMenu,EmployeesSubMenuEdit);
	
	  }
	
	@Test(priority = 5,dataProvider="getdata") 
	  public void  PrincipalloginEmployeessubmenuDeleteTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeesSubMenuDelete(EmployeesSubMenu,EmployeesSubMenuDelete);
	
	  }	
	
	@Test(priority = 6,dataProvider="getdata") 
	  public void  PrincipalloginEmployeesConfSubmenureadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeesConfSubmenuRead(EmployeesConfSubmenu, EmployeesConfSubmenuRead);
		
		  
	  }
	@Test(priority = 7,dataProvider="getdata") 
	  public void  PrincipalloginEmployeeTypeChildmenuReadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeeTypeChildmenuRead(EmployeeTypeChildmenu,EmployeeTypeChildmenuRead);
	
		  
	  }
	@Test(priority = 8,dataProvider="getdata") 
	  public void  PrincipalloginEmployeeTypeChildmenuCreateTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeeTypeChildmenuCreate(EmployeeTypeChildmenu,EmployeeTypeChildmenuCreate);
	
	  }
	@Test(priority = 9,dataProvider="getdata") 
	  public void  PrincipalloginEmployeeTypeChildmenuEditTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeeTypeChildmenuEdit(EmployeeTypeChildmenu,EmployeeTypeChildmenuEdit);
	
	  }
	
	@Test(priority = 10,dataProvider="getdata") 
	  public void  PrincipalloginEmployeeTypeChildmenuDeleteTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyEmployeesSubMenuDelete(EmployeeTypeChildmenu,EmployeeTypeChildmenuDelete);
	
	  }	
	
	@Test(priority = 11,dataProvider="getdata") 
	  public void  PrincipalloginDepartmentsChildmenuReadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDepartmentsChildmenuRead(DepartmentsChildmenu,DepartmentsChildmenuRead);
	
		  
	  }
	@Test(priority = 12,dataProvider="getdata") 
	  public void  PrincipalloginDepartmentsChildmenuCreateTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDepartmentsChildmenuCreate(DepartmentsChildmenu,DepartmentsChildmenuCreate);
	
	  }
	@Test(priority = 13,dataProvider="getdata") 
	  public void  PrincipalloginDepartmentsChildmenuEditTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDepartmentsChildmenuEdit(DepartmentsChildmenu,DepartmentsChildmenuEdit);
	
	  }
	
	@Test(priority = 14,dataProvider="getdata") 
	  public void  PrincipalloginDepartmentsChildmenuDeleteTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDepartmentsChildmenuDelete(DepartmentsChildmenu,DepartmentsChildmenuDelete);
	
	  }	
	@Test(priority = 15,dataProvider="getdata") 
	  public void  PrincipalloginDesignationChildmenuReadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDesignationChildmenuRead(DesignationChildmenu,DesignationChildmenuRead);
	
		  
	  }
	@Test(priority = 16,dataProvider="getdata") 
	  public void  PrincipalloginDesignationChildmenuCreateTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDesignationChildmenuCreate(DesignationChildmenu,DesignationChildmenuCreate);
	
	  }
	@Test(priority = 17,dataProvider="getdata") 
	  public void  PrincipalloginDesignationChildmenuEditTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDesignationChildmenuEdit(DesignationChildmenu,DesignationChildmenuEdit);
	
	  }
	
	@Test(priority = 18,dataProvider="getdata") 
	  public void  PrincipalloginDesignationChildmenuDeleteTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyDesignationChildmenuDelete(DesignationChildmenu,DesignationChildmenuDelete);
	
	  }	
	
	@Test(priority = 19,dataProvider="getdata") 
	  public void  PrincipalloginFamilyRelationshipsChildmenuReadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyFamilyRelationshipsChildmenuRead(FamilyRelationshipsChildmenu,FamilyRelationshipsChildmenuRead);
	
		  
	  }
	@Test(priority = 20,dataProvider="getdata") 
	  public void  PrincipalloginFamilyRelationshipsChildmenuCreateTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyFamilyRelationshipsChildmenuCreate(FamilyRelationshipsChildmenu,FamilyRelationshipsChildmenuCreate);
	
	  }
	@Test(priority = 21,dataProvider="getdata") 
	  public void  PrincipalloginFamilyRelationshipsChildmenuEditTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyFamilyRelationshipsChildmenuEdit(FamilyRelationshipsChildmenu,FamilyRelationshipsChildmenuEdit);
	
	  }
	
	@Test(priority = 22,dataProvider="getdata") 
	  public void  PrincipalloginFamilyRelationshipsChildmenuDeleteTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyFamilyRelationshipsChildmenuDelete(FamilyRelationshipsChildmenu,FamilyRelationshipsChildmenuDelete);
	
	  }	
	
	@Test(priority = 23,dataProvider="getdata") 
	  public void  PrincipalloginAssetChildmenuReadTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyAssetChildmenuRead(AssetChildmenu,AssetChildmenuRead);
	
		  
	  }
	@Test(priority = 24,dataProvider="getdata") 
	  public void  PrincipalloginAssetChildmenuCreateTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyAssetChildmenuCreate(AssetChildmenu,AssetChildmenuCreate);
	
	  }
	@Test(priority = 25,dataProvider="getdata") 
	  public void  PrincipalloginAssetChildmenuEditTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyAssetChildmenuEdit(AssetChildmenu,AssetChildmenuEdit);
	
	  }
	
	@Test(priority = 26,dataProvider="getdata") 
	  public void  PrincipalloginAssetChildmenuDeleteTest(String EmployeesMainMenu, String EmployeesMainMenuRead,String EmployeesSubMenu,String EmployeesSubMenuRead,String EmployeesSubMenuCreate,String EmployeesSubMenuEdit,String EmployeesSubMenuDelete,String EmployeesConfSubmenu,String EmployeesConfSubmenuRead,String EmployeeTypeChildmenu,String EmployeeTypeChildmenuRead,String EmployeeTypeChildmenuCreate,String EmployeeTypeChildmenuEdit,String EmployeeTypeChildmenuDelete,String DepartmentsChildmenu,String DepartmentsChildmenuRead,String DepartmentsChildmenuCreate,String DepartmentsChildmenuEdit,String DepartmentsChildmenuDelete,String DesignationChildmenu,String DesignationChildmenuRead,String DesignationChildmenuCreate,String DesignationChildmenuEdit,String DesignationChildmenuDelete,String FamilyRelationshipsChildmenu,String FamilyRelationshipsChildmenuRead,String FamilyRelationshipsChildmenuCreate,String FamilyRelationshipsChildmenuEdit,String FamilyRelationshipsChildmenuDelete,String AssetChildmenu,String AssetChildmenuRead,String AssetChildmenuCreate,String AssetChildmenuEdit,String AssetChildmenuDelete) {
		Employeesmodulescreenspages.verifyAssetChildmenuDelete(AssetChildmenu,AssetChildmenuDelete);
	
	  }	
	
}
