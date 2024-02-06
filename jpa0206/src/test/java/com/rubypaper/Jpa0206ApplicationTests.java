package com.rubypaper;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rubypaper.domain.Board;
import com.rubypaper.domain.BoardCrudRepository;

@SpringBootTest
class Jpa0206ApplicationTests {
	@Autowired
	BoardCrudRepository repository;
	
	@Test
	void contextLoads() {
		//update
//		Board board = repository.findById(2L).get();
//		//Board board = repository.find
//		board.setTitle("01234567890123456789");
//		board.setCnt(12L);
//		repository.save(board);
//		for (int i=0;i<10;i++) {
			Board vo = new Board();
			vo.setWriter("Writer");			
			vo.setTitle("0123456");
			vo.setAge(10);
			vo.setContent("둘리가 JPA를 ...");
			vo.setCreate_Date(new Date());
			vo.setCnt(null);
			repository.save(vo);
//		}
	}
	
	@AfterEach
	void selectIterable() {
		Iterable<Board> li = repository.findAll();
		for (Board m : li) {
			System.out.println("==> " + m);
		}
	}
}
