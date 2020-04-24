package com.subham.flightreservation.controllers;

import com.subham.flightreservation.entities.user;
import com.subham.flightreservation.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @RequestMapping("/showReg")
    public String showRegistrationPage(){

        return "login/registerUser";
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)       //the method here is post because in the form we have the post method only
    public String userRegistrationPage(@ModelAttribute("user") user userN,Model model){
        userRepository.save(userN);
        model.addAttribute("message","Hi! "+userN.getFirst_name()+" Your account has been created successfully ");
        return "login/login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("email") String email, @RequestParam("password") String password,Model model){
        user userN =userRepository.findByEmail(email);
        if(userN.getPassword().equals(password)){
            return "findflights";
        }
        else{
            model.addAttribute("msg","Invalid credentials.....try again");
            return "login/login";
        }



    }
}
