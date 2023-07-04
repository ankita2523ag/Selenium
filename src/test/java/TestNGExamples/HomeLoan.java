package TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {
	
	@Parameters({"URL"})
	@Test
	public void Login(String urlname)
	{
		System.out.println("HomeLoan");
		System.out.println("HomeLoan-urlname"+urlname);
	}
	
	@Test
	public void Demo()
	{
		System.out.println("HomeLoan");
	}
	
	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHomeLoan-Selenium");
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
