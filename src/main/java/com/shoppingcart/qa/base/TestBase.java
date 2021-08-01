package com.shoppingcart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	    
	public static   WebDriver driver;
	public static   Properties prop;

	 
		
		public TestBase()
		{
			
			try {
				prop = new Properties();
				FileInputStream fis = new FileInputStream("/Users/abhishekchaudhary/eclipse-workspace/ShoppingCart/src/main/java/com/shoppingcart/qa/config/config.properties");
				prop.load(fis);
				
			
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}	
			
		}
	
		
	    public static void  initialise() throws IOException
	    {
	    	
	    	
	    	  String browsername =  prop.getProperty("browser");
	    	   
	       if (browsername.equals("Chrome"))
	   	{
	   			
	    		   System.setProperty("webdriver.chrome.driver", "/Users/abhishekchaudhary/Downloads/chromedriver 2");
	   		   driver= new ChromeDriver();
	   			
	   	}
	    	   
	   	   else if (browsername.equals("Firefox"))
	   		{
	    		   System.setProperty("webdriver.gecko.driver", "/Users/abhishekchaudhary/Downloads/geckodriver");
	   			   driver= new FirefoxDriver();
	   			   
	   			
	   		}
	    	  
	    	   driver.manage().window().maximize();
	    	   driver.manage().deleteAllCookies();
	    	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    	   driver.get(prop.getProperty("url"));
	    	   
	    	   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	    		
	   
	    	    
	    }
}
