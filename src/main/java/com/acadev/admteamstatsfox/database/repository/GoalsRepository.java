package com.acadev.admteamstatsfox.database.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.acadev.admteamstatsfox.database.entity.Goals;

public interface GoalsRepository extends PagingAndSortingRepository<Goals, Long>, JpaRepository<Goals, Long> {

	Optional<Goals> findTopByOrderByIdDesc();

	List<Goals> findAllByMatchId(Long id);

	List<Goals> findAllByPlayerId(Long id);

	List<Goals> findAllByAssistPlayerId(Long id);

	List<Goals> findAllByPlayerIdAndMatchIdIn(Long id, List<Long> matchesIds);

	List<Goals> findAllByAssistPlayerIdAndMatchIdIn(Long id, List<Long> matchesIds);
}