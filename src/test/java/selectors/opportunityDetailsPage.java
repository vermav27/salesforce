package selectors;

import org.openqa.selenium.By;

public interface opportunityDetailsPage {
	
	By toastMessage = By.xpath("//span[text()='Opportunity']/a");
	By oppName = By.xpath("//span[text()='Opportunity Name']//parent::div//following-sibling::div/span//lightning-formatted-text");
	By detailTab = By.xpath("//div[@class='slds-grid slds-wrap slds-col slds-size_1-of-1 row row-main']/div[1]//li[@title='Details']/a");

}
