package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	@GetMapping("login.do")
	 String login() {		
		System.out.println("===> test.do");
	   return "/login/login.jsp";
	}
	
	@GetMapping("loginSuccess.do")
	 String loginSuccess() {		
		System.out.println("===> loginSuccess.do");
	   return "/login/loginSuccess.jsp";
	}
	
	@GetMapping("accessDenied.do")
	 String accessDenied() {
		System.out.println("===> accessDenied.do");
	   return "/login/accessDenied.jsp";
	}
}