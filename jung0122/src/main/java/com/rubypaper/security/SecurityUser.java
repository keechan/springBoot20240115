package com.rubypaper.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.rubypaper.login.LoginVO;

public class SecurityUser extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SecurityUser(LoginVO vo) {
		//{noop}은 암호화를 안하는 것을 쓰기로 함
		super(vo.getUsername(), "{noop}" + vo.getPassword(),
		//super(vo.getUsername(), vo.getPassword(),
				AuthorityUtils.createAuthorityList(vo.getRole().toString()));
		System.out.println("===> SecurityUser");
	}	
}
