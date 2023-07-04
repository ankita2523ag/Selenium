package TestNGExamples;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDataProviderAnnotation2 {
	
	
	@Test(dataProvider = "getData")
	public void getUser(String username, String password)
	{
		System.out.println("getUser");
		System.out.println("username"+username);
		System.out.println("password"+password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st Data: username,password - good credit history 
		//2nd Data: username,password - no credit history 
		//3rd Data: username,password - fraudulent credit history 
		
		//rows define no of data sets
		Object[][] data = new Object[3][2];
		data[0][0] = "ankita";
		data[0][1] = "ankita93";
		data[1][0] = "anku";
		data[1][1] = "anku90";
		data[2][0] = "niraj";
		data[2][1] = "niraj90";
		return data;
		/*
		Map<String,String> data_arr = new HashMap(3);
		Map<String,String> data1 = new HashMap();
		data1.put("ankita", "ankita93");
		data_arr.put("data1", data1);
		Map<String,String> data2 = new HashMap();
		data1.put("anku", "anku92");
		data_arr.put("data2", data2);
		*/
		
	}
	
}
