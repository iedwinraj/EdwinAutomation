package com.qa.verifyroleacess.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.verifyroleaccess.base.roleaccessBaseTest;

public class Parentmoduletest extends roleaccessBaseTest {
	
	@BeforeClass

	public void DashboadPageSetup() {
//		dataSheetName = "TC001";
		dataSheetName = "CADMINParentmodule";
//		Parentmodulepage = loginpage1.dousersLogin(prop.getProperty("CADMINusername"), prop.getProperty("CADMINpassword"));
//		Parentmodulepage = loginpage1.dousersLogin(prop.getProperty("Librarianusername"), prop.getProperty("Librarianpassword"));
		Parentmodulepage = loginpage1.dousersLogin(prop.getProperty("SchoolERPAdminusername"), prop.getProperty("SchoolERPAdminpassword"));
	}
	
	
	@Test(priority = 1,dataProvider="getdata") 
	  public void  AdmloginParentsreadTest(String ParentsMenu,String ParentsRead,String ParentProfileSubMenu,String ParentProfileSubMenuRead,String ParentProfileSubMenuCreate,String ParentProfileSubMenuEdit,String ParentProfileSubMenuDelete) {
		Parentmodulepage.verifyParentsMainmenu(ParentsMenu,ParentsRead);
		  
	  }
	 @Test(priority = 2,dataProvider="getdata") 
	  public void AdmloginParentProfileReadTest(String ParentsMenu,String ParentsRead,String ParentProfileSubMenu,String ParentProfileSubMenuRead,String ParentProfileSubMenuCreate,String ParentProfileSubMenuEdit,String ParentProfileSubMenuDelete) { 
		 Parentmodulepage.verifyParentProfilesubmenuRead(ParentProfileSubMenu,ParentProfileSubMenuRead);
	  
	  }
	 
	 @Test(priority = 3,dataProvider="getdata") 
	  public void AdmloginParentProfileCreateverifyTest(String ParentsMenu,String ParentsRead,String ParentProfileSubMenu,String ParentProfileSubMenuRead,String ParentProfileSubMenuCreate,String ParentProfileSubMenuEdit,String ParentProfileSubMenuDelete) { 
		 Parentmodulepage.verifyParentProfilesubmenuCreate(ParentProfileSubMenuCreate);
	  
	  }
	 @Test(priority = 4,dataProvider="getdata") 
	  public void AdmloginParentProfileEditverifyTest(String ParentsMenu,String ParentsRead,String ParentProfileSubMenu,String ParentProfileSubMenuRead,String ParentProfileSubMenuCreate,String ParentProfileSubMenuEdit,String ParentProfileSubMenuDelete) { 
		 Parentmodulepage.verifyParentProfilesubmenuEdit(ParentProfileSubMenuEdit);
	  
	  }
	 @Test(priority = 5,dataProvider="getdata") 
	  public void AdmloginParentProfileDeleteverifyTest(String ParentsMenu,String ParentsRead,String ParentProfileSubMenu,String ParentProfileSubMenuRead,String ParentProfileSubMenuCreate,String ParentProfileSubMenuEdit,String ParentProfileSubMenuDelete) { 
		 Parentmodulepage.verifyParentProfilesubmenuDelete(ParentProfileSubMenuDelete);
	  
	  }
}
