package com.rubypaper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.rubypaper.login.LoginService;
import com.rubypaper.login.LoginVO;

@SpringBootTest
class Jung0122ApplicationTests {
	@Autowired
	private LoginService service;
	
	@Autowired
	PasswordEncoder passwordEncoder; 

//	@Test
//	void testUpdate() {
//		System.out.println("===> Test");
//		LoginVO vo = new LoginVO();
//		vo.setUsername("admin");
//		vo.setPassword(passwordEncoder.encode("admin123"));
//		service.update(vo);
//	}
	
	@Test
	void contextLoads() {
		System.out.println("===> Test");

		LoginVO vo = new LoginVO();
		vo.setIdx("3098");
		service.delete(vo);
		
//		LoginVO vo = new LoginVO();
//		vo.setUsername("manager");
//		vo.setPassword(passwordEncoder.encode("manager123"));
//		service.update(vo);
		
//		LoginVO vo = new LoginVO();
//		vo.setUsername("ppk");
//		vo.setPassword(passwordEncoder.encode("ppk123"));
//		vo.setRole("ROLE_MMEMGER");
//		vo.setGrade("일반회원");
//		vo.setName("너구리");
//		service.insert(vo);
	}
}
