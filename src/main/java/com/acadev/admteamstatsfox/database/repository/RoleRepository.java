package com.acadev.admteamstatsfox.database.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acadev.admteamstatsfox.database.entity.Roles;
import com.acadev.admteamstatsfox.utils.enums.ERole;

public interface RoleRepository extends JpaRepository<Roles, Long> {
	Optional<Roles> findByName(ERole name);
}