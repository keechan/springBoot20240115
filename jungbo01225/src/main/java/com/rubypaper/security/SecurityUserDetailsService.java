package com.rubypaper.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rubypaper.member.MemberService;
import com.rubypaper.member.MemberVO;

@Service
public class SecurityUserDetailsService implements UserDetailsService  {
	
	SecurityUserDetailsService(){
		System.out.println("==>SecurityUserDetailsService");
	}
	
	@Autowired
	MemberService service;
		
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		MemberVO vo = new MemberVO();
		System.out.println("username확인:" + username);
		vo.setUsername(username);
		
		MemberVO user = service.selectUsername(vo);
		if (user == null) {
			throw  new UsernameNotFoundException(username + "사용자 없음");
		}else {
			return new SecurityUser(user);
		}
	}
}
