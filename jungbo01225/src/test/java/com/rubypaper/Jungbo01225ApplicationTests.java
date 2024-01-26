package com.rubypaper;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rubypaper.member.MemberServiceImpl;
import com.rubypaper.member.MemberVO;

@SpringBootTest
class Jungbo01225ApplicationTests {
	@Autowired
	MemberServiceImpl service;
	
	@Test
	void selectAll() {
		List<MemberVO> li = service.selectAll(null);
		for (MemberVO m:li) {
			System.out.println(m.getIdx() + "/" + m.getUsername());
		}
	}
	
	//먼저 실행....
	@BeforeEach
	void contextLoads() {
		System.out.println("===> Test1");

		MemberVO vo = new MemberVO();	
		vo.setIdx("3110 ");
		service.delete(vo);
		System.out.println("===> Test2");
	}
	//나중에 실행
	@AfterEach
	void printTest() {
		List<MemberVO> li = service.selectAll(null);
		for (MemberVO m:li) {
			System.out.println(m.getIdx() + "/" + m.getUsername());
		}
	}

}
