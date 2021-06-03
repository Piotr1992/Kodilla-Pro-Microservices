package com.example.mini_bank.accounts.service;

import com.example.mini_bank.accounts.dto.Account;
import com.example.mini_bank.accounts.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository repository;

    public List<Account> getAllAccounts() {
        return repository.findAll();
    }

    public Optional<Account> getAccount(final Long id) {
        return repository.findById(id);
    }

    public void save(Account account) {
        repository.save(account);
    }
}
