package com.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Keyword.Keyword;
import com.Utils.PropertiesReading;

public class Demo1 {
	 Keyword keyword=new Keyword();
	   @Test(priority=1)
	   public  void LaunchingBrowser()throws IOException, InterruptedException {
		   keyword.initializeDriver("chrome");
	   }
	   @Test(priority=2)
	   public  void openURL()throws IOException, InterruptedException {
		   keyword.openURL(PropertiesReading.getProperty("ObjectRepo", "URL1"));
		   keyword.maximize();
	   }
	   @Test(priority=3)
	   public  void Register()throws IOException, InterruptedException {
		   keyword.click(PropertiesReading.getProperty("ObjectRepo", "Register"));
		   keyword.sendKeys(PropertiesReading.getProperty("ObjectRepo", "Name"),"Tejal");
		   keyword.sendKeys(PropertiesReading.getProperty("ObjectRepo", "LName"),"Pandit");
		   keyword.sendKeys(PropertiesReading.getProperty("ObjectRepo", "Phone"),"7798304852");
		   keyword.sendKeys(PropertiesReading.getProperty("ObjectRepo", "Email"),"Tejal@gmail.com");
		   keyword.sendKeys(PropertiesReading.getProperty("ObjectRepo", "Address"),"waraje");
		   keyword.sendKeys(PropertiesReading.getProperty("ObjectRepo", "City"),"Pune");
		   keyword.sendKeys(PropertiesReading.getProperty("ObjectRepo", "State"),"Maharashtra");
		   keyword.sendKeys(PropertiesReading.getProperty("ObjectRepo", "PIN"),"411058");
		   keyword.sendKeys(PropertiesReading.getProperty("ObjectRepo", "Country"),"India");
		   keyword.sendKeys(PropertiesReading.getProperty("ObjectRepo", "UserName"),"Tejal@gmail.com");
		   keyword.sendKeys(PropertiesReading.getProperty("ObjectRepo", "Password"),"tejal123");
		   keyword.sendKeys(PropertiesReading.getProperty("ObjectRepo", "CPassword"),"tejal123");
		   keyword.getScreenShot();
		   keyword.click(PropertiesReading.getProperty("ObjectRepo", "Submit"));
		   keyword.waiting(2000);
	   }
	   @Test(priority=4)
	   public  void SignIn()throws IOException, InterruptedException {
		 keyword.click(PropertiesReading.getProperty("ObjectRepo", "Click_On"));
		 keyword.waiting(3000);
	   }
	   @Test(priority=5)
	   public  void LogIn()throws IOException, InterruptedException {
		   keyword.sendKeys(PropertiesReading.getProperty("ObjectRepo", "UName"),"Tejal@gmail.com");
		   keyword.sendKeys(PropertiesReading.getProperty("ObjectRepo", "PWD"),"tejal123");
		   keyword.getScreenShot();
		   keyword.click(PropertiesReading.getProperty("ObjectRepo", "Submit1"));
		   keyword.getScreenShot();
	       keyword.waiting(2000);
		  
		   
		   

}
}
