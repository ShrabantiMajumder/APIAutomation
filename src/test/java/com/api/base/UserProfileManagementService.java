package com.api.base;

import java.util.HashMap;

import com.api.models.request.ResetPasswordRequest;
import com.api.models.request.SignUpRequest;
import com.api.models.request.profileRequest;

import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService{
	
	
	private String BASE_PATH="/api/users";
	
	

	
	//Auth service is having method called Login.

	
	
	

	
	public Response getProfile(String token) {
	    setAuthToken(token);
	    return getRequest(BASE_PATH + "/profile");
	}

	public Response updateProfile(String token, profileRequest Payload) {
	    setAuthToken(token);
	    return putRequest(Payload,BASE_PATH + "/profile");
	}

}
