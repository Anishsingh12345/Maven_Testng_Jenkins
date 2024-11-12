package pageobject;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class posting {
	
	public static	WebDriver  dr1;
	
	public posting(WebDriver dr2)
	{
		dr2=this.dr1;
	}
	
	By mindtxpath= By.xpath("//*[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6' and    text()=\"What's on your mind, Jatt?\"]");
			By popupxpath=By.xpath("//*[@class='x78zum5 x1q0g3np x1pl0jk3 x1plvlek xryxfnj xqui1pq x14ocpvf x5oemz9 x1lck2f0 xlgs127']");
By textxpath=By.xpath("//*[@class='xdj266r x11i5rnm xat24cr x1mh8g0r x16tdsg8']");
By postxpath=By.xpath("//*[text()=\"Post\"]");



public void Postingtestcase(WebDriver driver1)
{
	JavascriptExecutor js = (JavascriptExecutor)driver1;
	Actions a =new Actions(driver1);


	
List <WebElement> mindwebelement = driver1.findElements(mindtxpath);
	int s=mindwebelement.size();


for(int i=0 ; i<s ; i++)
{
	try
	{
		a.moveToElement(mindwebelement.get(0));
		mindwebelement.get(0).click();

	}
	catch(Exception e)
	{
		a.moveToElement(mindwebelement.get(0));

		js.executeScript("arguments[0].scrollIntoView();",mindwebelement.get(0));
		mindwebelement.get(0).click();

	}
}






WebElement popupwebelement = driver1.findElement(postxpath);



a.moveToElement(popupwebelement);
js.executeScript("arguments[0].scrollIntoView();",popupwebelement);


WebElement textwebelement = driver1.findElement(textxpath);

js.executeScript("arguments[0].scrollIntoView();",textwebelement);
textwebelement.clear();
textwebelement.sendKeys("BELIEVE IN YOURSELF");

WebElement postwebelement = driver1.findElement(postxpath);

js.executeScript("arguments[0].scrollIntoView();",postwebelement);
postwebelement.click();









}
}





