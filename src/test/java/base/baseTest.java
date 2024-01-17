package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import selectors.basePage;

public class baseTest implements basePage{
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	
	@BeforeTest
	public static void setUp() throws IOException {
		if(driver==null) {
			String path = System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\config.properties";
			FileInputStream file = new FileInputStream(path);
			prop.load(file);
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("baseUrl"));
	
		}
	}
	
	@AfterTest
	public static void closeBrowser() {
		driver.close();
		System.out.println("Closed Browser");
	}
	
    public static void login(String userName,String passWord) throws IOException {
		
		String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\config.properties";
		FileInputStream file = new FileInputStream(filepath);
		prop.load(file);
		
		driver.manage().window().maximize();
		driver.findElement(username).sendKeys(prop.getProperty(userName));
		driver.findElement(password).sendKeys(prop.getProperty(passWord));
		driver.findElement(loginBtn).click();
		
	}
	
	public static void implicitTimeOut(int time) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
	}
}
