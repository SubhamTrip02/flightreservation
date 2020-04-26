package com.subham.flightreservation.respositories;

import com.subham.flightreservation.entities.flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<flight,Integer> {

    @Query("select operating_airlines,departure_city,arrival_city,date_of_departure,estimated_departure_time from flight where departure_city=:departure_city_var and arrival_city=:arrival_city_var and date_of_departure=:date_of_departure_var")
    List<flight> findAllFlights(@Param("departure_city_var") String departure_city,@Param("arrival_city_var") String arrival_city,
                                @Param("date_of_departure_var") Date s);


 //   List<flight> findByDeparture_cityAndArrival_cityAndDate_of_departure( String departure_city,String arrival_city, Date date_of_departure);
}
