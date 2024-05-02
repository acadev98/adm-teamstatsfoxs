package com.acadev.admteamstatsfox.model.response;

import java.util.List;

import com.acadev.admteamstatsfox.database.entity.Matches;
import com.acadev.admteamstatsfox.database.entity.Opponents;
import com.acadev.admteamstatsfox.database.entity.Tournments;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OpponentsDetailsResponse {
	private Opponents opponent;
	private List<Matches> matches;
	private List<Tournments> tournments;
}
