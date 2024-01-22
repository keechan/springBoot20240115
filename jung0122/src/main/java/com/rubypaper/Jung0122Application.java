package com.rubypaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.rubypaper", "com.controller"})
public class Jung0122Application {

	public static void main(String[] args) {
		SpringApplication.run(Jung0122Application.class, args);
	}

}
