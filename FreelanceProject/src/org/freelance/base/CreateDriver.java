package org.freelance.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CreateDriver {

  public ChromeDriver driver;
  
  @BeforeSuite
  public void startbrowser()
  {
	  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
	  driver = new ChromeDriver();
	  driver.get("https://www.carnival.com");
  }
  
  @AfterSuite
  public void closebrowser()
  {
	  driver.quit();
  }
	
}
