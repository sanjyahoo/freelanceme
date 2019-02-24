package org.freelance.testcases;

import org.freelance.assertions.Validations;
import org.freelance.base.CreateDriver;
import org.freelance.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_001_Cruise_itinerary extends CreateDriver{
	HomePage homepage;
	
	@Test(priority=1)
	public void step_001()
	{
	Assert.assertTrue(Validations.CheckTitle(driver, "Cruises | Carnival Cruise Deals: Caribbean, Bahamas, Alaska, Mexico"), "[Incorrect Title]");
	homepage = new HomePage(driver);
	homepage.exploreLinkEnabled();
	}
	
	@Test(priority=2)
	public void step_002()
	{
		homepage.hoverExplore();
		homepage.destinationLinkEnabled();
		
	}
	@Test(priority=3)
	public void step_003()
	{
		homepage.clickDestination();
		Assert.assertTrue(Validations.CheckURL(driver, "https://www.carnival.com/cruise-to.aspx"), "[Incorrect URL]");
	}
	
	public void step_004()
	{
		
	}
	
	
	
}
