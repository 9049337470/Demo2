package com.qa.pagelayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase
{
	 public HomePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 @FindBy(xpath="//input[@id='search_query_top']")
	private WebElement search_box;
	 
	 public void enterTextonsearchBox()
	 {
		 search_box.sendKeys("Dresses");
	 }
	 public void clickonsearch()
	 {
		 search_box.sendKeys(Keys.ENTER); 
	 }
	 
	

}
