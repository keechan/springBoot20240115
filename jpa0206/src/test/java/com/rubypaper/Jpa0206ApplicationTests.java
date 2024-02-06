package com.rubypaper;

import java.util.List;

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

//	@BeforeEach
//	void selectAll() {
//		List<Board> li = (List<Board>) repository.findAll();
//		for (Board m : li) {
//			System.out.println("BeforeEach ===> " + m.getTitle());
//		}
//	}
	
	//title = JPA 연습3 찾기
	@AfterEach
	void findByTitleLike() {
		List<Board> li1 = repository.findByAgeBetweenOrderBySeqDesc(11, 20);
		for (Board m : li1) {
			System.out.println("AfterEachPay ====> " + m);
		}
	}
	
	@Test
	void contextLoads() {
		//List<Board> board = (List<Board>) repository.findAll();
		//Board board = repository.find
		for (int i=0;i<10;i++) {
			System.out.println("contextLoads..." + i);
		}
	}
}
