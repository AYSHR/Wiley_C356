package com.wiley.sbconcept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SbconceptApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbconceptApplication.class, args);
	}

}
