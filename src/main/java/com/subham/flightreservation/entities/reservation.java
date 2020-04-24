package com.subham.flightreservation.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class reservation extends entityAbstract {

    private Boolean checked_in;
    private int number_of_bags;

    @OneToOne
    private passenger passengers;

    @OneToOne
    private flight flights;


    public Boolean getChecked_in() {
        return checked_in;
    }

    public void setChecked_in(Boolean checked_in) {
        this.checked_in = checked_in;
    }

    public int getNumber_of_bags() {
        return number_of_bags;
    }

    public void setNumber_of_bags(int number_of_bags) {
        this.number_of_bags = number_of_bags;
    }

    public passenger getPassengers() {
        return passengers;
    }

    public void setPassengers(passenger passengers) {
        this.passengers = passengers;
    }

    public flight getFlights() {
        return flights;
    }

    public void setFlights(flight flights) {
        this.flights = flights;
    }
}
