package Com.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.GenericMethods.GenericMethods;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class TC_01_ValidateWomenPage extends GenericMethods {
	
	    public static boolean status;
		
	    @Given("Firefox browser is launched and url is loaded")
		
        public static void LaunchBrowser(DataTable data)
        {
			
		List<List<String>> url=data.raw();
		status=GenericMethods.LaunchBrowser("ff",url.get(0).get(0));
        }
	
//====================================================================================		
		
		
 @When("the Women menu and the submenu of it is clicked and opened")
	
	 public static void NavigatetoWomenMenuItem()
	 { 
		     boolean status= true;
	         driver.findElement(By.linkText("Women")).click();
	         if(status){
	         System.out.println("Women menu is clicked");}
	         else 
	         System.out.println("Women menu is not clicked");
	            status= GenericMethods.checkBoxesPosition();     
	 } 
	         
             public static void NavigateTosubMenuDresesItem(){ 	
	         boolean status = true;
	         driver.findElement(By.xpath("//div[@class='block_content']/ul/li[2]")).isDisplayed();
	         if(status){
	        	 System.out.println("Dreses submenuitem is Displayed");}
	        	   else 
	        	  System.out.println("Dreses submenuitem is not isDisplayed");
	         
	        	 
		    
		}   
	 
 

//=====================================================================================================	
	@Then("Verify no.of active links present in the Dresses page of application")	
	
	
	public static void ActiveLinksPresent()
	{
	
	status= GenericMethods.linksPresentInThepage();  
    
    
    status= GenericMethods.linkWithColorFontsize(); 
	
		    
	
		
	
	
	
  
	
	   
}	
	
}

	
	
		
