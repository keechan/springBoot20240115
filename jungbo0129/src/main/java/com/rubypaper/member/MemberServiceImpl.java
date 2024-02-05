package com.rubypaper.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberDao dao;
	@Override
	public List<MemberVO> selectAll(MemberVO vo) {
		return dao.selectAll(vo);
	}
	
	@Override
	public MemberVO selectOne(MemberVO vo) {
		return dao.selectOne(vo);
	}
	
	@Override
	public void insert(MemberVO vo) {
		dao.insert(vo);
	}

	@Override
	public MemberVO edit(MemberVO vo) {
		return dao.edit(vo);
	}

	@Override
	public void update(MemberVO vo) {
		System.out.println("===> ServiceImpl : " + vo);
		dao.update(vo);		
	}
}
