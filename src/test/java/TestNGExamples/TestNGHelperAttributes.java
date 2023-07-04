package TestNGExamples;

import org.testng.annotations.Test;

public class TestNGHelperAttributes {
	
	@Test(enabled=false)
	public void Demo()
	{
		System.out.println("CarLoan");
	}
	
	@Test
	public void WebLoginCarLoan()
	{
		System.out.println("WebLoginCarLoan");
	}
	
	@Test
	public void VerifyUSer()
	{
		System.out.println("VerifyUSer");
	}
	
	@Test
	public void GetUSer()
	{
		System.out.println("GetUSer");
	}
	
	@Test(dependsOnMethods= {"WebLoginCarLoan","VerifyUSer"})
	public void WebLogoutCarLoan()
	{
		System.out.println("WebLogoutCarLoan");
	}
	
}
