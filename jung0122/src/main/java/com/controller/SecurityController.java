package com.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.rubypaper.login.LoginService;
import com.rubypaper.login.LoginVO;

import jakarta.servlet.http.HttpSession;

@Controller
public class SecurityController {
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private LoginService  service;
	
	@GetMapping("login.do")
	 String login() {		
		System.out.println("===> index.do");
	   return "/login/login.jsp";		
	}
	
	@GetMapping("logout.do")
	 String logout() {		
		System.out.println("===> logout.do");
	   return "/login/logout.jsp";			
	}
	
	@GetMapping("loginSuccess.do")
	 String loginSuccess(Principal user ) {		
		
		System.out.println("===> loginSuccess.do: "+user.getName());
		
		LoginVO vo = new LoginVO();
		vo.setUsername(user.getName());
				
		session.setAttribute("session",service.loginOK(vo));
		
	   return "/login/loginSuccess.jsp";		
	}
	
	@GetMapping("accessDenied.do")
	 String accessDenied() {		
		System.out.println("===> accessDenied.do");
	   return "/login/accessDenied.jsp";		
	}
}
