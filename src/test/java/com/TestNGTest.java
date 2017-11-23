package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

public class TestNGTest {

	public WebDriver driver;
	@Test
  	public void testAdd() {
      		String str= "Junit is working fine";
      		assertEquals("Junit is working fine",str);
		System.out.println("Junit   || Junit Testing Done :: Thannk You");
   	}
	
	@Test
	public void lauchBrowser(){
	System.setProperty("webdriver.chrome.driver", "./driver//chromedriver.exe");
	driver=new ChromeDriver();
	// driver.manage().window().maximize(); -- issue with this line - chrome driver 2.29
	//driver.get("https://news.google.co.in/");
	driver.get("https://www.ndtv.com/");
	System.out.println("Page Title: "+driver.getTitle());
	System.out.println("Digital Assurance  || Testing Done :: Thannk You");
	assertEquals("DONE","DONE");
	//driver.close();
	}
}
