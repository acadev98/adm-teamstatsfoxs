package com.acadev.admteamstatsfox.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PrevAndNextMatchesResponse {
	MatchesResponse prev;
	MatchesResponse next;
}
