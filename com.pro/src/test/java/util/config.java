package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class config {
	
	public File f;
	public FileInputStream fis;
	public Properties pro;
	
	public config()
	{
		f = new File("C:\\Users\\Acer-Aspire7\\eclipse-workspace\\com.pro\\configuration\\config.properties");
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pro=new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public String url()
	{
		String url1=pro.getProperty("url");
		return url1;
	}
	
	public String user()
	{
String user1= pro.getProperty("user");
				return user1;
	}
	
	public String pass()
	{
		String pass1= pro.getProperty("pass");
				return pass1 ;
	}
	
	public String userxpath()
	{
		String userxpath1 = pro.getProperty("userxpath");
				return userxpath1;
	}
	
	public String passxpath()
	{
		String passxpath1= pro.getProperty("passxpath");
				return passxpath1;
	}
	
	public String subxpath()
	{
		 String subxpath1 = pro.getProperty("subxpath");
		        return subxpath1;
	}
	
	public String title()
	{
		 String title1 = pro.getProperty("title");
		        return title1;
	}
	
	public String testcaseName()

	{
		String testcaseName1=pro.getProperty("testcaseName");
		return testcaseName1;
	}
	
	
}
