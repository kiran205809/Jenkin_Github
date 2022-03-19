package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {
	
	WebDriver driver = BaseClass.driver;
	ExtentTest test = BaseClass.test;
	
	
	
	
	
	
	//===============================WebElement========================
	@FindBy(className="login")
	WebElement Loginlick;
	
	
	
	@FindBy(name= "user_login")
	WebElement Username;
	
	@FindBy(name="user_pwd")
	WebElement Password;
	
	
	@FindBy(name="btn_login")
	WebElement Login;
	
	
	@FindBy(className="rememberMe")
	WebElement Button;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//======================== Functions============================
	
	public void Loginfunction(String UserNameVal, String PasswordVal) {
		 
	        
	        Loginlick.click();
	        test.log(LogStatus.PASS, "Click login button", "login link clicked successfully");
	     
	        //Button.click();
	        //test.log(LogStatus.PASS, "Click login", "logeed in successfully");
	        
	        Username.sendKeys(UserNameVal);
	        test.log(LogStatus.PASS, "Enter username", "Entered username successfully");
	        Password.sendKeys(PasswordVal);
	        test.log(LogStatus.PASS, "Enter password", "Entered passowrd successfully");
	        Login.click();
	        test.log(LogStatus.PASS, "Clicked login button", "logged in successfully");

}
	
	public void UIchect() {
	

  
        Assert.assertTrue(Username.isDisplayed());
        
       
		
		
	}
}