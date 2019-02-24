package org.freelance.assertions;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {
	
	public static boolean CheckTitle(ChromeDriver driver, String exp_title)
	{
		boolean result = false;
		if(driver.getTitle().trim().equalsIgnoreCase(exp_title))
		{
		result = true;
		}
		return result;
	}

	
	public static boolean CheckURL(ChromeDriver driver, String exp_url)
	{
		boolean result = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(exp_url))
		{
		result = true;
		}
		return result;
	}
	
}
