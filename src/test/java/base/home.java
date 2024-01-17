package base;

import selectors.homePage;

public class home extends baseTest implements homePage{
	
	public static void goToOpportunityTab() {
		
		driver.navigate().to("https://selfcare4-dev-ed.develop.lightning.force.com/lightning/o/Opportunity/list?filterName=Recent");
		
	}

}
