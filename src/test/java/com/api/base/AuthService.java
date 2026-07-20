package com.api.base;

import java.util.HashMap;

import com.api.models.request.LoginRequest;
import com.api.models.request.ResetPasswordRequest;
import com.api.models.request.SignUpRequest;
import com.api.models.response.LoginResponse;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AuthService extends BaseService{
	
	/*Auth service is going to have a relationship with base service
	 * 
	 */
	
	
	private String BASE_PATH="/api/auth/";
	
	

	
	//Auth service is having method called Login.

	
	
	public Response login(Object payload) {
		
		//just a method name PostRequest
		//actual work will happen Base service by postRequest method. 
	
	return postRequest(payload,BASE_PATH+"login");
	}
	
	
	public Response signUp(SignUpRequest payload) {
	    return postRequest(payload, BASE_PATH + "signup");
	}

	public Response resetpassword(ResetPasswordRequest payload) {
	    return postRequest(payload, BASE_PATH + "reset-password");
	}
	public Response forgotPassword(String emailAddress) {
	    HashMap<String, String> payload = new HashMap<String, String>();
	    payload.put("email", emailAddress);
	    return postRequest(payload, BASE_PATH + "forgot-password");
	}



}
