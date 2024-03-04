package com.shop.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.entities.Customer;
import com.shop.repositories.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer setCustomer(Customer customer) {
        Customer customer2 = customerRepository.save(customer);
        return customer2;
    }

}
