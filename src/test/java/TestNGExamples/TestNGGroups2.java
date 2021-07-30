package TestNGExamples;

import org.testng.annotations.Test;

public class TestNGGroups2 {


	@Test
	public void Demo()
	{
		System.out.println("CarLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void WebLoginCarLoan()
	{
		System.out.println("WebLoginCarLoan-Selenium");
	}
	
	@Test(groups= {"Smoke"})
	public void WebLogoutCarLoan()
	{
		System.out.println("WebLogoutCarLoan-Selenium");
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
