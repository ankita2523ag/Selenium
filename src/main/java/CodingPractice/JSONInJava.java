package CodingPractice;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONInJava {
		public static void main(String[] args) throws ParseException {
			// TODO Auto-generated method stub
			//JSONArray array=new JSONArray();
			//Create JSON OBJECT
			JSONObject filterDetailsJson=new JSONObject();
			filterDetailsJson.put("type" , "My Campaigns");
			filterDetailsJson.put("Campaigns name" , "contains:test");
			filterDetailsJson.put("Campaigns ID" , "is:");
			filterDetailsJson.put("Duration" , "Any");
			filterDetailsJson.put("Status" , "Any");
			System.out.println(filterDetailsJson);    
			String type = filterDetailsJson.get("type").toString();
			String Campaignsname = filterDetailsJson.get("Campaigns name").toString();
			String Campaignsid = filterDetailsJson.get("Campaigns ID").toString();
			String Duration = filterDetailsJson.get("Duration").toString();
			String Status = filterDetailsJson.get("Status").toString();
			System.out.println(type);
			System.out.println(Campaignsname);
			System.out.println(Campaignsid);
			System.out.println(Duration);
			System.out.println(Status);
			System.out.println("------------------");
			//Convert JSON String to JSON Object
			String filterDetailsString = filterDetailsJson.toJSONString();
			System.out.println(filterDetailsString);
			JSONParser parser = new JSONParser();  
			JSONObject filterDetailsStringToJson = (JSONObject) parser.parse(filterDetailsString);  
			System.out.println(filterDetailsStringToJson);
		}

}
