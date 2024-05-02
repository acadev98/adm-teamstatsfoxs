package com.acadev.admteamstatsfox.model.response;

import com.acadev.admteamstatsfox.database.entity.Matches;
import com.acadev.admteamstatsfox.database.entity.Opponents;
import com.acadev.admteamstatsfox.database.entity.Tournments;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MatchesResponse {
	private Matches match;
	private Opponents opponent;
	private Tournments tournment;
}
