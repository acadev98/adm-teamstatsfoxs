package com.acadev.admteamstatsfox.service;

import java.util.List;

import com.acadev.admteamstatsfox.database.entity.Tournments;
import com.acadev.admteamstatsfox.model.request.TournmentDetailsRequest;
import com.acadev.admteamstatsfox.model.response.PlayerStatisticsResponse;
import com.acadev.admteamstatsfox.model.response.TournmentsDetailsResponse;

public interface TournmentsService {

	String echo();

	List<Tournments> getTournments();

	Tournments getTournmentById(Long id);

	TournmentsDetailsResponse getTournmentsDetailsById(Long id);

	List<TournmentsDetailsResponse> getTournmentsDetails();

	List<PlayerStatisticsResponse> getStatisticsPlayersByTournmentId(Long id);

	TournmentsDetailsResponse create(TournmentDetailsRequest tournmentDetails);

	Tournments delete(Long id);

	TournmentsDetailsResponse update(Long id, TournmentDetailsRequest tournmentDetails);

}
