package base;

import java.time.Duration;

import org.testng.Assert;

import selectors.opportunityDetailsPage;

public class opportunityDetail extends baseTest implements opportunityDetailsPage {
	
	public static void OpenOpportunityAndVerifyCreation(String id, String actualOpportunityName) throws InterruptedException {
		
		String fullPathUrlOfOpportunity = "https://selfcare4-dev-ed.develop.lightning.force.com/lightning/r/Opportunity/"+id+"/view";
		driver.navigate().to(fullPathUrlOfOpportunity);
		
		Thread.sleep(Duration.ofSeconds(10));
		driver.findElement(detailTab).click();
		
		String fetchedOpportunityName = driver.findElement(oppName).getText();
		Assert.assertEquals(actualOpportunityName, fetchedOpportunityName);
		
	}

}
