package com.acadev.admteamstatsfox.service;

import java.util.List;

import com.acadev.admteamstatsfox.database.entity.OpponentsTournment;

public interface OpponentsTournmentsService {

	String echo();

	List<OpponentsTournment> getOpponentsByTournmentId(Long id);

	List<OpponentsTournment> getTournmentsByOpponentId(Long id);

	OpponentsTournment create(OpponentsTournment request);

	void deleteByTournmentId(Long id);

}
