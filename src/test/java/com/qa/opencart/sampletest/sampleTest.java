package com.qa.opencart.sampletest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.opencart.samplepage.samplepage;

public class sampleTest {

	add();
	
	
	@Test(enabled=false)
	public void testcase1() {
		System.out.println("This is testcase1");
	} 
	
	@Test
	public void testcase2() {
		System.out.println("This is testcase2");
	}
	
	@Test(groups= {"groupexe"})
	public void testcase3() {
		System.out.println("group method1");
	}

	@Test
	public void testcase4() {
		System.out.println("This is testcase4");
	}
	
	@Test(groups= {"groupexe"})
	public void testcase5() {
		System.out.println("group method2");
	}
	
	@Test(timeOut=200)
	public void testcase6() {
		System.out.println("Timeout attributes");
	}
	@Test
	@Parameters({"3","7"})
	public void testcase7(int a,int b) {
		int add = a+b;
		System.out.println("Add" + add);
	}
}
