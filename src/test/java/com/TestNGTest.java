package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGTest {

	public WebDriver driver;
	@Test
	public void lauchBrowser(){
	System.setProperty("webdriver.chrome.driver", "./driver//chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://news.google.co.in/");
	driver.get("https://www.ndtv.com/");
	System.out.println("Page Title: "+driver.getTitle());
		System.out.println("Digital Assurance  || Testing Done :: Thannk You");
	//driver.close();
	}
}
