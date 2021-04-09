package RestAPI;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://p13n-qa.adobe.io/data/api/v1/monitoring/checkpoint";
		String authToken = "Bearer eyJ4NXUiOiJpbXMta2V5LTEuY2VyIiwiYWxnIjoiUlMyNTYifQ.eyJpZCI6IjE2MTc3MzcxODg4NDFfZDAwYjU0MjUtYTJjNC00MThhLWEzYmYtNmU0YjUxMzdmMzk1X3VlMSIsImNsaWVudF9pZCI6IkZsb29kZ2F0ZVVJQ29uc29sZVRlc3QxIiwidXNlcl9pZCI6IjNCQzE0RkI4NUNFM0NFNkYwQTQ5MTYyMEBBZG9iZUlEIiwidHlwZSI6ImFjY2Vzc190b2tlbiIsImFzIjoiaW1zLW5hMS1xYTIiLCJmZyI6IlZLVUU1NlI0NFNIVTRRVENFT0lLRUxZQVBFPT09PT09Iiwic2lkIjoiMTYxNjc0NjU3MTM2MF8xY2UxNzc3MC0xZGU5LTQwZGMtYTQ0NS1hZTI4NDJjYWZmMDlfdWUxIiwibW9pIjoiYThjZDY5ODYiLCJleHBpcmVzX2luIjoiODY0MDAwMDAiLCJzY29wZSI6IkFkb2JlSUQsb3BlbmlkIiwiY3JlYXRlZF9hdCI6IjE2MTc3MzcxODg4NDEifQ.BxJDdeAK8trV6TdmXm9qYIvBo1l4XJmJDhrsCdtas6l1lVSBKIk4jYWFqmuggvi1eTtkq3sZDnCXJe_WqY1A-nZedY_41A_QVyoW06d_wK-3rltIlEH42I5JwTKPR47ukXyOoIdmPKWspGDAjEzGWAATwfEZedeVnD57MtVt6ho5Fqb3FxuZ7Tk60fb7r7wAs4wg5sbWQwAyNPtezz76SLvxELaca9Sxe88SCV8Dj3ei0LMmoiivyD_2PCMx6FZkmQL7zMHtj0XZOHfWKBOUNTJV6nBT8AJTQPTih21WSbMrPb_vFQ6bh0An3v82lK4fHmL4zXSVfPQUsExiK6vk4Q";
		Header h1 = new Header("Authorization", authToken);
		Header h2 = new Header("X-api-key", "4d84247c36bd4f63977853eb1e0cb5b7");
		Header h3 = new Header("Accept", "application/json, text/javascript, */*; q=0.01");
		Header h4 = new Header("Content-Type", "application/json");
		List<Header> headerslist = new ArrayList<Header>();
		headerslist.add(h1);
		headerslist.add(h2);
		headerslist.add(h3);
		headerslist.add(h4);
		Headers header = new Headers(headerslist);
		RequestSpecification request = RestAssured.given();
		request.headers(header);	
		Response response = request.relaxedHTTPSValidation().get();
		//if body is present then write
		//Response response = request.relaxedHTTPSValidation().body(emails).post();
		Integer statusCode = response.getStatusCode();
		String responseBody = response.asString();
		System.out.println("statusCode"+statusCode);
		System.out.println("responseBody"+responseBody);
		
	}

}
