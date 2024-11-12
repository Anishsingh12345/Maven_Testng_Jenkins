package testcases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobject.loginpage;
import pageobject.posting;
import reporting.Listeners;
import util.config;
import util.screensortcode;


@org.testng.annotations.Listeners(reporting.listenerinterface.class)
public class tc_posting extends BaseClass {
	
	
	public static screensortcode sc;
	public static Listeners lis;
	config c = new config();
	public String titlelocator = c.title();


	//test case name
	private String testcaselocator = " postingcodeyesbhai ";

	 @Test(priority = 2)
		public void screensortlistener()
		{
			
			
			 sc = new screensortcode(driver);
			 lis = new Listeners(testcaselocator);
			lis.testmethod(testcaselocator,testcaselocator);
			
			
			
			
		}
	
	

	 @Test(priority = 3)
		public void logintestcasemethod()
		{
		 tc_loginpage tc = new tc_loginpage();
		 tc.loginpagetestcase();
		}
	 
	 
		
	@Test(priority = 4)
	public void Postingtestmethod()
	{
	
	if(titleofpage.contains(titlelocator)) {
		Assert.assertTrue(true);
		posting p = new posting(driver);
p.Postingtestcase(driver);

	
	
	
	//console output
	System.out.println(testcaselocator + "testCase passed successfully");
	
	//extend report 
	
	lis.pass(testcaselocator);
	lis.flushcode();

	}
	else
	{
		System.out.print("login failed successfully");
		
		
		lis.fail(testcaselocator);
		lis.flushcode();

	}
	
	
	   
	
}
	
	@Test(priority = 5 , dependsOnMethods= {"Postingtestmethod"})
	public void screensort()
	{
		sc.screensortmethod(testcaselocator);
	}
	}
	
	
	





