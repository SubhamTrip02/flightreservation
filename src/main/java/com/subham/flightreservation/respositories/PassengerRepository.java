package com.subham.flightreservation.respositories;

import com.subham.flightreservation.entities.passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<passenger,Integer> {
}
