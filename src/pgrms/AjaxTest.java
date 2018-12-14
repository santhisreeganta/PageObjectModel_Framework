package pgrms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AjaxTest {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://in.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("Hello");
		
		List<WebElement> ele = driver.findElements(By.xpath("//input[@id='uh-search-box']//following-sibling::div/div/div/ul/li"));
		int count =ele.size();
		
		System.out.println(count);
	/*	System.out.println("Total no.of elements :" +ele.size());
		int i;
		for( i=1;i<ele.size();i++){
			
			WebElement element =driver.findElement(By.xpath("//input[@id='uh-search-box']//following-sibling::div/div/div/ul/li["+i+"]"));
			String tot =element.getText();
		  System.out.println(tot);  */
		
		
		for(WebElement rc : ele)
		{
			System.out.println(rc.getText());
		    String mt = rc.getText();
		    if(mt.startsWith("hel"))
		
		    {
		    	
		    	System.out.println("All the statments which starts with : " +mt);
		    	
		    	
		    }
		
		}
		
			
			
		}
		     
		
		
		
		
		
	}


