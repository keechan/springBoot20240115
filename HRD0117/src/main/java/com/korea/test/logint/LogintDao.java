package com.korea.test.logint;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogintDao {
	void insert(LogintVO vo);
	List<LogintVO> getLogintList(LogintVO  vo);
}

