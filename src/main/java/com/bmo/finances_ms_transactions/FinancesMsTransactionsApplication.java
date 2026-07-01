package com.bmo.finances_ms_transactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cache.annotation.EnableCaching;

@EnableDiscoveryClient
@EnableCaching
@SpringBootApplication
public class FinancesMsTransactionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancesMsTransactionsApplication.class, args);
	}

}
