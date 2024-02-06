package com.rubypaper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rubypaper.domain.Board;
import com.rubypaper.domain.BoardCrudRepository;

@SpringBootTest
class Jungbo01291ApplicationTests {
	@Autowired
	BoardCrudRepository repository;

//	@Test
//	void testSelectAll1() {
//		List<Board> li = (List<Board>) repository.findAll();
//		for (Board i : li) {
//			System.out.println("==> " + i);
//		}
//	}
	
//	@Test
//	void testSelectAll2() {
//		Iterable<Board> li = repository.findAll();
//		for (Board i : li) {
//			System.out.println("==> " + i);
//		}
//	}

	@Test
	void contextLoads() {
		for (int i=0;i<10;i++) {
			Board vo = new Board();
			vo.setTitle("JPA 연습");
			vo.setWriter("둘리"+i);
			vo.setContent("둘리가 JPA를 ...");
			vo.setAge("17");
			//vo.setCreateDate(new Date());
			vo.setCnt(7L);
			repository.save(vo);
		}
	}
	
//	@Test
//	void testGetBoard() {
//		Board board = repository.findById(52L).get();
//		System.out.println(board.toString());
//		
//	}

//	@Test
//	void testUpdateBoard() {
//		Board board = repository.findById(52L).get();
//		board.setTitle("수정하기");
//		//updatable=false...는 안됨.
//		board.setWriter("수정이");
//		
//		repository.save(board);
//	}

//	@Test
//	void testDeleteBoard() {
//		repository.deleteAll();		
//	}
	
}