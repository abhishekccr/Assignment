package com.shoppingcart.qa.pages;


import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.shoppingcart.qa.base.TestBase;
import com.shoppingcart.qa.util.TestUtil;

public class ItemsPage extends TestBase {
	
	public Actions action;
	JavascriptExecutor js;
	public TestUtil util;

	
	
	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")   
	WebElement firstProduct;
	
	@FindBy(xpath="//img[@title='Blouse']")
	WebElement secondProduct;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement AddtoCartFirstProduct;
	
	@FindBy(xpath="//span[@title='Continue shopping']//span[1]")
	WebElement continueshopping;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")
	WebElement addtocartSecondProduct;
	
	@FindBy(css="a[title='Proceed to checkout'] span")
	WebElement proceedToCheckOut;
	
	@FindBy(css="a[class='button btn btn-default standard-checkout button-medium'] span")
	WebElement proceedFromSummary;
	
	@FindBy(css="button[name='processAddress'] span")
	WebElement proceedFromAddress;
	
	@FindBy(xpath="//input[@id='cgv']")
	WebElement shippingcheckbox;
	
	@FindBy(css="button[name='processCarrier'] span")
	WebElement proceedFromshipping;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	WebElement payBank;
	
	@FindBy(css="button[class='button btn btn-default button-medium'] span")
	WebElement confirmOrder;
	
	
	public ItemsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void AddProductsToCart() throws InterruptedException
	{
	   // Adding the first item to the cart
		 util = new TestUtil();
		
		TestUtil.executeScrollmethod();
		
		TestUtil.mouseHoverImage(firstProduct);
		TestUtil.explicitWaitMethod(AddtoCartFirstProduct);
	   
		
		TestUtil.mouseHoverImage(AddtoCartFirstProduct);
		TestUtil.clickImageElement(AddtoCartFirstProduct);
		
		
		TestUtil.explicitWaitMethod(continueshopping);
		TestUtil.clickImageElement(continueshopping);
		
		//Adding the second item to the cart
		
		TestUtil.mouseHoverImage(secondProduct);
		TestUtil.explicitWaitMethod(addtocartSecondProduct);
	   
		
		TestUtil.mouseHoverImage(addtocartSecondProduct);
		TestUtil.clickImageElement(addtocartSecondProduct);
		
		
		
		
		TestUtil.explicitWaitMethod(proceedToCheckOut);
		TestUtil.clickImageElement(proceedToCheckOut);
		
	}
	
	
	public  void placeOrder() throws InterruptedException
	{
		proceedFromSummary.click();
		proceedFromAddress.click();
		
		Thread.sleep(2000);
		 shippingcheckbox.click();
		 proceedFromshipping.click();
		 payBank.click();
		 confirmOrder.click();
		
	}
	
	
	

}
