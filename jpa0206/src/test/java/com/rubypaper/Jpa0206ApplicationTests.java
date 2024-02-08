package com.rubypaper;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import com.rubypaper.domain.BoardCrudRepository;
import com.rubypaper.domain.BoardT;

@SpringBootTest
class Jpa0206ApplicationTests {
	@Autowired
	private BoardCrudRepository  boardCrudRepo;
	
	@Test
	void contextLoads() {
		for (long i =0 ; i < 2 ; i++) {
		BoardT	vo  = new BoardT();
		vo.setSeq(i);
		vo.setTitle("jpa 연습" + i);
		vo.setAge("13");
		boardCrudRepo.save(vo);
		}
	}

	// @AfterEach
	void selectAll1() {
		 List<Object[]>	li = boardCrudRepo.queryAnnotationTest4("연습9");
		 for(Object[] row : li ) {		    
		    System.out.println(Arrays.toString(row));
		 }
	 
	}

	@AfterEach
	void selectAll2() {
		 //List<BoardT>	li = boardCrudRepo.queryAnnotationTest4("연습9");
		List<BoardT> li = boardCrudRepo.queryAnnotationTest5("연습9");
		 for(BoardT m : li ) {		    
		    System.out.println(m.getSeq() + "," + m.getTitle());
		 }
	}

//	@BeforeEach
//	void selectAll() {
//		List<Board> li = (List<Board>) repository.findAll();
//		for (Board m : li) {
//			System.out.println("BeforeEach ===> " + m.getTitle());
//		}
//	}
	
//	//title = JPA 연습3 찾기
//	@AfterEach
//	void findByTitleLike() {
//		List<Board> li1 = repository.findByAgeBetweenOrderBySeqDesc(11, 20);
//		for (Board m : li1) {
//			System.out.println("AfterEachPay ====> " + m);
//		}
//	}
//	
//	@Test
//	void contextLoads() {
//		//List<Board> board = (List<Board>) repository.findAll();
//		//Board board = repository.find
//		for (int i=0;i<10;i++) {
//			System.out.println("contextLoads..." + i);
//		}
//	}
}
