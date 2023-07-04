package TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDataProviderAnnotation1 {
	
	@Parameters({"URL","APIKey"})
	@Test
	public void Login(String urlname, String apikey)
	{
		System.out.println("CarLoan");
		System.out.println("urlname"+urlname);
		System.out.println("apikey"+apikey);
	}
	
}
