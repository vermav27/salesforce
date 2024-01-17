package home;

import java.io.IOException;

import org.testng.annotations.Test;

import base.baseTest;
import base.home;

public class verifyDefaultApp extends baseTest{
	
	@Test
	public static void verifyDefaultApp() throws IOException {
		
		String app = "Sales";
		baseTest.implicitTimeOut(10);
		baseTest.login("username_qa", "password_qa");
		home.verifyAppLabel(app);
	}

}
