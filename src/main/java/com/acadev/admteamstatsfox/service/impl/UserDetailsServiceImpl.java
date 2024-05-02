package com.acadev.admteamstatsfox.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.acadev.admteamstatsfox.database.entity.Users;
import com.acadev.admteamstatsfox.database.repository.UsersRepository;
import com.acadev.admteamstatsfox.handler.exception.ApiException;
import com.acadev.admteamstatsfox.utils.enums.ApiMessage;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsersRepository repository;

	public String echo() {
		return "user details echo message service";
	}
	
	public UserDetails loadUserByUsername(String email) {

		Optional<Users> userOptional = repository.findByMail(email); 
		
		if (userOptional.isEmpty()) {
			throw new ApiException(ApiMessage.USER_NOT_FOUND);
		} else {
			Users user = userOptional.get();
			return org.springframework.security.core.userdetails.User.builder()
					.username(user.getMail())
					.password(user.getPassword())
					.build();
		}
		
	}
	
}
