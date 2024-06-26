package com.acadev.admteamstatsfox.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acadev.admteamstatsfox.database.entity.Presents;
import com.acadev.admteamstatsfox.database.repository.PresentsRepository;
import com.acadev.admteamstatsfox.service.PresentsService;

@Service
public class PresentsServiceImpl implements PresentsService {

	@Autowired
	private PresentsRepository repository;

	public Long getNextId() {
		Optional<Presents> entityMaxId = repository.findTopByOrderByIdDesc();
		if (entityMaxId.isPresent())
			return (entityMaxId.get().getId() + 1);
		return 1L;
	}

	public String echo() {
		return "presents echo message";
	}

	public List<Presents> getPresentsByMatchId(Long id) {
		return repository.findAllByMatchId(id);
	}

	public Presents create(Presents request) {
		Presents present = Presents.builder().id(getNextId()).matchId(request.getMatchId())
				.playerId(request.getPlayerId()).build();

		return repository.save(present);
	}

	public void deleteByMatchId(Long matchId) {
		List<Presents> presentsByMatchId = repository.findAllByMatchId(matchId);
		if (presentsByMatchId.size() > 0) {
			repository.deleteAll(presentsByMatchId);
		}
	}

	public List<Presents> getPresentsByPlayerId(Long id) {
		return repository.findAllByPlayerId(id);
	}

	public List<Presents> getPresentsByPlayerIdAndByMatchesIds(Long playerId, List<Long> matchesIds) {
		return repository.findAllByPlayerIdAndMatchIdIn(playerId, matchesIds);
	}

}
