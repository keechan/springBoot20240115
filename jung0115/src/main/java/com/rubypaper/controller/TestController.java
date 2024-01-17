package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.project.board.BoardVO;

@RestController
public class TestController {

	@GetMapping("/getBoard.json")
	public BoardVO  getBoard() {
		BoardVO board = new BoardVO();
		board.setTitle("Test99");
		board.setWriter("제목");
		return board;		
	}
		
	@GetMapping("/getBoardList.json")
	public List<BoardVO>  getBoardList() {
		List<BoardVO> boardList = new ArrayList<>();		
		for (int  i=0 ; i< 9 ; i++) {
			BoardVO board = new BoardVO();
			board.setTitle("Test99");
			board.setWriter("제목");
			boardList.add(board);
		}
		return boardList;		
	}
	
}
