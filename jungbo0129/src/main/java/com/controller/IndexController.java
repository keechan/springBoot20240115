package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/index2.do")
	String index() {
		System.out.println("===> index2.do");
		return "index2.html";
	}
}