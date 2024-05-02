package com.acadev.admteamstatsfox.model.response;

import java.util.List;

import com.acadev.admteamstatsfox.database.entity.Matches;
import com.acadev.admteamstatsfox.database.entity.Opponents;
import com.acadev.admteamstatsfox.database.entity.Players;
import com.acadev.admteamstatsfox.database.entity.Tournments;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TournmentsDetailsResponse {

	private Tournments tournment;
	private List<Players> players;
	private List<Opponents> opponents;
	private List<Matches> matches;

}
