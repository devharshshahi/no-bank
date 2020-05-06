package com.nobank.accounttransactionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountTransactionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountTransactionServiceApplication.class, args);
	}

}
