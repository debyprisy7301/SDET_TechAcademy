package TestScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SwagLogout_01 extends SwagLoginCart_01{
	WebDriver driver;
	@Test(priority=2)
	public void logout() throws InterruptedException, IOException {
		

	    logout.clickmorebutton();
	    Thread.sleep(2000);
	    logout.clicklogoutbutton2();
	    System.out.println("Logout Successful");

}
}