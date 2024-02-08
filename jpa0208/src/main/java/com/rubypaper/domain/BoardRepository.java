package com.rubypaper.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;


public interface BoardRepository
extends CrudRepository<Board,Long> 
       , QuerydslPredicateExecutor<Board> {
	//메쏘드 방식
//	List<Board> OrderBySeq(Pageable paging);
//	Page<Board> findByTitleLike(String string, PageRequest paging);

	//@Query 어노테이션 방식 : Board => Entity
//	@Query("SELECT b FROM Board b")
//	List<Board> SelectTest1();
	
	@Query("select b from Board b"
		+  " where b.title like %?1% "
		+  "    or b.content like %?2% "
		+  " order by b.seq desc ")
	List<Board> SelectTest1(String str1, String str2);

	@Transactional
	@Modifying
	@Query(value="update Board "
		+ "          set create_date = sysdate ", nativeQuery = true )
	void updateTest1();
	
	@Modifying
	@Query(value="insert into Board (seq, title) "
		+ "         values (2222, '111') ", nativeQuery = true )
	void insertTest1();
	
	@Modifying
	@Query(value="delete from Board where seq = 2222) ", nativeQuery = true )
	void deleteTest1();
}
