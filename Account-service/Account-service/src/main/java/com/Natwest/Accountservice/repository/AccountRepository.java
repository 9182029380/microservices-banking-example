package com.Natwest.Accountservice.repository;

import com.Natwest.Accountservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
   Account  findByAccountId(Long accountId);
}
