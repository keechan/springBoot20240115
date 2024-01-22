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
		//인증
	    http.authorizeHttpRequests(authorize -> authorize
	    		  //member는 인증한 경우... member로 시작 이거나, class로 시작이거나...
	              .requestMatchers("/member/**","/class/**").authenticated()
	              //실제 데이터 값은 : ROLE_MEMBER, 순서 지켜야 함
	              .requestMatchers("/manager/**").hasRole("MEMBER")
	              //실제 데이터 값은 : ROLE_ADMIN
	              .requestMatchers("/admin/**").hasRole("ADMIN")
	              //나머지는 아무거나 다 사용함
	              .anyRequest().permitAll());
	    
//	    http.csrf(csrf ->csrf.disable())
//	        .formLogin(login ->login.loginPage("/login.do").defaultSuccessUrl("/loginSuccess.do", true))
//	        .execeptionHandling(execeptionHandling -> execeptionHandling.accessDeniedPage("/accessDenied.do")
//	        .logout(logout -> logoutinvalidateHttpSession(true).logoutSuccessUrl("/"))
//	        .userDetailsService(userDetailsService -> userDetailsService(securityUserDetail));
	        
		//기본 sercurity UI를 사용안하겠다고 표시함
	    http.csrf().disable();
	    //로그인 페이지 설정 후 이동할 페이지까지(/loginSuccess.do) 설정	    
		http.formLogin().loginPage("/login.do").defaultSuccessUrl("/loginSuccess.do", true);
		//권한이 없는 경우 이동할 페이지 : accessDenied.do
		http.exceptionHandling().accessDeniedPage("/accessDenied.do");
		//로그아웃 시 이동할 페이지(/login.do) 설졍
		http.logout().invalidateHttpSession(true).logoutSuccessUrl("/login.do");		
		http.userDetailsService(securityUserDetail);
		
		return http.build(); 
	}
	
	@Bean
    public PasswordEncoder passwordEncoder() {
		//비밀번호를 인코딩하는 모듈
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();		
	}
}