package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductListTables {
	
	public WebDriver driver;
	
	public ProductListTables(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	By UPC = By.xpath("//*[@id='prod_itm_3258']");
	By Pagination = By.xpath("//span[@class='show-count-prdct pull-right']");
	
	
	
	public WebElement UPC() 
	{
		return driver.findElement(UPC);
	}
	
   public WebElement pagination() 
   {
	   return driver.findElement(Pagination);
	   
   }
	
	//*[@id="prod_itm_1501"]/td[2]
	

	
	//*[@id="prod_itm_1501"]
	//*[@id="prod_itm_1966"]
	
	
	
	
}
