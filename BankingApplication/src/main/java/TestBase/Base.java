package TestBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	static Properties pro;
	
public static void loadproperty_element()
{
	try {
		File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\Interface\\OR.properties");
		FileReader fr=new FileReader(f);
		pro=new Properties();
		pro.load(fr);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static By  ele(String key)
	{	
	    By loc = null;
	    
	loadproperty_element();
	String  elevalue = pro.getProperty(key);
	 
	String loctype=elevalue.split(":")[0];
	
	String locvalue=elevalue.split(":")[1];
	
	switch(loctype)
	{
	case "id":
		loc=By.id(locvalue);
		break;
		
	case "xpath":
		loc=By.xpath(locvalue);
		break;
	}
	return loc;
		
	}
public static void loadproperty_config()
{
	try {
		File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\Interface\\config.properties");
		FileReader fr=new FileReader(f);
		pro=new Properties();
		pro.load(fr);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static String config(String key)
	{
	loadproperty_config();
	String y =pro.getProperty(key);
	return y;
	}

}
