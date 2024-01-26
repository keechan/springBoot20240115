package com.rubypaper.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao  dao;
	
	@Override
	public List<MemberVO> selectAll(MemberVO vo) {
		return dao.selectAll(vo);
	}

	@Override
	public void insert(MemberVO vo) {
		dao.insert(vo);
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
		return dao.selectOne(vo);
	}

	@Override
	public void update(MemberVO vo) {
		dao.update(vo);
	}

	@Override
	public void delete(MemberVO vo) {
		System.out.println("===>ServiceImpl : " + vo);
		dao.delete(vo);
	}

	@Override
	public MemberVO selectUsername(MemberVO vo) {
		return dao.selectUsername(vo);
	}
}