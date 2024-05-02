package com.acadev.admteamstatsfox.model.response;

import com.acadev.admteamstatsfox.database.entity.Opponents;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PrevAndNextOpponentsResponse {
	Opponents prev;
	Opponents next;
}
