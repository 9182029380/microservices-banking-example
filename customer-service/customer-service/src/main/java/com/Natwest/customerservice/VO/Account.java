package com.Natwest.customerservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Account {

    private long accountId;
    private String accountNumber;
    private String accountType;
    private String accountHolderName;
    private String accountBalance;
}
