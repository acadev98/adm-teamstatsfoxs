package com.acadev.admteamstatsfox.model.response;

import com.acadev.admteamstatsfox.database.entity.Players;

import lombok.Data;

@Data
public class PlayerStatsResponse extends Players {

	private Integer age;
	private Integer matches;
	private Integer goals;
	private Integer assists;
	private Integer captains;
	private Integer redCards;
	private Integer yellowCards;

}
