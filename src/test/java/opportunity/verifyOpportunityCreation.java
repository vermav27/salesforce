package opportunity;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import base.baseTest;
import base.home;
import base.opportunity;
import base.opportunityDetail;

public class verifyOpportunityCreation extends baseTest{
	
	@Test
	public static void testVerifyOpportunityCreation() throws IOException, InterruptedException {
		
		baseTest.implicitTimeOut(10);
		baseTest.login("username_qa","password_qa");
		String generatedString = RandomStringUtils.randomAlphanumeric(5); //creatingRandomString
		String actualOpportunityName = "testOpportunity_" + generatedString;
		home.goToOpportunityTab();
		String createdOpportunityId = opportunity.createOpportunity(actualOpportunityName);
		System.out.println(createdOpportunityId);
		opportunityDetail.OpenOpportunityAndVerifyCreation(createdOpportunityId,actualOpportunityName);
		
	}

}
