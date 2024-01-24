package com.rubypaper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("index.do")
	String index() {
	   return "index.jsp";
	}
}