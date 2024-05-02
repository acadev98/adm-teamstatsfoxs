package com.acadev.admteamstatsfox.service;

import java.util.List;

import com.acadev.admteamstatsfox.database.entity.Opponents;
import com.acadev.admteamstatsfox.model.response.OpponentsDetailsResponse;
import com.acadev.admteamstatsfox.model.response.PrevAndNextOpponentsResponse;

public interface OpponentsService {

	String echo();

	List<Opponents> getOpponents();

	List<OpponentsDetailsResponse> getOpponentsDetails();

	Opponents create(Opponents tournment);

	Opponents getOpponentById(Long id);

	OpponentsDetailsResponse getOpponentDetailsById(Long id);

	Opponents delete(Long id);

	PrevAndNextOpponentsResponse getOpponentsPrevAndNext(Long id);

	Opponents update(Long id, Opponents opponents);

}
