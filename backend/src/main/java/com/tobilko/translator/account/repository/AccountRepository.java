package com.tobilko.translator.account.repository;

import com.tobilko.translator.account.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Andrew Tobilko on 12/1/17.
 */
public interface AccountRepository extends CrudRepository<Account, Long> {}
