package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rubypaper.login.LoginServiceImpl;
import com.rubypaper.login.LoginVO;


@Controller
public class RubypaperController {
	@Autowired
	LoginServiceImpl service;
	
	@Autowired
	private PasswordEncoder  passwordEncoder; 

	@GetMapping("/admin/admin.do")
	 String admin() {		
		System.out.println("===> admin.do");
	   return "/admin/index.jsp";
	}
	@GetMapping("/admin/memberRegist.do")
	 String memberRegist() {		
		System.out.println("===> memberRegist.do");
	   return "/admin/memberRegist.jsp";
	}
	@GetMapping("/admin/memberRegistOK.do")
	String memberRegistOK(LoginVO vo) {
		System.out.println("===> memberRegistOK.do");
		vo.setPassword(passwordEncoder.encode(vo.getPassword()));
		System.out.println("===> memberRegistOK.do insert");
		service.insert(vo);
		return "/admin/memberList.do";
	}
	@GetMapping("/admin/memberList.do")
	String memberList(Model model) {		
		System.out.println("===> memberList.do");
		model.addAttribute("li", service.selectAll());
	   return "/admin/memberList.jsp";
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
