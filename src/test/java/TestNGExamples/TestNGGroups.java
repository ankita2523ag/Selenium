package TestNGExamples;

import org.testng.annotations.Test;

public class TestNGGroups {


	@Test
	public void Demo()
	{
		System.out.println("HomeLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHomeLoan-Selenium");
	}
	@Test(groups= {"Smoke"})
	public void WebLogoutHomeLoan()
	{
		System.out.println("WebLogoutHomeLoan-Selenium");
	}
	
	@Test
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHomeLoan-Appium");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("LoginAPIHomeLoan-Rest API automation");
	}
}
