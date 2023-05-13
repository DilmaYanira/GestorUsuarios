package com.prueba.GestorUsuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GestorUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestorUsuariosApplication.class, args);
	}

}
