package org.ictkerala.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
		WebDriver driver;
		
		public LoginPage(WebDriver driver) {
			this.driver=driver;
		}

		public void setUsername(String uname) {
			WebElement uname1=driver.findElement(By.id("login1"));
			uname1.clear();
			uname1.sendKeys(uname);
		}
		
		public void setPassword(String passw) {
			WebElement passw1=driver.findElement(By.id("password"));
			passw1.clear();
			passw1.sendKeys(passw);
		}
		
		public void clickbttn() {
			WebElement bttn=driver.findElement(By.className("signin-btn"));
			bttn.click();
			
		}
}
