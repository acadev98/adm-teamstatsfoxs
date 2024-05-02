package com.acadev.admteamstatsfox.model.request;

import com.acadev.admteamstatsfox.utils.enums.EGoalType;

import lombok.Data;

@Data
public class GoalRequest {
	private String minute;
	private String playerId;
	private String assistPlayerId;
	private EGoalType type;
	private Boolean our;
}
