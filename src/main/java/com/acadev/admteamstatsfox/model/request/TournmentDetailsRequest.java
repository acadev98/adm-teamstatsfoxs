package com.acadev.admteamstatsfox.model.request;

import java.util.List;

import com.acadev.admteamstatsfox.database.entity.Opponents;
import com.acadev.admteamstatsfox.database.entity.Players;

import lombok.Data;

@Data
public class TournmentDetailsRequest {
	private TournmentRequest tournment;
	private List<Players> players;
	private List<Opponents> opponents;
}