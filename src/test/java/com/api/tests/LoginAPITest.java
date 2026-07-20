package com.api.tests;

import javax.management.Descriptor;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest {

	@Test(description= "Verify if Login API is working....")
	public void loginTest() {
	  // baseURI="http://64.227.160.186:8080";// 
		
		
		RequestSpecification x=given().baseUri("http://64.227.160.186:8080").
		header("Content-Type", "application/json");
		RequestSpecification z=x.body("{\"username\": \"shrabanti\",\"password\": \"disha12345\"}");
		Response response=z.post("/api/auth/login");
		
		
		System.out.println(response.asPrettyString());

		  String pathValue = response.jsonPath().getString("path");
		    System.out.println("Path in response: " + pathValue);
		Assert.assertEquals(response.getStatusCode(),200);
		
		
		/*
		RestAssured.baseURI="http://64.227.160.186:8080";
		RequestSpecification x=RestAssured.given();
		RequestSpecification y=x.header("Content-Type", "application/json");
		RequestSpecification z=y.body("{\"username\": \"shrabanti\",\"password\": \"SHRABANTIswift9#\"}");
		Response response=z.post("/api/auth/login");
		System.out.println(response.asPrettyString());

		
		Assert.assertEquals(response.getStatusCode(),200);
		*/
	}
}
