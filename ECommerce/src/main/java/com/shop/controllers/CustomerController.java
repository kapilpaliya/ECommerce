package com.shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.entities.Customer;
import com.shop.entities.LoginUsers;
import com.shop.servicies.CustomerService;

import jakarta.validation.Valid;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    
    @GetMapping("/")
    public String getWelcome() {
        return "welcome";
    }

    @GetMapping("/signup")
    public String setSignup(Model m) {
        m.addAttribute("title", "customer signup");
        m.addAttribute("customer", new Customer());
        return "UserSignup";
    }

    @PostMapping("/signupData")
    public String getSignup(@Valid @ModelAttribute Customer customer, BindingResult result, Model m) {
    	
    	if (result.hasErrors()) {
            m.addAttribute("customer", customer);
            System.out.println("Error\n"+customer);        
            return "UserSignup";
        }
        try{
        	 Customer customer2 = customerService.setCustomer(customer);
        	 System.out.println("Data Successfully Uploaded!......................");
        	 System.out.println("Success\n"+customer);
        	 return "temp";
        }catch(Exception exception) {
        	m.addAttribute("customer", customer);
        	m.addAttribute("message", true);
        	System.out.println("Email Error\n"+customer);
        	return "UserSignup";
        }
    }
    
    
    @GetMapping("/login")
    public String setLogin(Model m) {
    	m.addAttribute("title","Login : Welcome");
    	m.addAttribute("loginUsers", new LoginUsers());
    	return "UserLogin";
    }
    
    @PostMapping("/loginData")
    public String getLogin(@Valid @ModelAttribute("loginUsers") LoginUsers loginUsers, BindingResult result, 	Model m) {
    	
    	if (result.hasErrors()) {
           m.addAttribute("loginUsers", loginUsers);
            System.out.println(result);
            System.out.println("Error\n"+loginUsers);      
            System.out.println("result.hasErrors() Methods................................");
            return "UserLogin";
        }
    	
    	String email = loginUsers.getEmail();
    	String password = loginUsers.getPassword();
    	
    	Customer testCustomer = customerService.getCustomerByEmailAndPassword(email, password);
    	
    	if(testCustomer == null || !testCustomer.isActive()) {
			m.addAttribute("message", true);
			System.out.println("Message Customer == null.............................");
			return "UserLogin";
		}
    	
    	System.out.println("Success......................");
    	return "temp";
    }
    
    @RequestMapping("/lelo")
    public String getLelo() {
    	return "temps/lelo";
    }
    

}
