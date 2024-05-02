package com.acadev.admteamstatsfox.model.response;

import java.util.List;

import com.acadev.admteamstatsfox.database.entity.Cards;
import com.acadev.admteamstatsfox.database.entity.Goals;
import com.acadev.admteamstatsfox.database.entity.Matches;
import com.acadev.admteamstatsfox.database.entity.Opponents;
import com.acadev.admteamstatsfox.database.entity.Players;
import com.acadev.admteamstatsfox.database.entity.Tournments;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MatchesDetailsResponse {
	private Matches match;
	private Opponents opponent;
	private Tournments tournment;
	private List<Goals> goals;
	private List<Players> players;
	private List<Cards> cards;
}
