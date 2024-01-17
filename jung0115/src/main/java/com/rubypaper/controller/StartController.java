package com.rubypaper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class StartController {
		
	@Autowired
	HttpSession session;
	
	@Autowired
	HttpServletRequest request;
	
	@GetMapping("index.do")
	 String index(HttpServletRequest request) {		
		
	 return "index";		
	}	
	
}
