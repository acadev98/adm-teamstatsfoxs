package com.acadev.admteamstatsfox.service.impl;

import java.time.LocalDate;
import java.time.Period;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acadev.admteamstatsfox.database.entity.Cards;
import com.acadev.admteamstatsfox.database.entity.Matches;
import com.acadev.admteamstatsfox.database.entity.OpponentsTournment;
import com.acadev.admteamstatsfox.database.entity.Players;
import com.acadev.admteamstatsfox.database.entity.PlayersTournment;
import com.acadev.admteamstatsfox.database.entity.Presents;
import com.acadev.admteamstatsfox.model.response.PlayerStatsResponse;

@Service
public class MapperService {

	@Autowired
	private ModelMapper modelMapper;

	public PlayerStatsResponse convertToDto(Players player) {
		PlayerStatsResponse response = modelMapper.map(player, PlayerStatsResponse.class);

		if (null != player.getBirthday()) {
			response.setAge(Period.between(player.getBirthday(), LocalDate.now()).getYears());
		}

		return response;
	}

	public Long getPlayerIds(Presents presents) {
		return presents.getPlayerId();
	}

	public Long getPlayerIds(PlayersTournment playersTournments) {
		return playersTournments.getPlayerId();
	}

	public Long getMatchesIds(Matches matches) {
		return matches.getId();
	}

	public Long getPlayerIds(Cards cards) {
		return cards.getPlayerId();
	}

	public Long getOpponentsIds(OpponentsTournment opponentsTournments) {
		return opponentsTournments.getOpponentId();
	}

}
