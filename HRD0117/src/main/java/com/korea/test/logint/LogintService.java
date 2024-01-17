package com.korea.test.logint;

import java.util.List;

public interface LogintService {
	void insert(LogintVO vo);
	List<LogintVO> getLogintList(LogintVO  vo);
}
