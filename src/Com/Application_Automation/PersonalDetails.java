package Com.Application_Automation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Com.GenericMethods.GenericMethods;
import cucumber.api.DataTable;

public class PersonalDetails extends GenericMethods{

	
		@FindBy(how=How.XPATH,using="//input[@id='id_gender1']")	
		public static WebElement Mr;
		
		@FindBy(how=How.XPATH,using="//input[@name='customer_firstname']")
		public static WebElement First_name;
		
		@FindBy(how=How.XPATH,using="//input[@name='customer_lastname']")
		public static WebElement last_name;
		
		@FindBy(how=How.XPATH,using="//input[@name='passwd']")
		public static WebElement Password;
		
		@FindBy(how=How.XPATH,using="//select[@id='days']/option[@value='9']")
		public static WebElement date_select;
		
		@FindBy(how=How.XPATH,using="//select[@id='months']/option[@value='9']")
		public static WebElement month_select;
		
		@FindBy(how=How.XPATH,using="//select[@id='years']/option[@value='1989']")
		public static WebElement year_select;
		
		@FindBy(how=How.XPATH,using="//input[@id='newsletter']")
		public static WebElement Checkbox_select;
		
		
		@FindBy(how=How.XPATH,using="//input[@id='optin']")
		public static WebElement Checkbox_select1;
		
		@FindBy(how=How.XPATH,using="//input[@id='firstname']")
		public static WebElement youradress_fname;
		
		@FindBy(how=How.XPATH,using="//input[@id='lastname']")
		public static WebElement youradress_lastname;
		
		@FindBy(how=How.XPATH,using="//input[@id='company']")
		public static WebElement youradress_company;
		
		
		@FindBy(how=How.XPATH,using="//input[@id='address1']")
		public static WebElement youradress_address1;
		
		
		@FindBy(how=How.XPATH,using="//input[@id='address2']")
		public static WebElement youradress_address2;
		
		@FindBy(how=How.XPATH,using="//input[@id='city']")
		public static WebElement youradress_city;
		
		@FindBy(how=How.XPATH,using="//select[@id='id_state']/option[4]")
		public static WebElement youradress_state;
		
		@FindBy(how=How.XPATH,using="//input[@id='postcode']")
		public static WebElement youradress_postcode;
		
		@FindBy(how=How.XPATH,using="//select[@id='id_country']/option[2]")
		public static WebElement youradress_country;
				
		@FindBy(how=How.XPATH,using="//textarea[@class='form-control']")
		public static WebElement youradress_additionalinfo;
		
		@FindBy(how=How.XPATH,using="//input[@id='phone']")
		public static WebElement youradress_home;
		
		@FindBy(how=How.XPATH,using="//input[@id='phone_mobile']")
		public static WebElement youradress_mobilehome;
		
		
		@FindBy(how=How.XPATH,using="//input[@id='alias']")
		public static WebElement youradress_alias;
		
		

		@FindBy(how=How.XPATH,using="//button[@id='submitAccount']/span")
		public static WebElement Registerbtn;
		
		@FindBy(how=How.XPATH,using="//div[@id='center_column']/h1")
		public static WebElement MyAccount;
		
		
		
	////div[@id='center_column']/h1	
	//================================================================================================	
		 public static boolean TitleMrClicked()
	     {
	    	 
	     	 boolean status= GenericMethods.clickButton(Mr);
	    	System.out.println("Radiobuton is clicked");
	    	  
	    	  return status;
	     }
	//======================================================
	     public static boolean firstname(DataTable data)
	     {
	 		List<List<String>> first= data.raw();        
	 		boolean status=GenericMethods.clickAndSendData(First_name,first.get(0).get(0));
			System.out.println("firstname is printed");
	 		return status;	
	     }  
	     
	 //=============================================================    
	     public static boolean lastname(DataTable data)
	     {
	 		List<List<String>> last= data.raw();        
	 		boolean status=GenericMethods.clickAndSendData(last_name,last.get(0).get(1));
			System.out.println("lastname is printed");
	 		return status;	
	     }
	 		
	//==============================================================		
	 		
	     public static boolean password(DataTable data)
	     {
	 		List<List<String>> pwd= data.raw();        
	 		boolean status=GenericMethods.clickAndSendData(Password,pwd.get(0).get(2));
			System.out.println("password is printed");
	 		return status;	
	     }	
	//=====================================================================================
	     public static boolean datedisplay()
	     {
	 		       boolean status=  clickElement(date_select); 
	 				boolean status1=  clickElement(month_select); 
	 				boolean status2=  clickElement(year_select); 
	     System.out.println("date is entered");
	 return status;
	     
	     }

	//=============================================================================

	     public static boolean checkboxes()
	     {
	 		       boolean status=  clickElement(Checkbox_select); 
	 				System.out.println("checkbox news selected");
	 		       boolean status1=  clickElement(Checkbox_select1); 
	 			  System.out.println("Checkbox spl is selected");
	 return status;
	     }
	     
 //================================================================================   

	     public static void RegisterClicked() 	  
	     {
	    	 boolean status=  clickElement(Registerbtn); 
				System.out.println("Regbutn is clicked");
		      driver.close();
	    	 
	     }
	     
//======================================================================	     
	    public static void AcctpageDisplay()
	    {
	    	 boolean status=  click(MyAccount); 
				System.out.println("MyAccount page is displayed");
		    //  driver.close();	
	    	
	    }
	     
	     
	     
	     
	 //   MyAccount    
	     /*	public static boolean Addressdetails()
	{
		List<List<String>> pwd= data.raw();
		boolean status = 
		
	
	
	
	
	
	} */

	
	
}
