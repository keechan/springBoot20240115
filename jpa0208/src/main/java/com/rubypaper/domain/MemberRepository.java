package com.rubypaper.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository
extends CrudRepository<Member,String> 
       , QuerydslPredicateExecutor<Member> {
	//id, name, password, role
	Optional<Member> findById(String str);
	
	List<Member> OrderByIdDesc();
	
	List<Member> findByRoleLikeOrderByIdDesc(String str);
	
	//Page<Board> findByTitleLike(String str, Pageable paging);
	//List<Member>li = memberRepo.findByRoleContainingOrderById(String str);
}