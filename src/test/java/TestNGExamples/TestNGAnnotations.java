package TestNGExamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations extends BaseTest {
	
	@BeforeTest
	public void ploan() {
		System.out.println("----BeforeTest----");
	}
	
	@Test
	public void WebLoginCarLoan()
	{
		System.out.println("WebLoginCarLoan-Selenium");
	}
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCarLoan-Appium");
	}
	
	@AfterTest
	public void ploan1() {
		System.out.println("----AfterTest----");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("LoginAPIHomeLoan-Rest API automation");
	}
}
