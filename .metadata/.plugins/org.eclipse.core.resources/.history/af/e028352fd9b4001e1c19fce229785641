package com.rubypaper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rubypaper.project.board.BoardServiceImpl;
import com.rubypaper.project.board.BoardVO;

@Controller
public class BoardController {

	BoardController(){
		  System.out.println("===>BoardController ");	
	}
	
	@Autowired
	private BoardServiceImpl  srevice; // 필히 클래스를  Type 로 지정.
	
	@GetMapping("BoardForm.do")
	 String BoardForm() {		
		System.out.println("===> 글 저장폼으로 이동");
	   return "/board/BoardForm";		
	}
	
	@GetMapping("BoardFormOk.do")
	 String BoardFormOk(BoardVO  vo) {		
		System.out.println("===> 글 저장하기");
		srevice.insert(vo);
	   return "redirect:getBoardList.do";		
	}	
	
	@GetMapping("getBoardList.do")
	 String getBoardList(Model  model) {
		System.out.println("===> getBoardList ");
		
		model.addAttribute("li", srevice.getBoardList(null));
	   return "/board/getBoardList";		
	}		

	@GetMapping("BoardEdit.do")
	 String BoardEdit(Model  model, BoardVO vo) {
		System.out.println("===> BoardEdit 확인 ");		
		model.addAttribute("m", srevice.getBoard(vo));
	   return "/board/getBoard";		
	}
	

	@GetMapping("BoardUpdate.do")
	 String BoardUpdate(BoardVO  vo) {		
		srevice.update(vo);
	   return "redirect:getBoardList.do";		
	}
}
