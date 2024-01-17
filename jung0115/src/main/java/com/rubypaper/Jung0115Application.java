package com.rubypaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//비즈니스 레이어와 프레젠테이션 레이어를 구분하여 스캔지정함
//스캔 순서로 지정됨
@ComponentScan(basePackages= {"com.rubypaper.controller",
		                      "com.rubypaper.project"})
public class Jung0115Application {

	public static void main(String[] args) {
		SpringApplication.run(Jung0115Application.class, args);
	}
}