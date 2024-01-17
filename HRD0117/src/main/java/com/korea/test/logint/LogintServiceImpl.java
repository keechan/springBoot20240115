package com.korea.test.logint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogintServiceImpl implements LogintService {
	@Autowired 
	LogintDao dao;
	
	public LogintServiceImpl(){
		System.out.println("==> LogintServiceImpl 실행");
	}
	@Override
	public void insert(LogintVO vo) {
		dao.insert(vo);		
	}
	@Override
	public List<LogintVO> getLogintList(LogintVO vo) {
		return dao.getLogintList(vo);
	}
}
