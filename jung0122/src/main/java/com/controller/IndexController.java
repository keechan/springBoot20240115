package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	public IndexController() {
		System.out.println("===>TestController!");
	}
	@GetMapping("test.do")
	 String test() {		
		System.out.println("===> test.do");
	   return "/login/login.jsp";
	}
	
	@GetMapping("index.do")
	 String index() {
		System.out.println("===> index.do");
	   return "index.jsp";
	}
	
//	@GetMapping("BoardFormOk.do")
//	 String BoardFormOk(BoardVO  vo) {		
//		System.out.println("===> 글 저장하기");
//		srevice.insert(vo);
//	   return "redirect:getBoardList.do";		
//	}
	
}
