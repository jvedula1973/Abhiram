package com.tests;

import org.testng.annotations.Test;

import com.stf.RunTests;

public class SampleTest {
//	@Test
//	public void TestTitle() {
//		RunTests rt = new RunTests();
//		try {
//			rt.TestTitle();
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}
//	}
	
	
	 @Test
	  public void TestLogin() throws Exception {
		  
		  RunTests rt = new RunTests();
		  rt.TestLogin();;
	  }
}
