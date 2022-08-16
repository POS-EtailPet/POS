package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToStore {
	public WebDriver driver;
	
	public SwitchToStore(WebDriver driver) 
	{
		this.driver=driver;
	}

	
	By Switchtostore = By.id("id_store");
	By Submit = By.xpath("//input[@value='Search']");
	
	
	
	public WebElement switchToStore() 
	{
		return driver.findElement(Switchtostore);
		
	}
	
	public WebElement submit()
	{
		return driver.findElement(Submit);
	}
	
	
}
