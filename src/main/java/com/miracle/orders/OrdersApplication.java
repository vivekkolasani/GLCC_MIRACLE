package com.miracle.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@SpringBootApplication
@Transactional
@EnableTransactionManagement
public class OrdersApplication {
	private static final Logger logger = LogManager.getLogger(OrdersApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(OrdersApplication.class, args);
	}
}
