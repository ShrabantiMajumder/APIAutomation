package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.profileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.userProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {

	
	
	
	
	@Test
	public void getProfileInfoTest() {
	
	AuthService authService = new AuthService();
	Response response = authService.login(new LoginRequest("shrabanti", "disha12345"));
	LoginResponse loginResponse = response.as(LoginResponse.class);
	System.out.println(loginResponse.getToken());

	UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
	response = userProfileManagementService.getProfile(loginResponse.getToken());
	System.out.println(response.asPrettyString());

	
	profileRequest profileRequest = new profileRequest.Builder()
		    .firstName("ShrabantiBABY")
		    .lastName("Majumder")
		    .email("majumdershrabanti900@gmail.com")
		    .mobileNumber("9874818447")
		    .build();

		response = userProfileManagementService.updateProfile(loginResponse.getToken(), profileRequest);
		System.out.println(response.asPrettyString());


	}
	
}
