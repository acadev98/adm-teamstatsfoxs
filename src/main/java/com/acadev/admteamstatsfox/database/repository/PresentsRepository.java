package com.acadev.admteamstatsfox.database.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.acadev.admteamstatsfox.database.entity.Presents;

public interface PresentsRepository extends PagingAndSortingRepository<Presents, Long>, JpaRepository<Presents, Long> {
	Optional<Presents> findTopByOrderByIdDesc();

	List<Presents> findAllByMatchId(Long id);

	List<Presents> findAllByPlayerId(Long id);

	List<Presents> findAllByPlayerIdAndMatchIdIn(Long id, List<Long> matchesIds);
}