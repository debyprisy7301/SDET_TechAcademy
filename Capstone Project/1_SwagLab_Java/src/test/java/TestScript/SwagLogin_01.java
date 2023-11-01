package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;



public class SwagLogin_01 extends TestBase{
	
	@Test(priority=0,dataProvider = "getData")
	public void login(String username,String password,String firstname,String lastname,String zipcode) throws IOException, InterruptedException {
		
	    login.enterUsername(username);
	    login.enterPassword(password);
	    Thread.sleep(2000);
	    login.clickbutton();
	    Thread.sleep(2000);
	    
	    
	    String title = driver.getCurrentUrl();
	    
	    if(title.contains("saucedemo")) {
	    	Assert.assertTrue(title.contains("saucedemo"));
	    	System.out.println("Logout Successful");
	    	captureScreenshot(driver,"login");
	    }
	    else 
	    {
	    	captureScreenshot(driver,"SwagLoginError");
	    	System.out.println("Not successfully login");
	    	Assert.assertTrue(title.contains("saucedemo"));
	    	
	    }
	    
		}
		
	}
	
	
	


