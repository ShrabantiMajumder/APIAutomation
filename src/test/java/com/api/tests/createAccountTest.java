package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class createAccountTest {

	
	@Test(description = "Verify if login API is working...")
	public void createAccountTest() {
		SignUpRequest signUpRequest = new SignUpRequest.Builder()
			    .userName("disha123baby")
			    .email("shrabantius@gmail.com")
			    .firstName("Disha")
			    .password("disha1235")
			    .lastName("Bhatt")
			    .mobileNumber("9831601509")
			    .build();

		
		System.out.print(signUpRequest.getEmail());

	    AuthService authService = new AuthService();
	
	    
	
	    Response response = authService.signUp(signUpRequest);
	    System.out.println(response.asPrettyString());
// Assert.assertEquals(response.asPrettyString(),"User registered successfully!");
	}

}
