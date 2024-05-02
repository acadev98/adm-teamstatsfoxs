package com.acadev.admteamstatsfox.service;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.acadev.admteamstatsfox.database.entity.Matches;
import com.acadev.admteamstatsfox.model.request.MatchDetailsRequest;
import com.acadev.admteamstatsfox.model.response.MatchesDetailsResponse;
import com.acadev.admteamstatsfox.model.response.MatchesResponse;
import com.acadev.admteamstatsfox.model.response.PrevAndNextMatchesResponse;

public interface MatchesService {

	String echo();

	List<MatchesResponse> getMatchesResponse();

	List<Matches> getMatches();

	List<Matches> getMatchesByOpponentId(Long opponentId);

	MatchesDetailsResponse create(MatchDetailsRequest matchDetails);

	Matches getMatch(Long id);

	MatchesDetailsResponse getMatchDetails(Long id);

	Matches delete(Long id);

	PrevAndNextMatchesResponse getMatchesPrevAndNext(Long id);

	List<Matches> getMatchesByTournmentId(Long id);

	List<Matches> getMatchesByCaptain(Long id);

	MatchesDetailsResponse getNextMatchDetails();

}
