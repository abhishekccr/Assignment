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
	WebElement AddtoCartFirstProductBtn;
	
	@FindBy(xpath="//span[@title='Continue shopping']//span[1]")
	WebElement continueShoppingBtn;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")
	WebElement addtocartSecondProductBtn;
	
	@FindBy(css="a[title='Proceed to checkout'] span")
	WebElement proceedToCheckOutBtn;
	
	@FindBy(css="a[class='button btn btn-default standard-checkout button-medium'] span")
	WebElement proceedFromSummaryBtn;
	
	@FindBy(css="button[name='processAddress'] span")
	WebElement proceedFromAddressBtn;
	
	@FindBy(xpath="//input[@id='cgv']")
	WebElement shippingCheckbox;
	
	@FindBy(css="button[name='processCarrier'] span")
	WebElement proceedFromshippingBtn;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	WebElement payBank;
	
	@FindBy(css="button[class='button btn btn-default button-medium'] span")
	WebElement confirmOrderBtn;
	
	
	public ItemsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void AddProductsToCart() throws InterruptedException
	{
	   // Adding the first item to the cart
		//TestUtil util = new TestUtil();
		 
	
		
		TestUtil.executeScrollmethod();
		
		TestUtil.mouseHoverImage(firstProduct);
		TestUtil.explicitWaitMethod(AddtoCartFirstProductBtn);
	   
		
		TestUtil.mouseHoverImage(AddtoCartFirstProductBtn);
		TestUtil.clickImageElement(AddtoCartFirstProductBtn);
		
		
		TestUtil.explicitWaitMethod(continueShoppingBtn);
		TestUtil.clickImageElement(continueShoppingBtn);
		
		//Adding the second item to the cart
		
		TestUtil.mouseHoverImage(secondProduct);
		TestUtil.explicitWaitMethod(addtocartSecondProductBtn);
	   
		
		TestUtil.mouseHoverImage(addtocartSecondProductBtn);
		TestUtil.clickImageElement(addtocartSecondProductBtn);
		
		
		
		
		TestUtil.explicitWaitMethod(proceedToCheckOutBtn);
		TestUtil.clickImageElement(proceedToCheckOutBtn);
		
	}
	
	
	public  void placeOrder() throws InterruptedException
	{
		proceedFromSummaryBtn.click();
		proceedFromAddressBtn.click();
		
		 shippingCheckbox.click();
		 proceedFromshippingBtn.click();
		 payBank.click();
		 confirmOrderBtn.click();
		
	}
	
	public String validateConfirmOrderMessage()
	{
		
		return driver.getTitle();
	}
	
	
	

}
