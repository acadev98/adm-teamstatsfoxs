package com.acadev.admteamstatsfox.controller;

import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.acadev.admteamstatsfox.handler.ResponseHandler;
import com.acadev.admteamstatsfox.model.request.PlayerRequest;
import com.acadev.admteamstatsfox.service.PlayerService;
import com.acadev.admteamstatsfox.utils.MessagesUtils;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
	

	@Autowired
	private PlayerService service;

	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Object> createPlayer(@Valid @RequestBody PlayerRequest player) {
		return ResponseHandler.generateResponse(MessagesUtils.PLAYER_CREATED, HttpStatus.CREATED,
				service.create(player));
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Object> updatePlayer(@PathVariable("id") Long id, @Valid @RequestBody PlayerRequest player) {
		return ResponseHandler.generateResponse(MessagesUtils.PLAYER_UPDATED, HttpStatus.OK,
				service.update(id, player));
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Object> deletePlayer(@PathVariable("id") Long id) {
		return ResponseHandler.generateResponse(MessagesUtils.PLAYER_DELETED, HttpStatus.OK, service.delete(id));
	}

	@GetMapping("/echo")
	public ResponseEntity<Object> echoTest() {
		return ResponseHandler.generateResponse(service.echo(), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<Object> getPlayers() {
		return ResponseHandler.generateResponse(MessagesUtils.LIST_OF_PLAYERS, HttpStatus.OK, service.getPlayers());
	}

	@GetMapping("/actives")
	public ResponseEntity<Object> getPlayersActive() {
		return ResponseHandler.generateResponse(MessagesUtils.LIST_OF_PLAYERS_ACTIVES, HttpStatus.OK,
				service.getPlayersActives());
	}

	@GetMapping("/statistics")
	public ResponseEntity<Object> getPlayersStatistics() {
		return ResponseHandler.generateResponse(MessagesUtils.LIST_OF_PLAYERS_STATISTICS, HttpStatus.OK,
				service.getPlayersStatistics());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> getPlayersById(@PathVariable("id") Long id) {
		return ResponseHandler.generateResponse(MessagesUtils.PLAYER_FOUND, HttpStatus.OK, service.getPlayer(id));
	}

	@GetMapping("/{id}/images")
	public ResponseEntity<Resource> getImageByPlayerId(@PathVariable("id") Long id) throws MalformedURLException {
		return ResponseEntity.ok().body(service.getImageByPlayerId(id));
	}

	@PostMapping("/{id}/images")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Object> saveImageByPlayerId(@PathVariable("id") Long id,
			@RequestParam("file") MultipartFile file) {
		return ResponseHandler.generateResponse(MessagesUtils.PLAYER_IMAGE_CREATED, HttpStatus.CREATED,
				service.saveImage(id, file));
	}

	@GetMapping("/{id}/details")
	public ResponseEntity<Object> getPlayersDetailsById(@PathVariable("id") Long id) {
		return ResponseHandler.generateResponse(MessagesUtils.PLAYER_FOUND, HttpStatus.OK,
				service.getPlayerDetails(id));
	}

	@GetMapping("/{id}/prevandnext")
	public ResponseEntity<Object> getPlayersPrevAndNextById(@PathVariable("id") Long id) {
		return ResponseHandler.generateResponse(MessagesUtils.PLAYER_FOUND, HttpStatus.OK,
				service.getPlayerPrevAndNext(id));
	}

	@GetMapping("/numbers/avaibles")
	public ResponseEntity<Object> availableNumbers() {
		return ResponseHandler.generateResponse(MessagesUtils.AVAILABLE_NUMBERS, HttpStatus.OK,
				service.availableNumbers());
	}
}
