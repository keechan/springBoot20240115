package com.rubypaper.member;

import java.util.List;

public interface MemberService {
	   List<MemberVO> selectAll(MemberVO vo);
	   void insert(MemberVO vo);
	   MemberVO selectOne(MemberVO vo);
	   MemberVO selectUsername(MemberVO vo);
	   void update(MemberVO vo);
	   void delete(MemberVO vo);
}