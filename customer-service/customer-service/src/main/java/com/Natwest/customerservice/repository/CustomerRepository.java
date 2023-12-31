package com.Natwest.customerservice.repository;

import com.Natwest.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Long> {
    Customer findByCustomerId(Long customerId);
}
