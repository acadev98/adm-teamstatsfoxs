package com.acadev.admteamstatsfox.database.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.acadev.admteamstatsfox.database.entity.Opponents;

public interface OpponentsRepository
		extends PagingAndSortingRepository<Opponents, Long>, JpaRepository<Opponents, Long> {

	Optional<Opponents> findTopByOrderByIdDesc();

	Optional<Opponents> findByName(String name);
}