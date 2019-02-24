package org.freelance.pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class HomePage {
	
	ChromeDriver driver;
	public HomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void exploreLinkEnabled()
	{
		driver.findElementByXPath("//a[@aria-label='Explore']").isEnabled();		
	}	
	
	public void hoverExplore()
	{
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElementByXPath("//a[@aria-label='Explore']")).perform();
	}
	
	public void destinationLinkEnabled()
	{
		driver.findElementByXPath("//a[@aria-label='Destinations']").isEnabled();
	}
	
	public void clickDestination()
	{
		driver.findElementByXPath("//a[@aria-label='Destinations']").click();
	}
	
	
	
}
