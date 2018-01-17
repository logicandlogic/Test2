package com.pk.demo.Quickstart;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Unit test for simple App.
 */
public class AppTest2 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    @Test
	public void AppTest212()
    {
    	Reporter report = new Reporter();
    	report.log("Starting the test...");
    	
    	SoftAssert s_assert = new SoftAssert();
    	System.out.println("App2");
    	
    	report.log("Before Driver installation...");
    	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    	 WebDriver driver; 
    	 driver = new ChromeDriver();
    	 driver.navigate().to("https://www.gmail.com");
 		String getTitle = driver.getTitle();
 		
 		report.log("Title is..."+getTitle);
 		
 		if(getTitle.equals("Gmail")) {
 			
 			report.log("True : Before Driver installation...");
 			s_assert.assertTrue(true);
 		} else {
 			report.log("Fail : Before Driver installation...");
 			s_assert.assertTrue(false);
 		}
 		s_assert.assertAll();
 		//Assert.assertEquals(getTitle, "");
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
