package com.qa.verifyroleaccess.base;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.qa.Adminstrationmodule.pages.Buildings;
import com.qa.Adminstrationmodule.pages.BuildingsPage;
import com.qa.Adminstrationmodule.pages.CircularmodulescreensPages;
import com.qa.Adminstrationmodule.pages.ConfigurationsmodulescreensPages;
import com.qa.Adminstrationmodule.pages.DashboardPage;
import com.qa.Adminstrationmodule.pages.DashboardPage2;
import com.qa.Adminstrationmodule.pages.Dashboardpageparameterized;
import com.qa.Adminstrationmodule.pages.EmployeesmodulescreensPages;
import com.qa.Adminstrationmodule.pages.FeesManagementmodulescreensPages;
import com.qa.Adminstrationmodule.pages.IncidentmodulescreensPages;
import com.qa.Adminstrationmodule.pages.OnlineVideosmodulescreensPages;
import com.qa.Adminstrationmodule.pages.ParentmodulePage;
import com.qa.Adminstrationmodule.pages.ReportCardmodulescreensPages;
import com.qa.Adminstrationmodule.pages.SchoolManagementmodulePages;
import com.qa.Adminstrationmodule.pages.SendEmailmodulescreensPages;
import com.qa.Adminstrationmodule.pages.StoriesmodulescreensPages;
import com.qa.Adminstrationmodule.pages.StudentManagementmodulescreensPages;
import com.qa.Adminstrationmodule.pages.StudentlifecyclemodulePages;
import com.qa.Adminstrationmodule.pages.testLoginPage;
import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.RegisterPage;
import com.qa.verifyroleacess.tests.Buildingstest;
import com.qa.verifyroleacess.tests.Buildingtest;


public class roleaccessBaseTest {
	
	DriverFactory df;
	public Properties prop;
	WebDriver driver;
	public String testcaseName, testDec, author, category, dataSheetName;
	public testLoginPage loginpage1;
	public DashboardPage dashboardpage;
	public ProductInfoPage productInfoPage;
	public RegisterPage registerPage;
	public Dashboardpageparameterized dashboardpageparameterized;
	public DashboardPage2 dashboardpage2;
	public ParentmodulePage Parentmodulepage;
	public SchoolManagementmodulePages SchoolManagementmodulepages;
	public StudentlifecyclemodulePages Studentlifecyclemodulepages;
	public CircularmodulescreensPages Circularmodulescreenspages;
	public IncidentmodulescreensPages Incidentmodulescreenspages;
	public StoriesmodulescreensPages  Storiesmodulescreenspages;
	public OnlineVideosmodulescreensPages OnlineVideosmodulescreenspages;
	public SendEmailmodulescreensPages SendEmailmodulescreenspages;
	public FeesManagementmodulescreensPages FeesManagementmodulescreenspages;
	public StudentManagementmodulescreensPages	StudentManagementmodulescreenspages;
	public EmployeesmodulescreensPages	Employeesmodulescreenspages;
	public ReportCardmodulescreensPages	ReportCardmodulescreenspages;
	public ConfigurationsmodulescreensPages Configurationsmodulescreenspages;

	public BuildingsPage Buildingspage;
	
	@Parameters({"browser", "version"})
	@BeforeTest
	public void setUp(String browserName, String browserVersion) {
		df = new DriverFactory();
		prop = df.init_prop();
		String browser = prop.getProperty("browser");
		
		if(browserName !=null) {
			browser = browserName;
		}
		
		
		driver = df.init_driver(browser, browserVersion);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(120, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		if(driver.getCurrentUrl().equalsIgnoreCase("https://testautomation.pappaya.education/web/database/selector"));{
				driver.findElement(By.partialLinkText("testautomation_05")).click();
		}
		
		loginpage1 = new testLoginPage(driver);
		
	}
	
	@AfterTest
	public void tearDown() {
//		driver.quit();
		driver.close();
	}
	
	@DataProvider(name="getdata")
	
	public Object [][] getData(){
		return com.qa.verifyroleacess.utils.ReadExcelwithArray.readData(dataSheetName);
		
	}
	
	

}
