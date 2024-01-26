package com.rubypaper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rubypaper.member.MemberService;
import com.rubypaper.member.MemberVO;
import com.rubypaper.security.SecurityUser;

@Controller
public class SecurityController {
	@Autowired
	private MemberService service;
	
	@GetMapping("/login.do")
	 String login() {		
		return "/security/login.html";
	}	
	
	@GetMapping("/logout.do")
	 String logout() {		
		return "/security/logout.html";		
	}
	
	@GetMapping("/loginSuccess.do")
	 String loginSuccess(MemberVO vo, Model model, @AuthenticationPrincipal SecurityUser principal) {
		vo.setUsername(principal.getUsername());
		model.addAttribute("m", service.selectUsername(vo));
		return "/security/loginSuccess.html";		
	}	
	
	@GetMapping("/accessDenied.do")
	 String accessDenied() {		
		return "/security/accessDenied.html";		
	}	
}
