package com.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.entities.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	public Customer findByEmailAndPassword(String email, String password);
	
}
