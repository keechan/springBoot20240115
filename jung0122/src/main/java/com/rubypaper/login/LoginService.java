package com.rubypaper.login;

import java.util.List;

public interface LoginService {
	LoginVO loginOK(LoginVO vo);
	
	void insert(LoginVO vo);
	void delete(LoginVO vo);
	void update(LoginVO vo);
	
	List<LoginVO> selectAll();
}
