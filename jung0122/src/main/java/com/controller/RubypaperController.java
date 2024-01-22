package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class RubypaperController {

	
	@GetMapping("/admin/admin.do")
	 String admin() {		
		System.out.println("===> admin.do");
	   return "/admin/index.jsp";
	}
	
	@GetMapping("/guest/guest.do")
	 String guest() {		
		System.out.println("===> guest.do");
	   return "/guest/index.jsp";
	}
	
	@GetMapping("/guestBoard/guest.do")
	 String guestBoard() {		
		System.out.println("===> guestBoard.do");
	   return "/guestBoard/index.jsp";
	}
	
	@GetMapping("/manager/manager.do")
	 String manager() {		
		System.out.println("===> manager.do");
	   return "/manager/index.jsp";
	}
	
	@GetMapping("/member/member1.do")
	 String member1() {		
		System.out.println("===> member1.do");
	   return "/member1/index.jsp";
	}
	@GetMapping("/member/member2.do")
	 String member2() {		
		System.out.println("===> member2.do");
	   return "/member2/index.jsp";
	}
	
	@GetMapping("/member/memberBoard.do")
	 String memberBoard() {		
		System.out.println("===> memberBoard.do");
	   return "/memberBoard/index.jsp";
	}
	
	
}
