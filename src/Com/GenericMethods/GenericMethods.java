package Com.GenericMethods;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
 public static WebDriver driver;
private static boolean status;

 
 //	Creating a method for Launching Browser
 
  public static boolean LaunchBrowser(String browser, String url){	
	boolean status = true;
	System.out.println("Launching Browser ");
	try  // kept in try and Catch to handle if any exceptions while excception.
	{
	 switch(browser.toLowerCase().trim())
        {
    	  case "firefox":
    	  driver= new FirefoxDriver();
    	  System.out.println("Launching Browser through Firefox ");
    	  break;
    	  
    	  case "chrome":
    	  System.getProperty("webdriver.chrome.driver", "C:\\Users\\tm\\Desktop\\chromedriver.exe");
    	  driver= new ChromeDriver();
    	  System.out.println("Launching Browser through chrome ");
    	  break;}
          }catch(Exception e){
    	  status=false;
    	  System.out.println(e.getMessage());
    	
         }
          if(status)// To check Whether Browser is launched or not
         {
    	  driver.get(url);
    	  driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
          }

          System.out.println("Launching the  browser is completed");
      
          return status;
    }
 //********************************************************************************** 
 
  // Creating a method for Mousehover and Clicking on element
	public static boolean hoverAndClick(WebElement element){
	boolean status= true;
	try{    //kept in try and Catch to handle if any exceptions while exception.
	    new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
	    new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(element));
	     Actions act=new Actions(driver);
	     act.moveToElement(element).click(element).build().perform();
	     if(status){
	    	  System.out.println("hover action performed");}
	     else
	    	 System.out.println("hover action performed");
	   }catch(Exception e){	
		
		System.out.println(e.getMessage());
	    return false;
	   }	 
	
	    return status;
	
}
	
//************************************************************************************
//  Creating a method for ClickAndSend the input Element
	
public static boolean clickAndSendData(WebElement element,String data){
	
boolean status =true;
try{            //kept in try and Catch to handle if any exceptions while exception.
	//new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
	element.click();
	element.clear();
	element.sendKeys(data);
	
	}catch(Exception e){
	System.out.println(e.getMessage());
	return false;
	}
	
	return status;
}
	
//************************************************************************************	
	public static boolean linksPresentInThepage()
	{
	
	   boolean status = false;
	   try
	    {   
	    List<WebElement> link= driver.findElements(By.tagName("a"));
		
		System.out.println("no.of links : " +link.size());
		
		for(int i=0;i<link.size();i++){
			 WebElement ele = link.get(i);
			 String url = ele.getAttribute("href");
			 verifylinkactive(url);
		   }
	    } catch(Exception e){
	    	return false;
	    }
	   return status;
	}	    
	public static boolean verifylinkactive(String linkurl){
		 try 
	        {
	           URL url = new URL(linkurl);
	           
	           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	           
	           httpURLConnect.setConnectTimeout(3000);
	           
	           httpURLConnect.connect();
	           
	           if(httpURLConnect.getResponseCode()==200)
	           {
	               System.out.println(linkurl+" - "+httpURLConnect.getResponseMessage());
	            }
	          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
	           {
	               System.out.println(linkurl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
	            }
	        } catch (Exception e) {
	           
	        }
		return false;
	    } 
		
	
	
//**************************************************************************************************		    	
		
public static boolean linkWithColorFontsize()
{  boolean status = true;
 try
 {   
  List<WebElement> link= driver.findElements(By.tagName("a"));
  int n = link.size();
  System.out.println(n);
	
	for(int i=0;i<n;i++){
		System.out.println(" All links  :"  +link.get(i));
	    String ft = link.get(i).getCssValue("color");
	    String st = link.get(i).getText();
		String ts = link.get(i).getCssValue("font-size");
		
		boolean bval =link.get(i).isDisplayed();
	    if(bval=true)
	    
	    System.out.println(st);
	    System.out.println(ft);
	    System.out.println(ts);
	}
     } catch (Exception e){
		   status = false;
		   System.out.println(e.getMessage());
		  }
		  return status;
}  


//==========================================================================================================




public static boolean imagesPresentInWomens(){	
	
	boolean status=true;

    List<WebElement> img = driver.findElements(By.tagName("img")); // to find no.of images in the page
    int s = img.size();
    for(int i=0;i<s;i++){
    	System.out.println(" All images  :"  +img.get(i).getAttribute("class"));
   
        }
	return status;	
}


//========================================================================================================

public static boolean checkBoxesPosition(){	
	
	boolean status=true;
    try{
    	List<WebElement> chekb = driver.findElements(By.xpath("//input[@type='checkbox']")); // to find no.of checkboxes
        int s = chekb.size();
        System.out.println(s);
        for(int i=0;i<s;i++){
        System.out.println(chekb.get(i).getLocation());
        System.out.println(chekb.get(i).isEnabled());
        chekb.get(i).click();
       // System.out.println("no.of Checkboxes are clicked :" +i);
        
        if(status){
        	System.out.println("no.of Checkboxes are clicked :" +i);
        	System.out.println("checkbox present at respective x and y positions"); 
    		
        }
         
         else
    		System.out.println("not present and and not enabled");
    	 }
         }catch(Exception e){
    		return false;
    		
    	 } 
    	  return status;

} 


//=============================================================================

public static boolean isExist(WebElement element)
{
	try
	{
	boolean status = true;
	element.isDisplayed();
status=true;
	
	}
	catch(Exception e)
	{
	boolean status =false;
	}
	return status;
   

}
//================================================================================

public static boolean click(WebElement element)
{
	try
	{
	boolean status = true;
	element.isDisplayed();
status=true;
	
	}
	catch(Exception e)
	{
	boolean status =false;
	}
	return status;
   

}
//===============================================================================
public static boolean clickButton(WebElement element)
{
	try
	{
	boolean status = true;
	element.click();
status=true;
	
	}
	catch(Exception e)
	{
	boolean status =false;
	}
	return status;
}

public static boolean clickElement(WebElement element)
{
	try
	{
	boolean status = true;
	element.click();
status=true;
	
	}
	catch(Exception e)
	{
	boolean status =false;
	}
	return status;

}
// Generic Method to use a string through regular expression

public static String getRegexData(String Source,String pattern)
{
 //  Step 1:
	
	String data = " ";
	//Step 2
	Pattern patern = Pattern.compile(pattern);
	Matcher match = patern.matcher(Source);
	
	
	if(match.find())
	{
	  System.out.println("pattern Exist");
	  data =match.group();
	
	}
	else
		System.out.println("Patterrn not found");
	
		{
		return data;
		}
}

}
	
	





























/*public static boolean clickAndSendData(WebElement element ) {
	boolean status =true;
	try{            //kept in try and Catch to handle if any exceptions while exception.
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element ));
		element.click();
		element.clear();
		element.sendKeys(data);
		
		}catch(Exception e){
		System.out.println(e.getMessage());
		return false;
		}
		
		return status;
	}  */








































    
	
	
	
	

	
   
















