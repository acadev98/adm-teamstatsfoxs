package com.acadev.admteamstatsfox.model.request;

import com.acadev.admteamstatsfox.utils.enums.ECardType;

import lombok.Data;

@Data
public class CardRequest {
	private String minute;
	private String playerId;
	private ECardType type;
}
