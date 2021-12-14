package com.soumya.flightCheckIn.Integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.soumya.flightCheckIn.Integration.dto.Reservation;
import com.soumya.flightCheckIn.Integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements reservationRestClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate
				.getForObject("http://localhost:9091/reserveflight/reservations/" + id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject("http://localhost:9091/reserveflight/reservations", request, Reservation.class);
		return reservation;
	}

}
