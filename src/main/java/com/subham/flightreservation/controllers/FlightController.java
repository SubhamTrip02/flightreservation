package com.subham.flightreservation.controllers;

import com.subham.flightreservation.entities.flight;
import com.subham.flightreservation.respositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class FlightController {
    @Autowired
    FlightRepository flightRepository;

    @RequestMapping("/findFlights")
    public String findFlights(@RequestParam("from") String departure_city ,
                              @RequestParam("to") String arrival_city,
                              @RequestParam("departureDate") @DateTimeFormat(pattern = "yyyy-mm-dd")Date date_of_departure,
                              Model model) throws ParseException {


        List<flight> flights =flightRepository.findAllFlights(departure_city,arrival_city,date_of_departure);
        model.addAttribute("flights_all",flights);

        return "displayFlights";
    }

}
