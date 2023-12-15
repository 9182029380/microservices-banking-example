package com.Natwest.customerservice.VO;

import com.Natwest.customerservice.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTempleteVO {
    private Customer customer;
    private Account account;

}
