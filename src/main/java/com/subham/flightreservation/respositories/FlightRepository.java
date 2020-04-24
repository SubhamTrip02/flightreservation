package com.subham.flightreservation.respositories;

import com.subham.flightreservation.entities.flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<flight,Integer> {
}
