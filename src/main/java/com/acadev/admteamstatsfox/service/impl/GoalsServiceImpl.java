package com.acadev.admteamstatsfox.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acadev.admteamstatsfox.database.entity.Goals;
import com.acadev.admteamstatsfox.database.repository.GoalsRepository;
import com.acadev.admteamstatsfox.handler.exception.ApiException;
import com.acadev.admteamstatsfox.service.GoalsService;
import com.acadev.admteamstatsfox.utils.enums.ApiMessage;

@Service
public class GoalsServiceImpl implements GoalsService {

	@Autowired
	private GoalsRepository repository;

	public Long getNextId() {
		Optional<Goals> entityMaxId = repository.findTopByOrderByIdDesc();
		if (entityMaxId.isPresent())
			return (entityMaxId.get().getId() + 1);
		return 1L;
	}

	public String echo() {
		return "goals echo message";
	}

	public List<Goals> getGoals() {

		List<Goals> goals = repository.findAll();
		if (goals.isEmpty())
			throw new ApiException(ApiMessage.CONTENT_NOT_FOUND);

		return goals;
	}

	public List<Goals> getGoalsByMatchId(Long id) {
		return repository.findAllByMatchId(id);
	}

	public Goals create(Goals request) {
		request.setId(getNextId());
		return repository.save(request);
	}

	public void deleteByMatchId(Long matchId) {
		List<Goals> goalsByMatchId = repository.findAllByMatchId(matchId);
		if (goalsByMatchId.size() > 0) {
			repository.deleteAll(goalsByMatchId);
		}
	}

	public List<Goals> getGoalsByPlayerId(Long id) {
		return repository.findAllByPlayerId(id);
	}

	public List<Goals> getAssistsByPlayerId(Long id) {
		return repository.findAllByAssistPlayerId(id);
	}

	public List<Goals> getGoalsByPlayerIdAndByMatchesIds(Long id, List<Long> matchesIds) {
		return repository.findAllByPlayerIdAndMatchIdIn(id, matchesIds);
	}

	public List<Goals> getGoalsByAssistsPlayerIdAndByMatchesIds(Long id, List<Long> matchesIds) {
		return repository.findAllByAssistPlayerIdAndMatchIdIn(id, matchesIds);
	}

}
