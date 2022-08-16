package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImportInventory {
	public WebDriver driver; 
	
	public ImportInventory(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By importInventory = By.xpath("//button[text()='Import product inventory']");
	By exportsample = By.xpath("//input[@name='export-sample-file']");
	By uploadInventoryexcel = By.xpath("//*[@id='inventory-upload-file-form']/label/span");	
	
	
	public WebElement Importinventory() {
		return driver.findElement(importInventory);
	}
	
	public WebElement exportSample() 
	{
		return driver.findElement(exportsample);
	}
	public WebElement uploadExcelforinventory() 
	{
		return driver.findElement(uploadInventoryexcel);
	}

}
