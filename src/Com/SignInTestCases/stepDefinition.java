package Com.SignInTestCases;

import java.util.List;


import org.openqa.selenium.support.PageFactory;

import Com.Application_Automation.PersonalDetails;
import Com.Application_Automation.Sigin;

import Com.GenericMethods.GenericMethods;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition extends GenericMethods  {

	private boolean status;

	@Given("^Launch the \"([^\"]*)\" browser and url is loaded$")
	public void launch_the_firefox_browser_and_is_loaded(String browser,DataTable data) 
	{ 
		
	  List<List<String>> url=data.raw();
	  String Url1 =url.get(0).get(0);
	  status=GenericMethods.LaunchBrowser(browser,Url1);
    }
//========================================================================================================
	@When("^the homepage is launched verify signin option and verify the create acount header$")
	public void the_homepage_is_launched_verify_signin_option_and_verify_the_create_acount_header()
	{

	boolean status;
     if(status=true){
    	 Sigin signin   = PageFactory.initElements(driver, Sigin.class);
    	 Sigin.Click_On_SignIn();

    	 Sigin.creataccountpDispalay();
     
     }
	}
//===================================================================================================     
    @Then("^enter the valid email adress in create acount page$")
    public  void enter_the_valid_email_adress_in_create_acount_page(DataTable data)

    {
    	boolean status;
      if(status=true){
    	  Sigin EmailAdres = PageFactory.initElements(driver, Sigin.class);
    	  Sigin.Send_Email_Adress(data);
      
      }
      }
//=================================================================================     
     @Then("^Click create button and navigate to register page$") 
     public void click_create_button()
 
     {
    	 
     boolean status;
     if(status=true){
   	  Sigin actopen = PageFactory.initElements(driver, Sigin.class);
   	  Sigin.Click_On_Create();
     }
     
     System.out.println("button is clicked");
	
   
    }
//====================================================================================      
      
   @Then("^Click on Gender radio button$")
	 public static boolean Gender_display()
	    {
		  boolean status;
         if(status=true){
        	 PersonalDetails mr = PageFactory.initElements(driver, PersonalDetails.class);
        	 PersonalDetails.TitleMrClicked(); 
         	System.out.println("Gender is clicked");
         }
		return status;
	    }  
//==================================================================
  @Then("^verify personal details of Firstname, Lastname,Email,Password,Date of Birth and Checkboxes")
	public static void Enterpersonal(DataTable data) 
	{
	  List<List<String>> regdetails=data.raw();
	  
	  boolean status;
	    if(status=true){
         PersonalDetails enterdetails = PageFactory.initElements(driver, PersonalDetails.class);
    	  PersonalDetails.firstname(data);
    	  PersonalDetails.lastname(data);
    	  PersonalDetails.password(data);
    	  PersonalDetails.datedisplay();
    	  PersonalDetails.checkboxes();
	    }
	}
    	  
    @Then("verify all your address details")	  
    	  
    public static void addressDetails(DataTable data) 
    {     List<List<String>> regdetails=data.raw();
   
    	PersonalDetails enterdetails = PageFactory.initElements(driver, PersonalDetails.class);
    	
    	//  GenericMethods.clickAndSendData(enterdetails.youradress_fname, regdetails.get(0).get(0));
    	//  GenericMethods.clickAndSendData(enterdetails.youradress_lastname, regdetails.get(0).get(1));
    	String company=regdetails.get(0).get(2);
    	  GenericMethods.clickAndSendData(enterdetails.youradress_company, company);
    	  String addrs1=regdetails.get(0).get(3);
    	  GenericMethods.clickAndSendData(enterdetails.youradress_address1, addrs1);
    	  String adres2=regdetails.get(0).get(4);
    	  GenericMethods.clickAndSendData(enterdetails.youradress_address2, adres2);
    	  String city=regdetails.get(0).get(5);
    	  GenericMethods.clickAndSendData(enterdetails.youradress_city, city);
    	  String state=regdetails.get(0).get(6);
    	  GenericMethods.clickAndSendData(enterdetails.youradress_state, state);
    	  String postalcode=regdetails.get(0).get(7);
    	  GenericMethods.clickAndSendData(enterdetails.youradress_postcode, postalcode);
    	  String country=regdetails.get(0).get(8);
    	  GenericMethods.clickAndSendData(enterdetails.youradress_country, country);
    	  String AddtnlInfo=regdetails.get(0).get(9);
    	  GenericMethods.clickAndSendData(enterdetails.youradress_additionalinfo, AddtnlInfo);
    	  String home=regdetails.get(0).get(10);
    	  GenericMethods.clickAndSendData(enterdetails.youradress_home, home);
    	  String mobilehome=regdetails.get(0).get(11);
    	  GenericMethods.clickAndSendData(enterdetails.youradress_mobilehome, mobilehome);
    	  String Alias=regdetails.get(0).get(12);
    	  GenericMethods.clickAndSendData(enterdetails.youradress_alias, Alias);
    	 // enterdetails.your
    	  System.out.println("fn is typed");
    }  
    	  
   @Then("Click on Register Button and Verify AccountDisplay")	  
   public static void ClickRegister() 	  
   {  
	  PersonalDetails rg = PageFactory.initElements(driver, PersonalDetails.class);
  	  PersonalDetails.RegisterClicked();  
  	PersonalDetails.AcctpageDisplay();
   
	
	   
   }
    	  
    	  
    	
    	  
    	
	      
	}	  
//======================================================================================	  
	
	    
	    
		 
	    
	     

	

//Then verify personal details of <Title> <Firstname> <Lastname 
	    
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
   
