package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.config;

public class loginpage {
	public static WebDriver dr1;
	
	public loginpage(WebDriver dr2)
	{
		dr2=this.dr1;
	}
	
	config c = new config();
	 String userlocator = c.userxpath();
	  String passlocator = c.passxpath();
		String subloactor = c.subxpath();


	  


	
	By usernamexpath = By.xpath(userlocator);
			By passwordxpath=By.xpath(passlocator);
			By submitxpath = By.xpath(subloactor);
	
	
public void login(WebDriver driver1 , String usernamefield , String passwordfield)
{
	
	JavascriptExecutor js = (JavascriptExecutor)driver1;;
	
			
	  WebElement usernamewebelement = driver1.findElement(usernamexpath);
	  js.executeScript("arguments[0].scrollIntoView(true);",usernamewebelement);
	  WebElement passwordwebelement = driver1.findElement(passwordxpath);
	  js.executeScript("arguments[0].scrollIntoView(true);",passwordwebelement);

	  WebElement submitwebelement = driver1.findElement(submitxpath);
	  js.executeScript("arguments[0].scrollIntoView(true);",submitwebelement);

	  usernamewebelement.clear();
	  usernamewebelement.sendKeys(usernamefield);
	  
	  passwordwebelement.clear();
	  passwordwebelement.sendKeys(passwordfield);
	  
	  submitwebelement.click();
	  
}

}



