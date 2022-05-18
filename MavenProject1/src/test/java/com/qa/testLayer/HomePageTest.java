package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pagelayer.HomePage;
import com.qa.testBase.TestBase;

public class HomePageTest extends TestBase{
  @Test
  public void verifyTheFunctionalityOfSearch_Box() 
  {
	  HomePage hp=new HomePage(driver);
	  hp.enterTextonsearchBox();
	  hp.clickonsearch(); 
  }
}
