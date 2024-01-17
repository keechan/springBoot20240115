package com.korea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.korea.controller",
                              "com.korea.test"})
public class Hrd0117Application {

	public static void main(String[] args) {
		SpringApplication.run(Hrd0117Application.class, args);
	}
}