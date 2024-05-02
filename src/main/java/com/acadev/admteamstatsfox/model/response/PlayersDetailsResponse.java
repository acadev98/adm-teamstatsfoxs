package com.acadev.admteamstatsfox.model.response;

import java.util.List;

import com.acadev.admteamstatsfox.database.entity.Cards;
import com.acadev.admteamstatsfox.database.entity.Goals;
import com.acadev.admteamstatsfox.database.entity.Matches;
import com.acadev.admteamstatsfox.database.entity.Players;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlayersDetailsResponse {
	private Players player;
	private List<Goals> goals;
	private List<Goals> assists;
	private List<Matches> matches;
	private List<Cards> cards;
}
