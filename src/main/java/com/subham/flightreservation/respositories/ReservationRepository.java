package com.subham.flightreservation.respositories;

import com.subham.flightreservation.entities.reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<reservation,Integer> {
}
