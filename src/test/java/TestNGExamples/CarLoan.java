package TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan {
	
	@Parameters({"URL"})
	@Test
	public void Login(String urlname)
	{
		System.out.println("CarLoan");
		System.out.println("CarLoan-urlname"+urlname);
	}
	
	@Test
	public void Demo()
	{
		System.out.println("CarLoan");
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
	
	@Test
	public void LoginAPICarLoan()
	{
		System.out.println("LoginAPICarLoan-Rest API automation");
	}
	
	@Test
	public void MobileLogoutCarLoan()
	{
		System.out.println("MobileLoginCarLoan-Appium");
	}
	
}
