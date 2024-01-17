package com.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StartController {
	@GetMapping("index.do")
	 String index(HttpServletRequest request) {		
		
		return "index";		
	 }	
}
