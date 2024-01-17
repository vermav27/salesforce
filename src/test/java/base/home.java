package base;

import org.testng.Assert;

import selectors.homePage;

public class home extends baseTest implements homePage{
	
	public static void goToOpportunityTab() {
		
		driver.navigate().to("https://selfcare4-dev-ed.develop.lightning.force.com/lightning/o/Opportunity/list?filterName=Recent");
		
	}
	
	public static void verifyAppLabel(String actualAppLabel) {
		
		String getAppLabel = driver.findElement(appLabel).getText();
		Assert.assertEquals(actualAppLabel, getAppLabel);
		
		
	}

}
