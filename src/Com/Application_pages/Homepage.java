package Com.Application_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Com.GenericMethods.GenericMethods;

public class Homepage extends GenericMethods {

	//************************* WebElements****************************************
	
	
	@FindBy(how=How.CSS,using="span[id='lnkRegistration']")
	
	public static WebElement Lnk_Register;
	
	//************************* WebElements****************************************	
	
	//****************************Methods for Home page****************************
   
	/*  Method name      : clickRegisterLink()
     *  Purpose          : To click on Register link
     *  Input Parameter  : Element CSS selector
     *  Return Type      : Boolean
     *  Dependency       :Open the webpage and click on Registerlink
     *  Date of Creation : 23-11-2018
     *  Creation By      : Santhi Sree.k
     *  Reviewed By      :
     *  Modified By      :
     */
	
// Creating a mehtod to click on Register link
	public static boolean clickRegisterLink(){
	
		boolean status=true;
	    try{  //kept in try and Catch to handle if any exceptions while excception.
	    	Lnk_Register.click();
	       } catch(Exception e)
		
	      {
	      status=false;
	      System.out.println(e.getMessage());
	      }
	
	     return false;
	
	
}
	
}

