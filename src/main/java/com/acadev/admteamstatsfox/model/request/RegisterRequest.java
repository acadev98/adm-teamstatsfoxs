package com.acadev.admteamstatsfox.model.request;

import lombok.Data;

@Data
public class RegisterRequest {
	private String username;
	private String email;
	private String password;
}