package com.acadev.admteamstatsfox.service;

import java.util.List;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import com.acadev.admteamstatsfox.database.entity.Players;
import com.acadev.admteamstatsfox.model.request.PlayerRequest;
import com.acadev.admteamstatsfox.model.response.PlayerStatisticsResponse;
import com.acadev.admteamstatsfox.model.response.PlayersDetailsResponse;
import com.acadev.admteamstatsfox.model.response.PrevAndNextPlayersResponse;

public interface PlayerService {

	Players create(PlayerRequest player);

	Players delete(Long id);

	String echo();

	Players getPlayer(Long id);

	List<Players> getPlayers();

	List<Players> getPlayersActives();

	Players update(Long id, PlayerRequest player);

	List<Integer> findNumbers();

	PlayersDetailsResponse getPlayerDetails(Long id);

	PrevAndNextPlayersResponse getPlayerPrevAndNext(Long id);

	List<PlayerStatisticsResponse> getPlayersStatistics();

	List<Integer> availableNumbers();

	Boolean saveImage(Long id, MultipartFile file);

	Resource getImageByPlayerId(Long id);

}
