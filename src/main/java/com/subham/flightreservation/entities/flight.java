package com.subham.flightreservation.entities;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class flight  extends entityAbstract{

    private String flight_number,operating_airlines,departure_city,arrival_city;
    private Date date_of_departure;
    private Timestamp estimated_departure_time;

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public String getOperating_airlines() {
        return operating_airlines;
    }

    public void setOperating_airlines(String operating_airlines) {
        this.operating_airlines = operating_airlines;
    }

    public String getDeparture_city() {
        return departure_city;
    }

    public void setDeparture_city(String departure_city) {
        this.departure_city = departure_city;
    }

    public String getArrival_city() {
        return arrival_city;
    }

    public void setArrival_city(String arrival_city) {
        this.arrival_city = arrival_city;
    }

    public Date getDate_of_departure() {
        return date_of_departure;
    }

    public void setDate_of_departure(Date date_of_departure) {
        this.date_of_departure = date_of_departure;
    }

    public Timestamp getEstimated_departure_time() {
        return estimated_departure_time;
    }

    public void setEstimated_departure_time(Timestamp estimated_departure_time) {
        this.estimated_departure_time = estimated_departure_time;
    }
}
