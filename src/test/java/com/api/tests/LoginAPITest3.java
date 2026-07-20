package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class LoginAPITest3 {
	
	
	public String Token;

	@Test(description = "Verify if Login API is working...")
	public void loginTest() {

	
		
		LoginRequest loginRequest = new LoginRequest("shrabanti","disha12345");
	    AuthService authService = new AuthService();
	    Response response = authService.login(loginRequest);
	    
	    
	    
	    
	   // authService.forgotpassowrd()
	   // System.out.println(response.asPrettyString());
	
LoginResponse loginResponse = response.as(LoginResponse.class);//This will translate JSON to Response Object.This is going to give me LoginResponse object
	
	
	System.out.println(response.asPrettyString());
	Token = loginResponse.getToken();
	
	System.out.print(loginResponse.getEmail());
	System.out.print(loginResponse.getId());
	

	
	
	Assert.assertTrue(loginResponse.getToken() != null);
	Assert.assertEquals(loginResponse.getEmail(),"majumdershrabanti900@gmail.com");
	Assert.assertEquals(loginResponse.getId(),5493);


	}
	
	
}
