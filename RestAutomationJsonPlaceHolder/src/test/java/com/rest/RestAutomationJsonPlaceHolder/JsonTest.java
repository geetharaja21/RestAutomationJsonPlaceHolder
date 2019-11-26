package com.rest.RestAutomationJsonPlaceHolder;

import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;

public class JsonTest {

	
	@Test
	public void getUserid() {
		
		//Using Path Param
		given()
		.pathParam("userId", "7")
		//.queryParam("userId", 7)
		.when()
		.get("https://jsonplaceholder.typicode.com/posts/{userId}")
		.then()
		.statusCode(200)
		.extract().response().body().prettyPrint();
	}
}
