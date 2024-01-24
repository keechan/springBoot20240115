package com.rubypaper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("/main")
	void index(Model model) {
		model.addAttribute("hello", "안녕하세요? 타임리프입니다.");
		System.out.println("/index.do -> main.html");
	}
}
