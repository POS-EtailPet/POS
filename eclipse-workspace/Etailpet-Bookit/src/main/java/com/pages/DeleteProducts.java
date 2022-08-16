package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteProducts {
public WebDriver driver;


	public DeleteProducts(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By clickOnBatchAction = By.xpath("//button[@class='btn btn-filter dropdown-toggle']");
	By BatchActionDropdown = By.xpath("//*[@id='product_search_dash']/div[3]/div[3]/div/div");
	
	
	
	public WebElement ClickOnBatchAction() 
	{
		return driver.findElement(clickOnBatchAction);
	}
	
	public WebElement BatchActionDropDown() 
	{
		return driver.findElement(BatchActionDropdown);
	}
}
