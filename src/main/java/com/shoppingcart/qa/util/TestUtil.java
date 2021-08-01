package com.shoppingcart.qa.util;



import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shoppingcart.qa.base.TestBase;

public class TestUtil extends TestBase{
	
    public  JavascriptExecutor  js;
    public static Actions action;
	
   public static void executeScrollmethod()
   {
	   JavascriptExecutor  js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,720)");
	    
   }
   

  
   public static void mouseHoverImage(WebElement element)
   {
	    action = new Actions(driver);
	   action.moveToElement(element).perform();
   }
   
   public static void explicitWaitMethod(WebElement element)
   {
	   WebDriverWait wait = new WebDriverWait(driver , 13);
	   wait.until(ExpectedConditions.elementToBeClickable(element));
   }
   
   public static void clickImageElement(WebElement element)
   {
	   action.moveToElement(element).click().perform();
   }
   

}
