package com.korea.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.korea.test.logint.LogintServiceImpl;
import com.korea.test.logint.LogintVO;

@Controller
public class LogintController {
	@Autowired 
	LogintServiceImpl service;
	
	LogintController(){
		  System.out.println("=>LogintController ");	
	}
	
	@GetMapping("LogintForm.do")
	 String LogintForm() {		
		System.out.println("===> 저장폼으로 이동");
	   return "/logint/LogintForm";		
	}
	
	@GetMapping("LogintFormOk.do")
	 String LogintFormOk(LogintVO  vo) {		
		System.out.println("===> 저장하기");
		service.insert(vo);
	   return "redirect:getLogintList.do";
	}	

	@GetMapping("getLogintList.do")
	 String getLogintList(Model  model) {
		System.out.println("===> getLogintList ");
		
		model.addAttribute("li", service.getLogintList(null));
	   return "/logint/getLogintList";		
	}
	
	@GetMapping("table.do")
	 String LogintRandomFormOk(LogintVO  vo) {		
	   System.out.println("===> table.do");
	   Random random = new Random();
	   for(int i=1;i<=5;i++ ) {
		   //Idx1
		   vo.setIdx1(i);		   
		   System.out.println(i);
		   //Name1
		   int leftLimit = 97; // letter 'a'
		   int rightLimit = 122; // letter 'z'
		   int targetStringLength = 5;

		   String generatedString = random.ints(leftLimit, rightLimit + 1)
		           .limit(targetStringLength)
		           .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		           .toString();
		   vo.setName1(generatedString);
		   System.out.println(generatedString);
		   //Pwd1
		   int leftNumber = 48; // letter '0'
		   int rightNumber = 57; // letter '9'
		   int targetNumberLength = 4;

		   String generatedNumber = random.ints(leftNumber, rightNumber + 1)
		           .limit(targetNumberLength)
		           .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		           .toString();
		   vo.setPwd1(generatedNumber);
		   System.out.println(generatedNumber);		   
		   service.insert(vo);
	   }

	   return "redirect:index.do";
	}
	
}