package com.rubypaper.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
	
	SecurityConfig(){
		System.out.println("==>SecurityConfig");
	}
	
	@Autowired
	SecurityUserDetailsService	securityUserDetail;
	
	@SuppressWarnings("removal")
	@Bean
	SecurityFilterChain filterChain( HttpSecurity http ) throws Exception {
		
	    http.authorizeHttpRequests(authorize -> authorize
	              .requestMatchers("/member/**","/class/**").authenticated()
	              .requestMatchers("/manager/**").hasRole("MANAGER")
	              .requestMatchers("/admin/**").hasRole("ADMIN")
	              .anyRequest().permitAll())
				
		.csrf(csrf ->csrf.disable())	
	    
		.formLogin(login ->login.loginPage("/login.do").defaultSuccessUrl("/loginSuccess.do", true))
		.exceptionHandling(handling ->handling.accessDeniedPage("/accessDenied.do"))
		.logout(logout ->logout.invalidateHttpSession(true).logoutSuccessUrl("/logout.do"))
		.userDetailsService(securityUserDetail);
	    
		return http.build(); 
	}
	
    @Bean
    public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();		
	}
}
