package testcases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobject.loginpage;
import reporting.Listeners;
import util.config;
import util.screensortcode;
import pageobject.loginpage;

public class tc_loginpage extends BaseClass {
	
	config c1 = new config();
	String user = c1.user();
	 String pass = c1.pass();
	
	
	public void loginpagetestcase()
	{
		
		//pageobject code run
		
		loginpage login = new loginpage(driver);
		
		login.login(driver,user, pass);
	
		

		}
		
		
		   //editing
		
	}





