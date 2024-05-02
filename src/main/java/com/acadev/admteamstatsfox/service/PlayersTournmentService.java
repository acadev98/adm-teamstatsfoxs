package com.acadev.admteamstatsfox.service;

import java.util.List;

import com.acadev.admteamstatsfox.database.entity.PlayersTournment;

public interface PlayersTournmentService {

	String echo();

	List<PlayersTournment> getPlayersByTournmentId(Long id);

	PlayersTournment create(PlayersTournment request);

	void deleteByTournmentId(Long id);

}
