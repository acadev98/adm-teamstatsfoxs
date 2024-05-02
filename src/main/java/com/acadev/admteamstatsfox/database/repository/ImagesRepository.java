package com.acadev.admteamstatsfox.database.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acadev.admteamstatsfox.database.entity.Images;

public interface ImagesRepository extends JpaRepository<Images, Long> {
	Optional<Images> findTopByOrderByIdDesc();
	
	Optional<Images> findByName(String name);
}
