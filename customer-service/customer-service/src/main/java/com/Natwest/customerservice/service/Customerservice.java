package com.Natwest.customerservice.service;

import com.Natwest.customerservice.VO.Account;
import com.Natwest.customerservice.VO.ResponseTempleteVO;
import com.Natwest.customerservice.model.Customer;
import com.Natwest.customerservice.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class Customerservice {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Customer saveCustomer(Customer customer) {
        log.info("Inside saveCustomer method of Customerservice");
        return customerRepository.save(customer);
    }

   public ResponseTempleteVO getCustomerWithAccount(Long customerId) {
        log.info("Inside getCustomerWithAccount method of Customerservice");
       ResponseTempleteVO vo = new ResponseTempleteVO();
       Customer customer = customerRepository.findByCustomerId(customerId);
       vo.setCustomer(customer);
       vo.setAccount(restTemplate.getForObject("http://ACCOUNT-SERVICE/account/" + customerId,
               Account.class));
       return vo;

   }
}
