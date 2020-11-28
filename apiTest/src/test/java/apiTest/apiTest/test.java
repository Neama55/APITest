package apiTest.apiTest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyData;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class test {

	public static void main(String[] args) {
		
		
		   given().queryParam("title","qui est esse")
           .queryParam("id","2")
           .queryParam("userId","1")
           .when().get("https://jsonplaceholder.typicode.com/posts").then().log()
           .body().statusCode(200);
		/*	Map<String,String> car = new HashMap<>();
			car.put("userId", "1");
			car.put("title", "foo");
			String jsonString = ((ResponseBodyData) car).asString();
			given()
			.contentType("application/json")
			.body(jsonString)
			.when().post("https://jsonplaceholder.typicode.com/posts").then()
			.statusCode(200);
			*/
	
			
		// TODO Auto-generated method stub
/*		String userID = "9b5f49ab-eea9-45f4-9d66-bcf56a531b85";
        String userName = "TOOLSQA-Test";
        String password = "Test@@123";
        String baseUrl = "https://jsonplaceholder.typicode.com/posts";
 
        RestAssured.baseURI = baseUrl;
        RequestSpecification request = RestAssured.given();
 
        //Step - 1
        //Test will start from generating Token for Authorization
        request.header("Content-Type", "application/json");
        Response response = request.get("https://jsonplaceholder.typicode.com/posts");
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println(response.getStatusCode());
        String jsonString = response.asString();
        List<Map<String, String>> IDs = JsonPath.from(jsonString).get("userId");
        System.out.println("IDs"+IDs.size());
        Assert.assertTrue(IDs.size() > 0);
 
        for(int i=0;i<IDs.size();i++) {
        	System.out.println(IDs.get(i));
        }*/
 /*
 
        //Step - 3
        // Add a book - with Auth
        //The token we had saved in the variable before from response in Step 1, 
        //we will be passing in the headers for each of the succeeding request
        request.header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json");
 
        response = request.body("{ \"userId\": \"" + userID + "\", " +
                "\"collectionOfIsbns\": [ { \"isbn\": \"" + bookId + "\" } ]}")
                .post("/BookStore/v1/Books");
 
        Assert.assertEquals( 201, response.getStatusCode());
 
 
        //Step - 4
        // Delete a book - with Auth
        request.header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json");
 
        response = request.body("{ \"isbn\": \"" + bookId + "\", \"userId\": \"" + userID + "\"}")
                .delete("/BookStore/v1/Book");
 
        Assert.assertEquals(204, response.getStatusCode());
 
        //Step - 5
        // Get User
        request.header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json");
 
        response = request.get("/Account/v1/User/" + userID);
        Assert.assertEquals(200, response.getStatusCode());
 
        jsonString = response.asString();
        List<Map<String, String>> booksOfUser = JsonPath.from(jsonString).get("books");
        Assert.assertEquals(0, booksOfUser.size());*/
    }
	}


