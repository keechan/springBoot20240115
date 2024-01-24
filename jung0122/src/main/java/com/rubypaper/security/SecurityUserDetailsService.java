package com.rubypaper.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rubypaper.login.LoginServiceImpl;
import com.rubypaper.login.LoginVO;

@Service
public class SecurityUserDetailsService implements UserDetailsService {
//	@Autowired
//	HttpSession session;

	public SecurityUserDetailsService() {
		System.out.println("==> SecurityUserDetailsService ");
	}
	
	@Autowired
	LoginServiceImpl service;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		String sessionId =(String) session.getAttribute("sessionId");
//		System.out.println("===> sessionId:"+ sessionId);
		
//		if (sessionId == null || sessionId.equals("null")) {
//			vo.setSessionID("");
//		}else{
//			vo.setSessionID(sessionId);	
//		}

		//사용자 존재여부체크
		LoginVO vo = new LoginVO();
		System.out.println("===> username : " + username);
		vo.setUsername(username);
		LoginVO user = service.loginOK(vo);
		
		if (user == null) {
			//사용자 없음
			System.out.println("===> 사용자 없음 : " + user);
			throw new UsernameNotFoundException(username + "사용자 없음");
		} else {
			//사용자 ID 있음
			System.out.println("===> 사용자 있음 : " + user);
			//session.setAttribute("session", user);
			return new SecurityUser(user);
		}
//		return User.builder()
//			        .username(user.getName())
//			        .password(user.getPassword())
//			        .roles(user.getRole().toString())
//			        .build();
	}
}
