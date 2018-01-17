package com.pk.demo.Quickstart;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   
 @DataProvider(name = "minMaxDates" ,parallel =true)
	public Object[][] provideMinMaxDateRanges() {
	return new Object[][]{
	
	{"2013-01-04", "2014-01-04", "2014-08-04", "2015-07-04"},
	{"2013-05-04", "2013-04-04", "2014-04-04", "2014-07-04"}
 };
}

	@DataProvider(name = "provideDaysInterval")
	public Object[][] provideData() {
		
		return new Object[][]{{1,4}, {2,5}, {28,7}, {110,8}, {365,7}, {400,9}, {800,9}};
	}
     
    
     
    
   
    @Test( threadPoolSize =3)
	public void SuwtichToNewTab() throws InterruptedException, AWTException
    {
    
    	System.out.println("App2 fdg fdgfd");
    	Thread.sleep(5000);
    	//System.out.println("The period is ..."+x+ " "+Thread.currentThread().getId());
    
    	//System.out.println("The period is ..."+y+"  "+Thread.currentThread().getId());
    	
    
    	//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    	
    	
    	 ChromeDriverManager.getInstance().version("2.34").setup();
    	 
    	// EdgeDriverManager.getInstance().setup();
    	// WebDriver driver = new ChromeDriver();
    	 
    	 ChromeOptions o = new ChromeOptions();
    	 o.addArguments("disable-extensions");
    	 o.addArguments("--start-maximized");
    	WebDriver driver = new ChromeDriver(o);
    	 driver.manage().window().maximize();
    	 driver.navigate().to("https://google.com"); 
    	 Thread.sleep(3000);
    	 
    	Actions action = new Actions(driver);
    	WebElement ele = driver.findElement(By.linkText("Gmail"));
    	//action.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    	//action.sendKeys(Keys.ENTER).build().perform();
    	 Robot r = new Robot();
         r.keyPress(KeyEvent.VK_CONTROL);
         r.keyPress(KeyEvent.VK_T);
         r.keyRelease(KeyEvent.VK_CONTROL);
         r.keyRelease(KeyEvent.VK_T);
         Thread.sleep(1000);
    	
    	 Thread.sleep(3000);

    	 ArrayList<String> str = new ArrayList<String>(driver.getWindowHandles());
    	 driver.switchTo().window(str.get(1));
    	  //Open URL In 2nd tab.
    	   driver.get("http://www.qaautomated.com/p/contact.html");
    	   
    	   Thread.sleep(3000);
    	   
    	 //  driver.close();
    	   driver.switchTo().window(str.get(0));
    }

    //@Test(dataProvider ="minMaxDates")
   	public void AppTest1(String startDateFirst, String endDateFirst, String startDateLast, String endDateLast) throws InterruptedException
       {

    	System.out.println("App1");
    	//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    	 WebDriver driver; 
    	// driver = new ChromeDriver();
    	 //driver.navigate().to("https://www.facebook.com");
 		//String getTitle = driver.getTitle();
    	System.out.println("The startdateFirst is ..."+startDateFirst);
    	Thread.sleep(3000);
    	System.out.println("The EnddateFirst is ..."+endDateFirst);
    	Thread.sleep(3000);
    	System.out.println("The startdateLast is ..."+startDateLast);
    	Thread.sleep(3000);
    	System.out.println("The endDateLast is ..."+endDateLast);
    	Thread.sleep(3000);
    	
    	System.out.println("The end  is ...");
    	
       }
    /**
     * @return the suite of tests being tested
     */
   

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
