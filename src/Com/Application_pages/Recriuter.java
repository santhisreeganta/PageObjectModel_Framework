package Com.Application_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Com.GenericMethods.GenericMethods;

public class Recriuter extends GenericMethods {
    
	//************************* WebElements****************************************
	
	
    @FindBy(how=How.CSS,using="span[id='lblEmployerReg']")	
	
	public static WebElement lnk_lblEmployerReg;
    
    //************************* WebElements****************************************	
	
  	//****************************Methods for Recruiter****************************
     
  	  /*  Method name      : clickEmployerlink()
       *  Purpose          : To click on Employer link
       *  Input Parameter  : Element CSS selector
       *  Return Type      : Boolean
       *  Dependency       : click on Employerlink to open the Employer page.
       *  Date of Creation : 23-11-2018
       *  Created By       : Santhi Sree .k 
       *  Reviewed By      :
       *  Modified By      :
    */
   
    
    // creating a method to click on Employerlink
    public static boolean clickEmployerlink()
    {            
	boolean status =true;
	try{           //kept in try and Catch to handle if any exceptions while excception
	     lnk_lblEmployerReg.click();
	} catch(Exception e){
		
	 status = false;
	 System.out.println(e.getMessage());
	}
	
	return false;
    }
	
    }
