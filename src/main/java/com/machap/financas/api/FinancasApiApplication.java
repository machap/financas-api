package com.machap.financas.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.machap.financas.api.config.property.FinancasApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(FinancasApiProperty.class)
public class FinancasApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancasApiApplication.class, args);
	}

}

