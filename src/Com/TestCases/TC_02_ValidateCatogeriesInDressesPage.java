package Com.TestCases;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Com.GenericMethods.GenericMethods;
import cucumber.api.java.en.Given;


public class TC_02_ValidateCatogeriesInDressesPage extends GenericMethods {

	
	@Given("Dresses page is dispalyed with all the options")
	public static void DressesMenuOptions(){
	
	// Verify options under dresses menu
	System.out.println("\n"+"Validating whether all the dresses options Casual Dresses, Evening Dresses, Summer Dresses available under catalog");
	// Create a string array for the options which we want to verify	
     String[] options ={"Casual Dresses","Evening Dresses","Summer Dresses"};
	
    int optionLenght=  options.length;
	
    
	//get menu options displayed on the application
    
	List<WebElement> app_elements = driver.findElements(By.xpath("//div[@id='categories_block_left']/div/ul/li"));
	
	int app_lenght = app_elements.size();
	
	//compare the options displayed on the application with the String array
	
	for(int i=0;1<optionLenght;i++){
	boolean check=false;
	for(WebElement VerfyEle : app_elements ){
		  String Completeitem =VerfyEle.getText().trim();
	      if(options[i].equalsIgnoreCase(Completeitem))
	      {
	    	System.out.println(options[i]+"option is present under Dresses menu");  
	        check=true;
	        break;
	      
	       }
	}
	
	if(check=false)
		System.out.println(options[i]+"option is missing under Dresses menu");
	
	
	}
	
	
	}

}
