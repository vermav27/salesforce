package selectors;

import org.openqa.selenium.By;

public interface opportunityPage {
	
	By newBtn = By.xpath("//div[@title='New']");
	By opportunityName = By.xpath("//input[@name='Name']");
	By amount = By.xpath("//input[@name='Amount']");
	By date = By.xpath("//input[@name='CloseDate']");
	By stage = By.xpath("//label[text()='Stage']//following-sibling::div//button//span");
	By selectStage = By.xpath("//label[text()='Stage']//following-sibling::div//button//parent::div//following-sibling::div//span[text()='Prospecting']");
	By orderNumber = By.xpath("//input[@name='OrderNumber__c']");
	By trackingNumber = By.xpath("//input[@name='TrackingNumber__c']");
	By deliveryInstallation = By.xpath("//button[@aria-label='Delivery/Installation Status, --None--']");
	By selectDeliveryInstallation = By.xpath("//span[@title='In progress']");
	By saveBtn = By.xpath("//button[@name='SaveEdit']");
	
	

}
