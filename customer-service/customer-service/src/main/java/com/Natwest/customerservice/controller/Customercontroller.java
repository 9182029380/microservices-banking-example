package com.Natwest.customerservice.controller;

import com.Natwest.customerservice.VO.ResponseTempleteVO;
import com.Natwest.customerservice.model.Customer;
import com.Natwest.customerservice.service.Customerservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@Slf4j
public class Customercontroller {
    @Autowired
    private Customerservice customerService;

    @PostMapping("/")
    public Customer saveCustomer(@RequestBody Customer customer){
        log.info("Inside saveCustomer method of Customercontroller");
        return customerService.saveCustomer(customer);

    }
   @GetMapping("/{id}")
    public ResponseTempleteVO getCustomerWithAccount(@PathVariable("id") Long customerId){
       log.info("Inside getCustomerWithAccount method of Customercontroller");
       return customerService.getCustomerWithAccount(customerId);
   }

}
