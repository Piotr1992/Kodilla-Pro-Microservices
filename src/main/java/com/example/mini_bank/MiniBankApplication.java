package com.example.mini_bank;

import com.example.mini_bank.accounts.dto.Account;
import com.example.mini_bank.accounts.service.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiniBankApplication {

    public static void main(String[] args) {

        SpringApplication.run(MiniBankApplication.class, args);

    }

}
