package com.rubypaper.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {
	   List<MemberVO> selectAll(MemberVO vo);
	   MemberVO selectOne(MemberVO vo);
	   MemberVO edit(MemberVO vo);
	   void insert(MemberVO vo);
	   void update(MemberVO vo);
}
