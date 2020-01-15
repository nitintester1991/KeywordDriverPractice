package com.Keyword;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyword {
	public static WebDriver driver;
	WebElement element;
	JavascriptExecutor js;
	
	//Browser Launch 
	public void initializeDriver(String browserName) {
	 if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\perennial\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\perennial\\WebDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\perennial\\WebDrivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
		}
    }
	
	//open URL 
    public void openURL(String url) {
		driver.get(url);
	}
    
    //maximize window
    public void maximize() {
		driver.manage().window().maximize();
    }

	//find Element 
     public WebElement getElement(String object) {
		String locatorType = object.split(":")[0];
		String locatorValue = object.split(":")[1];
		switch (locatorType){
		case "xpath":
			element = driver.findElement(By.xpath(locatorValue));
			break;
		case "name":
			element = driver.findElement(By.name(locatorValue));
			break;
		case "cssSelector":
			element = driver.findElement(By.cssSelector(locatorValue));
			break;
		case "id":
			element = driver.findElement(By.id(locatorValue));
			break;
		case "linkText":
			element = driver.findElement(By.linkText(locatorValue));
			break;
		case "tagName":
			element = driver.findElement(By.tagName(locatorValue));
			break;
		case "className":
			element = driver.findElement(By.className(locatorValue));
			break;
		}
		return element;
	}
     
    // Click on WebElement 
    public void click(String object) {
    	getElement(object).click();
 	}
    
    //Entering Values in Input Boxes 
    public void sendKeys(String object, String value) {
    	getElement(object).sendKeys(value);
	}
    
    //load/navigate a new web page
    public void navigatePage(String url) {
		driver.navigate().to(url);
	}
    
    //navigate on back
    public void navigateBack(String url) {
		driver.navigate().back();
	}
    
    //navigate forward
    public void navigateForward(String url) {
		driver.navigate().forward();
	}
    
   //refresh the current page
    public void refreshPage(String url) {
		driver.navigate().refresh();
	}
    
    //Switch to new tab 
   public void switchTab() {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		driver.close();
		driver.switchTo().window(tabs2.get(1));
	}
   
   //Take screenshot 
	public void getScreenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(System.getProperty("user.dir")+"\\Screenshot\\screenshot_" + timeStamp() + ".png");
		FileUtils.copyFile(src, des);
	}
	
	//Take current system Time 
    public String timeStamp() {
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("dd_MM_yyyy-hh_mm_ss");
		String time = sd.format(d);
		return time;
	}
    
    //Get title of web page
    public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
    
    //Action class -hover on Web Element 
    public void moveAction(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
    
    //Action class -dragAndDrop Web Element 
    public void dragAndDrop(String object, String value) {
		Actions acn = new Actions(driver);
		//WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));			
       // WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));	
		//acn.dragAndDrop(From, To).build().perform();
	}
    
    //print msg of Successful
    public void printStatus(String status) {
		System.out.println(status + "  Sucessful");
	}

	//Get Domain name by JS
    public String getDomainJS() {
		js = (JavascriptExecutor) driver;
		return js.executeScript("return document.domain").toString();
    }

	//Get URL by JS
    public String getURLJS() {
		js = (JavascriptExecutor) driver;
		return js.executeScript("return document.URL").toString();
	}
	
    //Get Title by JS
     public String getTitleJS() {
		js = (JavascriptExecutor) driver;
        return js.executeScript("return document.title").toString();
	}

	//Get Title by JS
    public void scrollPage(int Xaxis, int Yaxis) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+Xaxis+","+ Yaxis+")");
	}

	// Navigate page by JS
     public void navigateJS(String url) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.location='url'");
	}

	//Open new Tab by JS
     public void openNewTab(String url) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.open('url')");

	}
     
     //Scroll Web page 
    public void scrollToWebElement(String object) {
        WebElement element = getElement(object);
 		JavascriptExecutor js = (JavascriptExecutor) driver;
 		js.executeScript("arguments[0].scrollIntoView()", element);
 	}

  //Close Browser 
  	public void closeBrowser() {
  		driver.close();
  	}

  	//Sleep the current thread
      public void waiting(int time) throws InterruptedException {
  		Thread.sleep(time);
  		// driver.wait(time);
  	}








    


	

}
