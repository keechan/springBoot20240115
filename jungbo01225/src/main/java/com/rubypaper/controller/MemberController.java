package com.rubypaper.controller;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.rubypaper.member.MemberService;
import com.rubypaper.member.MemberVO;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MemberController {

	@Autowired
	private MemberService  service;
	
	@Autowired
	private PasswordEncoder  passwordEncoder; 
	
	String path ="";
//	@PostConstruct
//	public  void init() {
//	  path = servletContext.getRealPath("/files/");
//	  
//	}	
	//String path = request.getSession(false).getServletContext().getRealPath("/files/");
	
	@GetMapping("/member/memberList.do")
	 String memberList(MemberVO vo, Model  model) {	
		model.addAttribute("li", service.selectAll(vo));		
	   return "/member/memberList.html";		
	}
	
	@GetMapping("/member/insert.do")
	 String insert() {
	   return "/member/insert.html";
	}
	
	@PostMapping("/member/insertOK.do")
	 String insertOK(MemberVO vo, Model model, HttpServletRequest request) throws IllegalStateException, IOException {
		Random rnd = new Random();
		String rName = (rnd.nextInt(999999) + 100001+"");
		System.out.println("rnd.nextInt(6) : " + rnd.nextInt(6)+100001);
		//자료실 입력처리 시작
		path=request.getSession().getServletContext().getRealPath("/files/");
		//System.out.println("path:" + path);
		MultipartFile file = vo.getFile();
		String fileName = file.getOriginalFilename();
		//파일명		
		//System.out.println("fileName:" + fileName);
		File F = new File(path+fileName);
		if (!file.isEmpty()) {
			if (F.exists()) {
				String Fname = fileName.substring(0, fileName.lastIndexOf("."));
				String Lname = fileName.substring(fileName.lastIndexOf("."));
				fileName = Fname + "_" + rName + Lname;
			}
			//변경된 파일명 새로 셋팅
			file.transferTo(new File(path+fileName));
		} else {
			//업로드할 파일 없을 때
			fileName = "space.png";
		}
		
		System.out.println(fileName);

		vo.setFiles(fileName);
		//자료실 입력처리 끝
		//비밀번호 암호화		
		vo.setPassword(passwordEncoder.encode(vo.getPassword()));
		service.insert(vo);
		
		//redirect를 안쓰면 templates로 감
	   return "redirect:/member/memberList.do";
	}
	
	@GetMapping("/member/edit.do")
	 String update(MemberVO vo, Model model) {
		model.addAttribute("m", service.selectOne(vo));
	   return "/member/edit.html";
	}
	
	@GetMapping("/member/editOK.do")
	 String update(MemberVO vo) {
		System.out.println("===> update(MemberVO vo) : " + vo);
		vo.setPassword(passwordEncoder.encode(vo.getPassword()));
		service.update(vo);
		//redirect를 안쓰면 templates로 감
	   return "redirect:/member/memberList.do";
	}
	
	@GetMapping("/member/delete.do")
	 String delete(MemberVO vo, Model model, HttpServletRequest request) {
		System.out.println("===> delete(MemberVO vo) : " + vo);
		
//		path=request.getSession().getServletContext().getRealPath("/files/");
//	    File delF = new File(path + vo.getFiles());
//	    System.out.println("===> delF : " + delF);
//	    if (!vo.getFiles().equals("space.png")) {
//	    	delF.delete();  //  실제파일 삭제
//	    }		
		service.delete(vo);
		return "redirect:/member/memberList.do";
	}
}