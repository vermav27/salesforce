package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selectors.opportunityDetailsPage;
import selectors.opportunityPage;

public class opportunity extends baseTest implements opportunityPage,opportunityDetailsPage {
	
	public static String createOpportunity(String name) throws InterruptedException, IOException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(newBtn).click();
		driver.findElement(opportunityName).sendKeys(name);
		
		driver.findElement(date).sendKeys("17/01/2025");
		
		WebElement stg = driver.findElement(stage);
		js.executeScript("arguments[0].scrollIntoView()",stg);
		stg.click();
		driver.findElement(selectStage).click();
		
		double orderNum = Math.random();
		WebElement odr = driver.findElement(orderNumber);
		js.executeScript("arguments[0].scrollIntoView()",odr);
		odr.sendKeys(Double.toString(orderNum));
		
		double trackingNum = Math.random();
		WebElement trk = driver.findElement(trackingNumber);
		js.executeScript("arguments[0].scrollIntoView()",trk);
		trk.sendKeys(Double.toString(trackingNum));
		
		WebElement dlvry = driver.findElement(deliveryInstallation);
		js.executeScript("arguments[0].scrollIntoView()",dlvry);
		dlvry.click();
		driver.findElement(selectDeliveryInstallation).click();
		
		driver.findElement(saveBtn).click();
		
		WebElement toastMsg = driver.findElement(toastMessage);
		wait.until(ExpectedConditions.visibilityOf(toastMsg));
		String currentUrlOfOpportunity = driver.getCurrentUrl();
		
		String[] arr = currentUrlOfOpportunity.split("/");
		String opportunityId = arr[6];
		
		return opportunityId;
		
	}
	
}
