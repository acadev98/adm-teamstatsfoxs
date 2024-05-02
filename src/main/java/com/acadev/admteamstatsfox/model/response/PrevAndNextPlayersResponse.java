package com.acadev.admteamstatsfox.model.response;

import com.acadev.admteamstatsfox.database.entity.Players;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PrevAndNextPlayersResponse {
	Players prev;
	Players next;
}
