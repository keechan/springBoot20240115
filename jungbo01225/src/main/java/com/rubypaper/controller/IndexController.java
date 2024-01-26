package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	public IndexController() {
		System.out.println("===>IndexController!");
	}
	
	@GetMapping("index2")
	 void index2() {}
}
