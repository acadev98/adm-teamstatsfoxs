package com.acadev.admteamstatsfox.service;

import com.acadev.admteamstatsfox.model.request.SignInRequest;
import com.acadev.admteamstatsfox.model.request.SignUpRequest;
import com.acadev.admteamstatsfox.model.response.SignInResponse;

public interface UserService {

	String echo();
	
	void signup(SignUpRequest request);
	
	SignInResponse signin(SignInRequest request);

}
