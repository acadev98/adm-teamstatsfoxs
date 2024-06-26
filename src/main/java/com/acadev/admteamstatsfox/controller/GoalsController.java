package com.acadev.admteamstatsfox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acadev.admteamstatsfox.handler.ResponseHandler;
import com.acadev.admteamstatsfox.service.GoalsService;
import com.acadev.admteamstatsfox.utils.MessagesUtils;

@RestController
@RequestMapping("/api/goals")
public class GoalsController {

	@Autowired
	private GoalsService service;

	@GetMapping("/echo")
	public ResponseEntity<Object> echoTest() {
		return ResponseHandler.generateResponse(service.echo(), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<Object> get() {
		return ResponseHandler.generateResponse(MessagesUtils.LIST_OF_GOALS, HttpStatus.OK, service.getGoals());
	}

}
