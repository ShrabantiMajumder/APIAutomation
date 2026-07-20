package com.api.base;

import com.api.filters.LoggingFilter;
import com.api.models.request.LoginRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	
	
	private static final String baseURI = "http://64.227.160.186:8080";
//	private static final String baseURI = "http://64.227.160.186:8080";
	 
	 
	//https://swift.techwithjatin.com/login
private RequestSpecification requestSpecificiation;


static {
    RestAssured.filters(new LoggingFilter());
}




public BaseService() {
	 
	requestSpecificiation = RestAssured.given().baseUri(baseURI) ;
	
	/*
	 * We can not create object of RequestSpecification as it is a interface.
	 *
	 * */
	
}


protected Response postRequest (Object Payload, String endpoint) {
	
	//System.out.println("hello");
	return requestSpecificiation.header("Content-Type", "application/json").body(Payload).post(endpoint);
	
}
	

protected Response getRequest (String endpoint) {
	
	//System.out.println("hello");
	return requestSpecificiation.get(endpoint);
	
}

protected void setAuthToken(String token) {
	requestSpecificiation.header("Authorization", "Bearer " + token);
}

protected Response putRequest (Object Payload, String endpoint) {
	
	//System.out.println("hello");
	return requestSpecificiation.header("Content-Type", "application/json").body(Payload).put(endpoint);
	
}
	


}
