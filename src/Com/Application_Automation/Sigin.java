package Com.Application_Automation;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Com.GenericMethods.GenericMethods;
import cucumber.api.DataTable;

public class Sigin extends GenericMethods {

	//************************* WebElements****************************************
	
	
	@FindBy(how=How.XPATH,using="//a[@class='login']")	
	public static WebElement login;
	
	@FindBy(how=How.XPATH,using="h3[class='page-subheading']")
	
	public static WebElement Creataccount;
	
	
	@FindBy(how=How.XPATH,using="//input[@name='email_create']")
	public static WebElement enterEmail;

	@FindBy(how=How.XPATH,using="//div[@class='submit']/button[@id='SubmitCreate']")
			public static WebElement Account;
	
  /*@FindBy(how=How.XPATH,using="//input[@id='id_gender1']")	
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
	public static WebElement Checkbox_select1; */
	
	
	
//======================================================================================

	  // creating a method to click on login
    public static boolean Click_On_SignIn()
    {            
	   boolean status= hoverAndClick(login);
	return status;
	        
	}
//================================================================================	

// to validate whether CreatAccount page is displayed   
public static boolean creataccountpDispalay()
{
 
	boolean status=isExist(Creataccount);
System.out.println("Create Ccount page Displayed");
return status;
}
//================================================================================

//creating a method to click on login
	  public static boolean Send_Email_Adress(DataTable data)
	  {    List<List<String>> email= data.raw();
	  String emailid =email.get(0).get(0);
	  String[] arr = emailid.split("@");
	  Date d = new Date();
	  SimpleDateFormat sdf = new SimpleDateFormat("hhmmss");
	  System.out.println(arr[0]+sdf.format(d)+"@"+arr[1]);
	  emailid=arr[0]+sdf.format(d)+"@"+arr[1];
	  
	  
	  
	boolean status=GenericMethods.clickAndSendData(enterEmail,emailid);
	System.out.println("email is printed");
		  
		  return status;	
}
//===============================================================	
     public static boolean Click_On_Create()
     {
    	 boolean status= GenericMethods.clickButton(Account);
    		System.out.println("Clicked on Acount button");
    	 return status;

     }
//===================================================================     
   /*  public static boolean clickRadio()
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
 		boolean status=GenericMethods.clickAndSendData(Password,last.get(0).get(0));
		System.out.println("lastname is printed");
 		return status;	
     }
 		
//==============================================================		
 		
     public static boolean password(DataTable data)
     {
 		List<List<String>> pwd= data.raw();        
 		boolean status=GenericMethods.clickAndSendData(Password,pwd.get(0).get(0));
		System.out.println("password is printed");
 		return status;	
     }	
//=====================================================================================
     public static boolean datedisplay(DataTable data)
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
     
     */
     
}
