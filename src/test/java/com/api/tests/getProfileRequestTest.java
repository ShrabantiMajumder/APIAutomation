package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.userProfileResponse;

import io.restassured.response.Response;

public class getProfileRequestTest {

	
	@Test
	public void getProfileInfoTest() {
	
	AuthService authService = new AuthService();
	Response response = authService.login(new LoginRequest("shrabanti", "disha12345"));
	LoginResponse loginResponse = response.as(LoginResponse.class);
	System.out.println(loginResponse.getToken());

	UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
	response = userProfileManagementService.getProfile(loginResponse.getToken());
	System.out.println(response.asPrettyString());

	
	response = userProfileManagementService.getProfile(loginResponse.getToken());
	userProfileResponse userProfileResponse = response.as(userProfileResponse.class);
	System.out.println(userProfileResponse.getUsername());


	}
	}
