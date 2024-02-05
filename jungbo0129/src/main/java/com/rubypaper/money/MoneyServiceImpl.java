package com.rubypaper.money;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoneyServiceImpl implements MoneyService {
	@Autowired
	MoneyDao dao;

	@Override
	public List<MoneyVO> getMoneyList(MoneyVO vo) {
		return dao.getMoneyList(vo);
	}
	
	
}
