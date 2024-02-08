package com.rubypaper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubypaper.domain.Board;
import com.rubypaper.domain.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardRepository boardRepo;
	
	@Override
	public List<Board> boardList() {		

		return (List<Board>) boardRepo.findAll();
	}
}