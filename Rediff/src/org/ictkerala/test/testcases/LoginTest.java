package org.ictkerala.test.testcases;

import org.ictkerala.test.pages.LoginPage;

public class LoginTest extends Configuration{
		LoginTest() {
			
			
			
			setUp();
			
			obj = new LoginPage(driver);
			
		}
		LoginPage obj;
		
		public void tc001() {
			
			obj.setUsername("Gautham");
			obj.setPassword("g1234");
			obj.clickbttn();
		}
		
			
			
		}


