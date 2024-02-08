package com.rubypaper;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rubypaper.domain.BoardRepository;
import com.rubypaper.domain.MemberRepository;

@SpringBootTest
class Jpa0208ApplicationTests {
	@Autowired
	private MemberRepository memberRepo;
	@Autowired
	private BoardRepository boardRepo;
	

	@Test
	void contextLoads() {
		System.out.println("-----> boardRepo.insertTest1()");
		boardRepo.insertTest1();
		//boardRepo.updateTest1();
		System.out.println("-----> boardRepo.deleteTest1()");
		boardRepo.deleteTest1();
//		for (Long i=1L;i<100;i++) {
//			System.out.println("contextLoads.....>" + i);
//			Board board1 = new Board();
//			board1.setTitle("제목"+i);
//			board1.setContent("내용"+i);
//			board1.setCnt(i);
//			boardRepo.save(board1);
//		}
		
		//삭제
		//boardRepo.deleteById(1L);

		//수정
//		Board board = boardRepo.findById(1L).get();
//		board.setContent("내용 수정");
//		board.setTitle("제목 수정");
//		boardRepo.save(board);

//		for (int i=0;i<1;i++) {
//			Board board1 = new Board();
//			board1.setTitle("제목"+i);
//			board1.setContent("내용"+i);
//			board1.setCreateDate(new Date());
//			board1.setCnt(3L);
//			boardRepo.save(board1);
//		}
		
//		Member member1 = new Member();
//		member1.setId("member1");
//		member1.setPassword("member111");
//		member1.setName("둘리");
//		member1.setRole("user");
//		memberRepo.save(member1);

	}
}
