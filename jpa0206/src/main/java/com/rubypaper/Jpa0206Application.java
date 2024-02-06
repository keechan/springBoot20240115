package com.rubypaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.rubypaper")
public class Jpa0206Application {

	public static void main(String[] args) {
		SpringApplication.run(Jpa0206Application.class, args);
	}

}
