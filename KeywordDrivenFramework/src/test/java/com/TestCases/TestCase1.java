package com.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Keyword.Keyword;
import com.Utils.PropertiesReading;

public class TestCase1 {
	   Keyword keyword=new Keyword();
	   @Test(priority=1)
	   public  void test()throws IOException, InterruptedException {
		   keyword.initializeDriver("chrome");
		   keyword.openURL(PropertiesReading.getProperty("ObjectRepo", "URL"));
		   keyword.maximize();
		   
		   // first product selection
		   keyword.moveAction(keyword.getElement(PropertiesReading.getProperty("ObjectRepo", "Obj_BdayGift")));
		   keyword.waiting(2000);
		   keyword.click(PropertiesReading.getProperty("ObjectRepo", "Obj_PartySuplies"));
		   keyword.waiting(2000);
	       try {
				keyword.click(PropertiesReading.getProperty("ObjectRepo", "obj_FirstProduct"));
				keyword.switchTab();
				keyword.printStatus("Try by click");

			} catch (Exception e) {
				keyword.navigatePage(PropertiesReading.getProperty("ObjectRepo", "Obj_Prod1URL"));
				keyword.printStatus("Catch By navigate");

			} finally {
				keyword.printStatus("Product 1 selection");
			}
			keyword.waiting(3000);
			keyword.getScreenShot();
			keyword.click(PropertiesReading.getProperty("ObjectRepo", "Obj_Prod1AddQuantity"));
			keyword.waiting(3000);
			keyword.getScreenShot();
			keyword.click(PropertiesReading.getProperty("ObjectRepo", "Obj_Prod1Details"));
			keyword.waiting(3000);
			keyword.getScreenShot();
			keyword.click(PropertiesReading.getProperty("ObjectRepo", "Obj_Prod1AddToCart"));
			keyword.waiting(3000);
			keyword.getScreenShot();
			
	        // second product selection
			keyword.openURL(PropertiesReading.getProperty("ObjectRepo", "URL"));
			keyword.maximize();
            keyword.moveAction(keyword.getElement(PropertiesReading.getProperty("ObjectRepo", "Obj_BdayGift")));
		    keyword.waiting(2000);
			keyword.click(PropertiesReading.getProperty("ObjectRepo", "Obj_WallDecore"));
		    keyword.waiting(2000);
		    try {
				keyword.click(PropertiesReading.getProperty("ObjectRepo", "Obj_SecondProduct"));
				keyword.switchTab();
				keyword.printStatus("Try by click");

			} catch (Exception e) {
				keyword.navigatePage(PropertiesReading.getProperty("ObjectRepo", "Obj_Prod2URL"));
				keyword.printStatus("Catch By navigate");

			} finally {
				keyword.printStatus("Product 2 selection");
			}
			keyword.waiting(3000);
			keyword.getScreenShot();
			keyword.click(PropertiesReading.getProperty("ObjectRepo", "Obj_Prod2AddQuantity"));
			keyword.waiting(3000);
			keyword.getScreenShot();
			keyword.click(PropertiesReading.getProperty("ObjectRepo", "Obj_Prod2Details"));
			keyword.waiting(3000);
			keyword.getScreenShot();
			keyword.click(PropertiesReading.getProperty("ObjectRepo", "Obj_Prod2AddToCart"));
			keyword.waiting(3000);
			keyword.getScreenShot();


			



		   
		   
		   
		   

}
}