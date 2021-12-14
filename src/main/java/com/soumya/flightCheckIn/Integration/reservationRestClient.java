package com.soumya.flightCheckIn.Integration;

import com.soumya.flightCheckIn.Integration.dto.Reservation;
import com.soumya.flightCheckIn.Integration.dto.ReservationUpdateRequest;

public interface reservationRestClient {

	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest resquest);
}
