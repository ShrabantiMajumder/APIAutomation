package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.ResetPasswordRequest;
import com.api.models.response.LoginResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;

public class ResetPasswordTest {

	
	
	@Test(description = "Verify if reset password is working correctly..")
	public void resetPasswordTest() {
		
		
		
		 ResetPasswordRequest resetpasswordobj = new ResetPasswordRequest("17ae4bc2-92f6-486f-a5f6-a344545c8cfc","disha12345","disha12345");
		 
		 
		 AuthService authService = new AuthService();
		 
		 
		 Response response =authService.resetpassword(resetpasswordobj);
		 
		 
		 System.out.println(response.asPrettyString());
		 
		 try {
			System.out.println(new ObjectMapper().writeValueAsString(resetpasswordobj));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
