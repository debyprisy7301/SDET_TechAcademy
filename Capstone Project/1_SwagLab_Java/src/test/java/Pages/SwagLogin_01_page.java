package Pages;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SwagLogin_01_page {
	WebDriver driver;
	
	By Username = By.id("user-name");
	By Password= By.id("password");
	By button = By.id("login-button");
	
	
	
			
				public void enterUsername(String name) 
			{
				driver.findElement(Username).sendKeys(name);
			}
			public void enterPassword(String pass) 
			{
				driver.findElement(Password).sendKeys(pass);
			}
			public void clickbutton() 
			{
				driver.findElement(button).click();
			}
			
			public SwagLogin_01_page (WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}

	
	


}

