package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImportsProducts {
	public WebDriver driver;

	public ImportsProducts(WebDriver driver) 
	{
		this.driver= driver;
	}

	By clickImport = By.xpath("//button[text()='IMPORT / UPDATE PRODUCTS']");
	By downloadexcel =By.xpath("//a[text()='Get Sample Excel']");
	By uploadexcel =By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[3]/div/div/div[2]/div[2]/div[1]/ul/li[1]/form/label/span"); 

	public WebElement ClickImport() 
	{
		return driver.findElement(clickImport);
	}


	public WebElement downloadExcel() 
	{

		return driver.findElement(downloadexcel);

	}

	public WebElement UploadExcel()
	{
		return driver.findElement(uploadexcel);
	}
}
