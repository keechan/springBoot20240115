package com.rubypaper.member;

import java.util.List;

public interface MemberService {
	List<MemberVO> selectAll(MemberVO vo);
	MemberVO selectOne(MemberVO vo);
	MemberVO edit(MemberVO vo);
	void insert(MemberVO vo);
	void update(MemberVO vo);
}