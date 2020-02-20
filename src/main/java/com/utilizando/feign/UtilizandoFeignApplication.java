package com.utilizando.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UtilizandoFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilizandoFeignApplication.class, args);
	}

}
