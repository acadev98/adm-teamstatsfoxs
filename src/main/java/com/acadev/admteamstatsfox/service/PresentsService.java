package com.acadev.admteamstatsfox.service;

import java.util.List;

import com.acadev.admteamstatsfox.database.entity.Presents;

public interface PresentsService {

	String echo();

	List<Presents> getPresentsByMatchId(Long id);

	Presents create(Presents request);

	void deleteByMatchId(Long id);

	List<Presents> getPresentsByPlayerId(Long id);

	List<Presents> getPresentsByPlayerIdAndByMatchesIds(Long playerId, List<Long> matchesIds);

}
