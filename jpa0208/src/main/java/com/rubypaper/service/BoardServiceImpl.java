package com.rubypaper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.querydsl.core.BooleanBuilder;
import com.rubypaper.domain.Board;
import com.rubypaper.domain.BoardRepository;
import com.rubypaper.domain.QBoard;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardRepository boardRepo;
	
	@Override
	public Page<Board> boardList(Board vo) {
		//동적 쿼리 사용시 선언 필요
		BooleanBuilder builder = new BooleanBuilder();
		QBoard qboard = QBoard.board;
		
		if (vo.getCh1()==null||vo.getCh2().equals("")) {
			//PageRequest.of(0, 10)
			System.out.println("=====> CH1/CH2 NULL...");
			builder.and(qboard.title.like("%%"));
			PageRequest pagesize = PageRequest.of(0, 10);
			return (Page<Board>) boardRepo.findAll(builder, pagesize);
	    } else if (vo.getCh1().equals("title")) {
	    	System.out.println("=====> CH1 : title");
			builder.and(qboard.title.like("%"+vo.getCh2()+"%"));
			return (Page<Board>) boardRepo.findAll(builder, PageRequest.of(0, 10));
		} else if (vo.getCh1().equals("content")) {
			System.out.println("=====> CH1 : content");
			builder.and(qboard.content.like("%"+vo.getCh2()+"%"));
			return (Page<Board>) boardRepo.findAll(builder, PageRequest.of(0, 10));
		}
		
		return null;
	}
}