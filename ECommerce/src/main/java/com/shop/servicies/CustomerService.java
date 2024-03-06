package com.shop.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.shop.entities.Customer;
import com.shop.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	public Customer setCustomer(@NonNull Customer customer) {
		Customer customer2 = customerRepository.save(customer);
		return customer2;
	}

	public Customer getCustomerByEmailAndPassword(String email, String password) {
		Customer customer = customerRepository.findByEmailAndPassword(email, password);
		return customer;
	}

}
