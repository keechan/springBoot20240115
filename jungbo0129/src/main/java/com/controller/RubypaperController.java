package com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubypaper.member.MemberService;
import com.rubypaper.member.MemberVO;
import com.rubypaper.money.MoneyService;
import com.rubypaper.money.MoneyVO;

@Controller
public class RubypaperController {

	@Autowired
	private MemberService  service;
	
	@Autowired
	private MoneyService serviceM;

	public RubypaperController() {
		System.out.println("===> RubypaperController");
	}

	@GetMapping("/member/memberList.do")
	 String memberList(MemberVO vo, Model  model) {
		List<MemberVO> li = service.selectAll(vo);
		
		model.addAttribute("li", li);		
	   return "/member/memberList.html";		
	}

	@GetMapping("/member/member.do")
	 String member(MemberVO vo, Model  model) {
		Date toDay = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		String toDayStr = df.format(toDay);
		
		MemberVO m = service.selectOne(vo);
		model.addAttribute("toDayStr", toDayStr);		
		model.addAttribute("m", m);		
	   return "/member/member.html";		
	}

	@PostMapping("/member/insertOK.do")
	 String insertOK(MemberVO vo) {
		System.out.println("===> /member/insertOK.do");
		
		service.insert(vo);	
		return "redirect:/member/memberList.do";		
	}

	@GetMapping("/member/edit.do")
	 String memberEdit(MemberVO vo, Model model) {
		model.addAttribute("m", service.edit(vo));
	   return "/member/memberEdit.html";		
	}
	
	@PostMapping("/member/editOK.do")
	 String editOK(MemberVO vo) {
		System.out.println("===> /member/editOK.do");
		
		service.update(vo);
		return "redirect:/member/memberList.do";
	}
	
	@GetMapping("/money/getMoneyList.do")
	String getMoneyList(MoneyVO vo, Model model) {
		System.out.println("===> getMoneyList");
		model.addAttribute("li", serviceM.getMoneyList(vo));
		return "redirect:/money/getMoneyList.html";
	}
}