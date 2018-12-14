package Com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Application_pages.Homepage;
import Com.Application_pages.Recriuter;
import Com.GenericMethods.GenericMethods;

public class TC_01_ValidateRegisterlink extends GenericMethods {
  
	@Test  // @Test annotation used to test the test scripts.
	public static void validate_Registerlink(){
	 
	boolean status =true;
	 String url ="https://www.talentzing.com/";
	 status=LaunchBrowser("ff", url);
	 

    if(status)   // Open the webpage and click on Registerlink
{   
	Homepage  homepage = PageFactory.initElements(driver, Homepage.class);
	homepage.clickRegisterLink();
	
	if(status){
	
	Recriuter obj = PageFactory.initElements(driver, Recriuter.class);// click on Employerlink to open the Employer page.
	obj.clickEmployerlink();
	

	
	
	}
}
}
}