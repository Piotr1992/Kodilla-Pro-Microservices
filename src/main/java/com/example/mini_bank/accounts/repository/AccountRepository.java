package com.example.mini_bank.accounts.repository;

import com.example.mini_bank.accounts.dto.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    @Override
    List<Account> findAll();

    @Override
    Account save(Account task);

    @Override
    Optional<Account> findById(Long id);

    @Override
    void deleteById(Long id);

}