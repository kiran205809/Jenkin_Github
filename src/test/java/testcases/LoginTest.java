package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass{
	

	@Test
	public void loginfailure() {
		
		//test = report.startTest("Login test failure");
		
		
		LoginPage login = new LoginPage();

		login.Loginfunction("creatorshashikiran@gmail.com", "Reset123");
		        
		     
		        
		        
		        WebElement ErrMsg = driver.findElement(By.id("msg_box"));
		        String ActualMsg =ErrMsg.getText();
		        String ExpectedMSg = "The email or password you have entered is invalid.";
		        
		        Assert.assertEquals(ActualMsg,ExpectedMSg);
		        
		      //  report.endTest(test);
					
					
					
					
				
		
		
	}

	@Test
	public void loginsuccess() {
		
		//test = report.startTest("Login test success");
		
		LoginPage login = new LoginPage();

		login.Loginfunction("creatorshashikiran@gmail.com", "Reset@123");
		        
		      
	//report.endTest(test);
}
	@Test
	@Parameters({"Param1","Param2"})
	public void parameterized(String UserNameVal, String PasswordVal) {

		//test = report.startTest("Login test");
		LoginPage login = new LoginPage();

		login.Loginfunction(UserNameVal,PasswordVal);
		
		//report.endTest(test);
	}
	
	@Test
	public void externaldatatest() {
		
		String UserNameVal = sheet.getRow(1).getCell(0).getStringCellValue();
		String PasswordVal =sheet.getRow(1).getCell(1).getStringCellValue();

			//test = report.startTest("Login test");
			LoginPage login = new LoginPage();

			login.Loginfunction(UserNameVal, PasswordVal);
			
			//report.endTest(test);
		
	}
	
		
	}

