package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class SwitchToPOS  {
	public WebDriver driver;
	
	public SwitchToPOS (WebDriver driver)
	{
		this.driver= driver;
	}
	
	By selectPOS = By.id("dashboard-toggle");
	By selectManageOrder = By.xpath("//*[@id=\"sidebar-nav\"]/div/div[1]/ul/li[7]/a");
	By selectmyproducts = By.xpath("//a[@class='active no-pin-popup' or text()='My Products']");
	
	public WebElement switchtoPOS() 
	{
		return driver.findElement(selectPOS);
	}

	public WebElement selectManagerOrder()
	{
		return driver.findElement(selectManageOrder);
	}

	public WebElement selectmyproduct()
	{
		return driver.findElement(selectmyproducts);
	}
	
	
	

	

	
	

}
