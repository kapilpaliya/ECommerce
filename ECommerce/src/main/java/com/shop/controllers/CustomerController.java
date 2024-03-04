package com.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.entities.Customer;

@Controller
public class CustomerController {

    @RequestMapping("/")
    public String getWelcome() {
        return "welcome";
    }

    @RequestMapping("/signup")
    public String getSignup(Model m) {
        m.addAttribute("title", "Signup Page");
        return "UserSignup";
    }

    @PostMapping("/signupData")
    public String getSignupData(@ModelAttribute Customer customer,
            @RequestParam("isActive") boolean isActive) {
        System.out.println(customer);
        System.out.println("New isActive : " + isActive);
        customer.setActive(isActive);
        System.out.println(customer);
        return "welcome";
    }

}
