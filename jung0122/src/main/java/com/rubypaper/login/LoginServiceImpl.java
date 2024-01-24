package com.rubypaper.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao dao;
	
	public LoginServiceImpl() {
		System.out.println("===> LoginServiceImpl");
	}

	@Override
	public LoginVO loginOK(LoginVO vo) {		
		System.out.println("===> ServiceImpl :" + vo);
		return dao.loginOK(vo);
	}

	@Override
	public void insert(LoginVO vo) {
		System.out.println("===> ServiceImpl insert :" + vo);
		dao.insert(vo);
	}

	@Override
	public void delete(LoginVO vo) {
		dao.delete(vo);
	}

	@Override
	public void update(LoginVO vo) {
		dao.update(vo);
	}

	@Override
	public List<LoginVO> selectAll() {
		return dao.selectAll();
	}
}