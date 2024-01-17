package selectors;

import org.openqa.selenium.By;

public interface basePage {
	
	By username = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By loginBtn = By.xpath("//input[@id='Login']");

}
