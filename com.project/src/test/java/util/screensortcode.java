package util;

import java.io.File;
import java.io.IOException;

import org.apache.maven.surefire.shared.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screensortcode {
	public File file;
	public String filepath="C:\\Users\\Acer-Aspire7\\eclipse-workspace\\com.project\\test-output\\screensortTESTCASES\\";
	
	public screensortcode(WebDriver dr)
	
	{
		file = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	
	}
	
	public void screensortmethod(String pathname)
	{
		try {
			FileUtils.copyFile(file,  new File(filepath+pathname+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
